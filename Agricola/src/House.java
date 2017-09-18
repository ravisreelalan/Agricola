import java.util.ArrayList;

/**
 * House.java
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
public class House {
   Room[] roomPositions;
   int rooms = 0;
   int liveStockInHouse = 0;
   int maxLiveStockInHouse = 0;
   int villagers = 0;
   GameElements.RoomType type = GameElements.RoomType.Wood;

   public House() {
      positions = new ArrayList<GameElements.SlotPosition>();
      positions.add( GameElements.SlotPosition.A2 );
      positions.add( GameElements.SlotPosition.A3 );
      rooms = 2;
      liveStockInHouse = 0;
      maxLiveStockInHouse = 1;
      villagers = 2;
      type = GameElements.RoomType.Wood;
   }

   public void AddRoom() {
      rooms++;
   }

   public void UpgradeHouse () throws Exception {
      if (type == GameElements.RoomType.Stone)
         throw new Exception();
      type.next();
   }
}