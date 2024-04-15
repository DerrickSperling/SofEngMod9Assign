package org.example.Factory;

import org.example.Garments.Pants.Pants;
import org.example.Garments.Pants.ProfessionalPants;
import org.example.Garments.Shoes.ProfessionalShoes;
import org.example.Garments.Shoes.Shoes;
import org.example.Garments.Tops.ProfessionalTop;
import org.example.Garments.Tops.Tops;

public class ProfessionalFactory implements Factory
{

    @Override
    public Pants makePants() {
        return new ProfessionalPants();
    }

    @Override
    public Tops makeTop() {
        return new ProfessionalTop();
    }

    @Override
    public Shoes makeShoes() {
        return new ProfessionalShoes();
    }
}
