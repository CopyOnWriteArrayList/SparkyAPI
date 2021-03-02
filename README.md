# SparkyAPI
API for Sparky Anticheat
#

!! THIS API IS CURRENTLY DEPRECATED, IT WILL NOT WORK WITH THE CURRENT VERSION OF SPARKY, PLEASE WAIT UNTIL ITS RECODED !!

For developers:
This API uses reflection because of my protection, don't abuse call theses methods or it may cause lag
#
Documentation:
```
SparkyAPI.isAntichetEnabled() - Returns a boolean if the anticheat is enabled or not

SparkyAPI.setAnticheatEnabled(boolean enabled) - Sets the state for the anticheat being enabled or not

SparkyAPI.getPing(Player player) - Returns the player's ping from the anticheat

SparkyAPI.isLagging(Player player) - Returns if the player is lagging

SparkyAPI.setCheckState(String checkName, boolean enabled) - Enables / disables a check (this defaults the check type A)

SparkyAPI.setCheckState(String checkName, String type, boolean enabled) - Enables / disables a check

SparkyAPI.reloadConfig() - Reload's the anticheats config

SparkyAPI.getVersion() - Returns the current version of the anticheat

SparkyAPI.getServerVersion() - Returns the server's version

SparkyAPI.exemptPlayer(Player player, int ticks) - Returns the anticheats checks for a specific player
and for a specific amount of ticks (NOTE: 20 ticks = 1 second)

SparkyAPI.resetExempt(Player player) - Resets the players exempt ticks
```

Maven:
```xml
   <repositories>
        <repository>
            <id>funkemunky-releases</id>
            <url>https://nexus.funkemunky.cc/content/repositories/releases/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>ac.sparky</groupId>
            <artifactId>API</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
```
