Got it! Here’s a **simple and clear `README.md`** for your project:

---

```markdown
# Java Maven Servlet Project

A simple Java web application using **Servlets** and **Maven**, with Jenkins CI/CD to deploy to **Tomcat**.

---

## Project Structure

```

src/main/java/        # Servlet source code
pom.xml               # Maven configuration
Jenkinsfile           # Jenkins Pipeline
target/               # Compiled WAR output

````

---

## Requirements

- Java 17 JDK
- Maven
- Apache Tomcat 9
- Jenkins
- Git

---

## Build & Deploy

1. Clone the repository:

```bash
git clone https://github.com/Rohitz999/java-maven-pipeline-project.git
cd java-maven-pipeline-project
````

2. Build with Maven:

```bash
mvn clean package
```

3. Deploy WAR to Tomcat (manual):

```bash
sudo cp target/*.war /opt/tomcat-9.0.11/webapps/your-app.war
sudo systemctl restart tomcat
```

---

## Jenkins CI/CD

The `Jenkinsfile` automates:

1. Code checkout
2. Maven build
3. WAR deployment to Tomcat
4. Tomcat restart

> Make sure Jenkins has permission to restart Tomcat:

```bash
jenkins ALL=(ALL) NOPASSWD: /bin/systemctl restart tomcat
```

---

## Access the Application

```
http://<server-ip>:8080/your-app/hello
```

You should see:

```
Hello from Jenkins Build 🚀
Build time: <timestamp>
```

---

## Author

Rohit Kumar Vishwakarm

```

---

If you want, I can also make an **even shorter one-page version** suitable for GitHub repos that’s **super clean and beginner-friendly**, without all the technical notes.  

Do you want me to do that?
```
