Este é um programa feito em Java que apresenta um menu de opções para o usuário. Cada opção corresponde a uma operação diferente que é executada quando a opção é selecionada. 

O código importa várias classes que são usadas para realizar diferentes operações. Estas incluem CalculoFatorial, DiferencaValores, ImpostoDeRenda, ReajusteSalario e OperacoesMat. Além disso, ele importa a classe Scanner do pacote java.util para ler a entrada do usuário.

A classe Menu contém o método principal (main) que é o ponto de entrada do programa. Dentro do método main, um objeto Scanner chamado dado é criado para ler a entrada do usuário. Em seguida, um loop while (true) é iniciado, que continuará a executar até que o programa seja encerrado.

Dentro do loop, o programa exibe um menu de opções para o usuário. O usuário pode escolher entre várias opções, cada uma correspondendo a uma operação diferente. Dependendo da opção escolhida pelo usuário, um caso diferente no bloco switch será executado. 
Cada caso chama um método diferente para executar a operação correspondente. Se o usuário escolher a opção 0, o programa será encerrado. Se o usuário inserir uma opção inválida, o programa irá informá-lo e pedir que ele tente novamente.

Cada operação é chamada por um método chamado Exercutar(), que existe em cada Classe do sistema.

Detalhes sobre cada método: 

Reajuste Salário: 

Este método é responsável por calcular o novo salário de um usuário após um reajuste percentual:
 ° Primeiro, cria um objeto Scanner chamado dados para ler a entrada do usuário.
 ° Em seguida, pede ao usuário para inserir seu salário atual e a porcentagem de aumento.
 ° Calcula o valor do aumento dividindo o produto do salário e a porcentagem por 100.
 ° Adiciona o valor do aumento ao salário atual para obter o novo salário.
 ° Finalmente, imprime o novo salário com o reajuste aplicado.

Difernça entre Valores: 

Este método é responsável por calcular a diferença entre dois valores inseridos pelo usuário:
 ° Primeiro, cria um objeto Scanner chamado dados para ler a entrada do usuário.
 ° Em seguida, pede ao usuário para inserir o primeiro e o segundo valor.
 ° Calcula a diferença entre os dois valores.
 ° Finalmente, imprime a diferença entre os dois valores.

 Operações Matemáticas:

Este método é responsável por realizar as quatro operações matemáticas básicas (soma, subtração, divisão e multiplicação) em dois números inseridos pelo usuário:
 ° Primeiro, cria um objeto Scanner chamado dado para ler a entrada do usuário.
 ° Em seguida, pede ao usuário para inserir dois números.
 ° Realiza a soma dos dois números e imprime o resultado.
 ° Chama o método Subtracao para realizar a subtração e imprime o resultado.
 ° Chama o método Divisao para realizar a divisão. Este método também imprime o resultado.
 ° Chama o método Multiplicacao para realizar a multiplicação e imprime o resultado.
 
Os Métodos Subtracao, Divisao e Multiplicacao são métodos auxiliares que realizam a subtração, divisão e multiplicação, respectivamente. O método Subtracao e Multiplicacao retornam o resultado da operação, enquanto o método Divisao imprime o resultado diretamente.

Imposto de Renda:

Este método é responsável por calcular o salário líquido de um usuário após a aplicação de um imposto de renda de 27,5%:
 ° Primeiro, cria um objeto Scanner chamado dados para ler a entrada do usuário.
 ° Em seguida, pede ao usuário para inserir seu salário bruto.
 ° Calcula o valor do imposto de renda dividindo o produto do salário bruto e a porcentagem do imposto por 100.
 ° Subtrai o valor do imposto do salário bruto para obter o salário líquido.
 ° Finalmente, imprime o salário líquido após a aplicação do imposto de renda.

 Calcular Fatorial:

Este método é responsável por calcular o fatorial de um número inserido pelo usuário:
 ° Primeiro, cria um objeto Scanner chamado dado para ler a entrada do usuário.
 ° Em seguida, pede ao usuário para inserir um número.
 ° Chama o método CalculoFatorial para calcular o fatorial do número.
 ° Finalmente, imprime o fatorial do número.

O Método CalculoFatorial é responsável por calcular o fatorial de um número:
 ° Primeiro, verifica se o número é negativo. Se for, imprime uma mensagem de erro e retorna -1.
 ° Em seguida, inicializa uma variável fatorial como 1.
 ° Em seguida, usa um loop for para multiplicar fatorial por cada número de 1 até o número inserido.
 ° Finalmente, retorna o valor de fatorial.

 

 

 
