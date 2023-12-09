package lab9p2_emilianourtechomarioocampo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class adminRegistro {
    public static void guardarRegistro(ArrayList<Registro> regis, String nombre) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombre));
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
