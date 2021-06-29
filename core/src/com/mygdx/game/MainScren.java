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
 * @author PC
 */
public class MainScren implements Screen{
   MyGdxGame game;
   private Texture backgrond;
  private Texture logo;
  private Texture play_Active;
 private  Texture play_unactive;
 private  Texture quit_Active;
 private  Texture quit_unactive;
  public MainScren(MyGdxGame game){
      this.game=game;
      backgrond=new Texture("download.jpg");
      logo=new Texture("download1.jpg");
      play_Active=new Texture("play_buuton.png");
      play_unactive=new Texture("play.png");
      quit_unactive=new Texture("quit.png");  
      quit_Active=new Texture("quit_button.png");
  }
    @Override
    public void show() {  
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
         game.batch.draw(backgrond,0,0);
         game.batch.draw(logo,300,230);
         game.batch.draw(play_unactive,350,100);
         game.batch.draw(quit_unactive,350,15);
     if(Gdx.input.getX()>350&&Gdx.input.getX()<500){
     if(Gdx.input.getY()>420&&Gdx.input.getY()<485){
         game.batch.draw(play_Active,350,100) ;
     if(Gdx.input.isTouched()){
       game.setScreen(new ChooseLevels(this.game));
     }
     }
     }
      if(Gdx.input.getX()>350&&Gdx.input.getX()<500){
     if(Gdx.input.getY()>515&&Gdx.input.getY()<585){
         game.batch.draw(quit_Active,350,15);
     if(Gdx.input.isTouched()){
      Gdx.app.exit();
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
        game.batch.dispose();
    }
    
}
