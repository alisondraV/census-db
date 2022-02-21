package entities;

import javax.persistence.*;

@Entity
@Table(name = "CENSUSYEAR", schema = "CENSUSDB")
public class CensusYearEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "censusYearID")
    private int censusYearId;
    @Basic
    @Column(name = "censusYear")
    private int censusYear;

    public int getCensusYearId() {
        return censusYearId;
    }

    public void setCensusYearId(int censusYearId) {
        this.censusYearId = censusYearId;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusYearEntity that = (CensusYearEntity) o;

        if (censusYearId != that.censusYearId) return false;
        if (censusYear != that.censusYear) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = censusYearId;
        result = 31 * result + censusYear;
        return result;
    }
}
