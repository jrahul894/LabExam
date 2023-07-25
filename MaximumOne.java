FROM openjdk
WORKDIR /app
COPY ./MaximumOne.java .
RUN javac MaximumOne.java
CMD ["java", "MaximumOne"]