# 📋 Exercício - Processamento de Contratos com Serviço de Pagamento Online

Este exercício faz parte do curso de Java do Professor Nélio Alves (DevSuperior) e tem como objetivo praticar **interfaces**, **service layer design**, **encapsulamento** e **boas práticas** com Java.

---

## 🎯 Descrição do Problema

Uma empresa deseja automatizar o processamento de seus contratos. O processamento consiste em gerar as parcelas a serem pagas para um determinado contrato, com base no número de meses desejado.

A empresa utiliza um serviço de pagamento online que cobra:
- **Juros simples** de 1% ao mês sobre o valor da parcela (proporcional ao número da parcela)
- **Taxa de pagamento** de 2% sobre o valor corrigido

O serviço contratado atualmente é o **PayPal**.

---

## ✅ Regras de Negócio

1. O valor de cada parcela é calculado como: `valorTotal / numeroParcelas`
2. A cada parcela, aplica-se juros simples de 1% multiplicado pelo número da parcela
3. Sobre o valor com juros, aplica-se taxa de pagamento de 2%
4. A data de vencimento de cada parcela é acrescida de meses a partir da data do contrato:
    - 1ª parcela: data do contrato + 1 mês
    - 2ª parcela: data do contrato + 2 meses
    - E assim sucessivamente

---

## 📦 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java
├── model/
│   ├── entities/
│   │   ├── Contract.java
│   │   └── Installment.java
│   └── services/
│       ├── ContractService.java
│       ├── OnlinePaymentService.java (interface)
│       └── PaypalService.java
```

---

## 🧱 Domain Layer (Entities)

### Contract
| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `number` | `Integer` | Número do contrato |
| `date` | `LocalDate` | Data do contrato |
| `totalValue` | `Double` | Valor total do contrato |
| `installments` | `List<Installment>` | Lista de parcelas |

### Installment
| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `dueDate` | `LocalDate` | Data de vencimento da parcela |
| `amount` | `Double` | Valor da parcela |

---

## ⚙️ Service Layer Design

### OnlinePaymentService (interface)
Define o contrato para qualquer serviço de pagamento online.

```java
public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
```

### PaypalService (implementação concreta)
Implementa as regras do PayPal:
- `interest(amount, months)` → retorna `amount * 0.01 * months`
- `paymentFee(amount)` → retorna `amount * 0.02`

### ContractService
Responsável pelo processamento do contrato.

```java
public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    
    public void processContract(Contract contract, int months) {
        // Lógica de geração das parcelas
    }
}
```

---

## 🧮 Exemplo de Cálculo

**Dados de entrada:**
- Número: `8028`
- Data: `25/06/2018`
- Valor: `600.00`
- Parcelas: `3`

**Cálculo:**
- Valor base por parcela: `600.00 / 3 = 200.00`

| Parcela | Juros (1% × n) | Valor com juros | Taxa (2%) | Valor final |
|---------|----------------|-----------------|-----------|-------------|
| #1 | 200 × 0.01 × 1 = 2.00 | 202.00 | 4.04 | **206.04** |
| #2 | 200 × 0.01 × 2 = 4.00 | 204.00 | 4.08 | **208.08** |
| #3 | 200 × 0.01 × 3 = 6.00 | 206.00 | 4.12 | **210.12** |

**Datas de vencimento:**
- Parcela #1: `25/07/2018`
- Parcela #2: `25/08/2018`
- Parcela #3: `25/09/2018`

---

## 🖥️ Exemplo de Execução

```
Entre os dados do contrato:
Número: 8028
Data (dd/MM/yyyy): 25/06/2018
Valor do contrato: 600.00
Entre com o numero de parcelas: 3

Parcelas:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12
```

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- `java.time.LocalDate` para manipulação de datas
- `java.time.format.DateTimeFormatter` para formatação
- Programação orientada a interfaces
- Injeção de dependência

---

## 📚 Conceitos Aplicados

✅ **Interfaces** - Definindo contratos para serviços  
✅ **Injeção de dependência** - Acoplamento fraco entre classes  
✅ **Encapsulamento** - Getters/setters e lista privada  
✅ **Composição** - Contract contém Installments  
✅ **Separação de responsabilidades** - Domain vs Service layers  
✅ **Boas práticas Java** - Uso de `LocalDate`, formatação, etc.





---



## 🧪 Testes

### Teste 1: Contrato com 1 parcela
- Entrada: Valor = 100.00, 1 parcela
- Saída esperada: Valor final = 100 + 1% + 2% = 103.02

### Teste 2: Contrato com 6 parcelas
- Entrada: Valor = 1200.00, 6 parcelas
- Valor base = 200.00
- Parcela #6: 200 + 12% (1%×6) = 224 + 2% = 228.48

### Teste 3: Data em ano bissexto
- Verificar se `plusMonths` funciona corretamente (ex: 31/01 + 1 mês = 28/02)

---

## 📖 Referências

- [Java DateTimeFormatter](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html)
- [LocalDate Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html)
- Curso Java Completo - Prof. Nélio Alves (Udemy)

---

## 👨‍💻 Autor

Exercício desenvolvido durante o curso **Java COMPLETO Programação Orientada a Objetos + Projetos** do Professor Nélio Alves.

---

## 📄 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

⭐ Se este README te ajudou, não esqueça de dar uma estrela no repositório!