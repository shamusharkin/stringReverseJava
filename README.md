# Java with Gradle

## Setup Instructions

1. Fork and clone this repository
1. Open IntelliJ
1. Click on "Import Project" and navigate to where you cloned the repository
1. Click "Next" until the workspace appears, you will see a notification about linking the Gradle project, select it and link the project as it suggests

## Your Task

Go methodically through the provided test code in `PlaylistTest`, uncommenting each test as you make the previous one pass. Your flow should be red, green, refactor at all steps.

_Hints_: [`ArrayList`](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)

## Stretch

If you were able to complete the Playlist exercise, begin writing the tests (and eventually code) for a vending machine. You may make this software as simple or as complex as you would like.

In order to set up a new Gradle project in IntelliJ, go to "File -> New -> Project" and select "Gradle" from the options in the left pane. Enter a value for the "ArtifactId" and click "Next". Fill in a "Project Name" and path for the project and click "Next". Finally, open the project in a New Window.

Next you will want to create a few directories either at the command line or using IntelliJ:

```
mkdir -p src/main/java
mkdir -p src/test/java
```

Back in IntelliJ, begin by creating the shell for the class you would like by right clicking on the "src/main/java" directory, first make this the source root by selecting "Mark Directory As -> Source Root". Right click on the same directory again and then select "New -> Java Class". Similarly for the `src/test/java` directory, mark it as the Test Directory.

After creating your class, hover around the name and select "Create Test". On this menu select "JUnit 4" at the top of the dialogue box and click "OK." You should now be configured to write tests.
