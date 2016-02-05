import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        playerFrom(playerName).wonPoint();
    }

    public String getScore() {
        for(Score score : possibleScores()) {
            if(score.isAppliable()) {
                return score.toString();
            }
        }
        return "";
    }

    private List<Score> possibleScores() {
        return asList(
                new TieScore(player1, player2),
                new WinScore(player1, player2),
                new AdvantageScore(player1, player2),
                new NormalScore(player1, player2)
                );
    }

    private Player playerFrom(String playerName) {
        return player1.getName() == playerName ? player1 : player2;
    }

}
