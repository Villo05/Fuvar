
package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Fuvarok {

    private static List<Fuvar> fuvarok = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fuvarok.csv");
        List<String> sorok = Files.readAllLines(path);
        
        for (String sor : sorok){
            String s[] = sor.split(";");
            String rsz = s[0];
            int ido_mp = Integer.parseInt(s[1]);
            int osszeg = Integer.parseInt(s[2]);
            String fit_mod = s[3];
            Fuvar fuvar = new Fuvar(rsz, ido_mp, osszeg, fit_mod);
            fuvarok.add(fuvar);
        }
        
        kiir();
    }
    private static void kiir(){
            System.out.println(fuvarok);
        }
}
