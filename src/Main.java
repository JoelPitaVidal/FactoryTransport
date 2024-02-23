public class Main {
    public static void main(String[] args) {

        Paquete transporte;

        transporte=FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        if(transporte instanceof Camion) System.out.println("CAMION:");
        System.out.println("Coste total: "+transporte.costeTotal(36400)+" "+ "Tipo de transporte: "+transporte.tipoEmbalaje(11f,25f ,30f));


        transporte=FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        if(transporte instanceof Bicicleta) System.out.println("BICICLETA:");
        System.out.println("Coste total: "+transporte.costeTotal(36400)+" "+"Tipo de transporte: "+transporte.tipoEmbalaje(2f,2f,3f));
    }
}