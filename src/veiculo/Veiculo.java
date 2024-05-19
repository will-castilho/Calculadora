package veiculo;

import java.util.Scanner;

public class Veiculo {
    int ano;
    int modelo;
    double quilometragem;
    String cor;

    public Veiculo(int ano, int modelo, double quilometragem, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.cor = cor;
    }

    public Veiculo() {

    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "ano=" + ano +
                ", modelo=" + modelo +
                ", quilometragem=" + quilometragem  +
                ", cor='" + cor + '\'' +
                '}';
    }

    public int lerModelo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo: ");
        this.modelo = scanner.nextInt();
        return this.modelo;
    }
    public int lerAno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano do veículo: ");
        this.ano = scanner.nextInt();
        return this.ano;
    }
    public String exibirCor(){
        System.out.println(cor);
        return this.cor;
    }
    public double lerQuilometragem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o KM do veículo: ");
        this.quilometragem = scanner.nextDouble();
        return this.quilometragem;
    }
    public String lerCor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cor do veiculo: ");
        String cor = scanner.nextLine();
        return cor;
    }
    public String mudarCor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nova cor: ");
        this.cor = scanner.nextLine();
        System.out.println("A nova cor e: ");
        return this.cor;
    }

    public void verificarManutencao(){
        if (this.quilometragem <= 25000){
            System.out.println("Tudo ok!!");
        }else if (this.quilometragem > 25000 && this.quilometragem <= 75000){
            System.out.println("Realizar revisão parcial");
        }else {
            System.out.println("Realizar revisão completa");
        }

    }

}
