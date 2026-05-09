
# 📊 Product Price Analyzer

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Lambda](https://img.shields.io/badge/Java-Lambda%20Expressions-orange?style=for-the-badge)
![Stream](https://img.shields.io/badge/Java-Stream%20API-red?style=for-the-badge)

A Java program that reads product data from a CSV file, calculates the **average price** of all products, and lists products with prices **below the average** in **descending order** of name.

## 📋 Problem Description

The program reads a CSV file containing product information (name and price). It then:
1. Calculates the **average price** of all products
2. Lists the **names of products** whose price is **below the average**
3. Displays the names in **descending alphabetical order** (Z → A)

## 📁 Input File Format

The CSV file should have the following format:
```
ProductName,Price
```

### Example (`in.txt`):
```
Tv,900.00
Mouse,50.00
Tablet,350.50
HD Case,80.90
Computer,850.00
Monitor,290.00
```

## 🎯 Example Execution

```
Enter full file path: c:\temp\in.txt
Average price: 420.23
Tablet
Mouse
Monitor
HD Case
```

### Step-by-step explanation:

| Product | Price | Below Avg? | Sorted Descending |
|---------|-------|------------|-------------------|
| Tv | 900.00 | No | - |
| Mouse | 50.00 | Yes | Tablet |
| Tablet | 350.50 | Yes | Mouse |
| HD Case | 80.90 | Yes | Monitor |
| Computer | 850.00 | No | HD Case |
| Monitor | 290.00 | Yes | - |

**Average calculation:** (900 + 50 + 350.5 + 80.9 + 850 + 290) / 6 = 420.23





📌 *Original problem from Lambda Expressions lesson — Java course by Prof. Dr. Nelio Alves*
