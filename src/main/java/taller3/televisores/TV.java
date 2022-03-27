package taller3.televisores;
public class TV {
	private Marca marca;
	public int canal;
	private int precio;
	public boolean estado;
	public int volumen;
	public Control control;
	private static int numTV=0;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		canal=1;
		volumen=1;
		precio=500;
		TV.numTV=TV.numTV+1;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;}
	public Marca getMarca() {
		return marca;}
	
	public void setControl(Control control) {
		this.control=control;}
	public Control getControl() {
		return control;}	
	
	public void setPrecio(int precio) {
		this.precio=precio;}
	public int getPrecio() {
		return precio;}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;}
	public int getVolumen() {
		return volumen;}
	
	public void setCanal(int canal) {
		this.canal=canal;}
	public int getCanal() {
		return canal;}
	
	public int getNumTV() {
		return numTV;}
	
	public void turnOn() {
		estado=true;}
	public void turnOff() {
		estado=false;}
	
	public boolean getEstado() {
		return estado;}
	public static void setNumTV(int numero) {
		TV.numTV=numero;
	}

	

}
