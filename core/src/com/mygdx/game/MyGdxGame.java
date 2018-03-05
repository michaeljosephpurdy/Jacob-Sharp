package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Entity logo;
	GameStateManager gameStateManager;

	@Override
	public void create () {
		gameStateManager = new GameStateManager();
		batch = new SpriteBatch();
		logo = new Entity(0, 0, "badlogic.png");
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		logo.draw(batch);
		batch.end();
	}
	
	private void update() {
		 if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
		 {
			 logo.moveRight();
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
		 {
			 logo.moveLeft();
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.UP))
		 {
			 logo.moveUp();
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
		 {
			 logo.moveDown();
		 }
	}

	@Override
	public void dispose () {
		batch.dispose();
		logo.dispose();
	}
}
