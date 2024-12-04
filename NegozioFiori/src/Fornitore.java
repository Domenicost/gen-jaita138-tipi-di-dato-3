import java.util.Scanner;

public class Fornitore {
    public static void main(String[] args) throws Exception {

        String scelta = "y";
        Scanner sc = new Scanner(System.in);

        while (scelta.equals("y")) {

            System.out.println("Crea un nuovo fornitore!");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Categoria:");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME,");
            System.out.println("3 - GIARDINAGGIO");
            System.out.println("Inserisci Categoria: ");
            byte categoriaNum = sc.nextByte();
            sc.nextLine();
            CategoriaFornitore categoriaFornitore = CategoriaFornitore.values()[categoriaNum];

            System.out.print("Inserisci P.IVA: ");
            String piva = sc.nextLine();

            System.out.print("Inserisci Luogo:");
            String luogo = sc.nextLine();

            System.out.print("Inserisci Numero Telefono:");
            String telefono = sc.nextLine();

            System.out.print("Inserisci email:");
            String email = sc.nextLine();

            System.out.print("Inserisci Lingua Principale:");
            String linguaPrincipale = sc.nextLine();

            System.out.print("Inserisci IBAN:");
            String IBAN = sc.nextLine();

            System.out.print("Inserisci Nome Referente:");
            String nomeReferente = sc.nextLine();

            System.out.print("Inserisci Note:");
            String note = sc.nextLine();


            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("Fornitore Creato!");

            System.out.println("Nome: " + nome);
            System.out.println("Categoria: " + categoriaFornitore);
            System.out.println("P.IVA: " + piva);
            System.out.println("Luogo: " + luogo);
            System.out.println("Telefono: " + telefono);
            System.out.println("email: " + email);
            System.out.println("Lingua Principale: " + linguaPrincipale);
            System.out.println("IBAN: " + IBAN);
            System.out.println("Nome Referente: " + nomeReferente);
            System.out.println("Note: " + note);

            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");

            System.out.println("Vuoi continuare a inserire un altro fornitore? (y/n):");
            scelta = sc.nextLine();
        }

        sc.close();
        System.out.println("Grazie per aver usato il nostro servizio!");
    }
}