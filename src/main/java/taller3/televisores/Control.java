package taller3.televisores;


public class Control {
	private TV tv;
	
	
	
	public void enlazar(TV tv) {
		this.tv=tv;
		this.tv.control=this;
	}
	
	public TV getTv() {
		return tv;}
	public void setTv(TV tv) {
		this.tv=tv;}
	
	public void turnOn() {
		this.tv.estado=true;}
	public void turnOff() {
		this.tv.estado=false;}
	
	public void canalUp() {
		if (tv.estado==true) {
			if (tv.canal<120) {
				tv.canal++;}
			return;}
		return;}
	
	public void canalDown() {
		if (tv.estado==true) {
			if (tv.canal>1) {
				tv.canal--;}
			return;}
		return;}
	
	public void volumenUp() {
		if (tv.estado==true) {
			if (tv.volumen<7) {
				tv.volumen++;}
			return;}
		return;}
	
	public void volumenDown() {
		if (tv.estado==true){
			if (tv.volumen>0) {
				tv.volumen--;}
			return;}
		return;}
	
	public void setCanal(int canal) {
		if (tv.estado==true) {
			if (tv.canal>=1||tv.canal<=120) {
				tv.canal=canal;}
			return;}
		return;}
	
	
	
	

}
	
	
