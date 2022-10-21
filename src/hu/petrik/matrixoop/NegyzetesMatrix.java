package hu.petrik.matrixoop;

public class NegyzetesMatrix extends Matrix {
    private int sor;
    public NegyzetesMatrix(int sor) {
        super(sor,sor);
    }

    public int getNegyzetesMatrixMeret() {
        return super.getM().length;
    }

    public int getFoAtloOsszeg() {
        int atloOsszeg = 0;
        for (int i = 0; i < super.getM().length; i++) {
            for (int j = 0; j <super.getM()[i].length ; j++) {
                if (i == j) {
                    atloOsszeg += super.getM()[i][j];
                }
            }
        }
        return atloOsszeg;

    }
    public int getMellekAtoOsszeg() {
        int atloOsszeg = 0;
        for (int i = 0; i < super.getM().length; i++) {
            for (int j = 0; j <super.getM()[i].length ; j++) {
                if ((i + j) == super.getM()[i].length -1) {
                    atloOsszeg += super.getM()[i][j];
                }
            }
        }
        return atloOsszeg;
    }
    public int getFoAtloAlattiOsszeg() {
        int sorI = 0;
        int oszlopI = 0;
        int atloAlattOsszeg = 0;
        for (int i = 0; i < super.getM().length; i++) {
            for (int j = 0; j < i; j++) {
                atloAlattOsszeg += super.getM()[i][j];
            }
        }


        return atloAlattOsszeg;
    }
}
