package com.runter66.endlessbossbattle.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.runter66.endlessbossbattle.EndlessBossBattle;

public abstract class AbstractScreen implements Screen {

    private static final float TARGET_WIDTH = 320;

    EndlessBossBattle game;
    Stage stage;
    float w;
    float h;

    AbstractScreen(EndlessBossBattle game) {
        this.game = game;

        // width is more important for me???
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float aspectRatio = screenHeight / screenWidth;

        Viewport viewport = new FillViewport(TARGET_WIDTH, TARGET_WIDTH * aspectRatio);
        stage = new Stage(viewport);

        Gdx.input.setInputProcessor(stage);

        w = stage.getWidth();
        h = stage.getHeight();
    }

    abstract void init();
    abstract void update(float delta);

    @Override
    public void show() {
        init();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
        stage.act();
        update(delta);
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
        stage.dispose();
    }
}
