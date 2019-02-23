package com.runter66.endlessbossbattle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class GamePreferences {

    private EndlessBossBattle game;
    private Preferences prefs;

    public GamePreferences(EndlessBossBattle game) {
        this.game = game;
        prefs = Gdx.app.getPreferences("prefs");
    }

    public boolean isMusicOn() {
        return prefs.getBoolean("isMusicOn", true);
    }

    public void setMusicOnOff(boolean onOff) {
        game.isMusicOn = onOff;
        prefs.putBoolean("isMusicOn", onOff);
        prefs.flush();
    }

    public boolean isSoundsOn() {
        return prefs.getBoolean("isSoundsOn", true);
    }

    public void setSoundsOnOff(boolean onOff) {
        game.isSoundsOn = onOff;
        prefs.putBoolean("isSoundsOn", onOff);
        prefs.flush();
    }
}
