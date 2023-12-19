package com.pluralsight.simplespring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Qualifier("BaiBai")
public class BaiBaiPetDAOImpl implements PetDAO {
    @Override
    public Pet getPetByID() {
        return new Pet(1, "Bai Bai", 20);
    }
}
