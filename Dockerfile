FROM maven:3.8.4-openjdk-17 as maven

COPY ./pom.xml ./pom.xml

COPY ./src ./src

RUN mvn dependency:go-offline -B

RUN mvn package

FROM openjdk:17

WORKDIR /adevguide

COPY --from=maven target/demo-*.jar ./demo.jar

CMD [
java, -jar, ./demo.jar]
