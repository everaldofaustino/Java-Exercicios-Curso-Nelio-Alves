import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        //Fazer um programa para ler dois números inteiros M e N, e depois ler
        //uma matriz de M linhas por N colunas contendo números inteiros,
        //podendo haver repetições. Em seguida, ler um número inteiro X que
        //pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        //esquerda, acima, à direita e abaixo de X, quando houver, conforme
        //exemplo

        Scanner scan = new Scanner(System.in);
        int linha = scan.nextInt();
        int coluna = scan.nextInt();
        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i<linha;i++){
            for(int j=0;j<coluna;j++){
                System.out.print("Digite o valor para [" + (i) + "][" + (j) + "]: ");
                matriz[i][j] = scan.nextInt();

            }
        }

        System.out.println("Digite o número a ser encontrado: ");
        int num = scan.nextInt();

        for(int i = 0;i<linha;i++){
            for(int j = 0;j<coluna;j++){
                if(matriz[i][j] == num){
                    System.out.println("Position "+ i+","+j);
                    if(j>0){
                        System.out.println("Left: "+ matriz[i][j-1]);

                    }
                    if(i>0){
                        System.out.println("Up: "+ matriz[i-1][j]);
                    }
                    if(j<matriz[i].length-1){
                        System.out.println("Right: "+matriz[i][j+1]);
                    }
                    if(i<matriz.length-1) {

                        System.out.println("Down: " + matriz[i + 1][j]);
                    }


                }

            }
        }



    }
}
