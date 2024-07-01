# Gerenciador de Funcionários

## Objetivo

Este projeto tem como objetivo desenvolver um programa para gerenciar informações de funcionários e realizar operações de aumento salarial com base em porcentagem.

## Requisitos

1. **Entrada de Dados**:
    - Ler um número inteiro `N` que representa a quantidade de funcionários.
    - Coletar os dados de `N` funcionários, incluindo:
        - Identificação (ID)
        - Nome
        - Salário
    - Garantir que não haja repetição de identificações (ID).

2. **Operação de Aumento Salarial**:
    - Ler uma identificação (ID) e um valor percentual `X`.
    - Aumentar o salário do funcionário correspondente à identificação fornecida em `X` por cento.
    - Se a identificação informada não existir, exibir uma mensagem de erro e abortar a operação.

3. **Encapsulamento**:
    - Implementar a técnica de encapsulamento para assegurar que o salário não possa ser alterado diretamente.
    - Permitir que o salário seja aumentado apenas através de uma operação de incremento percentual.

4. **Saída**:
    - Exibir a listagem atualizada dos funcionários após a operação de aumento salarial.

## Exemplo de Uso

1. **Entrada de Dados**:
    ```
    Entre com o número de funcionários: 3

    Entre com os dados do funcionário 1:
    ID: 1
    Nome: Alice
    Salário: 5000

    Entre com os dados do funcionário 2:
    ID: 2
    Nome: Bob
    Salário: 4500

    Entre com os dados do funcionário 3:
    ID: 3
    Nome: Carol
    Salário: 4700
    ```

2. **Operação de Aumento Salarial**:
    ```
    Entre com a identificação (ID) do funcionário para aumento: 2
    Entre com a porcentagem de aumento: 10
    ```

3. **Saída**:
    ```
    Listagem atualizada dos funcionários:
    ID: 1, Nome: Alice, Salário: 5000
    ID: 2, Nome: Bob, Salário: 4950
    ID: 3, Nome: Carol, Salário: 4700
    ```

## Mensagens de Erro

- Se a identificação informada para o aumento salarial não existir:
    ```
    This id does not exist!
    ```

## Considerações Finais

- Assegurar a integridade dos dados dos funcionários.
- Aplicar corretamente os aumentos salariais conforme especificado.
