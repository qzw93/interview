#!/bin/sh

javac -classpath /usr/share/java/junit-3.8.2.jar studentinfo/*.java
java -cp $PWD:/usr/share/java/junit4-3.8.2.jar org.junit.runner.JUnitCore studentinfo.AllTests

