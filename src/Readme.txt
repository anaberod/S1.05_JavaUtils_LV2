
README - Java Exercise: Configuration-Based Directory Listing
=============================================================

This document explains how to compile and run the Level 2 Exercise 1
from the command line using relative paths and standard Java tools.

----------------------------------------------------------------
Level 2 - Exercise 1: Recursive directory listing using configuration
----------------------------------------------------------------
Compile:
    javac -d out src\main\java\org\example\Main.java

Run:
    java -cp out org.example.Main

Configuration file:
    - Place 'config.properties' in the project root.
    - Example content:

        input.directory=src
        output.file=output.txt

Output:
    Creates 'output.txt' in the project root containing the full
    directory tree of the folder defined in 'input.directory'.

Notes:
    - All paths must be relative (e.g., 'src' not 'C:\Users\...')
    - Use File.separator in Java code to ensure cross-platform compatibility.
