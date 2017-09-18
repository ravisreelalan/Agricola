/**
 * PastureSlot.java
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

public class PastureSlot extends Slot{
   public boolean hasStable = false;
   public PastureSlot(GameElements.SlotPosition position, boolean stable)
   {
      super(position);
      this.hasStable = stable;
   }
}
