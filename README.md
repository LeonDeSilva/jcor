# JCOR

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/LeonDeSilva/jcor/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/LeonDeSilva/jcor.svg?branch=master)](https://travis-ci.org/LeonDeSilva/jcor)

**A Java Library for Chain of Responsibility Design Pattern**

**Why do you need JCOR**

Have you got long if else statements that makes the code highly unreadable?
Does SonarQube show high cyclomatic complexity because of these if else statements?

Chain of responsiblity is the solution for these problems.
JCOR is a library to help you implement Chain Of Responsibility (COR).

**How easy to use it**

Implement the Handler interface and create the set of nodes which is equal to one execution path of your 'if', 'else if' or 'else' statement.
Create a JCorExecutor instance and add your handlers and simply execute it.
