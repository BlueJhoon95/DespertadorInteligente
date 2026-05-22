public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO DESPERTADOR INTELIGENTE ---");

        // 1. Simular Caso de Uso: Crear Alarma
        // Creamos una alarma para las 07:30 de la categoría "Trabajo"
        Alarm miAlarma = new Alarm(7, 30, "Trabajo");

        // 2. Mostrar la información por pantalla
        miAlarma.printAlarmInfo();

        // 3. Simular Caso de Uso: Activar/Desactivar alarma
        System.out.println("\n[Usuario desactiva la alarma por festivo...]");
        miAlarma.setActive(false);
        miAlarma.printAlarmInfo();
    }
}