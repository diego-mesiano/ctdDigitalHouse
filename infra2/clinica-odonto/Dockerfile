FROM openjdk:11

WORKDIR /diretorioPrincipal

COPY target/clinica-odonto-0.0.1-SNAPSHOT.jar /diretorioPrincipal/arquivoExecutavel.jar

ENTRYPOINT ["java", "-jar", "arquivoExecutavel.jar"]