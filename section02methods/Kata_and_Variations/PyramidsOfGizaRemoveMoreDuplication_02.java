package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//---------------------- Kata Question -------------------//
// Where do you see duplicate lines of code?
//  and how can you refactor it?
// write out the steps
// then translate into code 
// make sure to run

//---------------------- Kata Question -------------------//
//Where do you see duplicate lines of code?
//and how can you refactor it?
//write out the steps
//then translate into code 
//make sure to run
// Look for duplicated lines of code
// refactor any duplicated code
public class PyramidsOfGizaRemoveMoreDuplication_02
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveUp()
  {
    Tortoise.turn(-90);
    Tortoise.move(100);
  }
  private static void moveDown()
  {
    // move the tortoise down
    // extract a method & name it
    Tortoise.turn(90); // !!! 
    Tortoise.move(100);// !!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
