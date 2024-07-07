package prototipo;

import java.util.Scanner;
import java.util.ArrayList;

public class prototipo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Exercicio> listex = new ArrayList<>();

        Exercicio supino = new Exercicio();
        supino.setNome("Supino reto");
        supino.setCod(0);
        supino.setLink("https://www.youtube.com/watch?v=Kr2erpSyu3M&t=2s");
        Exercicio crucifixo = new Exercicio();
        crucifixo.setNome("Crucifixo");
        crucifixo.setCod(1);
        crucifixo.setLink("https://www.youtube.com/watch?v=NB_1mCfIOLU");
        Exercicio remadaU = new Exercicio();
        remadaU.setNome("Remada Unilateral");
        remadaU.setCod(2);
        remadaU.setLink("https://www.youtube.com/watch?v=EUisRaNkCd4");
        Exercicio legP = new Exercicio();
        legP.setNome("Leg Press");
        legP.setCod(3);
        legP.setLink("https://www.youtube.com/watch?v=ueZhlRipdFk");
        Exercicio puxadaA = new Exercicio();
        puxadaA.setNome("Puxada Alta");
        puxadaA.setCod(4);
        puxadaA.setLink("https://www.youtube.com/watch?v=Xn-fIQw08q4");

        listex.add(supino);
        listex.add(crucifixo);
        listex.add(remadaU);
        listex.add(legP);
        listex.add(puxadaA);

        for (int i = 0; i < listex.size(); i++) {
            System.out.println("Nome: " + listex.get(i).getNome());
            System.out.println("Código: " + listex.get(i).getCod());
            System.out.println("Link: " + listex.get(i).getLink());
            System.out.println("\n");
        }

    }

}
