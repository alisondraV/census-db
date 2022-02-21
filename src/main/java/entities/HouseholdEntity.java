package entities;

import javax.persistence.*;

@Entity
@Table(name = "HOUSEHOLD", schema = "CENSUSDB")
public class HouseholdEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "geographicArea")
    private int geographicArea;
    @Basic
    @Column(name = "householdType")
    private short householdType;
    @Basic
    @Column(name = "householdSize")
    private short householdSize;
    @Basic
    @Column(name = "householdsByAgeRange")
    private short householdsByAgeRange;
    @Basic
    @Column(name = "householdEarners")
    private short householdEarners;
    @Basic
    @Column(name = "totalIncome")
    private short totalIncome;
    @Basic
    @Column(name = "censusYear")
    private int censusYear;
    @Basic
    @Column(name = "numberReported")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseholdEntity that = (HouseholdEntity) o;

        if (id != that.id) return false;
        if (geographicArea != that.geographicArea) return false;
        if (householdType != that.householdType) return false;
        if (householdSize != that.householdSize) return false;
        if (householdsByAgeRange != that.householdsByAgeRange) return false;
        if (householdEarners != that.householdEarners) return false;
        if (totalIncome != that.totalIncome) return false;
        if (censusYear != that.censusYear) return false;
        if (numberReported != that.numberReported) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + geographicArea;
        result = 31 * result + (int) householdType;
        result = 31 * result + (int) householdSize;
        result = 31 * result + (int) householdsByAgeRange;
        result = 31 * result + (int) householdEarners;
        result = 31 * result + (int) totalIncome;
        result = 31 * result + censusYear;
        result = 31 * result + numberReported;
        return result;
    }
}
