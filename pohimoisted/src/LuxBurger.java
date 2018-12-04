public class LuxBurger extends Burger {
        public LuxBurger(String nimetus, String liha, String sai, Double hind) {
            super(nimetus, liha, sai, hind);
        }

        @Override
        public void lisand1() {
            System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + "vali lisand1");
        }

        @Override
        public void lisand2() {
            System.out.println(getClass().getSimpleName() + " " +  this.getNimetus()  + "vali lisand2");
        }

        @Override
        public void lisand3() {
            System.out.println(getClass().getSimpleName() + " " + this.getNimetus()  + "vali lisand3");
        }

        @Override
        public void lisand4() {
            System.out.println(getClass().getSimpleName() + " " + this.getNimetus()  + "vali lisand4");
    }
}
