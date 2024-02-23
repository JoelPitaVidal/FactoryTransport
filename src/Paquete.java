public interface Paquete {
    static final int PALET=0;
    static final int CAJACARTON=1;
    static final int CAJAMADERA=2;

    public Float costeTotal(Integer cp,Float cosTot);

    Float costeTotal(int cp, Float cosTot);

    public int tipoEmbalaje (Float x, Float y, Float z);


    int tipoEmbalaje(Float x, Float y, Float z, int tipEm, Float peso);
}
