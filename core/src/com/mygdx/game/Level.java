
package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import javafx.util.Pair;

public abstract class Level implements Screen {
  protected Pair[] GridLevel= new Pair[16]; 
  protected MyGdxGame game;
  protected Texture background;
 protected  Texture win;
  protected Texture ball;
 protected  TextureRegion ball1;
 protected  Texture start_block;
 protected  Texture background_puzzle;
 protected  Texture end_block;
 protected  Texture liner_block ; 
protected   Texture horizontal_block; 
protected   Texture BottomLeftCurve;
 protected  Texture non;
 protected  Texture empty;
 protected  Texture silver_path;
protected   Texture BottomRightCurve;
 protected  Texture silver_path2;
protected   TextureRegion one;
  protected TextureRegion two;
 protected  TextureRegion three;
 protected  TextureRegion four;
protected   TextureRegion five;
 protected  TextureRegion six;
  protected TextureRegion seven;
  protected TextureRegion eight;
  protected TextureRegion nine;
 protected  TextureRegion ten;
 protected  TextureRegion eleven;
 protected  TextureRegion twelive;
 protected  TextureRegion therteen;
 protected  TextureRegion fourteen;
 protected  TextureRegion fiveteen;
  protected TextureRegion sixteen;
  public int Countclick=0; 
  protected TextureRegion temp=new TextureRegion() ;
 public  int []No_click=new int[2];
 public  int x;
public   int y;
public   boolean win1=false;
     @Override
    public void render(float f) {
        if(win1){
            game.setScreen(new ChooseLevels(this.game));
        }
        else{
      Gdx.gl.glClearColor(0,0,0,1);
     Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.batch.begin();
      game.batch.draw(background,0,0);
      game.batch.draw(background_puzzle,170,5);
      game.batch.draw(one,182,429,137,137);
      game.batch.draw(ball1,x,y);
      game.batch.draw(two,321,429,137,137);
      game.batch.draw(three,460,429,137,137);
      game.batch.draw(four,599,429,137,137);
      game.batch.draw(five,181,290,138,138);
      game.batch.draw(six,321,290,138,138);
      game.batch.draw(seven,460,290,138,138);
      game.batch.draw(eight,599,290,138,138);
      game.batch.draw(nine,181,153,138,138);
      game.batch.draw(ten,321,153,138,138);
      game.batch.draw(eleven,460,153,138,138);
      game.batch.draw(twelive,599,153,138,138);
      game.batch.draw(therteen,181,15,138,138); 
      game.batch.draw(fourteen,319,15,138,138);
      game.batch.draw(fiveteen,457,15,138,138);
      game.batch.draw(sixteen,596,15,137,137);
      if(CompareLevel(GridLevel)){
           update(f);
      }
     if(Gdx.input.getX()>182&&Gdx.input.getX()<319 &&
      Gdx.input.getY()>15&&Gdx.input.getY()<154){ 
         if(Gdx.input.isTouched()){
         No_click[Countclick]=0;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>321&&Gdx.input.getX()<459 &&
     Gdx.input.getY()>15&&Gdx.input.getY()<154){ 
         if(Gdx.input.isTouched()){
         No_click[Countclick] =1;
         Countclick++;
         }
     }
     if(Gdx.input.getX()>460&&Gdx.input.getX()<596 &&
     Gdx.input.getY()>15&&Gdx.input.getY()<154){ 
         if(Gdx.input.isTouched()){
         No_click[Countclick] =2;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>599&&Gdx.input.getX()<737 &&
     Gdx.input.getY()>15&&Gdx.input.getY()<154){ 
         if(Gdx.input.isTouched()){
          No_click[Countclick] =3;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>182&&Gdx.input.getX()<319 &&
     Gdx.input.getY()>154&&Gdx.input.getY()<291){ 
         if(Gdx.input.isTouched()){
          No_click[Countclick] =4;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>321&&Gdx.input.getX()<459 &&
     Gdx.input.getY()>154&&Gdx.input.getY()<291){ 
         if(Gdx.input.isTouched()){
          No_click[Countclick] =5;
         Countclick++;
         }
     }
     else if(Gdx.input.getX()>460&&Gdx.input.getX()<596 &&
     Gdx.input.getY()>154&&Gdx.input.getY()<291){
         if(Gdx.input.isTouched()){
          No_click[Countclick] =6;
         Countclick++;
         }
     }    
      if(Gdx.input.getX()>599&&Gdx.input.getX()<737 &&
     Gdx.input.getY()>154&&Gdx.input.getY()<291){ 
         if(Gdx.input.isTouched()){
         No_click[Countclick] =7;
         Countclick++;
         }
     } 
      if(Gdx.input.getX()>182&&Gdx.input.getX()<319 &&
     Gdx.input.getY()>291&&Gdx.input.getY()<429){ 
         if(Gdx.input.isTouched()){
          No_click[Countclick] =8;
         Countclick++;
         }
     }     
      if(Gdx.input.getX()>321&&Gdx.input.getX()<460 &&
        Gdx.input.getY()>291&&Gdx.input.getY()<429){
         if(Gdx.input.isTouched()){
          No_click[Countclick] =9;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>460&&Gdx.input.getX()<599 &&
        Gdx.input.getY()>291&&Gdx.input.getY()<429){
         if(Gdx.input.isTouched()){
           No_click[Countclick] =10;
         Countclick++;
         }
     }
      if(Gdx.input.getX()>599&&Gdx.input.getX()<737 &&
        Gdx.input.getY()>291&&Gdx.input.getY()<429){
         if(Gdx.input.isTouched()){
           No_click[Countclick] =11;
         Countclick++;
         }
     }  
      if(Gdx.input.getX()>182&&Gdx.input.getX()<319 &&
        Gdx.input.getY()>429&&Gdx.input.getY()<567){
         if(Gdx.input.isTouched()){
           No_click[Countclick] =12;
         Countclick++;
         }
       }
     if(Gdx.input.getX()>319&&Gdx.input.getX()<457){
       if(Gdx.input.getY()>429&&Gdx.input.getY()<567){
        if(Gdx.input.isTouched()){
         No_click[Countclick] =13;
         Countclick++;
        }
     }
    }
     if(Gdx.input.getX()>457&&Gdx.input.getX()<599){
       if(Gdx.input.getY()>429&&Gdx.input.getY()<567){
        if(Gdx.input.isTouched()){
         No_click[Countclick] =14;
         Countclick++; 
        }
     } 
   }
     if(Gdx.input.getX()>599&&Gdx.input.getX()<737){
       if( Gdx.input.getY()>429&&Gdx.input.getY()<567){
        if(Gdx.input.isTouched()){
          No_click[Countclick] =15;
         Countclick++; 
        }
}
    }
    if(Countclick==2){ 
    if(Swap(No_click[0],No_click[1], GridLevel)){
       SwapBlock(No_click[0],No_click[1]); 
    }
      Countclick=0;
     }
this.game.batch.end();
    }
    }
  public void SwapBlock(int clicked, int destination){
        if(No_click[0]==0)
            {
                if(No_click[1]==1){
                   temp.setRegion(one);
                   one.setRegion(two);
                   two.setRegion(temp);
                }
                 if(No_click[1]==4){
                   temp.setRegion(one);
                   one.setRegion(four);
                   two.setRegion(temp);
                }
                   
            }
            if(No_click[0]==1)
            {
                if(No_click[1]==2)
                {
                   temp.setRegion(two);
                   two.setRegion(three);
                   three.setRegion(temp);
                }
                
                else if(No_click[1] == 5)
                {
                   temp.setRegion(two);
                   two.setRegion(five);
                   five.setRegion(temp);
                }
            }
            if(No_click[0]==2)
            {
                if(No_click[1]==3)
                {
                 temp.setRegion(three);
                   three.setRegion(four);
                   four.setRegion(temp);
                }
                
               if(No_click[1]==6)
                {
                 temp.setRegion(three);
                   three.setRegion(seven);
                   seven.setRegion(temp);
                }
                
                 if(No_click[1]==1)
                {
                 temp.setRegion(three);
                   three.setRegion(two);
                   two.setRegion(temp);
                }
            }
            if(No_click[0]==3)
            {
                if(No_click[1]==7)
                {
                 temp.setRegion(four);
                   four.setRegion(eight);
                   eight.setRegion(temp);
                }
                
               if(No_click[1]==2)
                {
                 temp.setRegion(four);
                   four.setRegion(eight);
                   eight.setRegion(temp);
                }
            }
            if(No_click[0]==4)
            {
                if(No_click[1]==0)
                {
                 temp.setRegion(five);
                   five.setRegion(one);
                   one.setRegion(temp);
                }
                
               if(No_click[1]==5)
                {
                 temp.setRegion(five);
                   five.setRegion(six);
                   six.setRegion(temp);
                }
                
                 if(No_click[1]==8)
                {
                 temp.setRegion(five);
                   five.setRegion(nine);
                   nine.setRegion(temp);
                }
            }
           if(No_click[0]==5)
            {
                if(No_click[1]==1)
                {
                 temp.setRegion(six);
                   six.setRegion(two);
                   two.setRegion(temp);
                }
                
               if(No_click[1]==6)
                {
                 temp.setRegion(six);
                   six.setRegion(seven);
                   seven.setRegion(temp);
       
                }
                
                 if(No_click[1]==4)
                {
                 temp.setRegion(six);
                   six.setRegion(five);
                   five.setRegion(temp);
                }
                 if(No_click[1]==9)
                {
                 temp.setRegion(six);
                   six.setRegion(ten);
                   ten.setRegion(temp);
                }
            }
            if(No_click[0]==6)
            {
                if(No_click[1]==2)
                {
                 temp.setRegion(seven);
                   seven.setRegion(three);
                   three.setRegion(temp);
                }
                
               if(No_click[1]==7)
                {
                 temp.setRegion(seven);
                   seven.setRegion(eight);
                   eight.setRegion(temp);
                }
                
                 if(No_click[1]==5)
                {
                 temp.setRegion(seven);
                   seven.setRegion(six);
                   six.setRegion(temp);
                }
                 if(No_click[1]==10)
                {
                 temp.setRegion(seven);
                   seven.setRegion(eleven);
                   eleven.setRegion(temp);
                }   
            }
            if(No_click[0]==7)
            {
                if(No_click[1]==3)
                {
                 temp.setRegion(eight);
                   eight.setRegion(four);
                   four.setRegion(temp);
                }
                
               if(No_click[1]==11)
                {
                 temp.setRegion(eight);
                   eight.setRegion(twelive);
                   twelive.setRegion(temp);
                }
                
                 if(No_click[1]==6)
                {
                 temp.setRegion(eight);
                   eight.setRegion(seven);
                   seven.setRegion(temp);
                } 
            }
           if(No_click[0]==8)
            {
                if(No_click[1]==4)
                {
                 temp.setRegion(nine);
                   nine.setRegion(five);
                   five.setRegion(temp);
                }
                
               if(No_click[1]==9)
                {
                 temp.setRegion(nine);
                   nine.setRegion(ten);
                   ten.setRegion(temp);
                }
                
                 if(No_click[1]==12)
                {
                 temp.setRegion(nine);
                   nine.setRegion(therteen);
                   therteen.setRegion(temp);
                }    
            }
           if(No_click[0]==9)
            {
                if(No_click[1]==5)
                {
                 temp.setRegion(ten);
                   ten.setRegion(six);
                   six.setRegion(temp);
                }
                
               if(No_click[1]==10)
                {
                 temp.setRegion(ten);
                   ten.setRegion(eleven);
                   eleven.setRegion(temp);
                }
                
                 if(No_click[1]==8)
                {
                 temp.setRegion(ten);
                   ten.setRegion(nine);
                   nine.setRegion(temp);
                } 
              if(No_click[1]==13)
                {
                 temp.setRegion(ten);
                   ten.setRegion(fourteen);
                   fourteen.setRegion(temp);
                } 
            }           
           if(No_click[0]==10)
            {
                if(No_click[1]==6)
                {
                 temp.setRegion(eleven);
                   eleven.setRegion(seven);
                   seven.setRegion(temp);
                }
                
               if(No_click[1]==9)
                {
                 temp.setRegion(eleven);
                   eleven.setRegion(ten);
                   ten.setRegion(temp);
                }
                
                 if(No_click[1]==11)
                {
                 temp.setRegion(eleven);
                   eleven.setRegion(twelive);
                   twelive.setRegion(temp);
                } 
              if(No_click[1]==14)
                {
                 temp.setRegion(eleven);
                   eleven.setRegion(fiveteen);
                   fiveteen.setRegion(temp);
                } 
            }             
           if(No_click[0]==11)
            {
                if(No_click[1]==7)
                {
                 temp.setRegion(twelive);
                   twelive.setRegion(eight);
                   eight.setRegion(temp);
                }
                
               if(No_click[1]==10)
                {
                 temp.setRegion(twelive);
                   twelive.setRegion(eleven);
                   eleven.setRegion(temp);
                }
                
                 if(No_click[1]==15)
                {
                 temp.setRegion(twelive);
                   twelive.setRegion(sixteen);
                   sixteen.setRegion(temp);
                } 
            }          
           if(No_click[0]==12)
            {
                if(No_click[1]==8)
                {
                 temp.setRegion(therteen);
                   therteen.setRegion(nine);
                   nine.setRegion(temp);
                }
                
               if(No_click[1]==13)
                {
                 temp.setRegion(therteen);
                   therteen.setRegion(fourteen);
                   fourteen.setRegion(temp);
                }
            }              
           if(No_click[0]==13)
            {
                if(No_click[1]==12)
                {
                 temp.setRegion(fourteen);
                   fourteen.setRegion(therteen);
                   therteen.setRegion(temp);
                }
                
               if(No_click[1]==9)
                {
                 temp.setRegion(fourteen);
                   fourteen.setRegion(ten);
                   ten.setRegion(temp);
                }
                
                 if(No_click[1]==14)
                {
                 temp.setRegion(fourteen);
                   fourteen.setRegion(fiveteen);
                   fiveteen.setRegion(temp);
                } 
            }          
           if(No_click[0]==14)
            {
                if(No_click[1]==13)
                {
                 temp.setRegion(fiveteen);
                   fiveteen.setRegion(fourteen);
                   fourteen.setRegion(temp);
                }
                
               if(No_click[1]==10)
                {
                 temp.setRegion(fiveteen);
                   fiveteen.setRegion(eleven);
                   eleven.setRegion(temp);
                }
                
                 if(No_click[1]==15)
                {
                 temp.setRegion(fiveteen);
                   fiveteen.setRegion(sixteen);
                   sixteen.setRegion(temp);
                } 
            }
            if(No_click[0]==15)
            {
                if(No_click[1]==14)
                {
                 temp.setRegion(sixteen);
                   sixteen.setRegion(fiveteen);
                   fiveteen.setRegion(temp);
                }
                 if(No_click[1]==11)
                {
                 temp.setRegion(sixteen);
                   sixteen.setRegion(twelive);
                   twelive.setRegion(temp);
                }  
            }
}
   public abstract boolean Swap(int clicked, int destination, Pair[] GridLevel);
   public abstract boolean CompareLevel(Pair[] GridLevel);
  public abstract void update(float delta) ; 
}
