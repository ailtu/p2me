[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7137816&assignment_repo_type=AssignmentRepo)
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Diego Pinheiro

**Disciplina**: Programação 2

**Atividade**: Lista 01 - Nivelamento

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01
Crie uma classe `SumDivision` que contém os dois métodos `static` a seguir:
1. método `sum` que recebe dois parâmetros `addend1` e `addend2` do tipo double e retorna um double
que é a soma entre `addend1` e `addend2`.
2. Método divide que recebe dois parâmetros `dividend` e `divisor` do tipo double e retorna um double que é o resultado da divisão de `dividend` por `divisor`.

A variável `result` no código a seguir armazena o valor `15`:

    ```java
    double n = 15;
    double result = SumDivision.sum(n, 0);
    ```

### Questão 02
Crie uma classe `Volume` contendo um método `static` chamado `getName` que recebe uma variável `volume` do tipo `int` e retorna uma `String` com a descrição de `volume` a seguir
 1. `"Min Volume"`, caso `volume` seja menor ou igual a `0`;
 2. `"Low Volume"`, caso volume seja maior que 0 e menor ou igual a `25`;
 3. `"Medium Volume"`, caso volume seja maior que `25` e menor que ou igual a `75`;
 4. `"High Volume"`, caso volume seja maior que `75` e menor que `100`;
 5. `"Max Volume"`, caso volume seja maior ou igual à `100`.


> Exemplos:
A variável `result` no código a seguir armazena o conteúdo `"Low Volume"`.

    ```java
    int volume = 25;
    String result = Volume.getName(volume);
    ```