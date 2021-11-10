package cc.creedscode.demoplugin.Utils.Logger;

import jdk.jfr.internal.LogLevel;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logger {

    private static final String PluginName = "DemoPlugin";

    public static void log(LogLevel level, String message) {
        if (message == null) return;
        sendMessage(level, message);
    }

    private static void sendMessage(LogLevel level, String message){
        String textToTranslate = String.format("[%s/%s]", PluginName, level.toString());
        String result = ChatColor.translateAlternateColorCodes('&', textToTranslate + message);
        Bukkit.getConsoleSender().sendMessage(result);
    }

    public enum LogLevel { ERROR, WARNING, INFO, SUCCESS, NOTE }

}
