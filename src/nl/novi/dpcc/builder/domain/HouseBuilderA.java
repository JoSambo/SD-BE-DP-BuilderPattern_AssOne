package nl.novi.dpcc.builder.domain;

public class HouseBuilderA {

    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;
    private String province;
    private boolean hasGarden;

    public HouseBuilderA(String streetName, int housenumber, String houseNumberAddition, String postalCode, String province, boolean hasGarden) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
        this.province = province;
        this.hasGarden = hasGarden;
    }


    public HouseBuilderA withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderA withHousenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderA withHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderA withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderA withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderA withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }
}
