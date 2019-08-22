package me.msomi.sebe.factory.demography;

import me.msomi.sebe.domain.demography.Race;

public class RaceFactory {

    //TODO: Implement body
    public static Race buildRace(String raceDescription) {
        return new Race.Builder().raceDescription(raceDescription).build();
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
