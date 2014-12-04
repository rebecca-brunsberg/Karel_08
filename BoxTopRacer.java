/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author Rebecca Brunsberg
 * @version 2 December 2014
 *
 */
public class BoxTopRacer extends Racer {
 
  public BoxTopRacer(int y){
    super(y);
  }
 
 //allows for jumping hurdles of any width
 @Override
 public void jumpRight() {
   turnLeft();
   while(!rightIsClear()){
     move();
   }
   turnRight();
   move();
   while(!rightIsClear()){
     move();
   }
   turnRight();
   while(frontIsClear()){
     move();
   }
   turnLeft();
  
 }

}
