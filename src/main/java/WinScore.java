public class WinScore {

    private Player player;

    public WinScore(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return  "Win for " + player.getName();
    }
}