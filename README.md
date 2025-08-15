
# Hello Java Web

A simple Java web application packaged as a WAR file using Maven, with CI/CD integration via Jenkins.

---

## 📌 Project Overview
![App Homepage](docs/images/app-homepage.png)

This project is a minimal Java web app built using:
- **Java Servlet**
- **JSP**
- **Maven** (for build & dependency management)
- Packaged as `.war` for deployment to any Java servlet container (Tomcat, Jetty, etc.)
- Integrated with **Jenkins** for automated build and packaging.

---

## 🛠️ Tech Stack
- **Java** 8+  
- **Maven** 3.8+  
- **Servlet API**  
- **JSP**  
- **Jenkins** (optional for CI/CD)

---

## 📂 Project Structure
![Project Structure](docs/images/project-structure.png)


```

hello-java-web/  
├── pom.xml  
└── src/  
├── main/  
│ ├── java/  
│ │ └── com/example/HelloServlet.java  
│ └── webapp/  
│ ├── index.jsp  
│ └── WEB-INF/web.xml

```

---

## 🚀 Build & Run

### **1. Build with Maven**
```bash
mvn clean package

```

This will create:

```
target/hello-java-web-1.0-SNAPSHOT.war

```

### **2. Deploy to Tomcat**

1.  Copy the WAR file to Tomcat’s `webapps` directory:
    
    ```bash
    cp target/hello-java-web-1.0-SNAPSHOT.war $TOMCAT_HOME/webapps/
    
    ```
    
2.  Start Tomcat:
    
    ```bash
    $TOMCAT_HOME/bin/startup.sh
    
    ```
    
3.  Access the app at:
    
    ```
    http://localhost:8080/hello-java-web-1.0-SNAPSHOT
    
    ```
    

----------

## ⚙️ Jenkins CI/CD Setup

### **Jenkins Build Success**

![Jenkins Build Success](https://chatgpt.com/c/docs/images/jenkins-build-success.png)

### **Pipeline View**

![Jenkins Pipeline](https://chatgpt.com/c/docs/images/jenkins-pipeline.png)

----------

### **Steps to Set Up in Jenkins**

1.  **Create a Freestyle Project** in Jenkins.
    
2.  **Source Code Management** → Select `Git` → Add repo URL.
    
3.  **Build Triggers** → Optional: Poll SCM or use GitHub webhook.
    
4.  **Build Step**:
    
    -   Add **Invoke top-level Maven targets**
        
    -   Maven version: `Maven-3.8.6` (configured in _Global Tool Configuration_)
        
    -   Goals:
        
        ```
        clean package
        
        ```
        
5.  **Post-build Actions**:
    
    -   Archive artifacts:
        
        ```
        target/*.war
        
        ```
        

----------

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](https://chatgpt.com/c/LICENSE) file for details.

----------

## 🤝 Contributing

Pull requests are welcome!  
For major changes, please open an issue first to discuss what you’d like to change.

----------

