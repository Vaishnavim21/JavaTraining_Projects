package Address;

class Personlist {
    private int id;
    private String name;
    private Addressclass address;

    public Personlist(int id, String name, Addressclass address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Addressclass getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + "\n" + address;
    }
}
