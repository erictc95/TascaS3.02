import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class UndoTest {

    @Test
    void givenMultipleCalls_whenGetInstance_thenSameInstanceReturned() {
        Undo undo = new Undo();
    }

}
