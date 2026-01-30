package desafio_kindred.src;

import java.util.*;

public class Lobo extends Animal {
    Random gerador = new Random();

    protected int energia;

    public void mover() {
        if (energia < 10) {
            status = Status.MORTO;
        }
    }
}