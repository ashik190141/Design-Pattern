public class deptfactory {
    public dept getdept(String deptname) {
        if (deptname.equalsIgnoreCase("cse")) {
            return new cse();
        }
        else if (deptname.equalsIgnoreCase("eee")) {
            return new eee();
        }
        else {
            return new ipe();
        }
    }
}
