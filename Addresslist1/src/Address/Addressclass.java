package Address;

class Addressclass {
    private String permanentAddress;
    private String temporaryAddress;

    public Addressclass(String permanentAddress, String temporaryAddress) {
        this.permanentAddress = permanentAddress;
        this.temporaryAddress = temporaryAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    @Override
    public String toString() {
        return "Permanent Address: " + permanentAddress + ", Temporary Address: " + temporaryAddress;
    }
}

