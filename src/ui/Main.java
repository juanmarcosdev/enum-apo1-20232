package ui;
import model.Dia;
import model.FormaGalaxia;
import model.Galaxia;

public class Main {

	public static void main(String[] args) {

		Galaxia viaLactea = new Galaxia("Via Lactea", FormaGalaxia.ESPIRAL, 0.0);

		System.out.println(viaLactea.getFormaGalaxia().toString());


	}

}
