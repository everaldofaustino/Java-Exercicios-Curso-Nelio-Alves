
---

# 🧠 Qual é o problema que o Java está tentando resolver?

Evitar isso aqui:

```java
List<Integer> ints = new ArrayList<>();
List<Number> nums = ints; // ❌ isso NÃO pode
```

👉 Porque você poderia fazer:

```java
nums.add(3.14); // Double
```

💥 E quebraria a lista de Integer.

---

# 🔥 Então entram os **wildcards (`?`)**

Eles dizem:

> “Eu não sei exatamente o tipo, só sei que ele tem uma relação com X”

---

# 🎯 1. `? extends Shape` (LEITURA)

```java
List<? extends Shape>
```

👉 Tradução:

> “Lista de algum tipo que herda de Shape”

Pode ser:

```java
List<Circle>
List<Rectangle>
```

---

## ✔ O que você PODE fazer

```java
Shape s = list.get(0);
```

👉 Sempre seguro — tudo ali é Shape

---

## ❌ O que você NÃO pode fazer

```java
list.add(new Circle(2.0)); // ERRO
```

---

## 🧠 Por quê?

Porque o Java pensa:

> “E se isso for List<Rectangle>?”

Você estaria fazendo:

```java
List<Rectangle> list = ...
list.add(new Circle()); // 💥 inválido
```

---

# 🧃 Analogia (extends)

👉 Caixa com etiqueta:

> “Contém algum tipo de Shape”

✔ pode pegar
❌ não pode colocar

---

# 🎯 2. `? super Shape` (ESCRITA)

```java
List<? super Shape>
```

👉 Tradução:

> “Lista de Shape ou algo mais genérico”

Pode ser:

```java
List<Shape>
List<Object>
```

---

## ✔ O que você PODE fazer

```java
list.add(new Circle(2.0));
list.add(new Rectangle(3.0, 2.0));
```

👉 Sempre seguro — tudo é Shape

---

## ❌ O que você NÃO pode fazer

```java
Shape s = list.get(0); // ERRO
```

✔ Só pode:

```java
Object o = list.get(0);
```

---

## 🧠 Por quê?

Porque pode ser:

```java
List<Object>
```

👉 O compilador só garante que sai **Object**

---

# 🧃 Analogia (super)

👉 Caixa com etiqueta:

> “Aceita Shape ou algo mais genérico”

✔ pode colocar
❌ não sabe exatamente o que sai

---

# 🔁 Comparação final

| Tipo              | Pode ler | Pode adicionar |
| ----------------- | -------- | -------------- |
| `? extends Shape` | ✔ Shape  | ❌              |
| `? super Shape`   | ✔ Object | ✔ Shape        |

---

# 🔥 REGRA DE OURO (PECS)

```text
Producer → extends → lê
Consumer → super → escreve
```

---

# 🎯 Aplicando no seu código

## ✔ Método de soma (lê)

```java
public static double totalArea(List<? extends Shape> list)
```

👉 só precisa ler → `extends`

---

## ✔ Método de adicionar

```java
public static void addShapes(List<? super Shape> list)
```

👉 precisa inserir → `super`

---

# 🧠 Frase pra nunca esquecer

> “Se eu só leio → extends
> 
> Se eu adiciono → super”

---

