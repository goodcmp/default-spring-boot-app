FROM openjdk:15
RUN mkdir -p jar
WORKDIR /jar
COPY ./build/libs/deafult-0.0.1-SNAPSHOT.jar boot.jar
ENTRYPOINT ["java","-jar","/jar/boot.jar"]