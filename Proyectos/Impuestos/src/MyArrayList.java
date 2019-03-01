/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Gallegos
 */
import java.util.ArrayList;

@SuppressWarnings("serial")
public class MyArrayList extends ArrayList<Vehiculo> {

	public boolean add(Vehiculo vehiculo) {
		if(isRepetido(vehiculo)) {
			return false;
		}else {
			return super.add(vehiculo);
		}
	}
	
	private Boolean isRepetido(Vehiculo vehiculo) {
		boolean encontrado=false;
		int contador=0;
		while(!encontrado && contador < super.size()) {
			encontrado = this.get(contador).getPlaca()==vehiculo.getPlaca();
			contador++;
		}
		return encontrado;
	}
	
}
