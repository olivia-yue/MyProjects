# Rest API Test

This is an api test for "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false". 
It will check:
- Name = "Carbon credits"
- CanRelist = true
- The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"

## Setting up the automation environment
1. Install java sdk, the version is 1.8. Make sure JAVA_HOME environment variable is set and points to the JDK installation
2. Install maven (Refer to: https://maven.apache.org/install.html)
3. Install IDE like Eclipse (optional)

## Two ways to run the automation test

### Run test using maven command dierctly
1. Download the code via: $ git clone "https://github.com/olivia-yue/MyProjects.git"
2. Navigate to "restapi-test": $ cd MyProjects/restapi-test
3. Run the commend in console: $ mvn test
4. After the testing is finished, the report can be checked from "MyProjects/restapi-test/target/surefire-reports/index.html"

### Run test from the IDE (e.g. Eclipse)
1. Download the code via: $ git clone "https://github.com/olivia-yue/MyProjects.git"
2. Navigate to "restapi-test": $ cd MyProjects/restapi-test
3. Launch Eclipse, switch to Java Perspective
4. Import a Maven project, navigate to "restapi-test" folder and choose the **pom.xml** file
5. In Eclipse's Package Explorer, expand src/test/java/nz.net.catalyst.crashhub.funtion.testsuites
6. Right-click at "src/test/java/com.olivia.restapi.actest/CategoriesTest.java" and choose 'Run as TestNG Test' 
