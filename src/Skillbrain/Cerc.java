package Skillbrain;

public class Cerc extends ObiectGrafic {
    double raza;

    Cerc(double raza, double x, double y) {
        super(x, y);
        this.raza = raza;
    }

    public double aria() {
        return Math.PI * raza * raza;
    }

    public double perimetru() {
        return 2 * Math.PI * raza;
        }

    public static class Labrador extends Caine {
        public String rasa = "Labrador";
        public String rasa() {
            return rasa;
        }

        @Override
        public void mananca() {
            System.out.println("Eu sunt un labrador si imi place sa ma joc");
        }
    }
}

