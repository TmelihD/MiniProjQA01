public class PojoUrun  {

    private int id;

    private String urunIsmi;
    private String ureetici;
    private int miktar;
    private String birim;
    private String raf;

    public int getId() {
        return id;
    }

    public String getUrunImi() {
        return urunIsmi;
    }

    public String getUreetici() {
        return ureetici;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrunImi(String urunImi) {
        this.urunIsmi = urunImi;
    }

    public void setUreetici(String ureetici) {
        this.ureetici = ureetici;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}
