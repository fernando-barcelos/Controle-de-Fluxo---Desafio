package DesafioControle;

public class ParametrosInvalidosException extends Throwable {
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for ( int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
