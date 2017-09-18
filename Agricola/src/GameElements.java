/**
 * GameElements.java
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
public class GameElements {
   public static enum PlayerColor {
      Red, Blue, Black, White, Green, Yellow;
      private static PlayerColor[] vals = values();
      public PlayerColor next()
      {
          return vals[(this.ordinal()+1) % vals.length];
      }
   }

   public static enum RoomType {
      Wood, Clay, Stone;      
      private static RoomType[] vals = values();
      public RoomType next()
      {
          return vals[(this.ordinal()+1) % vals.length];
      }
   }

   public static enum SlotPosition {
      None, A1, B1, C1, D1, E1, A2, B2, C2, D2, E2, A3, B3, C3, D3, E3;
      
   }
   
   public static enum SlotType{
      Vacant, Room, Field, Pasture
   }

   public static enum Resources {
      Food, Wood, Stone, Reed;
   }

   public static enum LiveStock {
      None, Sheep, Pig, Cow;
   }
}
