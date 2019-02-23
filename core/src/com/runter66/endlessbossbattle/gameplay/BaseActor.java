package com.runter66.endlessbossbattle.gameplay;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.runter66.endlessbossbattle.EndlessBossBattle;

public abstract class BaseActor extends Actor {

    protected EndlessBossBattle game;
    protected TextureRegion region;
    protected Group group;

    public BaseActor(EndlessBossBattle game, Group group) {
        this.game = game;
        this.group = group;
        group.addActor(this);
        setRegion();
    }

    public abstract void setRegion();

    @Override
    public void draw (Batch batch, float parentAlpha) {
        if (region != null)
            batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(),
                    getScaleX(), getScaleY(), getRotation());
    }
}
