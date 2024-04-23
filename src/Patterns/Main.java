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
import Patterns.Structural.Adapter.Booking;
import Patterns.Structural.Adapter.BookingAdapter;
import Patterns.Structural.Adapter.*;
import Patterns.Structural.Bridge.*;
import Patterns.Structural.Composite.Service;
import Patterns.Structural.Composite.TravelPackage;
import Patterns.Structural.Decorator.*;
import Patterns.Structural.Facade.TravelPackageFacade;
import Patterns.Structural.Flyweight.BookingContext;
import Patterns.Structural.Flyweight.DestinationFactory;
import Patterns.Structural.Flyweight.DestinationFlyweight;
import Patterns.Structural.Proxy.BookingService;
import Patterns.Structural.Proxy.BookingServiceProxy;

public class Main {
    public static void main(String[] args) {
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
        System.out.println();
        System.out.println("----------Adapter begin----------");
        FlightBooking flightA = new FlightBooking();
        HotelBooking hotelB = new HotelBooking();
        Booking booking = new BookingAdapter(flightA, hotelB);
        booking.book("New York", "2024-04-15");
        booking.book("Grand Hotel", "2");
        System.out.println("----------Adapter end----------");
        System.out.println();
        System.out.println("----------Bridge begin----------");
        TravelType airTravelOnline = new AirTravel(new OnlineBookingSystem());
        System.out.println(airTravelOnline.arrangeTravel());
        System.out.println("Price: $" + airTravelOnline.calculatePrice());
        TravelType cruiseTravelAgent = new CruiseTravel(new AgentBookingSystem());
        System.out.println(cruiseTravelAgent.arrangeTravel());
        System.out.println("Price: $" + cruiseTravelAgent.calculatePrice());
        System.out.println("----------Bridge end----------");
        System.out.println();
        System.out.println("----------Composite begin----------");
        Service flight = new Service("Flight", 200.00);
        Service hotel = new Service("Hotel", 100.00);
        Service tour = new Service("City Tour", 50.00);
        TravelPackage honeymoonTravelPackage = new TravelPackage("Honeymoon Package");
        TravelPackage adventureTravelPackage = new TravelPackage("Adventure Package");
        honeymoonTravelPackage.add(flight);
        honeymoonTravelPackage.add(hotel);
        adventureTravelPackage.add(flight);
        adventureTravelPackage.add(tour);
        TravelPackage travelPackage = new TravelPackage("Travel Package");
        travelPackage.add(honeymoonTravelPackage);
        travelPackage.add(adventureTravelPackage);
        travelPackage.displayServiceDetails();
        System.out.println("----------Composite end----------");
        System.out.println();
        System.out.println("----------Decorator begin----------");
        TripPlan standardTrip = new StandardTripPlan();
        System.out.println(standardTrip.getDescription() + " Cost: $" + standardTrip.cost());
        TripPlan flightAndHotelTrip = new HotelBookingDecorator(new FlightBookingDecorator(new StandardTripPlan()));
        System.out.println(flightAndHotelTrip.getDescription() + " Cost: $" + flightAndHotelTrip.cost());
        TripPlan allInclusiveTrip = new InsuranceDecorator(new HotelBookingDecorator(new FlightBookingDecorator(new StandardTripPlan())));
        System.out.println(allInclusiveTrip.getDescription() + " Cost: $" + allInclusiveTrip.cost());
        System.out.println("----------Decorator end----------");
        System.out.println();
        System.out.println("----------Facade begin----------");
        TravelPackageFacade travelPackageExample = new TravelPackageFacade();
        travelPackageExample.bookTravelPackage("New York", "Los Angeles", "2024-05-15", "Hotel California", "2024-05-15", "2024-05-20", "2024-05-15", "2024-05-20");
        System.out.println("----------Facade end----------");
        System.out.println();
        System.out.println("----------Flyweight begin----------");
        DestinationFlyweight destination1 = DestinationFactory.getDestination("Eiffel Tower", "Famous French tower", "Paris, France");
        BookingContext booking1 = new BookingContext("John Doe", "2024-04-09", destination1);
        booking1.displayDetails();
        DestinationFlyweight destination2 = DestinationFactory.getDestination("Eiffel Tower", "Famous French tower", "Paris, France");
        BookingContext booking2 = new BookingContext("Billie Jean", "2024-05-10", destination2);
        booking2.displayDetails();
        System.out.println("----------Flyweight end----------");
        System.out.println();
        System.out.println("----------Proxy begin----------");
        BookingService bookingService = new BookingServiceProxy();
        bookingService.bookFlight("Paris");
        bookingService.bookFlight("Mars");
        System.out.println("----------Proxy end----------");
        System.out.println();
    }
}

