package model;
import model.FormaGalaxia;

public class Galaxia {

	private String nombre;

	private FormaGalaxia forma;

	private double distanciaTierra;

	public Galaxia(String name, FormaGalaxia form, double distance) {

		nombre = name;
		forma = form;
		distanciaTierra = distance;

	}

	public FormaGalaxia getFormaGalaxia() {
		return forma;
	}

}