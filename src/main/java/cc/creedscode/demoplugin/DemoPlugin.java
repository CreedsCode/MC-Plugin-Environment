package cc.creedscode.demoplugin;

import cc.creedscode.demoplugin.Utils.Logger.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class DemoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger.log(Logger.LogLevel.INFO, "Plugin booting..");
    }

    @Override
    public void onDisable() {
        Logger.log(Logger.LogLevel.INFO, "Bye bye.");
    }
}
