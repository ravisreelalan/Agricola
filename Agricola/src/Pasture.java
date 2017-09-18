import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Pasture.java
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

public class Pasture {
   public ArrayList<PastureSlot> pastureSlots;
   public boolean isFenced = false;

   public double Capacity() {
      int capacity = pastureSlots.size();
      int stableCount = (int) pastureSlots.stream().filter( ps -> ps.hasStable )
               .count();
      return Math.pow( capacity, stableCount + 1 );
   }

   public Pasture(ArrayList<PastureSlot> newSlots) {
      pastureSlots = newSlots;
   }

   public Pasture(PastureSlot newSlot) {
      pastureSlots = new ArrayList<PastureSlot>();
      pastureSlots.add( newSlot );
   }
   

//   public Pasture Split(ArrayList<GameElements.SlotPosition> slotsToBeMoved)
//       {
//           foreach (GameElements.SlotPosition pos in slotsToBeMoved)
//           {
//               if (slots.Contains(pos))
//               {
//                   slots.Remove(pos);
//               }
//               else throw new Exception();
//           }
//           return new Pasture(slotsToBeMoved);
//       }
//
//   public void Merge(Pasture pasture)
//       {
//           foreach (SlotPosition pos in pasture.slots)
//           {
//               if (slots.Contains(pos))
//               {
//                   throw new Exception();
//               }
//           }
//           slots.AddRange(pasture.slots);
//       }
}
