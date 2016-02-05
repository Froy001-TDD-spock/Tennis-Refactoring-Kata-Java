
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
        TieScore tieScore = new TieScore(player1, player2);
        if (tieScore.isAppliable()) {
            return tieScore.toString();
        }

        WinScore winScore = new WinScore(player1, player2);
        if(winScore.isAppliable()) {
            return winScore.toString();
        }

        AdvantageScore advantageScore = new AdvantageScore(player1, player2);
        if(advantageScore.isAppliable()) {
            return advantageScore.toString();
        }

        NormalScore normalScore = new NormalScore(player1, player2);
        if(normalScore.isAppliable()) {
            return normalScore.toString();
        }

        return "";
    }

    private Player playerFrom(String playerName) {
        return player1.getName() == playerName ? player1 : player2;
    }

}
