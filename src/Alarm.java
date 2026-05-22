public class Alarm {
    // Atributos privados
    private int hour;
    private int minute;
    private String category;
    private boolean isActive;
    private boolean hasMathChallenge;
    private String daysOfWeek;

    // Constructor
    public Alarm(int hour, int minute, String category) {
        this.hour = hour;
        this.minute = minute;
        this.category = category;
        this.isActive = true; 
        this.hasMathChallenge = false; 
        this.daysOfWeek = "LMXJVSD"; 
    }

    public void printAlarmInfo() {
        String time = String.format("%02d:%02d", hour, minute);
        System.out.println("⏰ Alarma [" + category + "] configurada a las " + time + " | Activa: " + isActive);
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setMathChallenge(boolean mathChallenge) {
        this.hasMathChallenge = mathChallenge;
    }

    public boolean hasMathChallenge() {
        return hasMathChallenge;
    }

    // --- MÉTODOS NUEVOS PARA QUE EL MANAGER PUEDA LEER LOS DATOS ---
    
    // Método para comprobar si coincide la hora
    public boolean isTimeToRing(int currentHour, int currentMinute) {
        return this.hour == currentHour && this.minute == currentMinute;
    }

    // Método para obtener el nombre de la categoría
    public String getCategory() {
        return this.category;
    }
}