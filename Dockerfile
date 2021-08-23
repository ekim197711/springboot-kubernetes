FROM azul/zulu-openjdk-alpine:16 as mybuilder
RUN mkdir /opt/project
WORKDIR /opt/project
COPY src ./src
COPY build.gradle.kts .
COPY gradlew .
COPY gradle ./gradle
RUN ./gradlew buildForDocker
RUN touch /tmp/somefile.txt

FROM azul/zulu-openjdk-alpine:16-jre
COPY --from=mybuilder /opt/project/build/libs/docker/app.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]