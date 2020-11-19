## Prerequisites: Ensure that MySQL (https://dev.mysql.com/doc/refman/8.0/en/installing.html) and Maven (https://maven.apache.org/download.cgi) are installed.

## Instructions:
1. Download the project file.
2. Create the database by running the following command in Command Prompt: mysql -u <enter your MySQL username> -p < create_db.sql.
3. You will then be prompted to enter your MySQL password.
4. After successfully logging in, start the server by running the following command: mvn jetty:run.
5. Once all the dependencies are installed, and the server has started successfully, access the web application using http:localhost:8080/struts-login-app/index.
6. Login using the accounts populated in the create_db.sql file. Here are some accounts:
Username: admin; Password: admin
Username: user1; Password: pass1
