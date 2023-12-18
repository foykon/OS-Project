public class Proses {
    private final int prosesId;
    private String prosesDurumu;
    private int varisZamani;
    private int oncelikDegeri;
    private int prosesSuresi;
    private final String color;
    private int beklemeSuresi;
    private int kullanilacakBellekAlani;
    private int kullanilanModemSayisi;
    private int kullanilanTarayiciSayisi;
    private int kullanilanCDSayisi;

    public Proses(int prosesId, int varisZamani, int oncelikDegeri, int prosesSuresi, String color,int kullanilacakBellekAlani, int kullanilanModemSayisi, int kullanilanTarayiciSayisi, int kullanilanCDSayisi) {
        this.prosesId = prosesId;
        this.prosesDurumu = "";
        this.varisZamani = varisZamani;
        this.oncelikDegeri = oncelikDegeri;
        this.prosesSuresi = prosesSuresi;
        this.color = color;
        this.beklemeSuresi = 0;
        this.kullanilacakBellekAlani = kullanilacakBellekAlani;
        this.kullanilanModemSayisi = kullanilanModemSayisi;
        this.kullanilanTarayiciSayisi = kullanilanTarayiciSayisi;
        this.kullanilanCDSayisi = kullanilanCDSayisi;
    }

    public int getKullanilacakBellekAlani() {
        return kullanilacakBellekAlani;
    }

    public void setKullanilacakBellekAlani(int kullanilacakBellekAlani) {
        this.kullanilacakBellekAlani = kullanilacakBellekAlani;
    }

    public int getKullanilanModemSayisi() {
        return kullanilanModemSayisi;
    }

    public void setKullanilanModemSayisi(int kullanilanModemSayisi) {
        this.kullanilanModemSayisi = kullanilanModemSayisi;
    }

    public int getKullanilanTarayiciSayisi() {
        return kullanilanTarayiciSayisi;
    }

    public void setKullanilanTarayiciSayisi(int kullanilanTarayiciSayisi) {
        this.kullanilanTarayiciSayisi = kullanilanTarayiciSayisi;
    }

    public int getKullanilanCDSayisi() {
        return kullanilanCDSayisi;
    }

    public void setKullanilanCDSayisi(int kullanilanCDSayisi) {
        this.kullanilanCDSayisi = kullanilanCDSayisi;
    }




    public int getVarisZamani() {
        return varisZamani;
    }

    public String getColor() {
        return color;
    }

    public int getProsesId() {
        return prosesId;
    }

    public String getProsesDurumu() {
        return prosesDurumu;
    }

    public void setProsesDurumu(String prosesDurumu) {
        this.prosesDurumu = prosesDurumu;
    }

    public int getOncelikDegeri() {
        return oncelikDegeri;
    }

    public void setOncelikDegeri(int oncelikDegeri) {
        this.oncelikDegeri = oncelikDegeri;
    }

    public int getProsesSuresi() {
        return prosesSuresi;
    }

    public void setProsesSuresi(int prosesSuresi) {
        this.prosesSuresi = prosesSuresi;
    }

    public int getBeklemeSuresi() {
        return beklemeSuresi;
    }

    public void setBeklemeSuresi(int beklemeSuresi) {
        this.beklemeSuresi = beklemeSuresi;
    }
}