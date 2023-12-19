package com.pluralsight.simplespring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("Ordinary")
public class PetDAOImpl implements PetDAO {
    @Override
    public Pet getPetByID() {
        return new Pet(2, "Not BaiBai", 10);
    }
}
