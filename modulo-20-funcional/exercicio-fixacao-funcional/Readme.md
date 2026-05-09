
# 👔 Employee Salary Analyzer

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Lambda](https://img.shields.io/badge/Java-Lambda%20Expressions-orange?style=for-the-badge)
![Stream](https://img.shields.io/badge/Java-Stream%20API-red?style=for-the-badge)

A Java program that reads employee data from a CSV file, filters employees based on salary criteria, and performs two data analysis operations using **Lambda Expressions** and **Stream API**.

## 📋 Problem Description

The program reads a CSV file containing employee information (name, email, and salary). It then performs two analyses:

1. **Email listing** - Shows emails (in alphabetical order) of employees whose salary is **above a user-specified value**
2. **Salary sum** - Calculates the sum of salaries of employees whose **name starts with the letter 'M'**

## 📁 Input File Format

The CSV file should have the following format:
```
Name,Email,Salary
```

### Example (`in.txt`):
```
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00
```

## 🎯 Example Execution

```
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00

Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com

Sum of salary of people whose name starts with 'M': 4900.00
```

### Step-by-step breakdown:

| Name | Email | Salary | > 2000? | Name starts with 'M'? |
|------|-------|--------|---------|----------------------|
| Maria | maria@gmail.com | 3200.00 | ✅ Yes | ✅ Yes |
| Alex | alex@gmail.com | 1900.00 | ❌ No | ❌ No |
| Marco | marco@gmail.com | 1700.00 | ❌ No | ✅ Yes |
| Bob | bob@gmail.com | 3500.00 | ✅ Yes | ❌ No |
| Anna | anna@gmail.com | 2800.00 | ✅ Yes | ❌ No |

**Results:**
- Emails > 2000: `anna@gmail.com`, `bob@gmail.com`, `maria@gmail.com` (alphabetical)
- Sum of 'M' names: 3200.00 + 1700.00 = 4900.00

## 📝 Example Output Format

```
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00

Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com

Sum of salary of people whose name starts with 'M': 4900.00
```

---

📌 *Original problem from Lambda Expressions lesson — Java course by Prof. Dr. Nelio Alves*
```