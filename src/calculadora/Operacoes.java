package calculadora;

import calculadora.Calculadora;

public class Operacoes {
    public static void main(String[] args) {
        //Teste com (40, 2)
        Calculadora calc = new Calculadora(40,2);
        System.out.println("RESULTADOS CONTA 1:");
        System.out.println("Soma: " +calc.somar());
        System.out.println("Subtracao: " +calc.subtrair());
        System.out.println("Multiplicacao: " +calc.multiplicar());
        System.out.println("Divisao: " +calc.dividir());
        System.out.println("---------------------------");
        //Teste com (40,0)
        Calculadora calc1 = new Calculadora(40,0);
        System.out.println("RESULTADOS CONTA 2:");
        System.out.println("Soma: " +calc1.somar());
        System.out.println("Subtracao: " +calc1.subtrair());
        System.out.println("Multiplicacao: " +calc1.multiplicar());
        try {
            System.out.println("Divisao: " + calc1.dividir());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
