import java.util.ArrayList;

/**
 * Logic.java
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




public class FieldManager {
   ArrayList<Field> fields;

   public FieldManager() {
      fields = new ArrayList<Field>();
   }

   public void AddField( GameElements.SlotPosition position ) {
      fields.add( new Field( position ) );
   }
}

[Authorize]

public class HomeController:Controller
{

   public ActionResult Index() {
      return View();
   }
}

public class GameRoomManager {
   public void AddToGameRoom( User user ) {

   }

   public void StartGame( User[] users ) {

   }
}

public class ActionType {

}

public class Action {
   String Name;
   ActionType type;
}



