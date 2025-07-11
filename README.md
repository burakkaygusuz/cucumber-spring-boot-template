# 🥒 Cucumber Spring Boot Test Automation Template

A comprehensive Spring Boot project template designed for **BDD test automation**. Built with Cucumber BDD framework and modern testing tools. This template provides a solid foundation that can be extended for Web, Mobile, and REST API test automation.

## 🚀 Features

- ✅ **Spring Boot 3.5.3** with modern Java 21 support
- ✅ **Cucumber 7.23.0** for BDD test writing
- ✅ **TestNG** test runner support
- ✅ **Allure Reporting** for detailed test reports
- ✅ **Jackson** for JSON processing
- ✅ **AssertJ** for powerful assertions
- ✅ **Google Java Format** for code formatting
- ✅ **Spring Boot Test** for integration testing

## 📁 Project Structure

```
cucumber-spring-boot-template/
├── src/
│   ├── main/java/
│   │   └── io/github/burakkaygusuz/template/
│   │       └── CucumberSpringBootTemplateApplication.java
│   └── test/java/
│       └── io/github/burakkaygusuz/template/
│           ├── config/
│           │   └── CucumberSpringConfiguration.java
│           ├── runner/
│           │   └── TestRunner.java
│           └── steps/
│               └── PlaceholderSteps.java
├── pom.xml
├── testng.xml
└── README.md
```

## 🛠️ Prerequisites

- **Java 21** or higher
- **Maven 3.6+**
- **IDE** (IntelliJ IDEA, Eclipse, VS Code)

## 📦 Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/burakkaygusuz/cucumber-spring-boot-template.git
   cd cucumber-spring-boot-template
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Open the project in your IDE**

## 🏃‍♂️ Running Tests

### Running Tests with Maven
```bash
# Run all tests
mvn test

# Run tests with specific tags
mvn test -Dcucumber.filter.tags="@smoke"

# Run tests in parallel
mvn test -Ddataproviderthreadcount=4
```

### Running Tests from IDE
- Run `TestRunner.java` file
- Or run `testng.xml` file

## 📊 Test Reports

### Allure Reports
```bash
# Generate Allure report
mvn allure:report

# Open Allure report
mvn allure:serve
```

Reports are generated in `target/allure-report/` directory.

## 🎯 Writing Test Scenarios

### 1. Creating Feature Files
Add `.feature` files to `src/test/resources/features/` directory:

```gherkin
Feature: Placeholder Feature

  Scenario: Placeholder Scenario
    Given a placeholder step
```

### 2. Creating Step Definitions
Add step definitions to `src/test/java/.../steps/` directory:

```java
public class PlaceholderSteps {

  @Given("a placeholder step")
  public void a_placeholder_step() {
    // This is a placeholder step for demonstration purposes.
    // You can add your implementation here if needed.
    System.out.println("Placeholder step executed.");
  }
}
```

## 🔧 Configuration

### TestNG Configuration
Configure test suite settings in `testng.xml`:

```xml
<suite name="CucumberTestSuite" parallel="methods" thread-count="4">
    <test name="CucumberTest">
        <classes>
            <class name="io.github.burakkaygusuz.template.runner.TestRunner"/>
        </classes>
    </test>
</suite>
```

### Cucumber Configuration
Configure Cucumber settings in `TestRunner.java`:

```java
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"io.github.burakkaygusuz.template.steps", "io.github.burakkaygusuz.template.config"},
    plugin = {
      "pretty",
      "html:target/cucumber-reports.html",
      "json:target/cucumber-reports/Cucumber.json",
      "junit:target/cucumber-reports/Cucumber.xml",
      "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    }
)
```

## 🎨 Code Formatting

The project uses Google Java Format:

```bash
# Check code format
mvn com.spotify.fmt:fmt-maven-plugin:check

# Format code
mvn com.spotify.fmt:fmt-maven-plugin:format
```

## 🚀 Advanced Features

### 1. Parallel Test Execution
```bash
mvn test -Ddataproviderthreadcount=4
```

### 2. Test Filtering with Tags
```bash
# Note: Add tags to your feature files first
mvn test -Dcucumber.filter.tags="@smoke and not @wip"

# Example: Run tests without any filter
mvn test
```

### 3. Environment Variables
```bash
mvn test -Dspring.profiles.active=test -Dapi.base.url=https://api.example.com
```

## 📝 Best Practices

### 1. Test Organization
- Keep feature files organized by functionality
- Use meaningful scenario names
- Group related steps in the same step definition class

### 2. Test Data Management
- Use external data sources (JSON, CSV, YAML)
- Implement data builders for test objects
- Use parameterized tests for data-driven testing

### 3. Test Maintenance
- Follow Page Object Model for UI tests
- Use proper assertion messages
- Implement proper error handling

## 🧪 Current Template Status

This template currently includes:
- ✅ **Basic Cucumber BDD structure** with Spring Boot integration
- ✅ **TestNG test runner** with parallel execution support
- ✅ **Allure reporting** integration
- ✅ **Placeholder feature and step definitions** for demonstration

### Extending the Template

This template can be extended for:
- **REST API Testing** - Add REST Assured or WebTestClient
- **Web UI Testing** - Add Selenium WebDriver dependencies
- **Mobile Testing** - Add Appium dependencies

## 📄 License

This project is licensed under the MIT License.

## 👨‍💻 Author

**Burak Kaygusuz**
- GitHub: [@burakkaygusuz](https://github.com/burakkaygusuz)
- LinkedIn: [burakkaygusuz](https://linkedin.com/in/burakkaygusuz)

---

⭐ If you find this project helpful, please give it a star!
