# Code Review and Refactoring Report

## Assignment tasks

### Task 1 - Reverse engineering
The Java project was reverse engineered by generating a UML class diagram from the source code. The generated diagram was exported and placed inside the `UML` directory.

Available UML files:

- `hotel-management-class-diagram.png`
- `hotel-management-class-diagram.svg`
- `hotel-management-class-diagram.puml`
- `hotel-management-class-diagram.dot`

### Task 2 - Code review
The code was inspected to identify maintainability and configuration issues. The review focused on build configuration, naming conventions, repeated code, resource handling, and database connection structure.

## Issues found

| No. | Issue | Effect |
|---:|---|---|
| 1 | Old Java source/target settings were used | Project may fail with newer JDK versions |
| 2 | A library path pointed to an absolute Windows location | Project becomes machine-dependent |
| 3 | JDBC closing logic was repeated in several classes | Code duplication and harder maintenance |
| 4 | Some resources were closed without enough safety checks | Possible runtime exceptions |
| 5 | Database connection values were hard-coded directly inside logic | Less readable and harder to modify |
| 6 | Debug printing existed inside database classes | Unprofessional output during execution |
| 7 | The class name `testing` did not follow Java naming style | Reduced readability and convention compliance |

## Refactoring performed

The following changes were applied:

1. Updated NetBeans project properties to use Java 8 build settings.
2. Corrected the `jcalendar` path to use the local `lib` folder.
3. Created `DatabaseResourceUtil` for safe JDBC resource closing.
4. Updated database classes to call the shared resource utility where suitable.
5. Improved `DataBaseConnection` by extracting database driver and URL constants.
6. Improved exception handling for database connection failure.
7. Removed unnecessary debug statements.
8. Improved visibility of database class fields where appropriate.
9. Renamed `testing` to `BookingDiaryPreview` to follow Java class naming conventions.
10. Added `.gitignore` to avoid uploading generated build folders and IDE private files.

## Verification

The project was checked after refactoring using:

```bash
ant clean jar
```

Build result:

```text
BUILD SUCCESSFUL
```

## Notes

The refactoring was intentionally limited to safe changes. The goal was to improve code quality without redesigning the whole project or changing the Swing UI behavior.
