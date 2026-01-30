package desafio_kindred.src;

import java.util.*;

public abstract class Animal {
    protected Status status;
    protected String simbolo;
    protected int turnoAtual;
    protected int turnosPassados;

    public abstract void mover();
}