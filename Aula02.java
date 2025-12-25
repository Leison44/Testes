public class aula02{
    public static void main (String[]args){
        
        //Tipos primitivos em Java: int, double, float, char, boolean, byte, short, long
       
        int age=10;
        double moneyDouble=2000;
        float moneyFloat=2500;
        byte ageByte=10;
        short idadeShort=10;
        boolean verdade=true;
        boolean falso=false;
        char letra='A';
        long numeroLong=123456789;
        String nome="João";
        var nome2="Maria"; //a partir do Java 10, é possível usar 'var' para declaração de variáveis com inferência de tipo
        System.out.println(nome);

        //Operadores lógicos: && (E), || (OU), ! (NÃO)
        //&& (E): retorna true se ambos os operandos forem true
        //|| (OU): retorna true se pelo menos um dos operandos for true
        //! (NÃO): inverte o valor lógico do operando
    }
}

//boolean: armazena valores verdadeiros ou falsos (true/false)
//Exemplo de uso:
//boolean isJavaFun = true;
//boolean isFishTasty = false;
//No exemplo acima, a variável isJavaFun é atribuída com o valor true, indicando que Java é divertido,

//char: armazena um único caractere (letra, número, símbolo) usando aspas simples
//Exemplo de uso:
//char letter = 'A';
//char digit = '1';
//char symbol = '#';
//No exemplo acima, a variável letter armazena o caractere 'A', digit armazena o caractere '1' e symbol armazena o caractere '#'.
//int: armazena números inteiros (sem casas decimais)

//casting: conversão explícita de um tipo de dado para outro
//Exemplo de uso:
//int myInt = 9;
//double myDouble = myInt; // conversão implícita de int para double
//double anotherDouble = 9.78;
//int anotherInt = (int) anotherDouble; // conversão explícita de double para   int

//declaração e tamanho dos tipos primitivos:
//int: 4 bytes
//double: 8 bytes
//float: 4 bytes
//byte: 1 byte
//short: 2 bytes
//long: 8 bytes
//char: 2 bytes
//boolean: tamanho não especificado (depende da JVM)
//Exemplo de declaração:
//int myInt = 100;
//double myDouble = 100.99;
//float myFloat = 10.5f;
//byte myByte = 10;
//short myShort = 1000;
//long myLong = 100000L;
//char myChar = 'A';
//boolean myBoolean = true;
//No exemplo acima, cada variável é declarada com seu respectivo tipo primitivo e inicializada com um valor.
//Exemplo de uso:
//int sum = myInt + 50;
//double total = myDouble * 2.5;
//boolean isAdult = (age >= 18);
//float division = myFloat / 2.0f;
//char nextLetter = (char) (myChar + 1); // incrementa o caractere

//string: não é um tipo primitivo, mas uma classe que representa uma sequência de caracteres
//Exemplo de uso:
//String greeting = "Hello, World!";
//String name = "John Doe";
//No exemplo acima, a variável greeting armazena a string "Hello, World!" e name armazena "John Doe". indicando que a afirmação é verdadeira.
//A variável isFishTasty é atribuída com o valor false, indicando que o peixe não é saboroso.   
