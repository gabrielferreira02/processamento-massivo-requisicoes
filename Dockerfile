FROM alpine/java:21-jdk
LABEL authors="gabriel"

WORKDIR /app

COPY target/processamentoMassivoRequisicoes-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080