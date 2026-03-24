# Exercício: Etiqueta de Preço com Herança

## 📋 Descrição

Fazer um programa para ler os dados de **N produtos** (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui **nome** e **preço**.
- **Produtos importados** possuem uma **taxa de alfândega**
- **Produtos usados** possuem **data de fabricação**

Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos importados, a taxa de alfândega deve ser acrescentada ao preço final do produto.

## 🎯 Objetivo

Implementar o programa conforme o diagrama de classes abaixo, aplicando os conceitos de **herança** e **polimorfismo**.

## 📊 Diagrama de Classes
| Classe | Atributos | Métodos |
|--------|-----------|---------|
| **Product** | - name: String<br>- price: Double | + priceTag(): String |
| **ImportedProduct** | - customsFee: Double | + priceTag(): String<br>+ totalPrice(): Double |
| **UsedProduct** | - manufactureDate: Date | + priceTag(): String |


## 📥 Entrada

O programa deve ler os dados na seguinte ordem:

1. **Número de produtos** (N)
2. Para cada produto:
    - Tipo do produto (c/u/i):
        - **c** = Common (comum)
        - **u** = Used (usado)
        - **i** = Imported (importado)
    - **Nome** do produto
    - **Preço** do produto
    - Se for **importado**: ler a **taxa de alfândega**
    - Se for **usado**: ler a **data de fabricação** (DD/MM/YYYY)

## 📤 Saída

Mostrar a **etiqueta de preço** de cada produto na mesma ordem em que foram digitados:
- Produto comum: `Nome $ Preço`
- Produto importado: `Nome $ PreçoTotal (Customs fee: $ Taxa)`
- Produto usado: `Nome (used) $ Preço (Manufacture date: Data)`

## 📌 Exemplo

### Entrada:
## Exemplo

### Entrada:

```
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 260.00
Customs fee: 20.00
Product #2 data:
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 1100.00
Product #3 data:
Common, used or imported (c/u/i)? u
Name: Iphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017
```

### Saída:

```
PRICE TAGS:
Tablet $ 280.00 (Customs fee: $ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
```


## 🧩 Regras de Negócio

| Tipo de Produto | Regra |
|-----------------|-------|
| **Common** | Apenas nome e preço |
| **Imported** | Preço final = preço + taxa de alfândega |
| **Used** | Acrescentar "(used)" no nome e data de fabricação na etiqueta |

## 🔧 Requisitos Técnicos

- Utilizar **herança** para representar os tipos de produto
- Utilizar **polimorfismo** para chamar o método `priceTag()` de forma genérica
- Utilizar **ArrayList** ou vetor para armazenar os produtos
- Utilizar **LocalDate** e **DateTimeFormatter** para trabalhar com data
- Utilizar **@Override** para sobrescrever os métodos

## 💡 Dicas

1. A classe `Product` deve ser a **superclasse**
2. `ImportedProduct` e `UsedProduct` devem **herdar** de `Product`
3. O método `priceTag()` deve ser **sobrescrito** nas subclasses
4. Para o produto importado, o preço final é calculado pelo método `totalPrice()`
5. Use `DateTimeFormatter.ofPattern("dd/MM/yyyy")` para parse da data
6. Use `LocalDate.parse()` para converter string para data

## Estrutura do Projeto

```
src/
├── entities/
│   ├── Product.java
│   ├── ImportedProduct.java
│   └── UsedProduct.java
└── application/
    └── Program.java
```
