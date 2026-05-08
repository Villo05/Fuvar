
package app;

public class Fuvar {
    private String rsz;
    private int ido_mp;
    private int osszeg;
    private String fit_mod;

    public Fuvar(String rsz, int ido_mp, int osszeg, String fit_mod) {
        this.rsz = rsz;
        this.ido_mp = ido_mp;
        this.osszeg = osszeg;
        this.fit_mod = fit_mod;
    }

    public String getRsz() {
        return rsz;
    }

    public int getIdo_mp() {
        return ido_mp;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public String getFit_mod() {
        return fit_mod;
    }
    
    
}
