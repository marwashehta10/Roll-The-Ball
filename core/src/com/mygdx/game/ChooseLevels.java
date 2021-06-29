/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

/**
 *
 * @author Azab
 */
public class ChooseLevels implements Screen{
    MyGdxGame game;
  private  Texture background;
 private   Texture Level1;
 private   Texture Level2;
 private   Texture Level3;
 private   Texture Level4;
 private   Texture Back;
    public ChooseLevels(MyGdxGame game)
    {
        this.game=game;
        background=new Texture("download.jpg");
        Back=new Texture("24806438.jpg");
        Level1=new Texture("Level1.jpg");
        Level2 =new Texture("Level2.jpg");
        Level3 =new Texture("Level3.jpg");
        Level4=new Texture ("Level4.jpg");
    }
    @Override
    public void show() {
    }
    @Override
    public void render(float f) {
         Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(background, 0, 0);
        game.batch.draw(Level1, 270,429,330,100);
        game.batch.draw(Level2, 270, 300,330,100);
        game.batch.draw(Level3, 270, 170,330,100);
        game.batch.draw(Level4, 270, 40,330,100);
        game.batch.draw(Back, 20,40,150,60);
     if(Gdx.input.getX()>270&&Gdx.input.getX()<630){
     if(Gdx.input.getY()>70&&Gdx.input.getY()<200){
     if(Gdx.input.isTouched()){
       game.setScreen(new Level1(this.game));
     }
     }
     }
     if(Gdx.input.getX()>270&&Gdx.input.getX()<630){
     if(Gdx.input.getY()>200&&Gdx.input.getY()<330){
     if(Gdx.input.isTouched()){
       game.setScreen(new Level2(this.game));
     }
     }
     }
     if(Gdx.input.getX()>270&&Gdx.input.getX()<630){
     if(Gdx.input.getY()>330&&Gdx.input.getY()<460){
     if(Gdx.input.isTouched()){
       game.setScreen(new Level3(this.game));
     }
     }
     }
     if(Gdx.input.getX()>270&&Gdx.input.getX()<630){
     if(Gdx.input.getY()>460&&Gdx.input.getY()<590){
     if(Gdx.input.isTouched()){
       game.setScreen(new Level4(this.game));
     }
     }
     }
     if(Gdx.input.getX()>20&&Gdx.input.getX()<180){
     if(Gdx.input.getY()>500&&Gdx.input.getY()<555){
     if(Gdx.input.isTouched()){
       game.setScreen(new MainScren(this.game));
     }
     }
     }
        game.batch.end();
    }
    @Override
    public void resize(int i, int i1) {
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

