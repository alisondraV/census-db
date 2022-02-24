package entities;

public class HouseholdEntity {
    private int id;
    private int geographicArea;
    private short householdType;
    private short householdSize;
    private short householdsByAgeRange;
    private short householdEarners;
    private short totalIncome;
    private int censusYear;
    private int numberReported;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(int geographicArea) {
        this.geographicArea = geographicArea;
    }

    public short getHouseholdType() {
        return householdType;
    }

    public void setHouseholdType(short householdType) {
        this.householdType = householdType;
    }

    public short getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(short householdSize) {
        this.householdSize = householdSize;
    }

    public short getHouseholdsByAgeRange() {
        return householdsByAgeRange;
    }

    public void setHouseholdsByAgeRange(short householdsByAgeRange) {
        this.householdsByAgeRange = householdsByAgeRange;
    }

    public short getHouseholdEarners() {
        return householdEarners;
    }

    public void setHouseholdEarners(short householdEarners) {
        this.householdEarners = householdEarners;
    }

    public short getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(short totalIncome) {
        this.totalIncome = totalIncome;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    public int getNumberReported() {
        return numberReported;
    }

    public void setNumberReported(int numberReported) {
        this.numberReported = numberReported;
    }
}
