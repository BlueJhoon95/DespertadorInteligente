
    public static void main(String[] args) {
        System.out.println("--- INICIANDO DESPERTADOR INTELIGENTE ---");

        // Creamos el cerebro del despertador
        AlarmManager manager = new AlarmManager();

        // Creamos un par de alarmas
        Alarm alarmaTrabajo = new Alarm(7, 30, "Trabajo");
        Alarm alarmaDeporte = new Alarm(18, 0, "Gimnasio");

        manager.addAlarm(alarmaTrabajo);
        manager.addAlarm(alarmaDeporte);

        // Simulamos que el reloj marca las 07:30
        manager.checkAlarms(7, 30);

        // Simulamos que nos vamos de viaje
        manager.setVacationMode(true);

        // Simulamos que el reloj marca las 18:00 (Hora del gimnasio)
        manager.checkAlarms(18, 0); 
    }
