public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO DESPERTADOR INTELIGENTE ---");

        AlarmManager manager = new AlarmManager();

        Alarm alarmaEstudio = new Alarm(16, 0, "Estudiar Programación", "LMXJVSD");
        alarmaEstudio.setMathChallenge(true);
        manager.addAlarm(alarmaEstudio);

        manager.checkAlarms("X", 16, 0);

        System.out.println("\n[Usuario intenta detener la alarma...]");
        
        if (alarmaEstudio.hasMathChallenge()) {
            MathChallenge reto = new MathChallenge();
            reto.generateChallenge();
            
            System.out.println("\n-> Usuario responde: 5");
            boolean apagada = reto.checkAnswer(5);
            
            if (!apagada) {
                int respuestaCorrecta = reto.getCorrectAnswer();
                System.out.println("\n-> Usuario responde: " + respuestaCorrecta);
                
                if (reto.checkAnswer(respuestaCorrecta)) {
                    alarmaEstudio.setActive(false); 
                }
            }
        }
        
        System.out.println("\n--- FIN DEL PROGRAMA ---");
    }
}