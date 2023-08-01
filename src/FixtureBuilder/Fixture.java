package FixtureBuilder;

public class Fixture {
    private String homeTeam;
    private String awayTeam;

    public Fixture(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }
}
