public class AdvantageScore {

    private Player player;

    public AdvantageScore(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Advantage " + player.getName();
    }
}
