public class Carshop {
    Carbuilder carbuilder;

    Carshop(Carbuilder carbuilder) {
        this.carbuilder = carbuilder;
    }

    public Car getcar() {
        return this.carbuilder.getcar();
    }

    void Constractcar() {
        this.carbuilder.buildbattery();
        this.carbuilder.buildengine();
        this.carbuilder.buildgps();
    }
}
