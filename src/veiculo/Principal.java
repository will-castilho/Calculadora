package veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();

        carro1.lerAno();
        carro1.lerModelo();
        carro1.lerCor();
        carro1.lerQuilometragem();


        carro1.verificarManutencao();
        carro1.exibirCor();
        carro1.mudarCor();
        carro1.exibirCor();

        System.out.println("ESPECIFICACOES:");
        System.out.println(carro1);

    }
}
