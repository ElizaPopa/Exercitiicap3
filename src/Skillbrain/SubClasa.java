package Skillbrain;

public class SubClasa extends SuperClasa {
    @Override
    void metodaImplicita() {
        System.out.println("Metoda implicita din SubClasa");
    }
    @Override
    protected void metodaProtected() {
        System.out.println("Metoda protected din SubClasa");
    }
@Override
    public void metodaPublica() {
        System.out.println("Metoda publica din SubClasa");
    }
    }

