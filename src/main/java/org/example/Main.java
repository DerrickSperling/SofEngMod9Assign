package org.example;


import org.example.Factory.CasualFactory;
import org.example.Factory.Factory;
import org.example.Factory.PartyFactory;
import org.example.Factory.ProfessionalFactory;
import org.example.Garments.Garments;

/**
 * Main method --
 * simulates a garment
 * @author DerrickSperling(sperdg@farmingdale.edu)
 */
public class Main
{
    //packoutfit method --
    //oacks all parts of an outfir from a single factory in order to prevent
    //customers from getting non-matching garments
    public static void packOutfit(Factory theFact, Garments[] custOrd)
    {
        System.out.println("Order packed");
        custOrd[0] = theFact.makePants();
        custOrd[1] = theFact.makeShoes();
        custOrd[2] = theFact.makeTop();
    }

    //outfitShowing method--
    //shows the content of an order
    public static void outfitShowing(Garments custOrd[])
    {
            System.out.println( "Type of pants: " + custOrd[0].returnType()
            + "\nType of shoes: " + custOrd[1].returnType()
            + "\nType of top: " + custOrd[2].returnType() );
    }
    public static void main(String[] args)
    {
        //making the different clothing factories
        CasualFactory casFact = new CasualFactory();
        ProfessionalFactory ProFact = new ProfessionalFactory();
        PartyFactory parFact = new PartyFactory();
        //new customer order
        Garments customerOrder[] = new Garments[3];

        //customers order is packed and outputted
        packOutfit(casFact, customerOrder);
        outfitShowing(customerOrder);


    }
}