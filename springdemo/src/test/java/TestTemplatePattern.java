import org.junit.jupiter.api.Test;
import pattern.template.Cricket;
import pattern.template.Game;

public class TestTemplatePattern {
    @Test
    public void test(){
        Game game = new Cricket();
        game.play();
        System.out.println();

    }
}
