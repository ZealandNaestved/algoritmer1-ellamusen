import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    public Random rand = new Random();

    public static void main(String[] args) {
        Algorithms1 a1 = new Algorithms1();
        System.out.println(a1.randomName());
        System.out.println(a1.randomLetter());
        exampleOfPredictableRandomNumber();
    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 17 --> ");
        System.out.println(random.nextInt(22));
    }

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!
    public String randomBoyName() {
        String[] names = Data.getRandomDrengeNavne();
        return names[this.rand.nextInt(names.length)];
    }

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen
    public String randomGirlName() {
        String[] names = Data.getRandomPigeNavne();
        return names[this.rand.nextInt(names.length)];
    }

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det
    public String randomName() {
        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.addAll(Arrays.asList(Data.getRandomDrengeNavne()));
        randomNames.addAll(Arrays.asList(Data.getRandomPigeNavne()));
        return randomNames.get(this.rand.nextInt(randomNames.size()));
    }

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
    public String randomLetter() {
        String[] letter = Data.getRandomLetter();
        return letter[this.rand.nextInt(letter.length)];
    }

    // TODO 8 - Skriv en plet eller krone generator metode (plet er boolean true og krone er boolean false)
    public String platEllerKrone() {
        Random pk = new Random(); // creating Random object

        if (pk.nextBoolean() == true) {
            return "Plat";
        } else {
            return "Krone";
        }
    }
}
