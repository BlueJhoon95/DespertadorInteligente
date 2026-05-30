public class Alarm {
    private int hour;
    private int minute;
    private String category;
    private boolean isActive;
    private boolean hasMathChallenge;
    private String daysOfWeek;
    private String sound;
    private int volume;

    public Alarm(int hour, int minute, String category) {
        this(hour, minute, category, "LMXJVSD");
    }

    public Alarm(int hour, int minute, String category, String daysOfWeek) {
        this.hour = hour;
        this.minute = minute;
        this.category = category;
        this.isActive = true;
        this.hasMathChallenge = false;
        this.daysOfWeek = daysOfWeek != null ? daysOfWeek.toUpperCase() : "LMXJVSD";
        this.sound = "Default";
        this.volume = 5;
    }

    public void printAlarmInfo() {
        String time = String.format("%02d:%02d", hour, minute);
        System.out.println("⏰ Alarma [" + category + "] configurada a las " + time + " | Días: " + daysOfWeek + " | Activa: " + isActive);
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek != null ? daysOfWeek.toUpperCase() : this.daysOfWeek;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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

    // --- ESTOS SON LOS MÉTODOS QUE SE HABÍAN BORRADO ---
    
    public boolean isTimeToRing(int currentHour, int currentMinute) {
        return this.hour == currentHour && this.minute == currentMinute;
    }

    public boolean isTimeToRing(String currentDayOfWeek, int currentHour, int currentMinute) {
        if (currentDayOfWeek == null || currentDayOfWeek.isEmpty()) {
            return isTimeToRing(currentHour, currentMinute);
        }
        String day = currentDayOfWeek.trim().substring(0, 1).toUpperCase();
        return this.hour == currentHour && this.minute == currentMinute && this.daysOfWeek.contains(day);
    }

    public void snooze() {
        snooze(10);
    }

    public void snooze(int minutesToSnooze) {
        int totalMinutes = this.hour * 60 + this.minute + minutesToSnooze;
        this.hour = (totalMinutes / 60) % 24;
        this.minute = totalMinutes % 60;
        System.out.println("💤 Alarma '" + category + "' aplazada " + minutesToSnooze + " minutos. Nueva hora: " + String.format("%02d:%02d", hour, minute));
    }

    public String getCategory() {
        return this.category;
    }
}