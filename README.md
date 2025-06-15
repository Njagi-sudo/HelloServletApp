# HelloServletApp

This is a simple Java Servlet application created using Apache Tomcat and Maven.  
It responds with a welcome message when accessed via an HTTP GET request.

## 📁 Project Structure

- `src/main/java/com/example/hello/HelloServlet.java`  
  → Java class that handles GET requests and returns an HTML welcome message.

- `src/main/webapp/WEB-INF/web.xml`  
  → Servlet configuration and URL mapping.

- `pom.xml`  
  → Maven configuration for dependencies and plugins.

## ▶️ How to Run Locally

1. Make sure you have:
    - Apache Tomcat installed
    - IntelliJ IDEA or any IDE with Maven support

2. Build the project:
    - Use Maven to package the `.war` or use "Build → Build Artifacts" in IntelliJ

3. Deploy to Tomcat:
    - Use the Tomcat configuration in IntelliJ to run the project

4. Access the servlet in your browser:http://localhost:8080/HelloApp/HelloServlet
   This will display:Hello, welcome to my first servlet!

## 🧪 Tested Environment

- Java 17
- Apache Tomcat 9
- Maven
- IntelliJ IDEA

## 💡 Notes

- Make sure Tomcat is running and the port is set to 8080.
- If using IntelliJ, confirm that the artifact is deployed under "Deployment" in the run configuration.

---




