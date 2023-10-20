#Classe ContaBancaria:
Deve ter atributos saldo e numeroDaConta.
Deve ter um método depositar(double valor) que adiciona o valor ao saldo.
Deve ter um método sacar(double valor) que subtrai o valor do saldo. Se o valor a ser sacado for maior que o saldo, não deve permitir e retornar um valor booleano false. Caso contrário, deve retornar true.

#Classe ConversorTemperatura:
Deve ter um método celsiusParaFahrenheit(double celsius) que converte a temperatura de Celsius para Fahrenheit.
Deve ter um método fahrenheitParaCelsius(double fahrenheit) que converte a temperatura de Fahrenheit para Celsius.


#Testes Parametrizados com CSV
Implemente a classe CalculadoraIMC descrita a seguir:
Classe CalculadoraIMC: 
Deve calcular o Índice de Massa Corporal (IMC) usando a fórmula: IMC = peso(kg) / altura²(m).
Peso e altura devem ser valores positivos.
Crie um arquivo dadosIMC.csv contendo dados para teste. O arquivo deve conter os seguintes registros:

peso,altura,resultadoEsperado
60,1.5,26.67
50,1.6,19.53
70,1.7,24.22
80,1.8,24.69
90,1.9,24.93

Utilize JUnit 5 para escrever um teste parametrizado que leia os dados do arquivo dadosIMC.csv e teste a classe CalculadoraIMC
