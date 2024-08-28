package autoreconnect.reconnect;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.LevelLoadingScreen;
import net.minecraft.client.gui.screen.world.WorldListWidget;
import net.minecraft.text.Text;


public class SingleplayerReconnectHandler extends ReconnectHandler {
    private final String worldName;

    public SingleplayerReconnectHandler(String worldName) {
        this.worldName = worldName;
    }

    @Override
    public String getName() {
        return worldName;
    }

    /**
     * @see WorldListWidget.Entry#start()
     * @see WorldListWidget.Entry#openReadingWorldScreen()
     */
    @Override
    public void reconnect() {
        MinecraftClient client = MinecraftClient.getInstance();
//        if (!client.getLevelStorage().levelExists(getName())) return;
//        client.setScreenAndRender(new LevelLoadingScreen(Text.translatable("selectWorld.data_read")));
//        client.startIntegratedServer(getName());
    }
}
