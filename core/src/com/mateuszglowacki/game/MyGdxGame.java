package com.mateuszglowacki.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	
	public static final String TITLE = "Untitled Platformer Game";
	private Stage stage;
	SpriteBatch batch;
	Texture img;
	Texture menu1;
	Texture mars;
	
	@Override
	public void create () {
		stage = new Stage(new ScreenViewport());
		batch = new SpriteBatch();
		img = new Texture("player.png");
		menu1 = new Texture("newgame.png");
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		stage.draw();
	
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		batch.begin();
		batch.draw(menu1,Gdx.graphics.getWidth()/3-menu1.getWidth()/2,Gdx.graphics.getHeight()*2/3-menu1.getHeight()/2);
		batch.end();
		
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
