# 💰 Jogo de Tabuleiro Imobiliário — Simulação em Java

Este projeto é uma simulação de um jogo de tabuleiro estilo Banco Imobiliário, implementado em Java como parte de um trabalho acadêmico da disciplina de **Estruturas de Dados**.

---

## 📌 Objetivo do Jogo

Cada jogador deve se movimentar pelo tabuleiro, comprar imóveis, pagar aluguéis, receber salários e tentar acumular o maior patrimônio possível até o final da partida.

---

## 🧠 Estruturas de Dados Utilizadas

- **Lista Ligada Circular**: Representa o tabuleiro. Cada casa aponta para a próxima, e a última casa volta para o início.
- **ArrayList**: Utilizado para armazenar jogadores e imóveis de forma dinâmica.
- **Orientação a Objetos**: Toda a lógica está organizada em classes específicas, facilitando a reutilização e a manutenção do código.

---

## 🚀 Funcionalidades

### 🎮 Menu Principal

- Cadastro, edição, listagem e remoção de jogadores (máx. 6)
- Cadastro, edição, listagem e remoção de imóveis (máx. 40)
- Configuração de:
  - Saldo inicial dos jogadores
  - Salário recebido ao completar uma volta
  - Número máximo de rodadas
- Início do jogo

### 🕹️ Durante o Jogo

- Lançamento de dados (dois dados de 1 a 6)
- Movimento pelo tabuleiro (lista circular)
- Compra de imóveis disponíveis
- Pagamento de aluguel ao cair em imóveis de outros jogadores
- Recebimento de salário ao passar pela casa inicial
- Casas especiais:
  - 💸 **Imposto**: paga 10% do saldo
  - 💰 **Restituição**: recebe 10% do saldo
- Negociação de propriedades entre jogadores
- Visualização do status completo (saldo + propriedades)
- Ranking atualizado por patrimônio
- Opção de desistir do jogo

---

## 🧾 Regras Gerais

- O jogo exige pelo menos **2 jogadores** e **10 imóveis** para começar.
- Cada jogador começa com um saldo inicial configurável (padrão: R$ 25.000,00).
- O jogo termina ao atingir o número máximo de rodadas ou quando restar apenas um jogador com saldo positivo.
- O vencedor é o jogador com o maior patrimônio (saldo + valor dos imóveis).

---

## 🏗️ Estrutura de Arquivos

```plaintext
📁 src/
├── Main.java            # Controla o menu e a execução do jogo
├── Jogador.java         # Classe que representa o jogador
├── Imovel.java          # Classe que representa os imóveis
├── Node.java            # Representa uma casa do tabuleiro (nó da lista)
└── Tabuleiro.java       # Lista ligada circular (tabuleiro)
