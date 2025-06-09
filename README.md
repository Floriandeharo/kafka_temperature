# ThermoSensible - Surveillance Température en Temps Réel

Ce projet est un système de surveillance de la température de produits sensibles (ex. médicaments, vaccins, produits alimentaires), avec génération d’alertes dès qu’une température dépasse un seuil critique (2°C).

## Stack Technique

- Spring Boot — Backend et traitement des alertes
- Apache Kafka —  Messages pour la simulation de capteurs
- Docker & Docker Compose — Conteneurisation des services
- HTML/JavaScript — Interface de visualisation des alertes

## Fonctionnalités

- Simulation de capteurs envoyant des températures aléatoires
- Kafka Producer  qui publie un message toutes les 5 secondes
- Kafka Consumer  qui vérifie chaque température
- Alerte générée si température > 2°C
- API REST : `GET /alerts`
- Interface HTML en temps réel (auto-refresh)

## Lancer le projet


```bash
git clone 
cd thermosensible
mvn clean package -DskipTests
docker-compose up --build
