package nl.novi.dpcc.builder.domain;

public class HouseBuilderB {

    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;
    private String province;
    private boolean hasGarden;

    public HouseBuilderB(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderB withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderB withHousenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderB withHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderB withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderB withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderB withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    // opdr. B en C

    public House build() {
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

    public House buildWithEmptyCheck() {
        if (streetName.equalsIgnoreCase("")) {
            throw new RuntimeException("Streetname cannot be empty");
        }
        if (houseNumberAddition.equalsIgnoreCase("")) {
            throw new RuntimeException("Housenumber addition cannot be empty");

        }
        if (postalCode.equalsIgnoreCase("")) {
            throw new RuntimeException("Postalcode cannot be empty");

        }
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

}
