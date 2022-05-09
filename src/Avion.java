import java.util.Random;

public class Avion {

    private int id;
    private int cantidadMaxima;
    private int pasajeroActual;
    private boolean estado;

    public Avion(int id, int pasajeroMaximo, int pasajeroActual, boolean estado){

        this.cantidadMaxima = pasajeroMaximo;
        this.pasajeroActual = pasajeroActual;
        this.id = id;
        this.estado = estado;

    }

    public Avion(int id,boolean estado){

        this.id = id;
        this.cantidadMaxima = new Random().nextInt(20) * 10;
        this.pasajeroActual = new Random().nextInt(20);
        this.estado = estado;
        
    }

    public int getId(){
        return id;
    };

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getPasajeroActual() {
        return pasajeroActual;
    }

    public boolean getEstado(){
        return estado;
    }

    public void bajarPasajeros(int cantidaPasajeros){

        if(cantidaPasajeros > this.pasajeroActual){

            System.out.println("Cantidad de pasajeros sobrepasa el actual, ingrese una cantidad menor");
            System.out.println("La cantidad actual es: " + getPasajeroActual());
        }

        if(cantidaPasajeros > getCantidadMaxima()){

            System.out.println("Cantidad de pasajeros excede el maximo, ingrese una cantidad menor");
            System.out.println("La cantidad Maxima es: " + getCantidadMaxima());
        }

        this.pasajeroActual = this.pasajeroActual - cantidaPasajeros;

    }

    public void subirPasajero(int cantidadPasajeros){

        if (cantidadPasajeros > cantidadMaxima) {
            System.out.println("Cantidad de pasajeor excede el maximo de avion");
            System.out.println("La cantidad Maxima (avion) es: "+ getCantidadMaxima());
        }

        this.pasajeroActual = this.pasajeroActual + cantidadPasajeros;

    }



    
}
