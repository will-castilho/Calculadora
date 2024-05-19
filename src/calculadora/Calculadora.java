package calculadora;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    int num1;
    int num2;
    int resultado;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    public int somar(){
        resultado = num1 + num2;
        return resultado;
    }
    public int subtrair(){
        resultado = num1 - num2;
        return resultado;
    }
    public int multiplicar(){
        resultado = num1 * num2;
        return resultado;
    }
    public int dividir(){
        if(num2 == 0){
            throw new ArithmeticException("Impossivel dividir");
        }else {
            resultado = num1 / num2;
            return resultado;
        }
    }
}
