# 📚 Atividades da Disciplina de Programação Orientada a Objetos

![Java](https://img.shields.io/badge/Java-11+-ED8B00?logo=java&logoColor=white) 
![OOP](https://img.shields.io/badge/Paradigma-OOP-blue)
![Status](https://img.shields.io/badge/Status-Concluído-success)

### 📄 Sobre o Projeto

Este repositório contém uma série de exercícios em **Java** que implementam um sistema de gerenciamento para uma academia ou escola. O projeto é uma demonstração prática de conceitos avançados de **Programação Orientada a Objetos (POO)**, incluindo herança, polimorfismo, interfaces e o uso de classes abstratas para modelar entidades como alunos, professores, planos e avaliações físicas.

---

### ✨ Conceitos e Destaques Técnicos

* **Herança e Polimorfismo**: A arquitetura do sistema é baseada em herança, com classes como `Aluno`, `Funcionario` e `Professor` estendendo a classe abstrata `Pessoa`. A interface `Exibivel` é implementada por várias classes (`Pessoa`, `Plano`, `AvaliacaoFisica`), e a classe `Impressora` utiliza polimorfismo para exibir os dados de qualquer objeto que a implemente.
* **Encapsulamento e Validação**: Os atributos das classes são protegidos por modificadores de acesso `private` e `protected`, e métodos _setters_ como `setCpf` em `Pessoa` incluem validação de dados para garantir a integridade do sistema.
* **Classes Abstratas e Interfaces**: O projeto faz uso da `abstract class Pessoa` para definir comportamentos comuns e da `interface Exibivel` para criar um contrato que garante a existência de um método `exibirDados` nas classes que a implementam.
* **Métodos Estáticos e Sobrescrita**: A classe `Professor` utiliza um atributo estático (`qnt`) e um método estático (`mostraQuantidade`) para contar o número de objetos `Professor` criados, uma prática útil para controle de instâncias. Além disso, o uso da anotação `@Override` em métodos como `exibirDados` e `calculaSalarioMes` garante a correta sobrescrita dos métodos das classes-pai.
* **Manipulação de Datas e Lógica de Negócio**: A API `java.time` é utilizada para gerenciar datas de nascimento, matrícula e avaliações físicas, além de calcular a idade de alunos e aplicar descontos automaticamente com base no tempo de vínculo.

---

### 📂 Estrutura do Projeto

* `src/modelo/`: Contém todas as classes do sistema (entidades e interfaces), organizadas em um único pacote.
* `src/teste/`: Contém a classe principal `TesteHeranca.java`, que demonstra a criação de objetos e a execução das funcionalidades do sistema.

---

### 🚀 Como Executar

Para compilar e executar o projeto, você precisará de um JDK instalado (versão 8 ou superior).

1.  Clone o repositório para sua máquina local.
    ```sh
    git clone [https://github.com/seu-usuario/atividades-too.git](https://github.com/seu-usuario/atividades-too.git)
    cd atividades-too
    ```
2.  Compile as classes Java a partir do diretório raiz.
    ```sh
    javac -d . src/modelo/*.java src/teste/*.java
    ```
3.  Execute a classe principal `TesteHeranca` para ver a demonstração do sistema.
    ```sh
    java teste.TesteHeranca
    ```

---
