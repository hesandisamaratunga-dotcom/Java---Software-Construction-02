# Hensel Workbook – Theory Answers

## Chapter 1 – Introduction

### Question 1. “Java source code is compiled into files that can be executed on any standard system (e.g.,Windows, Linux).” True or false?
True.
The Java compiler (javac) turns your .java source file into a .class file containing bytecode, which is the same on every platform.
It runs on any system that has a JVM. (Java Virtual Machine)

### Question 2. What is the purpose of a compiler?
translates source code (.java) into bytecode (.class) and reports syntax errors.

### Question 3. What is the purpose of the JVM?
loads the bytecode and executes it on the specific platform by translating it into machine code.

### Question 4. Explain the differences between a source file and bytecode.
- Source file (.java): human-readable code you write. It can't be executed directly.
- Bytecode (.class): machine-readable output of the compiler. It's platform-independent and is executed by the JVM.