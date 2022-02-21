package entities;

import javax.persistence.*;

@Entity
@Table(name = "GEOGRAPHICAREA", schema = "CENSUSDB")
public class GeographicAreaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "geographicAreaID")
    private int geographicAreaId;
    @Basic
    @Column(name = "code")
    private int code;
    @Basic
    @Column(name = "level")
    private int level;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "alternativeCode")
    private int alternativeCode;

    public int getGeographicAreaId() {
        return geographicAreaId;
    }

    public void setGeographicAreaId(int geographicAreaId) {
        this.geographicAreaId = geographicAreaId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(int alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeographicAreaEntity that = (GeographicAreaEntity) o;

        if (geographicAreaId != that.geographicAreaId) return false;
        if (code != that.code) return false;
        if (level != that.level) return false;
        if (alternativeCode != that.alternativeCode) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = geographicAreaId;
        result = 31 * result + code;
        result = 31 * result + level;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + alternativeCode;
        return result;
    }
}
