FROM openjdk:11
COPY ./target/calculator.jar ./
WORKDIR ./
CMD ["java","-jar","calculator.jar"]
