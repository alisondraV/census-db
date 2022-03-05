package entities;

public class GeographicAreaEntity {
    private int geographicAreaId;
    private int code;
    private int level;
    private String name;
    private int alternativeCode;
    private int population;

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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getReadableLevel() {
        switch (level) {
            case 0:
                return "Country";
            case 1:
                return "Province/Territory";
            case 2:
                return "CMA/CA";
            case 3:
                return "CMA/CA province";
            default:
                return "Unknown";
        }
    }
}
