package Exercicio7_1;
/**
 * 
 * @author Leonardo Santiago Gon�alves 81612334 SI3AN-MCA
 * 			
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
