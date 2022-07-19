package Skillbrain;

public class Persoana {
    public static String SPECIE = "homo_sapiens";

    // atribute
    String nume;
    int varsta;
    String adresa;

    // constructori
    Persoana() {
        nume = "Maria";
        varsta = 32;
        adresa = "Strada Ferdinand, nr. 26";
    }

    Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    //metode
    void plimbare() {
        System.out.println("Maria se plimba prin padure");
    }
    void gatire() {
        System.out.println("Maria gateste cina");
    }

    public static boolean respira(int dataDecesului) {
//        if (dataDecesului > 0) {
//            return false;
//        } else {
//            return true;
//        }
        return dataDecesului > 0 ? false : true;

    }

}
