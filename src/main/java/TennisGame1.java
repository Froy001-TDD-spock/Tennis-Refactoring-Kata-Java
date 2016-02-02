
public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.getName())
            player1.wonPoint();
        else
            player2.wonPoint();
    }

    public String getScore() {
        if (player1.isInATieWith(player2)) {
            return scoreForTie();
        }
        if(player1.hasWonAgainst(player2)) {
            return winScoreFor(player1);
        }
        if(player2.hasWonAgainst(player1)) {
            return winScoreFor(player2);
        }
        if (player1.hasAdvantageOver(player2)) {
            return advantageScoreFor(player1);
        }
        if(player2.hasAdvantageOver(player1)) {
            return advantageScoreFor(player2);
        }
        return scoreForOneToThreePoints();
    }

    private static String winScoreFor(Player player) {
        return "Win for " + player.getName();
    }

    private static String advantageScoreFor(Player player) {
        return "Advantage " + player.getName();
    }

    private String scoreForOneToThreePoints() {
        String score;
        score = nameFor(player1.getScore()) + "-" + nameFor(player2.getScore());
        return score;
    }

    private String scoreForTie() {
        String score;
        if(player1.getScore() > 2) {
            score = "Deuce";
        }
        else {
            score = nameFor(player1.getScore()) + "-All";
        }
        return score;
    }

    private String nameFor(int score) {
        String name = "";
        switch(score)
        {
            case 0:
                name+="Love";
                break;
            case 1:
                name+="Fifteen";
                break;
            case 2:
                name+="Thirty";
                break;
            case 3:
                name+="Forty";
                break;
        }
        return name;
    }

}
