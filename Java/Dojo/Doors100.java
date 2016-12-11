/**
 * 100 doors in a row are all initially closed. You make 100 passes by the
 * doors. The first time through, you visit every door and toggle the door (if
 * the door is closed, you open it; if it is open, you close it). The second
 * time you only visit every 2nd door (door #2, #4, #6, ...). The third time,
 * every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th
 * door.
 * 
 * Question: What state are the doors in after the last pass? Which are open,
 * which are closed?
 * 
 * [Source http://rosettacode.org]
 *
 */
public class Doors100 {

	public static void main(String[] args) {

		boolean doors[] = new boolean[100]; // começa por default falso

		// 1º
		for (int i = 0; i < doors.length; i++) {
			doors[i] = verificaDoor(doors[i]);
		}

		// 2º...
		for (int i = 1; i < doors.length; i++) {
			for (int j = i; j < doors.length; j += i) {
				doors[j] = verificaDoor(doors[j]);
			}
		}

		// Exibe
		for (int i = 0; i < doors.length; i++) {
			String status;

			if (doors[i]) {
				status = "aberto";
			} else {
				status = "fechado";
			}

			System.out.println((i + 1) + " - " + status);
		}

		/**
		 * Resposta: Ao finalizar a ultima passada, o código começa com um
		 * aberto seguido por um fechado, e o aberto vai crescendo de 2 em 2
		 * para um fechado.
		 * 
		 * */

	}

	// Inverte a porta para "aberto" ou "fechado"
	private static boolean verificaDoor(boolean porta) {
		if (porta == true) {
			return false;
		} else {
			return true;
		}
	}

}
