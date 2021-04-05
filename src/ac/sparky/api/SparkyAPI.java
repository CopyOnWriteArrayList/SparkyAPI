package ac.sparky.api;

import org.bukkit.entity.Player;

/**
 * Created on 26/07/2020 Package ac.sparky.api
 */
public class SparkyAPI {
    public static boolean isAnticheatEnabled() {
        return false;
    }

    public static void setAnticheatEnabled(boolean enabled) {
    }

    public static int getPing(Player player) {
        return -1;
    }

    public static boolean isLagging(Player player) {
        return false;
    }

    public static void setCheckState(String checkName, boolean enabled) {
    }

    public static void setCheckState(String checkName, String type, boolean enabled) {
    }


    public static void reloadConfig() {
    }

    public static String getVersion() {
        return null;
    }

    public static String getServerVersion() {
        return null;
    }

    public static void exemptPlayer(Player player, int ticks) {
    }

    public static void resetExempt(Player player) {
    }
}
