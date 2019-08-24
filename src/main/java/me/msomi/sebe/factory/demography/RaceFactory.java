package me.msomi.sebe.factory.demography;

import me.msomi.sebe.domain.demography.Race;

public class RaceFactory {

    //TODO: Implement body
    public static Race buildRace(String raceDescription, String raceId) {
        return new Race.Builder().raceDescription(raceDescription)
                .raceId(raceId)
                .build();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
