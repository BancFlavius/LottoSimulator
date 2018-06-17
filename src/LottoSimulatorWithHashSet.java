import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulatorWithHashSet {

    private final static int numbersGuessed = 4;
    public static void main(String[] args) {

        Set<Integer> bilet1 = generatorBilet();
        Set<Integer> bilet2 = generatorBilet();

        int counter = 0;
        int guessed = comparaDouaBilete(bilet1, bilet2);

        while(guessed < numbersGuessed){
            bilet2=generatorBilet();
            counter++;
            System.out.println(counter);
            guessed = comparaDouaBilete(bilet1, bilet2);
        }

        System.out.println("Avem un castigator ");

        System.out.print("Biletul Agentiei: ");
        for(Integer num : bilet1) System.out.print(num + " ");
        System.out.println();

        System.out.print("Bilet generat: ");
        for(Integer num : bilet2) System.out.print(num + " ");

    }

    public static Set<Integer> generatorBilet() {

        Set<Integer> sirBilet = new HashSet<>();

        while(sirBilet.size() != 6){
            sirBilet.add(new Random().nextInt(49)+1);
        }

        return sirBilet;
    }

    public static int comparaDouaBilete(Set<Integer> bilet1, Set<Integer> bilet2) {
        int gasite=0;

        for(Integer elem : bilet2){
            if(bilet1.contains(elem)){
                gasite++;
            }
        }

        return gasite;
    }
}
