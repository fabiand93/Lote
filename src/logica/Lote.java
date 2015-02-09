package logica;
//Esta clase representa un lote.
	public class Lote { //El nombre de la clase
	    private float frente; //frente del lote
	    private float profundidad; //profundidad del lote
		private int calcularPostes;
		private float calcularAlambre;

	    //Constructor: cuando se cree un objeto lote se ejecutará el código que incluyamos en el constructor
	    public Lote (float frente, float profundidad) {
	        this.frente=frente;
	        this.profundidad=profundidad;

	    } //Cierre del constructor … el código continúa …
	    //Método para establecer la profundidad del lote
	    public void setProfundidad (float valorProfundidad) {
	        profundidad = valorProfundidad; //La profundidad del objeto lote adopta el valor indicado
	    } //Cierre del método
	    //Método para obtener el diametro del objeto lote
	    public float getFrente () { return frente; } //Cierre del método
	    //Método para obtener la profundidad del objeto lote
	    public float getProfundidad () { return profundidad; } //Cierre del método

			//Metodo para calcular la cantidad de postes del lote + 1 de la puerta
				public int calcularPostes (float frente, float profundidad){
					this.calcularPostes= (int) ((frente*2 + profundidad*2)/2 +1 );
					return calcularPostes;
				}
			//Metodo para calcular la cantidad de alambre necesarion para el lote
				public float calcularAlambre (float frente, float profundidad){
					this.calcularAlambre = (frente*2 + profundidad*2);
					return (calcularAlambre);
				}
}
