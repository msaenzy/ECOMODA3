package model;

import controller.Controlador;
import java.io.FileNotFoundException;

public class MAIN {

    public MAIN() throws FileNotFoundException {
        Controlador controlador = new Controlador();
        controlador.iniciarPrograma();
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        MAIN ecoModa3 = new MAIN();
       
    }

}
