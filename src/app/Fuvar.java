
package app;

import java.util.Objects;

public class Fuvar {
    private String rsz;
    private int ido_mp;
    private double osszeg;
    private FizetesiMod fiz_mod;

    public Fuvar(String rsz, int ido_mp, double osszeg, FizetesiMod fiz_mod) {
        this.rsz = rsz;
        this.ido_mp = ido_mp;
        this.osszeg = osszeg;
        this.fiz_mod = fiz_mod;
    }
    
    public String getRsz() {
        return rsz;
    }

    public int getIdo_mp() {
        return ido_mp;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public FizetesiMod getFiz_mod() {
        return fiz_mod;
    }

    @Override
    public String toString() {
        return "Fuvar{" + "rsz=" + rsz + ", ido_mp=" + ido_mp + ", osszeg=" + osszeg + ", fiz_mod=" + fiz_mod + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.rsz);
        hash = 61 * hash + this.ido_mp;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.osszeg) ^ (Double.doubleToLongBits(this.osszeg) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.fiz_mod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fuvar other = (Fuvar) obj;
        if (this.ido_mp != other.ido_mp) {
            return false;
        }
        if (Double.doubleToLongBits(this.osszeg) != Double.doubleToLongBits(other.osszeg)) {
            return false;
        }
        if (!Objects.equals(this.rsz, other.rsz)) {
            return false;
        }
        return this.fiz_mod == other.fiz_mod;
    }

    
    
}
