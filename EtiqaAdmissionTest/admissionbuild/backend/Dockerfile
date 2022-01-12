#
# Package stage
#
FROM openjdk:11-jre-slim
COPY target/EtiqaAdmissionTest-0.0.1-SNAPSHOT.jar /usr/local/lib/EtiqaAdmissionTest.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/EtiqaAdmissionTest.jar"]