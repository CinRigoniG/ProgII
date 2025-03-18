import java.sql.SQLOutput;

public class Auto extends Vehiculo {

    private boolean descapotable;

    public Auto(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public Auto(String propietario, int puertas, int ruedas, boolean descapotable) {
        super(propietario, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar(){
        System.out.println("Se ha bajado del vehiculo");
    }

    public void subir(){
        System.out.println("Se ha subido al vehiculo");
    }

    public void caracteristicas(){
        System.out.println("Otra caracteristica...");
    }
}
