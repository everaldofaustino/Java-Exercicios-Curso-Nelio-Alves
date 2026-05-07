# 🔐 Log Access Analyzer

https://img.shields.io/badge/Java-17%252B-ED8B00?style=for-the-badge&logo=java&logoColor=white
https://img.shields.io/badge/License-MIT-green?style=for-the-badge
https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge
https://img.shields.io/badge/File-IO-blue?style=for-the-badge
https://img.shields.io/badge/Data%2520Structure-Set-orange?style=for-the-badge



A simple Java program that reads a website access log file and counts the number of **distinct users** who accessed the site.

## 📋 Problem Description

The program reads a log file containing access records. Each record consists of:
- **Username** (a single word)
- **Timestamp** in ISO 8601 format (`YYYY-MM-DDThh:mm:ssZ`)

The goal is to count how many **unique users** accessed the site, ignoring duplicate entries from the same user.

## 📁 Input Format Example

```
amanda 2018-08-26T20:45:08Z
alex86 2018-08-26T21:49:37Z
bobbrown 2018-08-27T03:19:13Z
amanda 2018-08-27T08:11:00Z
jeniffer3 2018-08-27T09:19:24Z
alex86 2018-08-27T22:39:52Z
amanda 2018-08-28T07:42:19Z
```

## 🚀 How to Run

1. Compile the Java program:
   ```bash
   javac Program.java
   ```

2. Run the program:
   ```bash
   java Program
   ```

3. Enter the full path to the log file when prompted:
   ```
   Enter file full path: c:\temp\in.txt
   ```

## ✅ Example Output

```
Total users: 4
```

## 🧠 How It Works

The program uses a `Set<String>` data structure (specifically `HashSet`) to store usernames. Since sets do not allow duplicate elements, simply adding all usernames from the log automatically filters out duplicates — resulting in the count of distinct users.

## 🛠️ Technologies Used

- **Java**
- `Set` interface with `HashSet` implementation
- File I/O (`BufferedReader`, `FileReader`)


---

📌 *Original problem from the Set lesson — Java course by Prof. Dr. Nelio Alves*