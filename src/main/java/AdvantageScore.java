public class AdvantageScore {

    private Player player1;
    private Player player2;

    public AdvantageScore(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static Boolean isAppliableTo(Player player1, Player player2) {
        return player1.hasAdvantageOver(player2) || player2.hasAdvantageOver(player1);
    }

    @Override
    public String toString() {
        return "Advantage " + playerInAdvantage().getName();
    }

    private Player playerInAdvantage() {
        return player1.hasAdvantageOver(player2) ? player1 : player2;
    }
}
