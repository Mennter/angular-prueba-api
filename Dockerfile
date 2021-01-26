
FROM openjdk:8-jdk-alpine3.8
LABEL maintenance="Ezequiel"

WORKDIR /

ADD ./build/libs/Prueba-Angular-0.0.1-SNAPSHOT.jar service.jar

EXPOSE 80

CMD java -Xmx512m -Xms512M -jar service.jar