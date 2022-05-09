import java.util.Random;

public class Aeropuerto {

    private String Nombre;
    private Avion [] avion = new Avion [100];

    public Aeropuerto(){

        Random random = new Random();

        for (int i = 0; i < 100; i++){
            Avion avion = new Avion(i+1,random.nextBoolean());
            this.avion [i] = avion;

        }



    }

}
