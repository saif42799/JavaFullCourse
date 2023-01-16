package LocalGlobalVariables;

import java.util.Random;

public class DiceRollerGLobal {

    Random random;
    int number = 0;

    DiceRollerGLobal(){
        random = new Random();
        roll(random,number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);

    }
}
