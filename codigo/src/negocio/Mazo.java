package negocio;

import java.util.ArrayList;

import views.MazoView;

public class Mazo {
	private ArrayList<Carta> cartasMazo;
	private int cantidad;
	

	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	
	public Mazo() {
		
	}

	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//

	public ArrayList<Carta> getCartasMazo() {
		return cartasMazo;
	}
	public void setCartasMazo(ArrayList<Carta> cartasMazo) {
		this.cartasMazo = cartasMazo;
	}

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public MazoView getView() {
		MazoView mazoView=new MazoView(cartasMazo, cantidad);
		return mazoView;
	}

}