public class Bicicleta implements Paquete{

    @Override
    public Float costeTotal(Integer cp, Float cosTot) {
        return null;
    }

    @Override
    public Float costeTotal(int cp, Float cosTot) {
        if(cp > 36200) cosTot = 5f;
        else cosTot = 6f;
        return cosTot;
    }



    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, int tipEm, Float peso) {
        if(peso >= 0 || peso <= 10) tipEm = Paquete.CAJACARTON;
        else return tipEm;
        return tipEm;
    }
}
