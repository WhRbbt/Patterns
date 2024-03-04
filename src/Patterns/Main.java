package Patterns;

import Patterns.Creational.Builder.AdventureTripBuilder;
import Patterns.Creational.Builder.BeachTripBuilder;
import Patterns.Creational.Builder.Director;
import Patterns.Creational.Factory.Abstract.*;
import Patterns.Creational.Factory.Method.TravelPackageFactory;
import Patterns.Creational.Factory.Method.TravelPackageFactoryCreator;
import Patterns.Creational.Factory.Method.TravelPackageType;
import Patterns.Creational.Prototype.Apartment;
import Patterns.Creational.Prototype.ApartmentPrototype;
import Patterns.Creational.Singleton.TravelAgency;

public class Main {
    public static void main(String[]args) {
        System.out.println("----------Singleton begin----------");
        TravelAgency travelAgency = TravelAgency.getInstance();
        travelAgency.listDestinations();
        travelAgency.bookTrip("Paris");
        travelAgency.addDestination("Singapore");
        travelAgency.listDestinations();
        travelAgency.bookTrip("Singapore");
        System.out.println("----------Singleton end----------");
        System.out.println();
        System.out.println("----------Builder begin----------");
        Director director = new Director();
        AdventureTripBuilder builder = new AdventureTripBuilder();
        director.buildAdventureTrip(builder);
        System.out.println(builder.build());
        AdventureTripBuilder builder2 = new AdventureTripBuilder();
        director.buildAdventureTrip(builder2);
        builder2.activity("Snowboarding").duration(2).transportation("Train");
        System.out.println(builder2.build());
        BeachTripBuilder builder3 = new BeachTripBuilder();
        director.buildBeachTrip(builder3);
        System.out.println(builder3.build());
        System.out.println("----------Builder end----------");
        System.out.println();
        System.out.println("----------Prototype begin----------");
        ApartmentPrototype apartmentPrototype = new Apartment("New York", 3, 2000);
        Apartment apartmentClone = (Apartment) apartmentPrototype.clone();
        if (apartmentPrototype != apartmentClone) {
            System.out.println("Objects are not the same! Yeah!");
        }
        if (apartmentPrototype.equals(apartmentClone)) {
            System.out.println("Objects are identical! Yeah!");
        }
        System.out.println("----------Prototype end----------");
        System.out.println();
        System.out.println("----------Factory begin----------");
        TravelPackageFactory internationalFactory = TravelPackageFactoryCreator.createFactory(TravelPackageType.INTERNATIONAL);
        internationalFactory.displayDetails();
        TravelPackageFactory cruiseFactory = TravelPackageFactoryCreator.createFactory(TravelPackageType.CRUISE);
        cruiseFactory.displayDetails();
        TravelPackageFactory adventureFactory = TravelPackageFactoryCreator.createFactory(TravelPackageType.ADVENTURE);
        adventureFactory.displayDetails();
        System.out.println("----------Factory end----------");
        System.out.println();
        System.out.println("----------Abstract factory begin----------");
        AbstractPackageFactory localFactory = FactoryCreator.getFactory(Type.LOCAL);
        Flight localFlight = localFactory.createFlight();
        Hotel localHotel = localFactory.createHotel();
        System.out.println(localFlight.getFlightDetails());
        System.out.println(localHotel.getHotelDetails());
        AbstractPackageFactory abroadFactory = FactoryCreator.getFactory(Type.ABROAD);
        Flight abroadFlight = abroadFactory.createFlight();
        Hotel abroadHotel = abroadFactory.createHotel();
        System.out.println(abroadFlight.getFlightDetails());
        System.out.println(abroadHotel.getHotelDetails());
        System.out.println("----------Abstract factory end----------");
    }
}

