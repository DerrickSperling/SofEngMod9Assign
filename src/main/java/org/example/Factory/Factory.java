package org.example.Factory;

import org.example.Garments.Pants.Pants;
import org.example.Garments.Shoes.Shoes;
import org.example.Garments.Tops.Tops;

import java.lang.reflect.Type;

public interface Factory
{
    Pants makePants();

    Tops makeTop();

    Shoes makeShoes();
}
