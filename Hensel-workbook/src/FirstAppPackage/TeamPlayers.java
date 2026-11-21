/*
Problem 7. (Class: TeamPlayers) The students from four classes are to be divided into teams
for a sports tournament. Using a program, determine
a) how many students are on each team, and
b) how many students remain if the teams are of equal size.

if two classes consist of 24 students each and the other two classes consist of 25 and
26 students, respectively.

sample output:
99 players distributed to 8 teams result in
12 players per team with 3 player(s) remaining.

 */

package FirstAppPackage;

public class TeamPlayers {
    public static void main(String[] args) {

        int class_a = 24;
        int class_b = 24;
        int class_c = 25;
        int class_d = 26;
        int teams = 8;

        int total = (class_a + class_b + class_c + class_d);

        int players_per_team = total / teams;
        int remaining = total % teams;

        System.out.println(total + " players distributed to " + teams + " result in");
        System.out.println(players_per_team + " players per team " + remaining + " player(s) remaining.");
    }
}
