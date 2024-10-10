public class client {
    public static void main(String[] args) {
        cosmeticFactory c1 = new cosmeticFactory();
        cosmeticCompany c = c1.getcompanyName("COMPANYb");
        info i = c.soap();
        info i1 = c.shampoo();
        i.cosmeticDetails();
        i1.cosmeticDetails();
    }
}
