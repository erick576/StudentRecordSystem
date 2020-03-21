# StudentRecordSystem

## Description
A University Student Record System GUI Application that can hold students and access their Courses, GPA, etc in Real Time

## Project Structure

    |   ├── .github/ISSUE_TEMPLATE  
    |   ├── .metadata
    |   ├── StudentRecordSystem
    |   |    ├── .settings
    |   |    └── org.eclipse.jdt.core.prefs
    │   ├── src
    |   |    ├── Application
    |   |    |    ├── AddTable.java
    |   |    |    ├── Main.java
    |   |    |    ├── Table.java
    |   |    |    └── application.css
    |   |    ├── Controller
    |   |    |    ├── AddTableController.java
    |   |    |    ├── InvalidFileException.java
    |   |    |    ├── StudentDatabaseApplicationController.java
    |   |    |    └── TableController.java
    |   |    ├── Model
    |   |    |    ├── Course.java
    |   |    |    ├── CourseCapacityReached.java
    |   |    |    ├── DomesticStudent.java
    |   |    |    ├── InternationalStudent.java
    |   |    |    ├── Student.java
    |   |    |    └── StudentManagmentDatabase.java
    |   |    ├── Test
    |   |    |    ├── AllTests.java
    |   |    |    └── StudentDatabaseTest.java
    |   |    ├── View
    |   |    |    ├── AddTableView.fxml
    |   |    |    ├── StudentDatabaseApplicationView.fxml
    |   |    |    └── TableView.fxml
    |   |    └── img
    |   |    |    └── picture.png
    │   ├── .classpath
    │   ├── .gitignore
    |   ├── .project
    │   └──  build.fxbuild
    ├── .gitignore
    ├── LICENSE
    └── README.md

## Design Pattern

Model–View–Controller
Model | View | Controller
--- | --- | ---

* Model: Student and Course Objects With All Necessary Parameters
* View: Implemented using JavaFX.
* Controller: Mouse, Editing and Key Listeners

## Steps To Run Application
| *Steps* |
|----|
|**1.** Go Onto Releases And Press [First Release](https://github.com/erick576/StudentRecordSystem/releases/tag/v1.0)|
|**2.** Download The Application.jar File|
|**3.** Open The File in Your Command Prompt|
|**4.** Type ```java -jar Application.jar```|
|**5.** Use the Application|
