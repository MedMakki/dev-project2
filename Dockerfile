FROM openjdk:17-jdk

WORKDIR /app

ENV nexus_user=admin
ENV nexus_passwd=makkismd
ENV nexus_url=http://localhost:8081/repository/maven-releases/tn/esprit/eventsProject/1.0.0/eventsProject-1.0.0.jar
RUN curl -u $nexus_user:$nexus_passwd -o eventsProject-1.0.0.jar $nexus_url

EXPOSE 8089

CMD ["java", "-jar", "eventsProject-1.0.0.jar"]
