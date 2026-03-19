import java.util.Locale;
import java.util.Scanner;

public class TestaPensionato {

    public static void main(String[] args) {
        //Adonadeumpensionatopossuidezquartosparaalugarparaestudantes,
        //sendoessesquartosidentificadospelosnúmeros0a9.
        //Fazerumprogramaqueiniciecomtodososdezquartosvazios,edepois
        //leiaumaquantidadeNrepresentandoonúmerodeestudantesquevão
        //alugarquartos(Npodeserde1a10).Emseguida,registreoalugueldos
        //Nestudantes. Para cada registro de aluguel, informaronomeeemaildo
        //estudante,bemcomoqualdosquartoseleescolheu(de0a9).Suponha
        //quesejaescolhidoumquartovago. Ao final,seuprogramadeveimprimir
        //umrelatóriodetodasocupaçõesdopensionato,porordemdequarto,
        //conformeexemplo.

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados? ");
        int n = scan.nextInt();
        scan.nextLine();

        Pensionato[] vetor = new Pensionato[10];
        for(int i = 0; i<n;i++){
            System.out.println("\nAluguel #"+(i+1));
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto: ");
            int quarto = scan.nextInt();
            scan.nextLine();

            vetor[quarto] =new Pensionato(nome,email);


        }

        System.out.println("\nQuartos ocupados: ");
        for(int i =0;i<vetor.length;i++){

            if(vetor[i]!= null){
                System.out.println(i+": "+ vetor[i]);
            }
        }







    }






}
