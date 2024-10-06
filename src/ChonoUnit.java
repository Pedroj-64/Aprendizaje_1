import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ChonoUnit {
    /**
     * La Clase propia de java ChronoUnit tiene diferentes funciones. Veamos algunas de las más útiles:
     * 
     * - ChronoUnit.DAYS.between(fechita, fechitaFinal): Calcula la diferencia en días entre dos fechas.
     * - ChronoUnit.MONTHS.between(fechita, fechitaFinal): Calcula la diferencia en meses entre dos fechas.
     * - ChronoUnit.YEARS.between(fechita, fechitaFinal): Calcula la diferencia en años entre dos fechas.
     * - ChronoUnit.WEEKS.between(fechita, fechitaFinal): Calcula la diferencia en semanas entre dos fechas.
     * - ChronoUnit.HOURS.between(fechita, fechitaFinal): Calcula la diferencia en horas entre dos fechas.
     * - ChronoUnit.MINUTES.between(fechita, fechitaFinal): Calcula la diferencia en minutos entre dos fechas.
     * - ChronoUnit.SECONDS.between(fechita, fechitaFinal): Calcula la diferencia en segundos entre dos fechas.
     * 
     * Esta clase puede usarse para medir la cantidad de tiempo entre dos fechas en diversas unidades de tiempo.
     */
    LocalDate fechita;
    LocalDate fechitaFinal;

    public ChonoUnit(LocalDate fechita, LocalDate fechitaFinal) {
        this.fechita = fechita;
        this.fechitaFinal = fechitaFinal;
    }

    public void practicandoAndo() {
        // Calcula la diferencia en días entre fechita y fechitaFinal
        long diasDiferencia = ChronoUnit.DAYS.between(fechita, fechitaFinal);
        System.out.println("Días de diferencia: " + diasDiferencia);

        // Calcula la diferencia en meses entre fechita y fechitaFinal
        long mesesDiferencia = ChronoUnit.MONTHS.between(fechita, fechitaFinal);
        System.out.println("Meses de diferencia: " + mesesDiferencia);

        // Calcula la diferencia en años entre fechita y fechitaFinal
        long añosDiferencia = ChronoUnit.YEARS.between(fechita, fechitaFinal);
        System.out.println("Años de diferencia: " + añosDiferencia);

        // Calcula la diferencia en semanas entre fechita y fechitaFinal
        long semanasDiferencia = ChronoUnit.WEEKS.between(fechita, fechitaFinal);
        System.out.println("Semanas de diferencia: " + semanasDiferencia);

        // Calcula la diferencia en horas entre fechita y fechitaFinal
        long horasDiferencia = ChronoUnit.HOURS.between(fechita.atStartOfDay(), fechitaFinal.atStartOfDay());
        System.out.println("Horas de diferencia: " + horasDiferencia);

        // Calcula la diferencia en minutos entre fechita y fechitaFinal
        long minutosDiferencia = ChronoUnit.MINUTES.between(fechita.atStartOfDay(), fechitaFinal.atStartOfDay());
        System.out.println("Minutos de diferencia: " + minutosDiferencia);

        // Calcula la diferencia en segundos entre fechita y fechitaFinal
        long segundosDiferencia = ChronoUnit.SECONDS.between(fechita.atStartOfDay(), fechitaFinal.atStartOfDay());
        System.out.println("Segundos de diferencia: " + segundosDiferencia);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        LocalDate start = LocalDate.of(2022, 1, 1);
        LocalDate end = LocalDate.of(2023, 1, 1);

        ChonoUnit ejemplo = new ChonoUnit(start, end);
        ejemplo.practicandoAndo();
    }
}
