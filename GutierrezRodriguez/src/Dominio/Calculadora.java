
package Dominio;
import Interfaz.ICalculadora;


public class Calculadora implements ICalculadora {
	public int suma (int i, int j){
	 	return i+j;
	}
	public int resta (int i,int j){
		return i-j;
	}
	public int producto(int i, int j) {
			return i*j;
	}
	public int  division (int  i,int j){
		return i/j;
	}

  




}
