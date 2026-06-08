# contact-book-java

A simple Java console application I built to manage contacts 
from the command line. You can add, search, delete and list 
contacts — all stored using a HashMap for fast lookup.

---

## What it does

- Add a new contact with name, phone number and email
- Search any contact instantly by name
- Delete a contact by name
- List all saved contacts at once

---

## How to run it

**On your own machine**

```bash
javac Contact.java ContactBook.java Main.java
java Main
```

---

## Project structure

Contact.java        - stores one contact's data (name, number, email)


ContactBook.java    - manages all contacts using HashMap


Main.java           - handles the menu and user input

---

## What I learned building this

This was my second Java project built completely from scratch. 
I used HashMap to store contacts with name as key and Contact 
object as value for fast retrieval. I split the logic across 
3 classes to keep each file responsible for one job only. 
This taught me the basics of OOP thinking before formally 
studying OOP concepts.

---

## Author

Sukanya Korivi — ECE Graduate 2025, learning Java and DSA

GitHub: https://github.com/SukanyaKorivi
