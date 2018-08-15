package pl.michalmorus.java.course.activities.Equals;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
//        Long l1 = 9999999999999L;
//        Long l2 = new Long(9999999999999L);
//        Long l3 = 9999999999999L;
//
//        String s1 = "abcde";
//        String s2 = "abcde";
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        System.out.println(l1 == l2);
//        System.out.println(l1 == l3);
//        System.out.println(l1.equals(l2));
//        System.out.println(l1.equals(l3));


        FootbalTeam[] footbalTeams = new FootbalTeam[]{
            new FootbalTeam("Polska", 1, 7, "Krzynówek"),
            new FootbalTeam("Belgia", 12, 15, "Curois"),
            new FootbalTeam("Polska", 1, 7, "Krzynówek")
        };

        for (FootbalTeam footbalTeam : footbalTeams) {
            System.out.println(footbalTeam.hashCode());
            System.out.println(footbalTeam.equals(footbalTeams[0]));
        }
    }
}


class FootbalTeam {
    private String name;
    private Integer goal;
    private Integer fifaRanking;
    private String bestPlayer;

    public FootbalTeam(String name, Integer goal, Integer fifaRanking, String bestPlayer) {
        this.name = name;
        this.goal = goal;
        this.fifaRanking = fifaRanking;
        this.bestPlayer = bestPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootbalTeam that = (FootbalTeam) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(goal, that.goal) &&
                Objects.equals(fifaRanking, that.fifaRanking) &&
                Objects.equals(bestPlayer, that.bestPlayer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, goal, fifaRanking, bestPlayer);
    }
}