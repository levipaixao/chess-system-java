# ♟️ Sistema de Xadrez

Implementação completa de um Sistema de Xadrez em Java, desenvolvido com foco em Programação Orientada a Objetos, modelagem de domínio e arquitetura limpa.
O projeto recria fielmente as regras oficiais do xadrez, incluindo todos os movimentos especiais e validações de partida.
---

#📌 Sobre o Projeto

Este projeto foi desenvolvido como estudo avançado de:

Engenharia de Software
Programação Orientada a Objetos
Design de Sistemas
Modelagem de Domínio
Boas práticas profissionais em Java

O objetivo foi construir um sistema totalmente orientado a regras, separando responsabilidades e simulando um projeto real de software.

---

## 🚀 Funcionalidades

♟️ Mecânica do Jogo
Tabuleiro 8x8
Movimentação válida de todas as peças
Sistema de turnos
Captura de peças
Validação de jogadas ilegais

🔥 Regras Oficiais Implementadas
 Check
 Checkmate
 Castling (Roque)
 En Passant
 Promoção de Peão
 Proteção contra auto-check
 Encerramento automático da partida  

---

🧠 Conceitos de Engenharia Aplicados

Este projeto demonstra domínio em:

Programação Orientada a Objetos (POO)
Encapsulamento
Herança
Polimorfismo
Abstração
Composição
Separação de responsabilidades
Clean Code
Tratamento de exceções customizadas
Estruturas bidimensionais
Arquitetura em camadas

---

## 🏗️ Arquitetura do Projeto

O sistema foi dividido em camadas para melhor organização:

application → Interface e execução do programa
chess       → Regras do jogo de xadrez
boardgame   → Estrutura genérica de tabuleiro

---

Estrutura do Projeto
src/
│
├── application/
│   ├── Program.java
│   └── UI.java
│
├── chess/
│   ├── ChessMatch.java
│   ├── ChessPiece.java
│   ├── ChessPosition.java
│   ├── ChessException.java
│   ├── Color.java
│   └── pieces/
│       ├── King.java
│       ├── Queen.java
│       ├── Rook.java
│       ├── Bishop.java
│       ├── Knight.java
│       └── Pawn.java
│
└── boardgame/
    ├── Board.java
    ├── Piece.java
    ├── Position.java
    └── BoardException.java
---

♟️ Design do Sistema

🔹 Camada boardgame

Motor genérico reutilizável responsável por:

criação do tabuleiro
controle de posições
validação estrutural
manipulação de peças

🔹 Camada chess

Implementa regras reais do jogo:

movimentação específica
lógica de check/checkmate
movimentos especiais
estados da partida

🔹 Camada application

Responsável apenas por:

interação com usuário
renderização do tabuleiro
execução do programa

⚡ Movimentos Especiais

Castling (Roque)

Executado automaticamente quando permitido:

Rei e torre nunca moveram
Caminho livre
Rei não passa por cheque

♟️ En Passant

Captura especial após avanço duplo do peão adversário.

👑 Promoção

Ao alcançar a última fileira, o peão pode ser promovido para:

Queen
Rook
Bishop
Knight

⚠️ Check & Checkmate

O sistema verifica continuamente:

ameaças ao rei
impossibilidade de defesa
fim automático da partida

---

▶️ Como Executar

Pré-requisitos

Java JDK 17+
Terminal ou IDE Java

---

1️⃣ Clonar o projeto
https://github.com/levipaixao/chess-system-java.git
2️⃣ Compilar
javac application/Program.java
3️⃣ Executar
java application.Program

<img width="173" height="397" alt="Captura de tela 2026-05-18 205929" src="https://github.com/user-attachments/assets/7662f451-7a11-4871-8466-d4abc8fb5f83" />
