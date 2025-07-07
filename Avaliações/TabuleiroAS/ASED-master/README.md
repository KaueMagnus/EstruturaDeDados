
# 🎲 Simulador de Jogo de Tabuleiro Imobiliário — Java (Lista Circular)

## 📌 Descrição Geral

Este projeto consiste em um jogo de tabuleiro inspirado no **Banco Imobiliário**, desenvolvido para a disciplina de **Estruturas de Dados**. O jogador pode se movimentar pelo tabuleiro, comprar imóveis, pagar aluguéis, propor negociações e competir por patrimônio.

O jogo simula uma estrutura de dados dinâmica e interativa, permitindo explorar conceitos de **listas ligadas circulares**, **coleções genéricas** e **lógica de fluxo de jogo**.

---

## 🎯 Objetivo do Projeto

Criar um sistema em Java que simule um jogo de tabuleiro com:
- Cadastro e gerenciamento de jogadores
- Cadastro e negociação de imóveis
- Movimentação de jogadores por uma estrutura de lista circular
- Controle de turnos, rodadas e condições de fim de jogo

---

## 🧠 Estruturas de Dados Utilizadas

### ✅ 1. Lista Ligada Circular (Classe: `Tabuleiro`)
- **Finalidade**: Representar o tabuleiro do jogo.
- **Justificativa**: A lista circular permite que os jogadores se movimentem continuamente pelas casas, simulando a rotação do tabuleiro.

### ✅ 2. ArrayList (Classe: `Main`)
- **Finalidade**: Armazenar dinamicamente os jogadores e imóveis cadastrados.
- **Justificativa**: É uma estrutura simples, eficiente e ideal para controle dinâmico de dados que não precisam de ordenação complexa.

### ✅ 3. Encapsulamento com Orientação a Objetos
- Classes bem definidas (`Jogador`, `Imovel`, `Node`, `Tabuleiro`) encapsulam a lógica do sistema, facilitando a reutilização e manutenibilidade.

---

## ⚙️ Instruções de Compilação e Execução

### ✅ Pré-requisitos
- Java JDK instalado
- Terminal ou prompt de comando

### ✅ Passo a passo

1. **Clone ou baixe o repositório**
   - Copie todos os arquivos `.java` para uma pasta local.

2. **Compile o projeto**
   No terminal, navegue até a pasta e execute:
   ```bash
   javac Main.java
   ```

3. **Execute o jogo**
   Após a compilação bem-sucedida:
   ```bash
   java Main
   ```

---

## 🕹️ Funcionalidades do Jogo

- Cadastro e gerenciamento de até **6 jogadores**
- Cadastro e gerenciamento de até **40 imóveis**
- Configuração de saldo inicial, salário por volta e número máximo de rodadas
- Movimento por dados (2 dados de 6 lados)
- Casas especiais: `Imposto` (perde 10% do saldo) e `Restituição` (ganha 10%)
- Compra, aluguel e negociação de imóveis
- Ranking dinâmico baseado em patrimônio (saldo + imóveis)
- Fim do jogo por número de rodadas ou quando apenas 1 jogador restar

---

## 📁 Estrutura de Arquivos

```plaintext
📁 src/
├── Main.java            # Menu, controle do jogo e lógica principal
├── Jogador.java         # Classe que representa o jogador
├── Imovel.java          # Classe que representa um imóvel do tabuleiro
├── Node.java            # Nó da lista circular (representa uma casa)
└── Tabuleiro.java       # Lista ligada circular que representa o tabuleiro
```

---

## 👨‍💻 Autor

**Kaue Marques Magnus**  
Curso de Análise e Desenvolvimento de Sistemas  
ULBRA — 2025

---
