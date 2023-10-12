package ar.edu.unq.enumerativosYstreams.secretariaDeportes;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecretariaDeDeportes {

	private List<ActividadSemanal> actividades;
	
	
	
	public SecretariaDeDeportes(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}

	public int getCantActividades() {
		return this.actividades.size();
	}


	public void agregarActividad(ActividadSemanal actividad) {
	        actividades.add(actividad);
	    }

	//Todas las actividades de FUTBOL. Devuelve List<ActividadSemanal>
	public List<ActividadSemanal> todasFutbol() {
		return this.actividades.stream().filter(a -> a.getDeporte().equals(Deporte.FUTBOL)).toList();
	}

	//Todas las actividades de una complejidad recibida como parámetro. 
	//Devuelve List<ActividadSemanal>
	public List<ActividadSemanal> actividadesComplejidad(int i) {
		
		return this.actividades.stream().filter(a -> a.getDeporte().getComplejidad() == i).toList();
	}

	public int cantTotalHoras() {

		return this.actividades.stream().mapToInt(a -> a.getDuracionHoras())
				.sum();
		
	}

	public ActividadSemanal ActividadMenorCosto(Deporte d) {
		
		Optional<ActividadSemanal> actividadEncontrada = this.actividades.stream().filter(a -> a.getDeporte() == d)
								.min(Comparator.comparing(a -> a.costo()));
		return actividadEncontrada.orElse(null);
	}
	
	public Map<Deporte, ActividadSemanal> encontrarActividadesMasEconomicas() {
	        return actividades.stream()
	                .collect(Collectors.groupingBy(
	                        ActividadSemanal::getDeporte,
	                        Collectors.minBy(Comparator.comparing(ActividadSemanal::costo))
	                ))
	                .values()
	                .stream()
	                .filter(Optional::isPresent)
	                .collect(Collectors.toMap(
	                        actividad -> actividad.get().getDeporte(),
	                        Optional::get
	                ));
	    }


	public void printActividades() {
		this.actividades.stream().forEach(actividad -> System.out.println(actividad.toString()));
	}
}

