
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
        if (TieScore.isAppliableTo(player1, player2)) {
            return new TieScore(player1, player2).toString();
        }
        if(WinScore.isAppliableTo(player1, player2)) {
            return new WinScore(player1, player2).toString();
        }
        if(AdvantageScore.isAppliableTo(player1, player2)) {
            return new AdvantageScore(player1, player2).toString();
        }
        if(NormalScore.isAppliableTo(player1, player2))
            return new NormalScore(player1, player2).toString();

        return "";
    }

    private Player playerFrom(String playerName) {
        return player1.getName() == playerName ? player1 : player2;
    }

}
