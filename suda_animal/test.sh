#!/bin/sh

javac -classpath /usr/share/java/junit4-4.11.jar src/*.java
java -cp $PWD:/usr/share/java/junit4-4.11.jar org.junit.runner.JUnitCore src.Active_test

