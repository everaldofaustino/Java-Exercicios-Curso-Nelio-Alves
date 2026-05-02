# Loan Interest Calculator - Brazil

A simple Java program to calculate loan payments using Brazil's standard compound interest rate of 2% per month.

## How it works

The program reads:
- **Loan amount** (in currency units)
- **Loan duration** (in months)

Then calculates the total payment after the loan period using compound interest formula.

## Formula

```
Payment = amount × (1 + interestRate)ᵐᵒⁿᵗʰˢ
```

Where `interestRate = 0.02` (2% per month)

## Example

| Input | Value |
|-------|-------|
| Amount | 200.00 |
| Months | 3 |

**Calculation:**
```
200 × 1.02 × 1.02 × 1.02 = 200 × (1.02)³ = 212.2416
```

**Output:**
```
Pagamento após 3 meses:
212.24
```

## Class Diagram

```
BrazilianInterestService
├── interestRate : double
└── payment(amount : double, months : int) : double
```

## Requirements

- Java 8 or higher

## How to run

1. Compile the program
2. Run the main class
3. Enter the loan amount when prompted
4. Enter the number of months
5. View the total payment amount

## Usage Example

```
Quantia: 200.00
Meses: 3
Pagamento após 3 meses:
212.24
```

## Notes

- Interest rate is fixed at 2% per month (Brazilian standard)
- Uses compound interest (juros compostos)
- Results are rounded to 2 decimal places