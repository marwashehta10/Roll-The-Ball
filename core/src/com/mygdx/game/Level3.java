/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import javafx.util.Pair;



/**
 *
 * @author PC
 */
public class Level3 extends Level {
    public Level3(MyGdxGame game) {
        this.game=game;
       background=new Texture("download.jpg");
       background_puzzle=new Texture("BlocksBackground.jpg");
       win=new Texture("WIN.jpg");
       start_block =new Texture("StartBlock.png");
       one=new TextureRegion(start_block);
       ball =new Texture("Ball 2.2.png");
       ball1=new TextureRegion(ball);
       horizontal_block =new Texture("HorizontalBlock.png");   
       ten=new TextureRegion(horizontal_block);
       sixteen=new TextureRegion(horizontal_block);
       end_block =new Texture("EndBlock2.png");
       eight=new TextureRegion(end_block);
       liner_block =new Texture("silver path.png"); 
       five= new TextureRegion(liner_block);
       BottomLeftCurve =new Texture("BottomLeftCurve.png");
       nine= new TextureRegion(BottomLeftCurve);
       BottomRightCurve =new Texture("BottomRightCurve.png"); 
       eleven=new TextureRegion(BottomRightCurve);
       non=new Texture("non.jpg");
       two=new TextureRegion(non);
       three=new TextureRegion(non);
       four=new TextureRegion(non);
       six=new TextureRegion(non);
       seven=new TextureRegion(non);
       twelive=new TextureRegion(non);
       empty=new Texture("empty.png");
       therteen= new TextureRegion(empty);
       fourteen=new TextureRegion(empty);
       fiveteen=new TextureRegion(empty);
          
            //The Key of the pair represents a unique number assigned to each block in our GridLevel.
            
            /*The Value of the pair is either 1 or -1. WHEN it is 1 this means the place is empty
            and ready to accept a moving block. WHEN it is -1 this means its not available to move
            another block in this block's position*/            
            
            /*
                   GridLevel shape: {  0   ,  1   ,  2   ,  3
                                      , 4   ,  5   ,  6   ,  7
                                      , 8   ,  9   ,  10  ,  11
                                      , 12  ,  13  ,  14  ,  15  }
            */
            
         
            GridLevel[0] = new Pair(0, -1); 
            GridLevel[1] = new Pair(1, -1); 
            GridLevel[2] = new Pair(2, -1); 
            GridLevel[3] = new Pair(3, -1); 
            GridLevel[4] = new Pair(4, -1);
            GridLevel[5] = new Pair(5, -1);
            GridLevel[6] = new Pair(6, -1);
            GridLevel[7] = new Pair(7, -1);
            GridLevel[8] = new Pair(8, -1);
            GridLevel[9] = new Pair(9, -1);
            GridLevel[10] = new Pair(10, -1);
            GridLevel[11] = new Pair(11, -1);
            GridLevel[12] = new Pair(12, 1);
            GridLevel[13] = new Pair(13, 1);
            GridLevel[14] = new Pair(14, 1);
            GridLevel[15] = new Pair(15, -1);
            x=ball1.getRegionX()+229;
            y=ball1.getRegionY()+471;
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
    @Override
   public void update(float delta){
    if(x<641&&y>209){
   game.batch.draw(ball1,x,y-4);
   y-=4;
   }
    else if(x<641&&y<209){
    game.batch.draw(ball1,x+4,y); 
    x+=4;
   }
    else if(y<330){
       game.batch.draw(ball1,x,y+4);
       y+=4;
    }
    else{
        game.batch.draw(ball1,x,y);
         game.batch.draw(win,300,230);
          win1=true;
    } 
    }
   @Override
  public boolean Swap(int clicked, int destination, Pair[] GridLevel)
        {
            if(clicked==0 || clicked==4 || clicked==7)
                return false;
            
            if(clicked==1 && (int)GridLevel[1].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==2)
                {
                    if((int)GridLevel[2].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[1];
                        GridLevel[1] = GridLevel[2];
                        GridLevel[2] = temp;
                        return true;
                    }
                }
                
                else if(destination == 5)
                {
                    if((int)GridLevel[5].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[1];
                        GridLevel[1] = GridLevel[5];
                        GridLevel[5] = temp;
                        return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 1 is clicked
            
          else if(clicked==2 && (int)GridLevel[2].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==3)
                {
                    if((int)GridLevel[3].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[2];
                        GridLevel[2] = GridLevel[3];
                        GridLevel[3] = temp;
                        return true;
                    }
                }
                
                else if(destination == 6)
                {
                    if((int)GridLevel[6].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[2];
                        GridLevel[2] = GridLevel[6];
                        GridLevel[6] = temp;
                        return true;
                    }
                }
                
                else if(destination == 1)
                {
                    if((int)GridLevel[1].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[2];
                        GridLevel[2] = GridLevel[1];
                        GridLevel[1] = temp;
                        return true;
}
                }
                else
                    return false;
            } // End of the condition where block 2 is clicked          
                        
              
          else if(clicked==3 && (int)GridLevel[3].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination == 2)
                {
                    if((int)GridLevel[2].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[3];
                        GridLevel[3] = GridLevel[2];
                        GridLevel[2] = temp;
                        return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 3 is clicked
            
          else if(clicked==5 && (int)GridLevel[5].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==6)
                {
                    if((int)GridLevel[6].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[5];
                        GridLevel[5] = GridLevel[6];
                        GridLevel[6] = temp;
                        return true;
                    }
                }

                else if(destination == 9)
                {
                    if((int)GridLevel[9].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[5];
                        GridLevel[5] = GridLevel[9];
                        GridLevel[9] = temp;
                        return true;
                    }
                }
               
                else if(destination == 1)
                {
                    if((int)GridLevel[1].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[5];
                        GridLevel[5] = GridLevel[1];
                        GridLevel[1] = temp;
                        return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 5 is clicked
            
            
          else if(clicked==6 && (int)GridLevel[6].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
               if(destination == 10)
                {
                    if((int)GridLevel[10].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[6];
                        GridLevel[6] = GridLevel[10];
                        GridLevel[10] = temp;
                        return true;
                    }
                }
                
                else if(destination == 5)
                {
                    if((int)GridLevel[5].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[6];
                        GridLevel[6] = GridLevel[5];
                        GridLevel[5] = temp;
                        return true;
                    }
                }
                
                else if(destination == 2)
                {
                    if((int)GridLevel[2].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[6];
                        GridLevel[6] = GridLevel[2];
                        GridLevel[2] = temp;
return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 6 is clicked
            
          else if(clicked==8 && (int)GridLevel[8].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==9)
                {
                    if((int)GridLevel[9].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[8];
                        GridLevel[8] = GridLevel[9];
                        GridLevel[9] = temp;
                        return true;
                    }
                }
          
                else if(destination == 12)
                {
                    if((int)GridLevel[12].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[8];
                        GridLevel[8] = GridLevel[12];
                        GridLevel[12] = temp;
                        return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 8 is clicked
            
          else if(clicked==9 && (int)GridLevel[9].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==10)
                {
                    if((int)GridLevel[10].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[9];
                        GridLevel[9] = GridLevel[10];
                        GridLevel[10] = temp;
                        return true;
                    }
                }
else if(destination==13)
                {
                    if((int)GridLevel[13].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[9];
                        GridLevel[9] = GridLevel[13];
                        GridLevel[13] = temp;
                        return true;
                    }
                }
                
                else if(destination==8)
                {
                    if((int)GridLevel[8].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[9];
                        GridLevel[9] = GridLevel[8];
                        GridLevel[8] = temp;
                        return true;
                    }
                }
                
                if(destination==5)
                {
                    if((int)GridLevel[5].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[9];
                        GridLevel[9] = GridLevel[5];
                        GridLevel[5] = temp;
                        return true;
                    }
                }
               
                else
                    return false;
            } // End of the condition where block 9 is clicked
            
          else if(clicked==10 && (int)GridLevel[10].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==11)
                {
                    if((int)GridLevel[11].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[10];
                        GridLevel[10] = GridLevel[11];
                        GridLevel[11] = temp;
                        return true;
                    }
                }
                            
                else if(destination==14)
                {
                    if((int)GridLevel[14].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[10];
                        GridLevel[10] = GridLevel[14];
                        GridLevel[14] = temp;
                        return true;
                    }
                }
                
                else if(destination==9)
                {
                    if((int)GridLevel[9].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[10];
                        GridLevel[10] = GridLevel[9];
                        GridLevel[9] = temp;
                        return true;
                    }
                }
                
                if(destination==6)
                {
                    if((int)GridLevel[6].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[10];
                        GridLevel[10] = GridLevel[6];
                        GridLevel[6] = temp;
                        return true;
                    }
                }
               
                else
                    return false;
            } // End of the condition where block 10 is clicked
            
          else if(clicked==11 && (int)GridLevel[11].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==10)
                {
                    if((int)GridLevel[10].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[11];
GridLevel[11] = GridLevel[10];
                        GridLevel[10] = temp;
                        return true;
                    }
                }
                
                else if(destination==15)
                {
                    if((int)GridLevel[15].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[11];
                        GridLevel[11] = GridLevel[15];
                        GridLevel[15] = temp;
                        return true;
                    }
                }
                
                else
                    return false;
            } // End of the condition where block 11 is clicked
            
          else if(clicked==12 && (int)GridLevel[12].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==13)
                {
                    if((int)GridLevel[13].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[12];
                        GridLevel[12] = GridLevel[13];
                        GridLevel[13] = temp;
                        return true;
                    }
                }

                else if(destination==8)
                {
                    if((int)GridLevel[8].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[12];
                        GridLevel[12] = GridLevel[8];
                        GridLevel[8] = temp;
                        return true;
                    }
                }
        
                else
                    return false;
            } // End of the condition where block 12 is clicked
            
          else if(clicked==13 && (int)GridLevel[13].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==14)
                {
                    if((int)GridLevel[14].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[13];
                        GridLevel[13] = GridLevel[14];
                        GridLevel[14] = temp;
                        return true;
                    }
                }
                            
                else if(destination==12)
                {
                    if((int)GridLevel[12].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[13];
                        GridLevel[13] = GridLevel[12];
                        GridLevel[12] = temp;
                        return true;
                    }
                }
                
                else if(destination==9)
                {
                    if((int)GridLevel[9].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[13];
                        GridLevel[13] = GridLevel[9];
                        GridLevel[9] = temp;
                        return true;
                    }
                }
        
                else
                    return false;
            } // End of the condition where block 13 is clicked
            
          else if(clicked==14 && (int)GridLevel[14].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==13)
                {
                    if((int)GridLevel[13].getValue() == -1)
                        return false;
                    else
                    {
Pair temp = GridLevel[14];
                        GridLevel[14] = GridLevel[13];
                        GridLevel[13] = temp;
                        return true;
                    }
                }
                
                else if(destination==10)
                {
                    if((int)GridLevel[10].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[14];
                        GridLevel[14] = GridLevel[10];
                        GridLevel[10] = temp;
                        return true;
                    }
                }
        
                else
                    return false;
            } // End of the condition where block 14 is clicked           
            
            else if(clicked==15 && (int)GridLevel[15].getValue() == -1)
            {
                //a list of if conditions that represent the number of possible valid moves for the block
                if(destination==14)
                {
                    if((int)GridLevel[14].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[15];
                        GridLevel[15] = GridLevel[14];
                        GridLevel[14] = temp;
                        return true;
                    }
                }
                
                else if(destination==11)
                {
                    if((int)GridLevel[11].getValue() == -1)
                        return false;
                    else
                    {
                        Pair temp = GridLevel[15];
                        GridLevel[15] = GridLevel[11];
                        GridLevel[11] = temp;
                        return true;
                    }
                }
        
                else
                    return false;
            } // End of the condition where block 15 is clicked
            
            return false;

        }
  @Override
 public boolean CompareLevel(Pair[] GridLevel)
    {
       Pair Block1 = new Pair(15, -1);
        Pair Block2 = new Pair(10, -1);
        Pair Block3 = new Pair(9,-1);
        Pair Block4= new Pair (8,-1);
        
        if((int)GridLevel[10].getKey() == (int)Block1.getKey() &&
                (int)GridLevel[11].getKey() == (int)Block2.getKey() &&
                (int)GridLevel[9].getKey() == (int)Block3.getKey()&&
                (int)GridLevel[8].getKey() == (int)Block4.getKey())
            return true;
        else if((int)GridLevel[9].getKey() == (int)Block1.getKey() &&
                (int)GridLevel[10].getKey() == (int)Block3.getKey() &&
                (int)GridLevel[11].getKey() == (int)Block2.getKey()&&
                (int)GridLevel[8].getKey() == (int)Block4.getKey())
            return true;
        else
            return false;
    }

    @Override
    public void show() {
    }
}

