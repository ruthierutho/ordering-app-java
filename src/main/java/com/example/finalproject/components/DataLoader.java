package com.example.finalproject.components;

import com.example.finalproject.models.*;
import com.example.finalproject.repositories.CustomerRepository;
import com.example.finalproject.repositories.OrderRepository;
import com.example.finalproject.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    VenueRepository venueRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Drink tennents = new Drink ("Tennents Lager", 3.79);
        Drink pinotGrigio = new Drink ("Pinot Grigio", 4.29);
        Drink merlot = new Drink ("Merlot", 4.49);
        Drink guinness = new Drink("Guinness", 4.50);

        Food steakPie = new Food("Steak Pie", 8.99);
        Food fishAndChips = new Food("Fish & Chips", 7.89);
        Food burger = new Food("Burger", 8.99);
        Food lasagne = new Food("Lasagne", 6.99);

        Menu grosvenorMenu = new Menu("The Grosvenor - Food and Drink Menu");
        Menu kiltedPigMenu = new Menu("The Kilted Pig - Food and Drink Menu");
        Menu athleticArmsMenu = new Menu("The Athletic Arms - Food and Drink Menu");
        Menu macNastysMenu = new Menu("MacNastys - Food and Drink Menu");

        Customer ruth = new Customer("Ruth");
        customerRepository.save(ruth);

        Customer neale = new Customer("Neale");
        customerRepository.save(neale);

        Customer chris = new Customer("Chris");
        customerRepository.save(chris);

        Customer mark = new Customer("Mark");
        customerRepository.save(mark);

        Venue grosvenor = new Venue("The Grosvenor", grosvenorMenu);
        venueRepository.save(grosvenor);

        Venue kiltedPig = new Venue("The Kilted Pig", kiltedPigMenu);
        venueRepository.save(kiltedPig);

        Venue athleticArms = new Venue("The Athletic Arms", athleticArmsMenu);
        venueRepository.save(athleticArms);

        Venue macNastys = new Venue("MacNastys", macNastysMenu);
        venueRepository.save(macNastys);

        Order order1 = new Order("Thursday Feb 4th", ruth, grosvenor);
        orderRepository.save(order1);

        Order order2 = new Order("Thursday Feb 4th", neale, kiltedPig);
        orderRepository.save(order2);

        Order order3 = new Order("Thursday Feb 4th", chris, athleticArms);
        orderRepository.save(order3);

        Order order4 = new Order("Thursday Feb 4th", mark, macNastys);
        orderRepository.save(order4);
//
//
//        ruth.addOrder(order1);
//        customerRepository.save(ruth);
//
//        neale.addOrder(order2);
//        customerRepository.save(neale);
//
//        chris.addOrder(order3);
//        customerRepository.save(chris);
//
//        mark.addOrder(order4);
//        customerRepository.save(mark);
//
//
//        venue1.addOrder(order1);
//        venueRepository.save(venue1);
//
//        venue2.addOrder(order2);
//        venueRepository.save(venue2);
//
//        venue3.addOrder(order3);
//        venueRepository.save(venue3);
//
//        venue4.addOrder(order4);
//        venueRepository.save(venue4);
//
//
//        order1.addDrink(pinotGrigio);
//        order1.addDrink(merlot);
//        order1.addFood(fishAndChips);
//        order1.addFood(burger);
//        orderRepository.save(order1);
//
//        order2.addDrink(guinness);
//        order2.addDrink(merlot);
//        order2.addFood(burger);
//        order2.addFood(fishAndChips);
//        orderRepository.save(order2);
//
//        order3.addDrink(tennents);
//        order3.addDrink(tennents);
//        order3.addDrink(pinotGrigio);
//        order3.addDrink(merlot);
//        order3.addFood(burger);
//        orderRepository.save(order3);
//
//        order4.addDrink(tennents);
//        order4.addDrink(merlot);
//        order4.addFood(steakPie);
//        order4.addFood(lasagne);
//        orderRepository.save(order4);
//
//        grosvenorMenu.addDrink(tennents);
//        grosvenorMenu.addDrink(pinotGrigio);
//        grosvenorMenu.addDrink(merlot);
//        grosvenorMenu.addDrink(guinness);
//        grosvenorMenu.addFood(steakPie);
//        grosvenorMenu.addFood(fishAndChips);
//        grosvenorMenu.addFood(burger);
//        grosvenorMenu.addFood(lasagne);
//        grosvenorMenu.addVenue(venue1);
//
//        kiltedPigMenu.addDrink(tennents);
//        kiltedPigMenu.addDrink(pinotGrigio);
//        kiltedPigMenu.addDrink(merlot);
//        kiltedPigMenu.addDrink(guinness);
//        kiltedPigMenu.addFood(steakPie);
//        kiltedPigMenu.addFood(fishAndChips);
//        kiltedPigMenu.addFood(burger);
//        kiltedPigMenu.addFood(lasagne);
//        kiltedPigMenu.addVenue(venue2);
//
//        athleticArmsMenu.addDrink(tennents);
//        athleticArmsMenu.addDrink(pinotGrigio);
//        athleticArmsMenu.addDrink(merlot);
//        athleticArmsMenu.addDrink(guinness);
//        athleticArmsMenu.addFood(steakPie);
//        athleticArmsMenu.addFood(fishAndChips);
//        athleticArmsMenu.addFood(burger);
//        athleticArmsMenu.addFood(lasagne);
//        athleticArmsMenu.addVenue(venue3);
//
//        macNastysMenu.addDrink(tennents);
//        macNastysMenu.addDrink(pinotGrigio);
//        macNastysMenu.addDrink(merlot);
//        macNastysMenu.addDrink(guinness);
//        macNastysMenu.addFood(steakPie);
//        macNastysMenu.addFood(fishAndChips);
//        macNastysMenu.addFood(burger);
//        macNastysMenu.addFood(lasagne);
//        macNastysMenu.addVenue(venue4);
    }
}

//        Customer john = new Customer("John");
//        customerRepository.save(john);
//
//        Customer roosa = new Customer("Roosa");
//        customerRepository.save(roosa);
//
//        Customer juan = new Customer("Juan");
//        customerRepository.save(juan);
//
//        Customer colin = new Customer("Colin");
//        customerRepository.save(colin);
//
//        Customer hannah = new Customer("Hannah");
//        customerRepository.save(hannah);
//
//        Customer zsolt = new Customer("Zsolt");
//        customerRepository.save(zsolt);
//
//        Customer ally = new Customer("Ally");
//        customerRepository.save(ally);
//
//        Customer stuart = new Customer("Stuart");
//        customerRepository.save(stuart);
//
//        Customer michael = new Customer("Michael");
//        customerRepository.save(michael);
//
//        Customer andy = new Customer("Andy");
//        customerRepository.save(andy);
//
//        Customer ruthI = new Customer("Ruth I");
//        customerRepository.save(ruthI);
//
//        Customer emma = new Customer("Emma");
//        customerRepository.save(emma);
//
//        Customer katie = new Customer("Katie");
//        customerRepository.save(katie);
//
//        Customer gavin = new Customer("Gavin");
//        customerRepository.save(gavin);
//
//        Customer max = new Customer("Max");
//        customerRepository.save(max);
//
//        Customer ian = new Customer("Ian");
//        customerRepository.save(ian);
//
//        Customer mateusz = new Customer("Mateusz");
//        customerRepository.save(mateusz);
//
//        Customer rob = new Customer("Rob");
//        customerRepository.save(rob);
//
//        Customer marc = new Customer("Marc");
//        customerRepository.save(marc);
//
//        Customer kenny = new Customer("Kenny");
//        customerRepository.save(kenny);
//
//        Customer emily = new Customer("Emily");
//        customerRepository.save(emily);



//        Order order5 = new Order("Thursday Feb 4th", john, venue1);
//        orderRepository.save(order5);
//
//        Order order6 = new Order("Thursday Feb 4th", roosa, venue2);
//        orderRepository.save(order6);
//
//        Order order7 = new Order("Thursday Feb 4th", juan, venue3);
//        orderRepository.save(order7);
//
//        Order order8 = new Order("Thursday Feb 4th", colin, venue4);
//        orderRepository.save(order8);
//
//        Order order9 = new Order("Thursday Feb 4th", hannah, venue1);
//        orderRepository.save(order9);
//
//        Order order10 = new Order("Thursday Feb 4th", zsolt, venue2);
//        orderRepository.save(order10);
//
//        Order order11 = new Order("Thursday Feb 4th", ally, venue3);
//        orderRepository.save(order11);
//
//        Order order12 = new Order("Thursday Feb 4th", stuart, venue4);
//        orderRepository.save(order12);
//
//        Order order13 = new Order("Thursday Feb 4th", michael, venue1);
//        orderRepository.save(order13);
//
//        Order order14 = new Order("Thursday Feb 4th", andy, venue2);
//        orderRepository.save(order14);
//
//        Order order15 = new Order("Thursday Feb 4th", ruthI, venue3);
//        orderRepository.save(order15);
//
//        Order order16 = new Order("Thursday Feb 4th", emma, venue4);
//        orderRepository.save(order16);
//
//        Order order17 = new Order("Thursday Feb 4th", katie, venue1);
//        orderRepository.save(order17);
//
//        Order order18 = new Order("Thursday Feb 4th", gavin, venue2);
//        orderRepository.save(order18);
//
//        Order order19 = new Order("Thursday Feb 4th", max, venue3);
//        orderRepository.save(order19);
//
//        Order order20 = new Order("Thursday Feb 4th", ian, venue4);
//        orderRepository.save(order20);
//
//        Order order21 = new Order("Thursday Feb 4th", mateusz, venue1);
//        orderRepository.save(order21);
//
//        Order order22 = new Order("Thursday Feb 4th", rob, venue2);
//        orderRepository.save(order22);
//
//        Order order23 = new Order("Thursday Feb 4th", marc, venue3);
//        orderRepository.save(order23);
//
//        Order order24 = new Order("Thursday Feb 4th", kenny, venue4);
//        orderRepository.save(order24);
//
//        Order order25 = new Order("Thursday Feb 4th", emily, venue1);
//        orderRepository.save(order25);


//    Drink bulmers = new Drink("Bulmers", 4.50);
//    Drink oldMoot = new Drink ("Old Moot", 4.50);
//    Drink punkIpa = new Drink("Punk IPA", 4.49);
//    Drink sanMiguel = new Drink("San Miguel", 4.00);
//    Drink stellaArtois = new Drink("Stella Artois", 4.00);
//    Drink strongbow = new Drink("Strongbow", 4.00);
//    Drink kopparberg = new Drink("Kopparberg Mixed Fruit", 4.50);
//    Drink magners = new Drink("Magners", 4.50);
//
//    Food scampi = new Food("Scampi", 8.99);
//    Food chickenBurger = new Food("Chicken Burger", 8.99);
//    Food chickenCurry = new Food("Chicken Curry", 9.99);
//    Food chickenSupreme = new Food("Chicken Supreme", 8.99);
//    Food chips = new Food("Chips", 3.50);