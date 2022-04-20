package Semana1;

public class ModeloCarro { //Inicio de la clase ModeloCarro
    public static void Carro(){
        System.out.println("Hola que hace soy una Camioneta RC Racer 4x4 :v");
        System.out.println("Te cuento cuales son mis caracteristicas :) ");
    }

    public static void main(String[] args) { //Inicio del metodo principal
        Carro(); //Llamado del metodo Carro
        Carrito objCarro = new Carrito(); //Creacion del objeto
        objCarro.setNombreCarro("Camioneta Hotwheel RC Racer 4x4");
        System.out.println("Soy un carrito tipo: " + objCarro.getNombreCarro());

        objCarro.setLlantas(4);
        System.out.println("Tengo " + objCarro.getLlantas() + " llantas");

        objCarro.setEspejos(2);
        System.out.println("Tambien tengo espejos son " + objCarro.getEspejos() + " pero estan algo grandes");

        objCarro.setMotor("Inline Vertical Engine");
        System.out.println("Mi motor considero que es bueno para alguien que va empezando es un " + objCarro.getMotor());

        objCarro.setCajuela("Palangana");
        System.out.println("Ademas de que en la parte trasera tengo una " + objCarro.getCajuela() + " para lo que se te ofrezca poner :)");

    } // Fin del main
} // Fin de la clase ModeloCarro
