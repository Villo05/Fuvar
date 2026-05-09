
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
        
        sorok.remove(0);
        
        for (String sor : sorok){
            String s[] = sor.split(";");
            System.out.println("sor: " + sor);
            String rsz = s[0];
            int ido_mp = Integer.parseInt(s[1]);
            double osszeg = Double.parseDouble(s[2]);
            String fiz= s[3];
            FizetesiMod fiz_mod = switch (fiz) {
                case "kártya" -> FizetesiMod.KARTYA;
                case "készpénz" -> FizetesiMod.KESZPENZ;
                case "utalás" -> FizetesiMod.UTALAS;
                case "csekk" -> FizetesiMod.CSEKK;
                default -> FizetesiMod.NINCS;
            };

            Fuvar fuvar = new Fuvar(rsz, ido_mp, osszeg, fiz_mod);
            fuvarok.add(fuvar);
            
            elsoFeladat();
            masodikFeladat();
            harmadikFeladat();
            negyedikFeladat();
            otodikFeladat();
            hatodikFeladat();
            hetedikFeladat();
            nyolcadikFeladat();
        }
    }    
        private static void elsoFeladat(){
            double osszeg = 0;
            for (Fuvar f : fuvarok){
                osszeg += f.getOsszeg();
            }
            System.out.println("\n1. Összes fuvar értéke: " + (int)osszeg + " Eur");
        }
        
        private static void masodikFeladat(){
            Fuvar max = fuvarok.get(0);
            for (Fuvar f : fuvarok){
                if (f.getOsszeg() > max.getOsszeg()){
                    max = f;
                }
            }
            System.out.println("2. Legdrágább fuvar rendszáma: " + max.getRsz());
        }
        private static void harmadikFeladat(){
            Fuvar min = fuvarok.get(0);
            for (Fuvar f : fuvarok) {
                if (f.getOsszeg() < min.getOsszeg()) {
                    min = f;
                }
            }
            double arfolyam = 365;
            double ft = min.getOsszeg() * arfolyam;
            System.out.println("3. Legolcsóbb fuvar forintban: " + (int) ft + " Ft");
        
        }
        private static void negyedikFeladat(){
            int db = 0;
            for (Fuvar f : fuvarok) {
                if (f.getFiz_mod() == FizetesiMod.KARTYA) {
                    db++;
                }
            }
            System.out.println("4. Hány kártyás fizetés volt: " + db + " db");
        }
        
        private static void otodikFeladat(){
            boolean meghatarozott = true;
            for (Fuvar f : fuvarok) {
                if (f.getFiz_mod() == FizetesiMod.NINCS) {
                    meghatarozott = false;
                }
            }
            System.out.println("5. Minden fizetési mód meghatázott: " + meghatarozott);
        }
        
        private static void hatodikFeladat(){
            String[] autok = new String[fuvarok.size()];
            int db = 0;
            for (Fuvar f : fuvarok) {
                boolean van = false;
                for (int i = 0; i < db; i++) {
                    if (autok[i].equals(f.getRsz())) {
                        van = true;
                    }
                }
                if (!van) {
                    autok[db] = f.getRsz();
                    db++;
                }
            }
            System.out.println("6. Hány darab autó van a rendszerben: " + db);
        }
        
        private static void hetedikFeladat(){
            System.out.println("7. Hányféle fizetési mód van: " + FizetesiMod.values().length);
        }
        
        private static void nyolcadikFeladat(){
            System.out.println("8. Melyik autó mennyi fuvart teljesített: ");
        }
}
