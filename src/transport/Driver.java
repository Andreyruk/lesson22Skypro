package transport;

import transport.enums.TranportTypes;

import java.util.Objects;

import static transport.Transport.DEFAULT_MESSAGE;
import static valid.ValidateUtils.*;

public class Driver {
    private String name;
    private Number experience;
    private TranportTypes tranportType;

    public Driver(String name, Double experience, TranportTypes tranportType) {
        this.name = validateString(name, DEFAULT_MESSAGE);
        this.experience = validateMathNumber(experience);
        this.tranportType = tranportType;
    }

    public String getName() {
        return name;
    }

    public Number getExperience() {
        return experience;
    }

    public TranportTypes getTranportType() {
        return tranportType;
    }

    @Override
    public String toString() {
        return "Водитель " + name +
                ", стаж " + experience +
                ", водительские права категории " + tranportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(experience, driver.experience) && tranportType == driver.tranportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, tranportType);
    }
}