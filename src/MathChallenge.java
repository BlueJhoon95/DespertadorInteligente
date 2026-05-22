import java.util.Random;

public class MathChallenge {
    private int num1;
    private int num2;
    private int correctAnswer;

    public MathChallenge() {
        Random random = new Random();
        this.num1 = random.nextInt(20) + 1; 
        this.num2 = random.nextInt(20) + 1; 
        this.correctAnswer = this.num1 + this.num2;
    }

    public void generateChallenge() {
        System.out.println("🧮 RETO MATEMÁTICO: Para detener la alarma, resuelve: " + num1 + " + " + num2);
    }

    public boolean checkAnswer(int userAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("✅ ¡Correcto (" + userAnswer + ")! Alarma apagada.");
            return true;
        } else {
            System.out.println("❌ ¡Error (" + userAnswer + ")! La alarma sigue sonando: ¡RIIING!");
            return false;
        }
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}