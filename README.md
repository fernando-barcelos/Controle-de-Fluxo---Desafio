# Desafio Controle de Fluxo

Este projeto implementa um sistema que recebe dois números inteiros como parâmetros via terminal e realiza a contagem incremental baseada na diferença entre eles.

## Funcionalidades

- Recebe dois números inteiros como parâmetros
- Calcula a quantidade de interações baseada na diferença entre os números
- Imprime uma sequência numérica incrementada
- Valida se o segundo parâmetro é maior que o primeiro

## Estrutura do Projeto

O projeto contém duas classes principais:

- `Contador.java`: Contém a lógica principal do programa
- `ParametrosInvalidosException.java`: Classe de exceção customizada

## Como Executar

1. Compile o projeto
2. Execute via terminal passando dois parâmetros numéricos
```bash
java Contador 12 30
```

## Regras de Negócio

- Se o primeiro parâmetro for maior que o segundo, será lançada a exceção `ParametrosInvalidosException`
- A mensagem de exceção será: "O segundo parâmetro deve ser maior que o primeiro"
- O programa imprimirá a sequência: "Imprimindo o número X" onde X é o número da iteração

