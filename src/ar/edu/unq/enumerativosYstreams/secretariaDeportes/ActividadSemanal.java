package ar.edu.unq.enumerativosYstreams.secretariaDeportes;

/*
 * De la actividad semanal se conoce el día de la semana, 
 * la hora de inicio, la duración y el
	deporte que se practica
 */
public class ActividadSemanal {

	private DiaDeLaSemana dia;
	private Deporte deporte;
	private int horaInicio;
	private int duracionHoras;
	public DiaDeLaSemana getDia() {
		return dia;
	}
	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}
	public Deporte getDeporte() {
		return deporte;
	}
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getDuracionHoras() {
		return duracionHoras;
	}
	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	public ActividadSemanal(DiaDeLaSemana dia, Deporte deporte, int horaInicio, int duracionHoras) {
		this.dia = dia;
		this.deporte = deporte;
		this.horaInicio = horaInicio;
		this.duracionHoras = duracionHoras;
	}

//	El costo de la actividadSemanal se rige por el siguiente algoritmo: De lunes 
//	a miércoles la
//	hora cuesta 500 pesos, y de jueves a domingos 1000 pesos. Cada punto de complejidad
//	agrega 200 pesos.
	public int costo() {
		int costoBase;
		
			if(this.getDia() == DiaDeLaSemana.LUNES || this.getDia() == DiaDeLaSemana.MARTES
					|| this.getDia() == DiaDeLaSemana.MIERCOLES) {
				costoBase =  500;
			}
			else {
				costoBase =  1000;
			}
		return (costoBase * this.duracionHoras) + (200 * this.getDeporte().getComplejidad());
	}
	@Override
	public String toString() {
		//“Deporte: FUTBOL. Dia: MARTES A LAS: 19 . Duración: 1 hora(s).”
		return "Deporte: " + this.getDeporte().name() + ". Dia: " + this.getDia().name() +
				" A LAS: " + this.getHoraInicio() + " Duracion: " + this.getDuracionHoras()
				+ " horas";
	}
	

}
