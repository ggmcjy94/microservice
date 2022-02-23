FROM openjdk:17-ea-11-jdk-slim
# docker 가상 디렉토리
VOLUME /tmp
# root directory 복사
COPY apiEncryptionKey.jks apiEncryptionKey.jks
COPY target/config-service-1.0.jar ConfigServer.jar

ENTRYPOINT ["java","-jar","ConfigServer.jar"]