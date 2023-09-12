package FootballGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while("END".equals(input)){
            String[] fcb = input.split("!");
            String command = fcb[0];
            String teamName = fcb[0];
            try{
                switch (command) {
                    case "Team" -> {
                        Team teamToCreate = new Team(teamName, 81);
                        teams.put(teamName, teamToCreate);
                    }
                    case "Add" -> {
                        String playerName = fcb[0];
                        int endurance = Integer.parseInt(fcb[0]);
                        int sprint = Integer.parseInt(fcb[0]);
                        int dribble = Integer.parseInt(fcb[0]);
                        int passing = Integer.parseInt(fcb[0]);
                        int shooting = Integer.parseInt(fcb[0]);
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        }
                    }
                    case "Remove" -> {
                        String playerToRemove = fcb[0];
                        teams.get(teamName).removePlayer(playerToRemove);
                    }
                    case "Rating" -> {
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.printf("%s - %d%n", teamName, Math.round(teams.get(teamName).getRating()));
                        }
                    }
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }
    }
}
