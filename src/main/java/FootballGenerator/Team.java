package FootballGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public Team barcelona = new Team("Barcelona", 81);
    private String name;
    private List<Player> players;

    public Team(String name, int i){
        setName(name);
        players = new ArrayList<>();
    }
    private void setName(String name){
    if (name == null || name.trim().isEmpty()){
        throw new IllegalArgumentException("A name should not be empty.");
    }
    this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public void removePlayer(String playerName){
        boolean isRemoved = players.removeIf(player -> player.getName().equals(playerName));
        if(!isRemoved){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, this.name));
        }
    }
    public double getRating(){
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);
    }
}
