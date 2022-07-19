package Skillbrain;

import Skillbrain.AnimalDeCompanie;
import Skillbrain.Mamifer;

public class Caine implements Mamifer, AnimalDeCompanie {

    public void mananca() {
        System.out.println("Eu sunt un caine si imi place sa mananc oase");
    }

    public void sunet() {
        System.out.println("Ham Ham");
    }

    public void reproducere() {
        System.out.println("Eu sunt un caine tare prietenos si imi place sa am multi pui");
    }

    public void vaneaza() {
        System.out.println("Eu sunt un caine de companie si nu stiu sa vanez");
    }
}
