
package app;

public class Fuvar {
    private String rsz;
    private int idoMp;
    private int osszeg;
    private String fit_mod;

    public Fuvar(String rsz, int ido_mp, int osszeg, String fit_mod) {
        this.rsz = rsz;
        this.idoMp = idoMp;
        this.osszeg = osszeg;
        this.fit_mod = fit_mod;
    }

    public String getRsz() {
        return rsz;
    }

    public int getIdoMp() {
        return idoMp;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public String getFit_mod() {
        return fit_mod;
    }
    
    
}
