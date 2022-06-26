package supermark.code;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Factura extends Comprobante{
		private String nombreEmp;
		private String cuitEmp;
		private Hora hora;
		private TransferenciaB pago;
		
		public String getNombreEmp() {
			return nombreEmp;
		}
		public void setNombreEmp(String nombreEmp) {
			this.nombreEmp = nombreEmp;
		}
		public String getCuitEmp() {
			return cuitEmp;
		}
		public void setCuitEmp(String cuitEmp) {
			this.cuitEmp = cuitEmp;
		}
		public Hora getHora() {
			return hora;
		}
		public void setHora(Hora hora) {
			this.hora = hora;
		}
		public TransferenciaB getPago() {
			return pago;
		}
		public void setPago(TransferenciaB pago) {
			this.pago = pago;
		}
		public Factura(String nombreEmp, String cuitEmp, Hora hora, TransferenciaB pago,Integer id,Float total,Character tipo,Date fecha,HashMap<Integer, Detalle> detalles,Usuario destinatario) {
			super(id, total, tipo, fecha, detalles, destinatario);
			this.nombreEmp = nombreEmp;
			this.cuitEmp = cuitEmp;
			this.hora = hora;
			this.pago = pago;
		}
	
}
