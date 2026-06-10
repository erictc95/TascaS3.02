# Tasca S3.02 - Design Patterns I

## 📖 Introduction

This project focuses on learning and applying the **SOLID principles** through different **Design Patterns** in Java.

The project includes implementations of the following patterns:

* Singleton
* Abstract Factory
* Strategy

The main objective is to build a software architecture that is:

* Scalable
* Reusable
* Low coupled
* Easy to maintain
* Easy to extend

All functionalities are validated through **JUnit 5 unit tests**.

---

## 🛠️ Technologies Used

* Java 21
* Maven
* JUnit 5

---

## 📁 Project Structure

```text
TascaS3.02
│
├── level1-singleton
├── level2-abstract-factory
├── level3-strategy
└── src/test
```

---

# 🔹 Level 1 — Singleton Pattern

## 📌 Description

Implementation of an `Undo` class using the **Singleton Design Pattern**.

This pattern guarantees that only one shared instance of the class exists during the entire application lifecycle.

The class simulates the basic behavior of an **Undo system**, similar to a Linux terminal command history.

---

## ✅ Features

The `Undo` class allows:

* Adding commands
* Undoing the last command
* Displaying command history

---

## 🧱 Implemented Requirements

* Private constructor
* Static `getInstance()` method
* Command history stored using `Stack` or `List`
* Unit tests implemented with JUnit

---

## 💻 Usage Example

```java
Undo undo = Undo.getInstance();

undo.addCommand("mkdir folder");
undo.addCommand("cd folder");

undo.showHistory();

// Output:
// mkdir folder
// cd folder

undo.undoCommand();

undo.showHistory();

// Output:
// mkdir folder
```

---

# 🔹 Level 2 — Abstract Factory Pattern

## 📌 Description

Implementation of an international contact manager using the **Abstract Factory Design Pattern**.

Each country has its own concrete factory responsible for generating:

* Addresses
* Phone numbers

formatted according to the selected country.

---

## 🏗️ Architecture

### Abstract Products

* Address
* Phone

### Abstract Factory

* ContactFactory

### Concrete Factories

* SpainContactFactory
* USAContactFactory

### Client

* Contact

---

## 🌍 Supported Formats

### Spain

**Address**

```text
Carrer Major 34, 08001 Barcelona
```

**Phone**

```text
+34 623 45 67 89
```

### USA

**Address**

```text
154 5th Avenue, New York, NY 10001
```

**Phone**

```text
+1 (098) 765-4321
```

---

## 💻 Usage Example

### Spain

```java
ContactFactory spainFactory = new SpainContactFactory(
        "Carrer Major 34",
        "Barcelona",
        "08001",
        "623456789"
);

Contact contactSpain = new Contact(spainFactory);

System.out.println(contactSpain);
```

### USA

```java
ContactFactory usaFactory = new USAContactFactory(
        "154 5th Avenue",
        "New York",
        "NY 10001",
        "987654321"
);

Contact contactUSA = new Contact(usaFactory);

System.out.println(contactUSA);
```

---

# 🔹 Level 3 — Strategy Pattern

## 📌 Description

Implementation of a flexible report generation system using the **Strategy Design Pattern**.

This pattern allows changing the report generation algorithm at runtime without modifying the main service class.

---

## ✅ Supported Report Formats

The system can generate reports in:

* HTML
* JSON
* XML
* PDF
* CSV
* Excel
* Word

---

## 🧱 Architecture

### Strategy Interface

* ReportStrategy

### Concrete Strategies

* HtmlReportStrategy
* JsonReportStrategy
* XmlReportStrategy
* PdfReportStrategy
* CsvReportStrategy
* ExcelReportStrategy
* WordReportStrategy

### Context / Service

* ReportService

---

## 💻 Usage Example

```java
ReportStrategy strategy = new JsonReportStrategy();

ReportService reportService = new ReportService(strategy);

reportService.generateReport();
```

---

# 🧪 Unit Tests

All levels include unit tests to validate:

* Correct pattern implementation
* Requirement compliance
* Expected outputs

Run all tests using:

```bash
mvn test
```

---

# ▶️ Running the Project

## Compile

```bash
mvn clean install
```

## Run

(Only if the project includes Spring Boot)

```bash
mvn spring-boot:run
```

---

# 🎯 Learning Objectives Achieved

* Application of SOLID principles
* Correct implementation of creational and behavioral patterns
* Separation of responsibilities
* Low coupling
* Extensible architecture
* Unit testing coverage

---

# 👨‍💻 Author

**Eric Tarrés Cabrisas**

