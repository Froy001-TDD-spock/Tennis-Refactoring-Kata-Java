import org.apache.commons.collections4.Predicate;

public class IsAppliable implements Predicate<Score> {

    public boolean evaluate(Score score) {
        return score.isAppliable();
    }

}
