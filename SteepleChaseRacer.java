/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author Rebecca Brunsberg
 * @version 2 December 2014
 *
 */
public class SteepleChaseRacer extends Racer {
 
  public SteepleChaseRacer(int y){
    super(y);
  }
 
  //allows for jumping hurdles of any height
 @Override
 public void jumpRight() {
   turnLeft();
   while(!rightIsClear()){
     move();
   }
   turnLeft();
   turnLeft();
   turnLeft();
   move();
   turnLeft();
   turnLeft();
   turnLeft();
   while (frontIsClear()){
     move();
   }
   turnLeft();
  
 }

}
