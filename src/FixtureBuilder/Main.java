package FixtureBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        Main fixtureGenerator = new Main();
        List<Fixture> fixtures = fixtureGenerator.generateFixtures(teams);

        for (int i = 0; i < fixtures.size(); i++) {
            Fixture fixture = fixtures.get(i);
            System.out.println("Week " + (i + 1) + ": " + fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
        }
    }

    public List<Fixture> generateFixtures(List<String> teams) {
        List<Fixture> fixtures = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        Collections.shuffle(teams);

        int totalWeeks = teams.size() - 1;
        int matchesPerWeek = teams.size() / 2;

        for (int week = 1; week <= totalWeeks; week++) {
            for (int match = 0; match < matchesPerWeek; match++) {
                int homeIndex = match;
                int awayIndex = (teams.size() - 1) - match;

                String homeTeam = teams.get(homeIndex);
                String awayTeam = teams.get(awayIndex);

                fixtures.add(new Fixture(homeTeam, awayTeam));
            }

            String lastTeam = teams.remove(teams.size() - 1);
            teams.add(1, lastTeam);
        }

        return fixtures;
    }
}
