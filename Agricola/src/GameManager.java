/**
 * GameManager.java
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
public class GameManager {
   Game game;

   public void PlayerSetup() {
      for (int i = 0; i < game.players.length; i++) {
//         game.players[i].Initialize( GameElements.PlayerColor(i) );
      }
   }

   public void Collect() {
      for (int i = 0; i < game.players.length; i++) {
         game.players[i].Collect( game.currentRound );
      }
   }

   public void DrawRoundCard() throws Exception {
      if (game.currentRound == 1) {

      } else if (game.currentRound > 1 && game.currentRound <= 4) {

      } else if (game.currentRound > 4 && game.currentRound <= 7) {

      } else if (game.currentRound > 7 && game.currentRound <= 9) {

      } else if (game.currentRound > 9 && game.currentRound <= 11) {

      } else if (game.currentRound > 11 && game.currentRound <= 13) {

      } else if (game.currentRound == 14) {

      } else
         throw new Exception("Which round is this??");
   }

   public void Replenish() {

   }

   public void TakeActions() {

   }

   public void ReturnHome() {

   }

   public void Field() {

   }

   public void Feed() {

   }

   public void Breed() {

   }

   public void Harvest() {

   }

   public void StartNextTurn() {

   }

   public void Score() {

   }

   public void ScorePlayer( User user ) {

   }
}