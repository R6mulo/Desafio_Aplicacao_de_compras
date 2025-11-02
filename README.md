🛒 Aplicação de Compras com Cartão de Crédito
💡 Sobre o projeto

Este projeto foi desenvolvido como um desafio prático em Java, com o objetivo de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) e coleções da linguagem (Collections Framework).

A aplicação simula o uso de um cartão de crédito, permitindo ao usuário realizar compras até atingir o limite definido, visualizar o resumo ordenado das compras e até cancelar todas as transações.

⚙️ Funcionalidades

✅ Definir o limite do cartão de crédito

✅ Adicionar compras com descrição e valor

✅ Bloquear compras quando o limite for atingido

✅ Listar compras realizadas em ordem crescente de valor

✅ Mostrar o total gasto e o saldo restante

✅ Cancelar todas as compras e restaurar o saldo original

✅ Encerrar o programa de forma segura

🧱 Estrutura do Projeto

O projeto é composto por três classes principais, seguindo o modelo de POO:

Arquivo	Descrição
Compra.java	Representa uma compra individual com descrição e valor. Implementa Comparable para permitir ordenação por valor.
CartaoDeCredito.java	Controla o limite, o saldo, e a lista de compras realizadas. Possui métodos para lançar compras, exibir resumo e cancelar todas as transações.
Main.java	Contém o método main e o menu de interação com o usuário (via console).
🧠 Conceitos e Ferramentas Utilizadas
🧩 Programação Orientada a Objetos (POO)

Encapsulamento: cada classe possui seus próprios atributos e métodos.

Abstração: o cartão e as compras são representações simplificadas do mundo real.

Responsabilidade Única: cada classe cuida apenas da sua própria função.

📚 Collections Framework

Uso de ArrayList para armazenar as compras dinamicamente.

Uso de Collections.sort() para ordenar as compras pelo valor.

Implementação de Comparable<Compra> na classe Compra.

💬 Entrada de dados com Scanner

O programa interage com o usuário via entrada de console (System.in).

🧮 Controle de fluxo e lógica condicional

Estruturas if, switch e loops do-while controlam o menu e as ações.

🧰 Ferramentas

Linguagem: Java 17+

IDE: IntelliJ IDEA

Paradigma: Programação Orientada a Objetos

Bibliotecas padrão: java.util (ArrayList, Collections, Scanner)

🖥️ Exemplo de Execução

===== APLICAÇÃO DE COMPRAS =====

Informe o limite do cartão: R$ 500

1 - Adicionar compra

2 - Exibir resumo e sair

3 - Cancelar todas as compras e sair

Escolha uma opção: 1
Descrição da compra: Camiseta

Valor da compra: R$ 100

✅ Compra realizada com sucesso!

1 - Adicionar compra

2 - Exibir resumo e sair

3 - Cancelar todas as compras e sair

Escolha uma opção: 1
Descrição da compra: Tênis

Valor da compra: R$ 250

✅ Compra realizada com sucesso!

1 - Adicionar compra

2 - Exibir resumo e sair

3 - Cancelar todas as compras e sair

Escolha uma opção: 2

===== COMPRAS REALIZADAS =====

Camiseta - R$ 100,00

Tênis - R$ 250,00

Total gasto: R$ 350,00

Saldo disponível: R$ 150,00

===== FIM DA TRANSAÇÃO =====

📂 Estrutura de pastas
src/
└── aplicacao/
    ├── Compra.java
    ├── CartaoDeCredito.java
    └── Main.java

🚀 Como executar no IntelliJ IDEA

Crie um novo projeto Java.

Crie o pacote aplicacao.

Copie os três arquivos (Compra.java, CartaoDeCredito.java, Main.java) para dentro desse pacote.

Execute o arquivo Main.java clicando com o botão direito → Run 'Main.main()'.

👨‍💻 Autor

Rômulo Chaves
🎓 Estudante do programa Oracle Next Education (ONE)
💼 Desenvolvedor back End em aprendizado de Java

🔗 [GitHub](https://github.com/R6mulo) | [LinkedIn](https://www.linkedin.com/in/romulo-chaves)
