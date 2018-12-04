public abstract class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    public Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public void setHind(Double hind) {
        this.hind = hind;
    }

    public String getNimetus("burger") {
        return nimetus;
    }

    public String getLiha("liha") {
        return liha;
    }

    public String getSai("sai") {
        return sai;
    }

    public Double getHind(10) {
        return hind;
    }

    public void lisand1();{
        System.out.println("Lisatud tomat");
    }

    public void lisand2();{
        System.out.println("Lisatud kurk");
    }

    public void Lisand3();{
        System.out.println("Lisatud paprika");
    }

    public void Lisand4();{
        System.out.println("Lisatud salat");
    }


    public String getLisand1() {
        return lisand1;
    }

    public Double getLisand1Hind() {
        return lisand1Hind;
    }

    public String getLisand2() {
        return lisand2;
    }

    public Double getLisand2Hind() {
        return lisand2Hind;
    }

    public String getLisand3() {
        return lisand3;
    }

    public Double getLisand3Hind() {
        return lisand3Hind;
    }

    public String getLisand4() {
        return lisand4;
    }

    public Double getLisand4Hind() {
        return lisand4Hind;
    }
}
