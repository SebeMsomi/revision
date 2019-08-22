package me.msomi.sebe.factory.demography;

import me.msomi.sebe.domain.demography.Gender;

public class GenderFactory {

    //TODO: Implement body
    public static Gender buildGender(String genderDescription) {
        return new Gender.Builder().genderDescription(genderDescription).build();
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
