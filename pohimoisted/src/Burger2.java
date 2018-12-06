public class Burger2 {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;

    private String lisand1;
    private Double lisand1Hind;

    private String lisand2;
    private Double lisand2Hind;

    private String lisand3;
    private Double lisand3Hind;

    private String lisand4;
    private Double lisand4Hind;

    // konstruktor
    public Burger2(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public void valiLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;

    public void valiLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand2Hind = lisand2Hind;

    public void valiLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand3Hind = lisand3Hind;

    public void valiLisand4(String lisand4, Double lisand4Hind) {
        this.lisand4 = lisand4;
        this.lisand4Hind = lisand4Hind;
    }

    public Double koostaBurger() {
        Double hind1 = this.hind;
        System.out.println("Burger " + this.nimetus);
        System.out.println("Liha " + this.liha);
        System.out.println("Sai " + this.sai);
        System.out.println("Hind ilma lisandita " + this.hind);
        System.out.println("-------");

        if(this.lisand1 != null) {
            System.out.println("Lisatud ") + this.lisand1 + " hinnaga " + this.lisand1Hind);
            hind = hind + this.lisand1Hind;
        }
        if(this.lisand2 != null) {
            System.out.println("Lisatud ") + this.lisand2 + " hinnaga " + this.lisand2Hind);
            hind = hind + this.lisand2Hind;
        }
        if(this.lisand3 != null) {
            System.out.println("Lisatud ") + this.lisand3 + " hinnaga " + this.lisand3Hind);
            hind = hind + this.lisand3Hind;
        }
        if(this.lisand4 != null) {
            System.out.println("Lisatud ") + this.lisand4 + " hinnaga " + this.lisand4Hind);
            hind = hind + this.lisand4Hind;
        }
        return hind;
    }
}

