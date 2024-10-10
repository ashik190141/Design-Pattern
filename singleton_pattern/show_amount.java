public class show_amount {
    
    private static show_amount s = new show_amount();
    private show_amount() {
        
    }
    
    public static show_amount getAccess() {
        return s;
    }

    public void show(bank b1) {
        System.out.println(b1.totalAmount);
    }
}
