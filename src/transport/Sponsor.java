package transport;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;

public class Sponsor {
    private String name;
    private Double sponsorAmount;
    private List<Transport> sponsoringCar;

    public Boolean sponsorRace() {
        return false;
    }

    public Sponsor(String name, Double sponsorAmount, List<Transport> sponsoringCar) {
        this.name = name;
        this.sponsorAmount = sponsorAmount;
        this.sponsoringCar = sponsoringCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSponsorAmount() {
        return sponsorAmount;
    }

    public void setSponsorAmount(Double sponsorAmount) {
        this.sponsorAmount = sponsorAmount;
    }

    public List<Transport> getSponsoringCar() {
        return sponsoringCar;
    }

    public void setSponsoringCar(List<Transport> sponsoringCar) {
        this.sponsoringCar = sponsoringCar;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sponsorAmount=" + sponsorAmount +
                ", sponsoringCar=" + sponsoringCar + '}';
//        return String.format("Sponsor{name='%s', sponsorAmount=%s, sponsoringCar=%s}", name, sponsorAmount, String.join(+'\n' sponsoringCar));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name) && Objects.equals(sponsorAmount, sponsor.sponsorAmount) && Objects.equals(sponsoringCar, sponsor.sponsoringCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sponsorAmount, sponsoringCar);
    }
}
