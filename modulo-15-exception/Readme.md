# Exercício: Tratamento de Exceções em Saque Bancário

## 📋 Descrição

Este exercício consiste em implementar um sistema simples de conta bancária com tratamento de exceções para operações de saque. O programa deve ler os dados de uma conta bancária e realizar um saque, validando duas condições:

1. O valor do saque não pode exceder o saldo disponível
2. O valor do saque não pode exceder o limite de saque da conta

Se alguma das condições for violada, uma exceção deve ser lançada com a mensagem de erro apropriada.

## 🎯 Objetivos

- Praticar o conceito de **exceções** em Java
- Implementar **validações** em operações bancárias
- Utilizar **classes personalizadas** de exceção
- Aplicar **encapsulamento** e **boas práticas** de programação

## 📊 Diagrama da Classe

| **Account** |
|---|
| - number : Integer |
| - holder : String |
| - balance : Double |
| - withdrawLimit : Double |
| + deposit(amount : Double) : void |
| + withdraw(amount : Double) : void |

## 🔧 Funcionalidades

### Métodos Implementados

- **`deposit(double amount)`** - Adiciona um valor ao saldo da conta
- **`withdraw(double amount)`** - Realiza o saque com validações:
    - Verifica se o valor do saque não ultrapassa o limite disponível
    - Verifica se o valor do saque não ultrapassa o saldo da conta
    - Lança exceções personalizadas quando as condições são violadas

### Exceções

Foi implementada uma exceção personalizada `AccountException` (ou `BusinessException`) para tratar os erros de negócio:

- **"Not enough balance"** - Quando o valor do saque é maior que o saldo disponível
- **"The amount exceeds withdraw limit"** - Quando o valor do saque é maior que o limite permitido

## 💻 Exemplos de Execução

### ✅ Caso 1: Saque Válido

```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00
```

### ❌ Caso 2: Saque com Valor Acima do Limite

```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit
```

### ❌ Caso 3: Saque com Valor Acima do Limite (800.00)

```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit
```

### ❌ Caso 4: Saque com Saldo Insuficiente

```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance
```

## 🏗️ Estrutura do Projeto

```
modulo-15-exceptions/
├── src/
│   ├── application/
│   │   └── Program.java          # Classe principal com interface do usuário
│   ├── entities/
│   │   └── Account.java          # Classe Account com regras de negócio
│   └── exceptions/
│       └── AccountException.java # Classe de exceção personalizada
```

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/acenelio/exceptions2-java.git
```

2. Abra o projeto em sua IDE preferida (IntelliJ IDEA, Eclipse, etc.)

3. Execute a classe `Program.java`

4. Siga as instruções no console para:
    - Inserir os dados da conta
    - Realizar uma operação de saque
    - Visualizar o resultado

## 📝 Código Exemplo

### Account.java (Método withdraw)

```java
public void withdraw(double value) {
    if (balance < value) {
        throw new AccountException("Not enough balance");
    }
    if (withdrawLimit < value) {
        throw new AccountException("The amount exceeds withdraw limit");
    }
    balance -= value;
}
```

### Program.java (Tratamento da Exceção)

```java
try {
    account.withdraw(amount);
    System.out.printf("New balance: %.2f%n", account.getBalance());
} catch (AccountException e) {
    System.out.println("Withdraw error: " + e.getMessage());
}
```

## 📚 Conceitos Aprendidos

- **Try-catch**: Bloco para tratamento de exceções
- **Exceções personalizadas**: Criação de classes que estendem `RuntimeException` ou `Exception`
- **Validações de negócio**: Implementação de regras em métodos da classe
- **Encapsulamento**: Uso de métodos getters/setters e atributos privados
- **Lançamento de exceções**: Uso da palavra-chave `throw`

## 🔗 Referências

- [Repositório Original do Exercício](https://github.com/acenelio/exceptions2-java)
- [Documentação Java sobre Exceções](https://docs.oracle.com/javase/tutorial/essential/exceptions/)

---

**Autor:** Exercício baseado no curso de Java do professor Nélio Alves  
**Licença:** Este projeto é livre para uso educacional