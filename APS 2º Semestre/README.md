
# APS - 2° Semestre

![Status do Projeto](https://img.shields.io/badge/status-%20desenvolvido-green)

Projeto desenvolvido para a disciplina de Introdução a Programação Estrutura **APS** (Atividade Prática Supervisionada) do 2° semestre do curso de Ciência da Computação na Universidade Paulista. Este projeto tem como objetivo desenvolver um sistema de criptografia.

## 📝 Descrição

O projeto **APS-2-Semestre** visa apresentar os aspectos da criptografia RSA. Este projeto foi construído usando a linguagem
de Programação python.

## 🚀 Funcionalidades

O RSA está fortemente ligado à Teoria dos Números, sendo baseado em pilares como as operações de resto e fatoração por números primos. O algoritmo pode ser resumido nos passos descritos abaixo:

*	Obter dois números primos p e q; (Utilizei o teste Miller-Rabin. É um teste probabilístico para saber se  um número n é primo de maneira eficiente).

*	Calcular n = p*q;

*	Calcular phi(n) = (p-1)(q-1); (Função totiente de Euler)

*	Escolher mdc(phi(n), E) == 1, ou seja, E e phi(n) são coprimos (primos relativos);

*	 Calcular D sendo d*e = 1 mod(phi(n)), ou seja, d seja o inverso multiplicativo de E em (mod phi(n)); (Algoritmo de Euclides estendido)

*	Chave pública: (e, n); chave privada: (d, n);

*	Função para cifrar uma mensagem m: m^e = c mod(n);

*	Função para decifrar uma mensagem c: c^d = m mod(n);

O RSA se mantém devido à dificuldade em fatorar um grande número (n) em números primos (p e q). Se b é o número de bits de n, então existem v(2b-1) possibilidades a serem testadas em um eventual pior caso, o que resulta em complexidade de tempo. A título de curiosidade, considerando b = 2048, v(2b) resulta em um número um pouco maior que 1,79.10308. Considerando uma supermáquina que consegue processar 1 bilhão (109) de tentativas por segundo, seriam necessários mais de 5.10291 anos.


## 📦 Tecnologias Utilizadas

- [Linguagem de Programação utilizada: **Python**]

## ⚙️ Instalação e Uso

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/Guilherme-Sbizero/APS-2-Semestre.git
    ```

2. **Navegue até o diretório do projeto**:
    ```bash
    cd APS-2-Semestre
    ```

3. **Execute o projeto**:
    ```bash
    Para executar o projeto basta abrir o projeto na sua IDE ou no seu Editor de Código e rodar o arquivo main.py exemplo vs code no Run Code (Cntrl + Alt + N)
    ```

## 📂 Estrutura do Projeto

    APS-2-Semestre/
    ├── src/
    │   ├── [main.py]
    │   ├── [criptografia.py]
    │   ├── [numeroPrimo.py]
        ├── [gerarChaves.py]
    ├── docs/
    │   ├── [Documentação]
    └── README.md

## 🔍 Como Contribuir

1. **Faça um fork do projeto**
2. **Crie uma nova branch** para sua feature:
    ```bash
    git checkout -b feature/nome-da-feature
    ```
3. **Commit suas mudanças**:
    ```bash
    git commit -m "Adiciona nova feature: nome-da-feature"
    ```
4. **Push para a branch**:
    ```bash
    git push origin feature/nome-da-feature
    ```
5. **Abra um Pull Request**

## 📄 Licença

Esse projeto está sob a licença MIT License. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.
