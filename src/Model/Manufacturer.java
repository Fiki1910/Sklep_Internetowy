package Model;

public class Manufacturer {

    private int ID;
    private String name;
    private String headquarter;
    private String nameOfCEO;

    public Manufacturer(int ID, String name, String headquarter, String nameOfCEO) {
        this.ID = ID;
        this.name = name;
        this.headquarter = headquarter;
        this.nameOfCEO = nameOfCEO;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getHeadquarter() {
        return headquarter;
    }

    public String getNameOfCEO() {
        return nameOfCEO;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", headquarter='" + headquarter + '\'' +
                ", nameOfCEO='" + nameOfCEO + '\'' +
                '}';
    }
}
