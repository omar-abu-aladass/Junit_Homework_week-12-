# Hotel Management System - UML and Refactored Version

This NetBeans Java Swing project contains a reviewed and improved version of the Hotel Management System source code.
The project also includes a UML class diagram generated from the Java source files as part of reverse engineering.

## Project content

```text
src/        Java source code
lib/        Required external JAR libraries
UML/        Generated UML class diagram files
res/        Application resources and icons
nbproject/  NetBeans project configuration
```

## UML class diagram

The generated UML diagram is stored in the `UML` folder in multiple formats:

```text
UML/hotel-management-class-diagram.png
UML/hotel-management-class-diagram.svg
UML/hotel-management-class-diagram.puml
UML/hotel-management-class-diagram.dot
```

## Refactoring overview

The source code was reviewed and refactored with a conservative approach. The main goal was to improve maintainability while keeping the original application behavior unchanged.

Main improvements include:

- Updating outdated Java build settings.
- Fixing local library paths for NetBeans.
- Improving database connection handling.
- Adding a shared utility class for closing JDBC resources safely.
- Renaming a test-style UI class to a clearer class name.
- Removing unnecessary debug output.
- Adding a `.gitignore` file for generated build files.

## How to open

Open the folder directly in NetBeans as an existing project.

## How to build

The project can be built with NetBeans or with Ant:

```bash
ant clean jar
```

For details, see:

```text
CODE_REVIEW_AND_REFACTORING.md
GITHUB_SUBMISSION_GUIDE.md
```
