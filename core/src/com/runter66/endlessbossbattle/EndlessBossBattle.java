package com.runter66.endlessbossbattle;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.runter66.endlessbossbattle.screens.LoadingScreen;

public class EndlessBossBattle extends Game {

	public AssetManager assetManager;
	public SoundManager soundManager;
	public GamePreferences preferences;

	public boolean isMusicOn;
	public boolean isSoundsOn;

	@Override
	public void create() {
		assetManager = new AssetManager();
		soundManager = new SoundManager(this);
		preferences = new GamePreferences(this);

		isMusicOn = preferences.isMusicOn();
		isSoundsOn = preferences.isSoundsOn();

		setScreen(new LoadingScreen(this));
	}

	@Override
	public void dispose () {
		super.dispose();
		assetManager.dispose();
		soundManager.dispose();
	}
}
