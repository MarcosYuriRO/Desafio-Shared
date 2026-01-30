package desafio_kindred.src;

public enum Bloco {
    BARREIRA(0),
    CHAO(1),
    OVELHA(2),
    LOBO(3);

    private int bloco;

    Bloco(int bloco){
        this.bloco = bloco;
    }

    public int getBloco(){
        return bloco;
    }
}
