# Utiliser une image Java officielle
FROM openjdk:17-jdk-slim

# Créer un répertoire pour l'application
WORKDIR /app

COPY target/thermosensible-0.0.1-SNAPSHOT.jar thermosensible-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "thermosensible-0.0.1-SNAPSHOT.jar"]
