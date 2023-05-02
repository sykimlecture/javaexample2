package java0502.template2;

public class Player {
    private PlayerLevel level;
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
}
