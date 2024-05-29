package examen;
/**
 * @author Isaac
 * @version 1.0
 * 
 * 
 * Al poner una hora en esta clase, te dice si es correcta
 */
public class Hora {
	public static boolean horaValida = true;
/**
 * Introduces los segundos, minutos y horas y si todo está dentro de los requisitos, te devuelve un "true", si no pues un "false"
 * @param segundos
 * @param minutos
 * @param horas
 * @return
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}