public class client {
    public static void main(String[] args) {
        deptfactory f1 = new deptfactory();
        dept d1 = f1.getdept("cse");
        d1.details();
    }
}
