import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
   /**
   * A program Sketch.java that sketches out a cat based on the parameters in the method.
   * @author: D. Gu 
   */
  
  public void settings(){
    // Size of sketchpad
    size(900, 900);
  }

  public void draw(){
    drawCat(500, 500);
    drawCatTwo(200, 200, 223, 100, 100, 100);
  }

  /** 
  * Draws the face of a cat based on parameters (Level 2)
  *
  * @param intX X coordinate of the cat
  * @param intY Y coordinate of the cat
  * @return nothing
  */
  
  public void drawCat(int intX, int intY){
    // Draw the head
    noFill();
    stroke(0);
    ellipse(intX, intY, 220, 220);

    // Draw the ears
    stroke(0);
    line((float)(intX - 150), (float)(intY - 150), (float)(intX - 80), (float)(intY - 78)); 
    line((float)(intX - 150), (float)(intY - 150), (float)(intX - 50), (float)(intY - 100));
    line((float)(intX + 150), (float)(intY - 150), (float)(intX + 80), (float)(intY - 78)); 
    line((float)(intX + 150), (float)(intY - 150), (float)(intX + 50), (float)(intY - 100));

    // Draw the eyes
    stroke(0);
    rect((float)(intX - 70), (float)(intY - 50), 40, 30);
    ellipse((float)(intX - 50), (float)(intY - 35), 10, 10);
    rect((float)(intX + 30), (float)(intY - 50), 40, 30);  
    ellipse((float)(intX + 50), (float)(intY - 35), 10, 10);

    // Draw the nose and mouth
    triangle((float)(intX), (float)(intY - 30), (float)(intX - 30), (float)(intY + 20), (float)(intX + 30), (float)(intY + 20));
    noFill();
    arc((float)(intX + 50), (float)(intY + 20), 100, 90, HALF_PI, PI);
    arc((float)(intX - 50), (float)(intY + 20), 100, 90, 0, HALF_PI);
  }
  
  /** 
  * Draws the face of a cat based on parameters (Level 3 + 4)
  *
  * @param intX X coordinate of the cat
  * @param intY Y coordinate of the cat
  * @param intColor1 Color of R (from 0 - 255)
  * @param intColor2 Color of G (from 0 - 255)
  * @param intColor3 Color of B (from 0 - 255)
  * @param intSize Size of the cat
  * @return 
  */
  
  public int drawCatTwo(int intX, int intY, int intColor1, int intColor2, int intColor3, int intSize){
     // Draw the head
     fill(intColor1, intColor2, intColor3);
     stroke(0);
     ellipse(intX, intY, intSize, intSize);
 
     // Draw the ears
     stroke(0);
     line((float)(intX - (intSize / 1.466)), (float)(intY - (intSize / 1.466)), (float)(intX - (intSize / 2.75)), (float)(intY - (intSize / 2.82))); 
     line((float)(intX - (intSize / 1.466)), (float)(intY - (intSize / 1.466)), (float)(intX - (intSize / 4.4)), (float)(intY - (intSize / 2.2)));
     line((float)(intX + (intSize / 1.466)), (float)(intY - (intSize / 1.466)), (float)(intX + (intSize / 2.75)), (float)(intY - (intSize / 2.82))); 
     line((float)(intX + (intSize / 1.466)), (float)(intY - (intSize / 1.466)), (float)(intX + (intSize / 4.4)), (float)(intY - (intSize / 2.2)));
 
     // Draw the eyes
     stroke(0);
     rect((float)(intX - (intSize / 3.14)), (float)(intY - (intSize / 4.4)), (float)(intSize / 5.5), (float)(intSize / 7.33));  
     ellipse((float)(intX - (intSize / 4.4)), (float)(intY - (intSize / 6.285)), (float)(intSize / 22), (float)(intSize / 22));
     rect((float)(intX + (intSize / 7.33)), (float)(intY - (intSize / 4.4)), (float)(intSize / 5.5), (float)(intSize / 7.33));
     ellipse((float)(intX + (intSize / 4.4)), (float)(intY - (intSize / 6.285)), (float)(intSize / 22), (float)(intSize / 22));
 
     // Draw the nose and mouth
     triangle((float)(intX), (float)(intY - (intSize / 7.33)), (float)(intX - (intSize / 7.33)), (float)(intY + (intSize / 11)), (float)(intX + (intSize / 7.33)), (float)(intY + (intSize / 11)));
     noFill();
     arc((float)(intX + (intSize / 4.4)), (float)(intY + (intSize / 11)), (float)(intSize / 2.2), (float)(intSize / 2.44), HALF_PI, PI);
     arc((float)(intX - (intSize / 4.4)), (float)(intY + (intSize / 11)), (float)(intSize / 2.2), (float)(intSize / 2.44), 0, HALF_PI);
     
     // Returns the X coordinate value
     return intX;
  }
}