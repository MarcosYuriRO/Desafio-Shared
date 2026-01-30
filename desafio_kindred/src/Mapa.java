package desafio_kindred.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mapa {
    private StringBuffer mapa;
    private int bloco;

    private final int[] ESTRUTURA_MAPA = {0, 1, 2, 3, 4};


    public void renderizarMapa(){
        
    }

    public List<Integer> estruturarBlocosDoMapa(){
        Random random = new Random();
        List<Integer> blocos = new ArrayList<>(); 
        int limiteMapa = ESTRUTURA_MAPA.length * ESTRUTURA_MAPA.length;
        for (int i = 0; i <= limiteMapa; i++) {
            int numeroBloco = random.nextInt(4);
            blocos.add(numeroBloco);
        }

        return blocos;
    }

        
    public String renderizarBlocos(Bloco bloco){
        switch (bloco) {
            case BARREIRA:
                return "X";
            case CHAO:
                return ".";
            case OVELHA:
                return "🐑";
            case LOBO:
                return "🐺";
            default:
                return "";
        }
    }

}
