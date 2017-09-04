# Pencil Durability Kata
The goal of the Pencil Durability kata is to write a program that mimicks how a graphite pencil works. In this program you will use methods that simulate writing, point degradation, pencil sharpening, erasing, eraser degradation and text editing. This kata is meant to be designed and developed using Test-Driven Development (TDD).

More information about the Pencil Durability kata and instructions to write the kata can be found <a href="https://github.com/PillarTechnology/kata-pencil-durability"> here </a>.

# Running the tests
To run all the tests from the command line go the directory where the project was cloned and type 
    ```mvn clean test -Dtest=com.aim.PencilTest.java``` to run PencilTest.java or type  ```mvn clean test -Dtest=com.aim.EraserTest.java``` to run EraserTest.java.

To run a particular test from the command line go the directory where the project was cloned and type ```mvn clean test -Dtest=com.aim.PencilTest.java#methodName```. Change methodName for the name of the test you are interested in running. ex: ```mvn clean test -Dtest=com.aim.PencilTest.java#editTextTest```.

# Sample Run
The file Tester.java shows how to properly use all Pencil and Eraser methods. 

# Built with
- Java
- Maven (Dependency Management)
- JUnit (Unit Testing Framework)




