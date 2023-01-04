package transport;

import java.io.IOException;
import java.util.*;

import static transport.enums.BodyType.*;
import static transport.enums.BusCapacity.*;
import static transport.enums.LiftCapacity.*;
import static transport.enums.TranportTypes.*;

public class MainTransport {
    private static Car[] auto;
    private static Truck[] trucks;
    private static Bus[] buses;

    public static void main(String[] args) throws IOException {
        System.out.println("Домашнее задание 22.");
        System.out.println();
        car();
        truck();
        buses();

        Mechanic mechanic1 = new Mechanic("Alex", "BMW", addToList(auto[0], trucks[0]));
        Mechanic mechanic2 = new Mechanic("Tom", "Kia", addToList(auto[1], buses[1]));
        Mechanic mechanic3 = new Mechanic("Tom", "Kia", addToList(auto[1], buses[1]));
        Sponsor sponsor1 = new Sponsor("Jhon", 1000.0, addToList(auto[0], buses[0], auto[3]));
        Sponsor sponsor2 = new Sponsor("Jhon1", 2000.0, addToList(auto[1], trucks[1], auto[4]));
        Sponsor sponsor3 = new Sponsor("Jhon1", 2000.0, addToList(auto[1], trucks[1], auto[4]));

        Driver driver1 = new Driver("Ivan", 5.0, B);
//        infoAuto(driver1, addToList(mechanic1, mechanic2), addToList(sponsor1));
        Driver driver2 = new Driver("Stepan", 6.0, D);
//        infoAuto(driver2, addToList(mechanic2), addToList(sponsor2, sponsor1));
        Driver driver3 = new Driver("Fedor", -6.0, B);
//        infoAuto(driver3, addToList(mechanic1), addToList(sponsor2));
        Driver driver4 = new Driver("Fedor", -6.0, B);
//        infoAuto(driver4, addToList(mechanic1), addToList(sponsor2));

        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(driver1);
        driverSet.add(driver2);
        driverSet.add(driver3);
        driverSet.add(driver1);
        driverSet.add(driver4);

        for (Driver driver: driverSet) {
            System.out.println(driver);
        }
//        Iterator<Driver> itr = driverSet.iterator();
//
//        while (itr.hasNext()) {
//            Driver driver = itr.next();
//            System.out.println(driver);
//        }

        Set<Mechanic> mechanicSet = new HashSet<>();
        mechanicSet.add(mechanic1);
        mechanicSet.add(mechanic2);
        mechanicSet.add(mechanic3);
        mechanicSet.add(mechanic1);
        mechanicSet.add(mechanic2);

        for (Mechanic mechanic: mechanicSet) {
            System.out.println(mechanic);
        }

        Set<Sponsor> sponsorSet = new HashSet<>();
        sponsorSet.add(sponsor1);
        sponsorSet.add(sponsor2);
        sponsorSet.add(sponsor3);
        sponsorSet.add(sponsor1);
        sponsorSet.add(sponsor2);

        for (Sponsor sponsor: sponsorSet) {
            System.out.println(sponsor);
        }
    }

    public static <T> List<T> addToList(T... item) {
        List<T> list = new ArrayList<>();
//        Arrays.stream(car).forEach(item -> {
//            cars.add(item);
        Arrays.stream(item).forEach(list::add);
        return list;
    }

    public static void car() {
        auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", -1.7, PICKUP, true);
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, SEDAN, true);
//        auto[2] = new transport.Car("BMW", "Z8", 3, "чёрный", "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, SUV, false);
        auto[4] = new Car("Hyundai", "Avante", -1.6, VAN, true);
//        printInfoAuto(auto);
//        System.out.println();
    }

    public static <T> void printInfoAuto(T[] auto) {
        for (T a : auto) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public static void truck() {
        trucks = new Truck[2];
        trucks[0] = new Truck("Камаз", "", 11.0, N1, true);
        trucks[1] = new Truck("МАЗ", "В-901", 11.0, N2, false);
//        infoTruck();
//        System.out.println();
    }

    public static void infoTruck() {
        for (Truck truck : trucks) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }

    public static void buses() {
        buses = new Bus[2];
        buses[0] = new Bus("Ласточка", "В-901", 31.0, BIG, true);
        buses[1] = new Bus("Ленинград", /*"В-901"*/"", 31.0, SMALL, null);
//        infoBus();
//        System.out.println();
    }

    public static void infoBus() {
        for (Bus buses : buses) {
            if (buses != null) {
                System.out.println(buses);
            }
        }
    }
}