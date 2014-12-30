@echo off
javac -source 1.5 -classpath c:\junit3.8.1\junit.jar studentinfo\*.java
if errorlevel 1 goto exit
start /b java -cp .;c:\junit3.8.1\junit.jar junit.awtui.TestRunner studentinfo.AllTests
:exit