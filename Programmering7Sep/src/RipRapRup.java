import java.util.Random;

public class RipRapRup {

    public static void main(String[] args) {
        RipRapRup program = new RipRapRup();
        for (int i = 0; i < 25; i++) {
            program.run();
        }
    }

    public void run() {
        String[] navne = genererTilfældigeNavne();
        udskrivNavne(navne);
    }

    public String[] genererTilfældigeNavne() {
        String[] muligeNavne = {"Rip", "Rap", "Rup"};
        Random random = new Random();
        String[] tilfældigeNavne = new String[3];

        for (int i = 0; i < 3; i++) {
            int tilfældigtIndex = random.nextInt(muligeNavne.length);
            tilfældigeNavne[i] = muligeNavne[tilfældigtIndex];
        }

        return tilfældigeNavne;
    }

    public void udskrivNavne(String[] navne) {
        System.out.print(navne[0] + ", " + navne[1] + " og " + navne[2]);
        System.out.println();
    }
}
