package singletony;

import java.io.IOException;

public class ConfigHelperSingletonMain {
    public static void main(String[] args) throws IOException {
        String logTag = ConfigHelper.getInstance().getConfig("log.tag");

        Player player = new Player();
        player.load();
        player.play();
        player.pause();
        player.stop();
        player.reset();
    }
}
