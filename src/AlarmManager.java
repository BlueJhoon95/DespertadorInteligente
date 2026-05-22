import java.util.ArrayList;
import java.util.List;

public class AlarmManager {
    private List<Alarm> alarms; // La lista de alarmas guardadas
    private boolean vacationMode; // Nuestro interruptor de vacaciones

    // Constructor
    public AlarmManager() {
        this.alarms = new ArrayList<>();
        this.vacationMode = false; // Por defecto no estamos de vacaciones
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println("✅ Alarma de '" + alarm.getCategory() + "' añadida al gestor.");
    }

    public void setVacationMode(boolean active) {
        this.vacationMode = active;
        if (active) {
            System.out.println("\n🌴 MODO VACACIONES ACTIVADO. Nada sonará.");
        } else {
            System.out.println("\n💼 MODO VACACIONES DESACTIVADO. Alarmas normales.");
        }
    }

    // El Reloj Interno llama a este método para comprobar las alarmas
    public void checkAlarms(int currentHour, int currentMinute) {
        System.out.println("\n⏳ Comprobando alarmas para las " + String.format("%02d:%02d", currentHour, currentMinute) + "...");
        
        // ¡Aquí entra la Funcionalidad Avanzada 1!
        if (vacationMode) {
            System.out.println("😴 Zzz... El modo vacaciones está activo. Se ignoran todas las alarmas.");
            return; // Corta la ejecución de la función, ninguna alarma sonará
        }

        boolean algunaSono = false;
        for (Alarm alarm : alarms) {
            if (alarm.isActive() && alarm.isTimeToRing(currentHour, currentMinute)) {
                System.out.println("🔔 ¡RIIING! Sonando la alarma de: " + alarm.getCategory());
                algunaSono = true;
            }
        }
        
        if (!algunaSono) {
            System.out.println("🔇 Ninguna alarma programada para esta hora.");
        }
    }
}