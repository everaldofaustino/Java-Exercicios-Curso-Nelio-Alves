# Calculadora de Impostos

Um programa em Java que calcula impostos para pessoas físicas e jurídicas com base nas regras fiscais brasileiras. O programa demonstra conceitos de programação orientada a objetos incluindo herança, polimorfismo e classes abstratas.

## 📋 Descrição do Problema

Desenvolver um programa para ler os dados de N contribuintes (N fornecido pelo usuário), que podem ser pessoas físicas ou pessoas jurídicas, e depois mostrar:
- O valor do imposto pago por cada contribuinte
- O total de imposto arrecadado

### Regras para Cálculo de Imposto

#### Pessoa Física
- **Renda < R$ 20.000,00**: paga 15% de imposto
- **Renda ≥ R$ 20.000,00**: paga 25% de imposto
- **Dedução com gastos de saúde**: 50% dos gastos com saúde são abatidos no imposto

*Exemplo:* Uma pessoa com renda anual de R$ 50.000,00 e R$ 2.000,00 em gastos com saúde:
- Imposto = (50.000 × 25%) - (2.000 × 50%) = R$ 11.500,00

#### Pessoa Jurídica
- **Alíquota base**: paga 16% de imposto sobre a renda anual
- **Alíquota reduzida**: paga 14% de imposto se a empresa possuir mais de 10 funcionários

*Exemplo:* Uma empresa com renda anual de R$ 400.000,00 e 25 funcionários:
- Imposto = 400.000 × 14% = R$ 56.000,00

## 🏗️ Diagrama de Classes
```

┌─────────────────────┐
│ Contribuinte │
│ (Classe Abstrata) │
├─────────────────────┤
│ - nome: String │
│ - rendaAnual: Double│
├─────────────────────┤
│ + imposto(): Double │
│ (abstrato) │
└─────────────────────┘
△
│
│
┌──────┴──────┐
│ │
┌───▼────┐ ┌───▼─────┐
│Pessoa │ │ Pessoa │
│Física │ │Jurídica │
├────────┤ ├─────────┤
│- gastos│ │- numero │
│Saude: │ │Funciona-│
│Double │ │rios: int│
└────────┘ └─────────┘

````

## 💻 Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- Princípios de Programação Orientada a Objetos
- ArrayList para coleção de dados

## 🚀 Como Executar

### Pré-requisitos
- Java Development Kit (JDK) instalado
- Um terminal/linha de comando

### Passos
```
Entre com o número de contribuintes: 3

Dados do contribuinte #1:
Pessoa física ou jurídica (f/j)? f
Nome: Alex
Renda anual: 50000.00
Gastos com saúde: 2000.00

Dados do contribuinte #2:
Pessoa física ou jurídica (f/j)? j
Nome: SoftTech
Renda anual: 400000.00
Número de funcionários: 25

Dados do contribuinte #3:
Pessoa física ou jurídica (f/j)? f
Nome: Bob
Renda anual: 120000.00
Gastos com saúde: 1000.00

IMPOSTOS PAGOS:
Alex: R$ 11500.00
SoftTech: R$ 56000.00
Bob: R$ 29500.00

TOTAL DE IMPOSTOS: R$ 97000.00

```