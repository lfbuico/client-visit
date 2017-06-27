FROM ibmjava:8-sdk
VOLUME /tmp
ADD client-visit-portal*.jar client-visit-portal.jar
ADD cacerts /opt/ibm/java/jre/lib/security/cacerts
RUN sh -c 'touch /client-visit-portal.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /client-visit-portal.jar" ]