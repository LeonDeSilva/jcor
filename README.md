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

<br>

**Handler**

Modifier and Type       | Method and Description
------------------------|------------------------------------------------------------------------
boolean                 | <b>evaluate (I</b> input, <b>S</b> status) <br> Method to evaluate whether the current handler is capable for processing the given input and state object.
void                    | <b>process (I</b> input, <b>S</b> status) throws Exception <br> Method to do the processing of the handler.
boolean                 | <b>shouldExitChainAfterProcessing (S</b> status); <br> Method to let the executor know whether the processing should stop from the current handler or not.



**JCorExecutor**

Modifier and Type       | Method and Description
------------------------|------------------------------------------------------------------------
void                    | <b>addHandler (Handler<I, S></b> handler) <br> Method to add a handler to execution list
void                    | <b>execute (I</b> input, <b>S</b> status) throws Exception <br> Method to execute the given list of handlers for a given input and status object.