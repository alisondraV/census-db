package entities;

import javax.persistence.*;

@Entity
@Table(name = "AGEGROUP", schema = "CENSUSDB")
public class AgeGroupEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ageGroupID")
    private int ageGroupId;
    @Basic
    @Column(name = "description")
    private String description;

    public int getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(int ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgeGroupEntity that = (AgeGroupEntity) o;

        if (ageGroupId != that.ageGroupId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ageGroupId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
