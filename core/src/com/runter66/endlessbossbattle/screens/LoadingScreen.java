package com.runter66.endlessbossbattle.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.runter66.endlessbossbattle.EndlessBossBattle;

public class LoadingScreen implements Screen {

    private EndlessBossBattle game;
    private static final String[] textureNames = new String[] {"player"};

    public LoadingScreen(EndlessBossBattle game) {
        this.game = game;
    }

    @Override
    public void show() {
        // load textures and etc. here
        for (String textureName : textureNames)
            game.assetManager.load(textureName + ".png", Texture.class);
        game.soundManager.load();
        game.assetManager.finishLoading();
    }

    @Override
    public void render(float delta) {
        if (game.assetManager.update()) {
            //
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
