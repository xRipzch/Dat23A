import java.util.Scanner;

public class tvChannels {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vælg en TV-kanal:");
            System.out.println("1. DR");
            System.out.println("2. Kanal5");
            System.out.println("3. Disney Channel");
            System.out.println("0. Afslut");

            int choice = scanner.nextInt();
            scanner.nextLine(); // For at fjerne newline karakteren

            String currentShow = ""; // Lokal variabel til den aktuelle kanals program

            if (choice == 1) {
                currentShow = "Det lille hus på prærien.";
            } else if (choice == 2) {
                currentShow = "Politijagt på Kanal 5!";
            } else if (choice == 3) {
                currentShow = "That's so Raven, på Disney Channel.";
            } else if (choice == 0) {
                System.out.println("Programmet afsluttes.");
                break; // break var nemmest. :(
            } else {
                System.out.println("Ugyldigt valg. Prøv igen.");
            }

            if (!currentShow.isEmpty()) {
                System.out.println("Du ser nu: " + currentShow);
                System.out.println(); // Tom linje for bedre læsbarhed
            }
        }
    }

    public static void main(String[] args) {
        tvChannels program = new tvChannels();
        program.run();
    }
}
