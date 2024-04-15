package org.example.Factory;

import org.example.Garments.Pants.Pants;
import org.example.Garments.Pants.PartyPants;
import org.example.Garments.Shoes.PartyShoes;
import org.example.Garments.Shoes.Shoes;
import org.example.Garments.Tops.PartyTop;
import org.example.Garments.Tops.Tops;

public class PartyFactory implements Factory
{

    @Override
    public Pants makePants() {
        return new PartyPants();
    }

    @Override
    public Tops makeTop() {
        return new PartyTop();
    }

    @Override
    public Shoes makeShoes() {
        return new PartyShoes();
    }
}
