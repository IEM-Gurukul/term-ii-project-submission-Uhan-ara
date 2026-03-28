[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
***Personal Book Universe Tracker***

---

## Problem Statement (max 150 words)
Many readers crave stories that belong to different series and fictional universes, which is very much intriguing but also makes it difficult to organize reading lists and track progress across interconnected stories. Managing relationships between books, series and universes manually can become confusing, especially when multiple storylines overlap.

The *Personal Book Universe Tracker* is designed to help users organize books in a structured way by grouping them into series and universes while also tracking reading progress. The system allows users to add books, manage their reading status and search their collection efficiently. It also provides recommendations for the next book to read within a series. By structuring books hierarchically and storing the data persistently; the system helps readers maintain an organized private library and better understand connections between intertwined storylines.

---

## Target User
- Readers (book enthusiasts who follow multi-series or connected universes)

---

## Core Features

- Book Management

      -- Add new books

      -- Update book information

      -- Remove books 
- Universe and Series Organization

      -- Create fictional universes (e.g., Harry Potter Universe)

      -- Create series within universes

      -- Organize books under the appropriate series
- Reading Progress Tracking

      -Track pages read

      -Mark books as Reading / Completed / Planned
- Recommendation System

      -Suggest the next book to read based on series order

- Search Functionality

      -Search by title

      -Search by author

      -Search by universe or series

- Data Persistence

      -Save library data to file

      -Load saved data when the program starts

---

## OOP Concepts Used

- Abstraction: *an abstract Book class defines common properties and behavior shared by all book types*
- Inheritance: *specific book types such as **Novel**, **Comic** and **Manga** inherit from the base Book class*
- Polymorphism: *different subclasses of Book can implement behaviors such as reading progress tracking in their own way*
- Exception Handling: *used to handle invalid input, missing books, or incorrect operations within the system*
- Collections: *Java Collections such as ArrayList and HashMap are used to manage books, series and universes efficiently*

---

## Proposed Architecture Description
The system follows a **modular object-oriented architecture** where responsibilities are separated into different components.

- The **Book module** defines the abstract Book class and its subclasses (*Novel, Comic, Manga*), which represent different types of books and store attributes such as title, author, reading status, and progress.

- The **Series and Universe modules** organize books into hierarchical structures where books belong to a series and series belong to a universe.

- The **LibraryManager** acts as the central controller responsible for managing books, series, and universes. It handles operations such as adding books, updating progress, searching the library, and retrieving information.

- The **RecommendationEngine** suggests the next book to read based on the order of books in a series.

- The **FileManager** manages data persistence by saving and loading library information from files.

- The **Main module** provides a console-based interface that allows users to interact with the system and access its features.

---

## How to Run
1. Compile all Java source files in the project.

2. Run the Main class from the main package.

3. The console menu will appear with options such as:

    - Add Universe

    - Add Series

    - Add Book

    - Update Reading Progress

    - View Library

    - Recommend Next Book

    - Save and Exit

4. The system will store library data and reload it when the program starts again.

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
