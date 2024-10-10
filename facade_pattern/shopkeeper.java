public class shopkeeper {
    blackBerry blackberry= new blackBerry();
    
    samsung samSung= new samsung();

    shopkeeper(String phoneNmae) {
        if (phoneNmae.equalsIgnoreCase("iphone"))
            selliphone();
        else if(phoneNmae.equalsIgnoreCase("samsung"))
            sellSamsung();
        else
            sellBlackberry();
    }

    void selliphone() {
        iPhone iphone = new iPhone();
        iphone.modelNo();
        iphone.price();
    }

    void sellSamsung() {
        samSung.modelNo();
        samSung.price();
    }

    void sellBlackberry() {
        blackberry.modelNo();
        blackberry.price();
    }
}
