package Semana1;
    public class Carrito { //Inicio de la clase Carrito
        /*Carrito(){ //Constructor

        }*/

        //Abstraccion
        //Declaramos caracteristicas relevantes en forma de variable y determinamos el tipo de variable
        int llantas, espejo;
        String NombreC, motor, cajuela;
        public String getNombreCarro(){ return NombreC; }
        public int getEspejos(){ return espejo; }
        public int getLlantas(){ return llantas; }
        public String getMotor(){ return motor; }
        public String getCajuela(){ return cajuela; }
        //Fin de la abstraccion

        //Metodos
        public boolean setNombreCarro(String NombreC){
            if(!NombreC.isEmpty()) {
                this.NombreC = NombreC;
                return true;
            }else{
                return false;
            }
        }

        public boolean setEspejos(int espejo){
            if(espejo >= 0) {
                this.espejo = espejo;
                return true;
            }else{
                return false;
            }
        }

        public boolean setLlantas(int llantas) {
            if(llantas >= 0) {
                this.llantas = llantas;
                return true;
            }else{
                return false;
            }
        }

        public boolean setMotor(String motor){
            if(!motor.isEmpty()) {
                this.motor = motor;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCajuela(String cajuela){
            if(!cajuela.isEmpty()) {
                this.cajuela = cajuela;
                return true;
            }else{
                return false;
            }
        }
    }// Fin de la clase Carrito
