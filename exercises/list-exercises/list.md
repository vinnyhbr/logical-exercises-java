### Exercícios Básicos

1. **Criação de Lista**
    
    Crie um **`ArrayList`** de strings e adicione 5 nomes de pessoas. Imprima a lista.
    
2. **Iteração com For-Each**
    
    Use um loop **`for-each`** para percorrer e imprimir todos os elementos de uma lista de inteiros.
    
3. **Tamanho da Lista**
    
    Escreva um programa que verifique o tamanho de uma lista e imprima:
    
    - "Pequena" se tiver menos de 5 elementos.
    - "Média" se tiver entre 5 e 10 elementos.
    - "Grande" se tiver mais de 10 elementos.
4. **Verificar Elemento**
    
    Peça ao usuário para digitar um nome e verifique se ele está presente em uma lista predefinida.
    
5. **Remover Elemento**
    
    Crie uma lista com números de 1 a 10 e remova todos os números pares. Imprima a lista resultante.
    

### **Exercícios Intermediários**

1. **Converter Array para Lista**
    
    Converta um array de strings (ex: **`String[] cores = {"Vermelho", "Azul", "Verde"}`**) para uma **`ArrayList`**.
    
2. **Ordenar Lista**
    
    Crie uma lista de números inteiros desordenados e use **`Collections.sort()`** para ordená-la. Imprima antes e depois.
    
3. **Copiar Lista**
    
    Crie uma cópia de uma lista de strings sem usar o método **`clone()`**.
    
4. **Inverter Lista**
    
    Inverta a ordem dos elementos de uma lista usando **`Collections.reverse()`**.
    
5. **Lista para Array**
    
    Converta uma **`ArrayList`** de strings em um array (**`String[]`**).
    
6. **Remover Duplicatas**
    
    Crie uma lista com elementos duplicados e remova todas as repetições (use **`HashSet`** para ajudar).
    
7. **Sublista**
    
    Dada uma lista de 20 números, crie uma sublista do 5º ao 15º elemento e imprima.
    
8. **Comparar Listas**
    
    Verifique se duas listas de strings são iguais (mesmos elementos na mesma ordem).
    
9. **União de Listas**
    
    Crie duas listas e faça a união delas em uma terceira lista (sem duplicatas).
    
10. **Interseção de Listas**
    
    Dadas duas listas, encontre os elementos comuns entre elas.
    

### **Exercícios Avançados**

1. **LinkedList vs ArrayList**
    
    Compare o tempo de inserção de 10.000 elementos no início de uma **`ArrayList`** e uma **`LinkedList`**.
    
2. **Lista de Objetos**
    
    Crie uma classe **`Pessoa`** (com nome e idade) e uma lista de **`Pessoa`**. Ordene-a por idade.
    
3. **Filtrar Lista**
    
    Use **`Stream`** para filtrar uma lista de números, mantendo apenas os maiores que 50.
    
4. **Mapear Lista**
    
    Converta uma lista de strings para uma lista de seus tamanhos (ex: **`["Java"] → [4]`**).
    
5. **Método Reduce**
    
    Some todos os elementos de uma lista de inteiros usando **`Stream.reduce()`**.
    
6. **Imutabilidade**
    
    Crie uma lista imutável (usando **`List.of()`** ou **`Collections.unmodifiableList()`**).
    
7. **Pilha com LinkedList**
    
    Use **`LinkedList`** para implementar uma pilha (LIFO) com os métodos **`push`** e **`pop`**.
    
8. **Fila com LinkedList**
    
    Implemente uma fila (FIFO) usando **`LinkedList`** e os métodos **`add`** e **`remove`**.
    
9. **Lista Bidirecional**
    
    Percorra uma **`LinkedList`** do início ao fim e depois do fim ao início.
    
10. **Diferença entre Listas**
    
    Dadas duas listas, encontre os elementos que estão apenas na primeira lista.
    

## Exercícios Contextualizados (com saída esperada)

---

### 1. Lista de Presença

Uma lista contém os nomes dos alunos presentes.

O programa pergunta um nome e diz se ele está na lista.

```java
List<String> presentes = Arrays.asList("Ana", "Carlos", "Beatriz", "João");
String nome = "Carlos";
```

**Saída esperada**:

```
Carlos está presente.
```

---

### 2. Remover Nomes Duplicados

Remova os nomes duplicados de uma lista e imprima a lista final.

```java
List<String> nomes = Arrays.asList("Ana", "Carlos", "Ana", "João", "Carlos", "Beatriz");
```

**Saída esperada**:

```
Nomes sem duplicatas:
Ana
Carlos
João
Beatriz
```

---

### 3. Verificar Tamanho da Lista

Verifique o tamanho de uma lista de tarefas e classifique como "Pequena", "Média" ou "Grande".

```java
List<String> tarefas = Arrays.asList("Comprar pão", "Estudar Java", "Lavar roupa", "Fazer exercícios", "Caminhar");
```

**Saída esperada**:

```
Tamanho da lista: 5
Classificação: Média
```

---

### 4. Filtrar Contatos Inativos

Remova da lista de contatos os nomes que aparecem na lista de inativos.

```java
List<String> contatos = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos", "Daniel", "Fernanda"));
List<String> inativos = Arrays.asList("Carlos", "Daniel");
```

**Saída esperada**:

```
Contatos ativos:
Ana
Bruno
Fernanda
```

---

### 5. Converter Lista para Array

Dado uma lista de frutas, converta para array e imprima todos os elementos.

```java
List<String> frutas = Arrays.asList("Maçã", "Banana", "Uva");
```

**Saída esperada**:  
```
Array de frutas:
Maçã
Banana
Uva
```
