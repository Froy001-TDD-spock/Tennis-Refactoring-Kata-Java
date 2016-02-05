public class WinScore {

    private Player player1;
    private Player player2;

    public WinScore(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static Boolean isAppliableTo(Player player1, Player player2) {
        return player1.hasWonAgainst(player2) || player2.hasWonAgainst(player1);
    }

    @Override
    public String toString() {
        return  "Win for " + playerWhoWon().getName();
    }

    private Player playerWhoWon() {
        return player1.hasWonAgainst(player2) ? player1 : player2;
    }
}