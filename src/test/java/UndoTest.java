import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UndoTest {

    @Test
    void givenMultipleCalls_whenGetInstance_thenSameInstanceReturned() {
        Undo undo = Undo.getInstance();
        Undo undo2 = Undo.getInstance();
        assertSame(undo, undo2);
    }

    @Test
    void undoCommand_whenHistoryHasCommands_returnsLastCommand() {
        Undo undo = Undo.getInstance();
        undo.clearHistory();
        undo.addCommand("md test");
        undo.addCommand("cd test");
        assertEquals("cd test", undo.undoCommand());
    }

    @Test
    void undoCommand_whenHistoryIsEmpty_throwsException() {
        Undo undo = Undo.getInstance();
        undo.clearHistory();
        assertThrows(IllegalStateException.class, undo::undoCommand);
    }

    @Test
    void shouldUndoMultipleCommandsInCorrectOrder() {
        Undo undo = Undo.getInstance();
        undo.clearHistory();
        undo.addCommand("md test");
        undo.addCommand("md test2");
        undo.addCommand("cd test2");
        assertEquals("cd test2", undo.undoCommand());
        assertEquals("md test2", undo.undoCommand());
        assertEquals("md test", undo.undoCommand());
    }

    @Test
    void shouldEmptyHistoryAfterMultipleUndos() {
        Undo undo = Undo.getInstance();
        undo.clearHistory();
        undo.addCommand("md test");
        undo.addCommand("md test2");
        assertEquals("md test2", undo.undoCommand());
        assertEquals("md test", undo.undoCommand());
        assertThrows(IllegalStateException.class, undo::undoCommand);
    }

}
