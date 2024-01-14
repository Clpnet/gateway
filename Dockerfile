FROM tomcat:8-jre8

# Eliminar la aplicación de bienvenida de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar el archivo WAR a la carpeta webapps
COPY reniec_v3.war /usr/local/tomcat/webapps/ROOT.war

# Puerto en el que Tomcat escuchará
EXPOSE 8080

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]
