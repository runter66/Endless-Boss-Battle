package com.runter66.endlessbossbattle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.Disposable;

import java.util.HashMap;

public class SoundManager implements Disposable {

    private EndlessBossBattle game;
    private HashMap<String, Sound> sounds;
    private static final String[] soundNames = new String[] {};

    public SoundManager(EndlessBossBattle game) {
        this.game = game;
        sounds = new HashMap<String, Sound>();
    }

    public void load() {
        for (String soundName : soundNames)
            sounds.put(soundName, Gdx.audio.newSound(Gdx.files.internal(soundName + ".wav")));
    }

    public void play(String soundName) {
        if (game.isSoundsOn) sounds.get(soundName).play();
    }

    @Override
    public void dispose() {
        for (Sound sound : sounds.values()) sound.dispose();
    }
}
