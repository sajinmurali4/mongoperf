FROM amazoncorretto:11 AS builder
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM  amazoncorretto:11
EXPOSE 8070
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java","-XX:+AlwaysPreTouch","-Xms756m", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]