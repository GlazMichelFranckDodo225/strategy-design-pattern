import com.dgmf.character.Character;
import com.dgmf.character.impl.King;
import com.dgmf.character.impl.Queen;
import com.dgmf.character.impl.Troll;

public class Main {
    public static void main(String[] args) {
        // King
        Character king = new King();
        king.fight();
        // Queen
        Character queen = new Queen();
        queen.fight();
        // Troll
        Character troll = new Troll();
        troll.fight();
    }
}