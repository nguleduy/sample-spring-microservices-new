FROM openjdk:8-jre-alpine
ENV APP_FILE config-service-0.0.1-SNAPSHOT.jar
ENV APP_HOME /libs
EXPOSE 8088
COPY build/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
