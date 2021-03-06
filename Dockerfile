FROM openjdk:14-alpine
COPY build/libs/micronaut-lombok-reproducer-*-all.jar micronaut-lombok-reproducer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-lombok-reproducer.jar"]
