//Esto lo sacamos con click derecho en el package, new, interface, el nombre de la interface es IVisualizable
package com.javram.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	Date startToSee(Date dateI);//El date que esta al inicio es el tipo de dato que va a retornar
	void stopToSee(Date dateI, Date dateF);//El void que esta al inicio es el tipo de dato que va a retornar
	
}
