package org.example.Factory;

import org.example.Garments.Pants.CasualPants;
import org.example.Garments.Pants.Pants;
import org.example.Garments.Shoes.CasualShoes;
import org.example.Garments.Shoes.Shoes;
import org.example.Garments.Tops.CasualTop;
import org.example.Garments.Tops.Tops;

public class CasualFactory implements Factory
{

    @Override
    public Pants makePants() {
        return new CasualPants();
    }

    @Override
    public Tops makeTop() {
        return new CasualTop();
    }

    @Override
    public Shoes makeShoes() {
        return new CasualShoes();
    }
}
