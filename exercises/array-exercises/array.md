### **Exercícios Básicos**

1. **Imprimir um Array**: Escreva um programa que declare e inicialize um array de inteiros e imprima todos os seus elementos.
2. **Soma de Elementos**: Calcule e imprima a soma de todos os elementos de um array.
3. **Maior Elemento**: Encontre e imprima o maior valor em um array de inteiros.
4. **Média dos Elementos**: Calcule a média dos valores de um array.
5. **Copiar Array**: Crie um novo array que seja uma cópia de um array existente.
6. **Contar Pares e Ímpares**: Conte quantos números pares e ímpares existem em um array.
7. **Inverter Array**: Inverta a ordem dos elementos de um array (sem usar bibliotecas externas).
8. **Procurar Elemento**: Verifique se um determinado valor existe em um array.
9. **Contar Ocorrências**: Conte quantas vezes um elemento aparece no array.

### **Exercícios Intermediários**

1. **Ordenar Array**: Implemente o algoritmo **Bubble Sort** para ordenar um array.
2. **Matriz Soma**: Some os elementos de duas matrizes (arrays bidimensionais) e armazene o resultado em uma terceira matriz.
3. **Diagonal Principal**: Imprima os elementos da diagonal principal de uma matriz quadrada.
4. **Array União**: Dados dois arrays, crie um terceiro array com a união dos elementos (sem repetições).
5. **Array Interseção**: Dados dois arrays, crie um terceiro array com a interseção dos elementos.
6. **Frequência de Elementos**: Imprima a frequência de cada elemento único em um array.
7. **Segundo Maior**: Encontre o segundo maior elemento em um array.
8. **Rotacionar Array**: Rotacione os elementos de um array para a esquerda ou direita em **N** posições.
9. **Subarray de Soma Máxima**: Encontre o subarray contíguo com a maior soma (Pesquise sobre **Kadane's Algorithm**).
10. **Matriz Transposta**: Calcule a transposta de uma matriz.

### **Exercícios Avançados**

1. **Array sem Duplicatas**: Remova elementos duplicados de um array (sem usar coleções como **Set**).
2. **Pares com Soma Específica**: Encontre todos os pares de elementos no array cuja soma seja igual a um valor dado.
3. **Tripletas com Soma Zero**: Encontre todas as triplas únicas no array que somem zero.
4. **Maior Produto**: Encontre o maior produto possível entre dois elementos de um array.
5. **Elemento Dominante**: Verifique se existe um elemento que aparece mais de **n/2** vezes no array.
6. **Subarrays Distintos**: Conte quantos subarrays distintos existem onde a soma dos elementos é igual a **K**.
7. **Array Espiral**: Imprima os elementos de uma matriz em ordem espiral.
8. **Pivot em Array Ordenado Rotacionado**: Encontre o índice de um elemento em um array ordenado que foi rotacionado (ex: **[4,5,6,1,2,3]**).
9. **Maior Retângulo em Histograma**: Dado um array representando alturas de barras em um histograma, encontre a área do maior retângulo possível.
10. **Merge Sorted Arrays**: Combine dois arrays ordenados em um terceiro array também ordenado.

## 📦 Arrays – Exercícios Contextualizados (com saída esperada)

---

### 1. Notas de Aluno

Um array contém as notas de um aluno em 4 provas. Calcule e imprima a média.

Se a média for maior ou igual a 7, exiba `"Aprovado"`, senão `"Reprovado"`.

```java
double[] notas = {6.5, 8.0, 7.2, 5.8};
```

**Saída esperada**:

```
Média: 6.88
Reprovado
```

---

### 2. Temperaturas Semanais

Um array armazena a temperatura máxima registrada nos últimos 7 dias.

Imprima a maior, a menor e a média das temperaturas.

```java
int[] temperaturas = {30, 32, 28, 35, 31, 29, 33};
```

**Saída esperada**:

```
Maior temperatura: 35
Menor temperatura: 28
Média: 31.14
```

---

### 3. Controle de Estoque

Dado um array com as quantidades em estoque de 8 produtos,

exiba quais produtos estão abaixo do estoque mínimo (menor que 5 unidades).

```java
int[] estoque = {10, 3, 7, 2, 15, 0, 6, 4};
```

**Saída esperada**:

```
Produtos com estoque baixo:
Produto 2: 3 unidades
Produto 4: 2 unidades
Produto 6: 0 unidades
Produto 8: 4 unidades
```

---

### 4. Pesquisa de Produto

Verifique se um produto com código informado pelo usuário existe no array de códigos cadastrados.

```java
int[] codigos = {101, 203, 301, 412, 555};
int procurado = 412;
```

**Saída esperada**:

```
Produto encontrado: código 412
```

---

### 5. Contar Ocorrências

Dado um array com avaliações de clientes (notas de 1 a 5),

conte quantas vezes cada nota apareceu.

```java
int[] avaliacoes = {5, 4, 3, 5, 2, 1, 5, 4, 3, 5};
```

**Saída esperada**:

```
Nota 1: 1 vez(es)
Nota 2: 1 vez(es)
Nota 3: 2 vez(es)
Nota 4: 2 vez(es)
Nota 5: 4 vez(es)
```
