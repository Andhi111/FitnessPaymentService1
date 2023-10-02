FROM openjdk:11-jre-slim
COPY build/libs/FitnessPaymentService1.jar /FitnessPaymentService1.jar
CMD ["java", "-jar", "/FitnessPaymentService1.jar"]