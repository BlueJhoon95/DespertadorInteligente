import java.util.ArrayList;
import java.util.List;

public class AlarmManager {
    private List<Alarm> alarms; 
    private boolean vacationMode; 

    public AlarmManager() {
        this.alarms = new ArrayList<>();
        this.vacationMode = false; 
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println("✅ Alarma de '" + alarm.getCategory() + "' añadida al gestor.");
    }

    public void removeAlarm(Alarm alarm) {
        if (alarms.remove(alarm)) {
            System.out.println("🗑️ Alarma de '" + alarm.getCategory() + "' eliminada del gestor.");
        } else {
            System.out.println("⚠️ No se encontró la alarma de '" + alarm.getCategory() + "' para eliminar.");
        }
    }

    public void setVacationMode(boolean active) {
        this.vacationMode = active;
        if (active) {
            System.out.println("\n🌴 MODO VACACIONES ACTIVADO. Nada sonará.");
        } else {
            System.out.println("\n💼 MODO VACACIONES DESACTIVADO. Alarmas normales.");
        }
    }

    public void checkAlarms(int currentHour, int currentMinute) {
        System.out.println("\n⏳ Comprobando alarmas para las " + String.format("%02d:%02d", currentHour, currentMinute) + "...");
        
        if (vacationMode) {
            System.out.println("😴 Zzz... El modo vacaciones está activo. Se ignoran todas las alarmas.");
            return; 
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

    public void checkAlarms(String currentDayOfWeek, int currentHour, int currentMinute) {
        System.out.println("\n⏳ Comprobando alarmas para " + currentDayOfWeek + " a las " + String.format("%02d:%02d", currentHour, currentMinute) + "...");
        
        if (vacationMode) {
            System.out.println("😴 Zzz... El modo vacaciones está activo. Se ignoran todas las alarmas.");
            return; 
        }

        boolean algunaSono = false;
        for (Alarm alarm : alarms) {
            if (alarm.isActive() && alarm.isTimeToRing(currentDayOfWeek, currentHour, currentMinute)) {
                System.out.println("🔔 ¡RIIING! Sonando la alarma de: " + alarm.getCategory());
                algunaSono = true;
            }
        }
        
        if (!algunaSono) {
            System.out.println("🔇 Ninguna alarma programada para esta hora.");
        }
    }

    public void showUpcomingAlarms() {
        System.out.println("\n📣 Alarmas activas:");
        boolean foundActive = false;
        for (Alarm alarm : alarms) {
            if (alarm.isActive()) {
                alarm.printAlarmInfo();
                foundActive = true;
            }
        }
        if (!foundActive) {
            System.out.println("🔕 No hay alarmas activas en la lista.");
        }
    }
}