package supermark.code;

public class Hora {
	private int hora;
	private int min;
	private int seg;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	public Hora(int hora, int min, int seg) {
		super();
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
}
