public class client {
    public static void main(String[] args) {
        collection c = new collection();
        iterator itr = c.getiterator();
        while (itr.hasnext()) {
            System.out.println(itr.next());
        }
    }
}
