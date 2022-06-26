package supermark.code;

import java.sql.Date;
import java.util.HashMap;

public class Remito extends Comprobante{
	private boolean pagado;
	private boolean entregado;
	
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	public Remito(boolean pagado, boolean entregado,Integer id,Float total,Character tipo,Date fecha,HashMap<Integer, Detalle> detalles,Usuario destinatario) {
		super(id, total, tipo, fecha, detalles, destinatario);
		this.pagado = pagado;
		this.entregado = entregado;
	}
}
