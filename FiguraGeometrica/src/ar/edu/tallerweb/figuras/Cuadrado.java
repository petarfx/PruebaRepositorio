package ar.edu.tallerweb.figuras;

public class Cuadrado {

	private float lado;
	private float perimetro;
	private float area;
	
	public float calculaPerimetro(){
		perimetro = (float) (4 * lado);
		return perimetro;
	}
	
	public float calculaArea(){
		area = (float) (lado * lado);
		return area;
	}
	
	public float devuelvePerimetro(){
		return perimetro;
	}
	
	public float devuelveArea(){
		return area;
	}
	
	public Cuadrado(Integer lado){
		this.lado = lado;
	}
}

