public class Alarm {
    // Atributos privados (Encapsulación, como pide el profesor)
    private int hour;
    private int minute;
    private String category;
    private boolean isActive;
    private boolean hasMathChallenge;
    private String daysOfWeek;

    // Constructor: lo que pide el sistema al crear una alarma nueva
    public Alarm(int hour, int minute, String category) {
        this.hour = hour;
        this.minute = minute;
        this.category = category;
        this.isActive = true; // Por defecto, al crearla se enciende
        this.hasMathChallenge = false; // Por defecto no hay reto matemático
        this.daysOfWeek = "LMXJVSD"; // Por defecto suena todos los días
    }

    // Método para imprimir la información por consola (ya que no hay interfaz gráfica)
    public void printAlarmInfo() {
        // Formateamos la hora para que salga con dos dígitos (ej. 08:05)
        String time = String.format("%02d:%02d", hour, minute);
        System.out.println("⏰ Alarma [" + category + "] configurada a las " + time + " | Activa: " + isActive);
    }

    // --- GETTERS Y SETTERS ---
    // Métodos públicos para poder modificar y leer los datos privados
    
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
}