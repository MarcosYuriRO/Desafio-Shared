# Desafio Kindred

[Link do Live Share](https://prod.liveshare.vsengsaas.visualstudio.com/join?87DEEAA2995CB1250F6B64FCEAE8381BF8FF)

# 🐾 Desafio Java: Ecossistema Predator-Prey

Este projeto é um simulador de ecossistema baseado em console, desenvolvido como um desafio de lógica, Programação Orientada a Objetos (POO) e manipulação de estados em Java.

## 🎯 O Objetivo
Criar um mundo dinâmico onde **Ovelhas** e **Lobos** interagem em um tabuleiro, seguindo regras de movimento, sobrevivência e reprodução. O simulador deve rodar em um loop infinito (ou até a extinção de uma espécie), mostrando a evolução do ecossistema a cada segundo.

---

## 🛠️ Requisitos Técnicos

* **Linguagem:** Java 17+
* **Conceitos Chave:** * Herança e Polimorfismo (Classe abstrata `Animal`).
    * Manipulação de Matrizes (Grid bidimensional).
    * Controle de Threads (`Thread.sleep`) para animação.
    * Geração de números aleatórios (`Random`).

---

## 📋 As Regras do Jogo

### 1. O Mundo
* O mapa é uma matriz de `n x n` (ex: 20x20).
* Cada célula pode estar vazia (`.`), ocupada por um Ovelhas (`O`) ou por um Lobo (`L`).

### 2. Os Animais (Comportamento)
Todos os animais se movem para uma casa adjacente (norte, sul, leste, oeste) aleatoriamente a cada turno.

* **🐑 Ovelhas:**
    * **Reprodução:** Após sobreviver por 3 turnos, o coelho gera um novo coelho em uma posição adjacente livre.
    * **Objetivo:** Apenas sobreviver e se multiplicar.
* **🐺 Lobos:**
    * **Fome:** O lobo começa com um valor de energia. Cada movimento gasta 1 de energia.
    * **Alimentação:** Se um lobo se mover para uma casa ocupada por um coelho, ele o "come" e recupera sua energia.
    * **Morte:** Se a energia do lobo chegar a 0, ele morre e é removido do mapa.

---

## 🚀 Divisão de Tarefas Sugerida

### **Marcos: O Arquiteto do Mundo (Engine)**
- [ ] Criar a classe `Mapa` que gerencia a matriz.
- [ ] Implementar o método `renderizar()` que limpa o console e desenha o estado atual.
- [ ] Criar o `GameLoop` principal que controla a passagem dos turnos.

### **Kai: O Biólogo Digital (Entidades)**
- [ ] Criar a classe abstrata `Animal` e as subclasses `Lobo` e `Ovelha`.
- [ ] Implementar a lógica de movimento aleatório validando as bordas do mapa.
- [ ] Implementar as regras específicas (comer para o lobo, reproduzir para o ovelha).

---

## 💡 Desafios Extra (Intensidade Máxima)
1.  **Plantas:** Adicionar um item estático que nasce no mapa e serve de alimento para os coelhos.
2.  **Estatísticas:** Ao final de cada turno, exibir o contador de quantos animais de cada espécie existem.
3.  **Cores:** Usar códigos ANSI para imprimir os Lobos em vermelho e Coelhos em verde no console.

---

## 📖 Como Rodar
1. Clone o repositório.
2. Compile as classes: `javac Main.java`.
3. Execute: `java Main`.
