public class cosmeticFactory {
    public cosmeticCompany getcompanyName(String name) {
        if(name.equalsIgnoreCase("companya"))
            return new companyA();
        else
            return new companyB();
    }
}
