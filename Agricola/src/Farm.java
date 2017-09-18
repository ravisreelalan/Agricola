import java.util.ArrayList;
import java.util.Arrays;

/**
 * Farm.java
 * 
 * Version:
 * 	$Id$
 * 
 * Revisions:
 * 	$Log$
 */

// Import statements are place here

/**
 * A farm is a 5x3 area which each player is provided with at the start of the
 * game A farm has slots, 1 house, fields - sown and empty, and pastures. Slots
 * are given to each of the managers to create their structures.
 * 
 * @author Ravi Sreelalan Iyer
 */
public class Farm {
   // slots are for display - everything else is for state maintenance;
   ArrayList<Slot> freeSlots;
   House house;
   PastureManager pastureManager;
   FieldManager fieldManager;

   public Farm() {


      freeSlots = (ArrayList<Slot>) Arrays.asList( slots );
      
      // GameElements.SlotPosition[] allSlots = { GameElements.SlotPosition.A1,
      // GameElements.SlotPosition.B1, GameElements.SlotPosition.C1,
      // GameElements.SlotPosition.D1, GameElements.SlotPosition.E1,
      // GameElements.SlotPosition.A2, GameElements.SlotPosition.B2,
      // GameElements.SlotPosition.C2, GameElements.SlotPosition.D2,
      // GameElements.SlotPosition.E2, GameElements.SlotPosition.A3,
      // GameElements.SlotPosition.B3, GameElements.SlotPosition.C3,
      // GameElements.SlotPosition.D3, GameElements.SlotPosition.E3 };
      // freeSlots=new ArrayList<GameElements.SlotPosition>();
      // freeSlots.addAll(Arrays.asList(allSlots));freeSlots.remove(GameElements.SlotPosition.A2);freeSlots.remove(GameElements.SlotPosition.A3);house=new
      // House();pastureManager=new PastureManager();fieldManager=new
      // FieldManager();
;

   }

   public void BuildStable( GameElements.SlotPosition slot ) {
      pastureManager.BuildStable( slot );
   }
}
