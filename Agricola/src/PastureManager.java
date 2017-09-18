import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * PastureManager.java
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

public class PastureManager {
   ArrayList<GameElements.SlotPosition> pasturedSlots;
   ArrayList<Pasture> pastures;

   // cant think of any other way - I'm going to maintain every possible
   // fence on the map and mark them on or off.
   ArrayList<Fence> fences;

   public PastureManager() {
      pastures = new ArrayList<Pasture>();
      pasturedSlots = new ArrayList<GameElements.SlotPosition>();
      fences = new ArrayList<Fence>();
   }

   public boolean CanBuildStable( GameElements.SlotPosition slot,
                                  boolean build ) {
      if (pasturedSlots.contains( slot )) {
         // find that pasture!
         Pasture currentPasture = pastures.stream()
                  .filter( pasture -> pasture.pastureSlots.contains( slot ) )
                  .collect( Collectors.toList() ).get( 0 );
         if (currentPasture != null) {
            PastureSlot ps = currentPasture.pastureSlots.stream()
                     .filter( s -> s.position == slot && s.hasStable )
                     .collect( Collectors.toList() ).get( 0 );
            if (ps != null) {
               if (build) {
                  ps.hasStable = true;
               }
               return true;
            }
         }
         return false;
      }
      // if we're here, then we're being asked about a slot that the
      // PastureManager isnt aware about
      return true;
   }

   public int BuildStable( GameElements.SlotPosition slot ) {
      if (pasturedSlots.contains( slot )) {
         // find that pasture!
         if (CanBuildStable( slot, true )) {
            return 1;
         }
      } else {
         Pasture newPasture = new Pasture( slot );
         newPasture.hasStable = true;
         newPasture.capacity = 1;
         pastures.add( newPasture );
         pasturedSlots.add( slot );
      }
   }

   /**
    * All right this looks like the best bet
    * I'm gonna go with a floodfill algo that checks all slots that are 
    * not of type room or field
    */
   public void BuildFences(ArrayList<Fence> newFences)
       {
           if (fences.Count == 0)
           {
               Pasture p = new Pasture();
               newFences.ForEach(delegate (Fence f)
               {
                   if (f.slotBefore == SlotPosition.None && p.slots.Find(s => s == f.slotAfter) == SlotPosition.None)
                   {
                       p.slots.Add(f.slotAfter);
                   }
                   else p.slots.Add(f.slotBefore);
               });
           }
        }

}
