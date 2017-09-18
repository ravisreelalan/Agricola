/**
 * SlotManager.java
 * 
 * Version:
 * 	$Id$
 * 
 * Revisions:
 * 	$Log$
 */

// Import statements are place here

/**
 * @author Ravi Sreelalan Iyer
 *
 */
class Slot {
   private int positionX, positionY;

   Slot(int posX, int posY) {
      positionX = posX;
      positionY = posY;
   }
}

public class SlotManager {
   private Slot[][] allSlots;

   public SlotManager() {
      allSlots = new Slot[][] {
               { new Slot( 0, 0 ), new Slot( 0, 1 ), new Slot( 0, 2 ),
                        new Slot( 0, 3 ), new Slot( 0, 4 ) },
               { new Slot( 1, 0 ), new Slot( 1, 1 ), new Slot( 1, 2 ),
                        new Slot( 1, 3 ), new Slot( 1, 4 ) },
               { new Slot( 2, 0 ), new Slot( 2, 1 ), new Slot( 2, 2 ),
                        new Slot( 2, 3 ), new Slot( 2, 4 ) } };
   }

   public Slot[][] getAllSlots() {
      return allSlots;
   }

   public Slot getSlotAt( int x, int y ) {
      assert(x>=0 && x<=4 && y>=0 && y<=2);      
      return allSlots[x][y];
   }

}
