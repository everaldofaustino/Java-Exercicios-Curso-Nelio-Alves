
---

## 📌 Exercício – Processamento de Arquivos CSV

### 🎯 Objetivo

Fazer um programa para ler o caminho de um arquivo **`.csv`** contendo os dados de itens vendidos.

### 📂 Formato do arquivo de origem

Cada item possui:

- **nome**
- **preço unitário**
- **quantidade**

Separados por **vírgula** (`,`).

---

### ✅ Regra de negócio

Gerar um novo arquivo chamado **`summary.csv`** contendo apenas:

- **nome**
- **valor total** do item (`preço unitário × quantidade`)

### 📁 Localização do arquivo de saída

O arquivo `summary.csv` deve ser criado em uma **subpasta chamada `out`**, localizada na **mesma pasta do arquivo de origem**.

---

## 📋 Exemplo

### Arquivo de origem (`source.csv`)

```csv
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```

### Arquivo de saída (`out/summary.csv`)

```csv
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

---

### 🧩 Resumo visual

| Arquivo de origem | Processamento | Arquivo de saída |
|------------------|---------------|------------------|
| `nome,preço,qtd` | `preço × qtd` | `nome,valor_total` |
| Local: qualquer pasta | — | Local: `pasta_origem/out/summary.csv` |

---