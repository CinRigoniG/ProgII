public class Camion extends Vehiculo{

    private float carga;

    public Camion(float carga) {
        this.carga = carga;
    }

    public Camion() {
    }

    public Camion(String propietario, int puertas, int ruedas, float carga) {
        super(propietario, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void caracteristicas(float carga){
        System.out.println("...");
    }

    public void cargar(){
        System.out.println("...");
    }

}
