package Lista_01;
public class Lampada {
    boolean ligado;

    Lampada(){
        /**
         * todo novo objeto de lampada estará ligado
         */
        liga();
    }

    void liga(){
        ligado = true;
    }
    void desliga(){
        ligado = false;
    }

    String observa(){
        if(ligado){
            return "Ligado";
        }
        return "Desligado";
    }
}
