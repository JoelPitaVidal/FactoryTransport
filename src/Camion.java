public class Camion implements Paquete{

    @Override
    public Float costeTotal(Integer cp, Float cosTot) {
        return null;
    }

    @java.lang.Override
    public java.lang.Float costeTotal(int cp, java.lang.Float cosTot) {
        Float coste;
        if(cp > 36200) coste = 5f;
        else coste = 6f;
        return cosTot;
    }

    @Override
    public int tipoEmbalaje(Float x, Float y, Float z) {
        return 0;
    }

    @java.lang.Override
    public int tipoEmbalaje(Float x, Float y, Float z,float peso,int tipEm) {
        if(peso > 30) tipEm = Paquete.PALET;
        else if (peso >= 30 || peso >=10) tipEm = Paquete.CAJAMADERA;
        else tipEm = Paquete.CAJACARTON;
        return tipEm;
    }
}
