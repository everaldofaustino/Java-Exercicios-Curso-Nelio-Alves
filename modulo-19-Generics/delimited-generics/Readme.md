
# 🚀 Calculation Service - Encontrando o Produto Mais Caro

![Java Version](https://img.shields.io/badge/Java-11%2B-blue?logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

Este projeto demonstra o uso de **generics** e **comparação de objetos** em Java para encontrar o maior elemento de uma lista, utilizando um serviço genérico de cálculo.

## 📌 Descrição

O programa lê uma lista de produtos a partir de um arquivo de entrada e exibe o produto mais caro, aplicando os conceitos de:

- `Comparable<T>` para definir critério de comparação
- Método genérico `max()` para reutilização com qualquer tipo comparável
- Tratamento de arquivos com `try-with-resources`

## 🧠 Tecnologias Utilizadas

- Java 11+
- Programação Genérica (Generics)
- Interface `Comparable`
- Leitura de arquivos (`BufferedReader`, `FileReader`)

## 📂 Estrutura do Projeto

```
project/
├── src/
│   ├── entities/
│   │   └── Product.java
│   ├── services/
│   │   └── CalculationService.java
│   └── application/
│       └── Program.java
├── in.txt
└── README.md
```

## 🧩 Exemplo de Arquivo de Entrada (`in.txt`)

```
Computer, 890.50
iPhone X, 910.00
Tablet, 550.00
```

## 🧪 Exemplo de Saída

```
Most expensive:
iPhone X, 910.00
```

## 🔧 Como Executar

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/calculation-service.git
```

2. **Compile os arquivos**
```bash
javac src/entities/*.java src/services/*.java src/application/*.java
```

3. **Execute o programa**
```bash
java -cp src application.Program
```

> ⚠️ Certifique-se de que o arquivo `in.txt` esteja na raiz do projeto ou ajuste o caminho no código.

## 🧠 Explicação Técnica

### Classe `Product` (entidade)

Implementa `Comparable<Product>` e define a comparação com base no valor (preço):

```java
 @Override
public int compareTo(Product other){
    return value.compareTo(other.getValue());
}
```

### Classe `CalculationService` (serviço genérico)

Contém o método `max()` que recebe qualquer `List<T>` onde `T` implementa `Comparable<T>`:

```java
public static <T extends Comparable<T>> T max(List<T> list) {
    // lógica de comparação
}
```

### Classe `Program` (aplicação principal)

- Lê o arquivo `in.txt`
- Cria objetos `Product`
- Adiciona a uma lista
- Chama `CalculationService.max(list)`
- Exibe o resultado

## 📚 Conceitos Aplicados

| Conceito | Implementação |
|----------|----------------|
| Generics | `T extends Comparable<T>` |
| Comparable | `compareTo()` |
| Tratamento de exceções | `try-with-resources` |
| Sobrescrita | `toString()`, `compareTo()` |

## 📖 Nota

> Java já possui o método `Collections.max(list)` que faz o mesmo que o `CalculationService.max()`. Este projeto foi desenvolvido para fins didáticos, demonstrando como implementar manualmente um método genérico de busca de máximo.






