package pl.sdacademy.testowanie.podstawy.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @since : 19.07.2020
 **/
public class Cafe {
    boolean canServeCoffe;

    public Cafe() {
        canServeCoffe = false;
    }

    public void serveCoffee() {
        canServeCoffe = true;
    }

    public boolean canServeCoffee() {
        return canServeCoffe;
    }
}
