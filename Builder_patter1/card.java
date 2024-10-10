public class card {
    public void getCard(String name) {
        if(name.equalsIgnoreCase("silver"))
        {
            silver_card sc = new silver_card();
            sc.silverCard();
        }
        else if (name.equalsIgnoreCase("golden")) {
            golder_card gc = new golder_card();
            gc.golderCard();
        }
        else {
            platinum_card pc = new platinum_card();
            pc.platinumCard();
        }
    }
}
