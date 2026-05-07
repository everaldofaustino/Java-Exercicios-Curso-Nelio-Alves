
# 📚 Course Enrollment Analyzer

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Set](https://img.shields.io/badge/Data%20Structure-Set-orange?style=for-the-badge)
![Algorithm](https://img.shields.io/badge/Algorithm-Union-red?style=for-the-badge)

A Java program that reads student enrollment data from three courses (A, B, and C) and calculates the **total number of distinct students** enrolled with a specific instructor — handling duplicate enrollments across multiple courses.

## 📋 Problem Description

In an online learning platform, each student has a unique integer code. An instructor can have multiple courses, and a student can enroll in as many courses as they want. Therefore, the total number of students for an instructor is **not simply the sum** of students from each course — duplicates across courses must be counted only once.

Instructor Alex has three courses: **A**, **B**, and **C**. The program reads the list of students enrolled in each course and outputs the total number of **distinct students** enrolled with Alex.

## 📥 Input Format

The program reads interactively:

1. Number of students in Course A, followed by their student codes
2. Number of students in Course B, followed by their student codes
3. Number of students in Course C, followed by their student codes

## 📤 Output Format

```
Total students: X
```

Where `X` is the number of unique students across all three courses.

## 🎯 Example

```
How many students for course A? 3
21
35
22

How many students for course B? 2
21
50

How many students for course C? 3
42
35
13

Total students: 6
```

**Explanation:** The unique students are {21, 22, 35, 42, 50, 13} — 6 distinct students total.



## 🧠 How It Works

The program uses a `Set<Integer>` data structure (specifically `HashSet`) to store student codes. Since sets automatically handle duplicates:

1. Create an empty set to store all students
2. For each course:
    - Read the number of students
    - Read each student code and add it to the set
3. The set size at the end equals the number of **distinct students**

This approach provides **O(1)** average time complexity for insertions and automatically eliminates duplicates across courses.

## 🛠️ Technologies Used

- **Java 17+**
- `Set<Integer>` interface with `HashSet` implementation
- `Scanner` for user input


## 💡 Key Concepts Demonstrated

- **Set data structure** for handling unique elements
- **Union operation** concept across multiple collections
- **Input validation** and interactive user prompts
- **Time complexity optimization** using HashSet

## 📊 Complexity Analysis

| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Insert student | O(1) average | O(n) |
| Get total | O(1) | - |

Where `n` is the total number of student enrollments across all courses.

---

📌 *Original problem from the Set lesson — Java course by Prof. Dr. Nelio Alves*
