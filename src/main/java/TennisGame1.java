
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
        if (player1.isInATieWith(player2)) {
            return new TieScore(player1, player2).toString();
        }
        if(player1.hasWonAgainst(player2)) {
            return new WinScore(player1).toString();
        }
        if(player2.hasWonAgainst(player1)) {
            return new WinScore(player2).toString();
        }
        if (player1.hasAdvantageOver(player2)) {
            return new AdvantageScore(player1).toString();
        }
        if(player2.hasAdvantageOver(player1)) {
            return new AdvantageScore(player2).toString();
        }
        return new NormalScore(player1, player2).toString();
    }

    private Player playerFrom(String playerName) {
        return player1.getName() == playerName ? player1 : player2;
    }

}
