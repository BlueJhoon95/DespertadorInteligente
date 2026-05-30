# ⏰ Despertador Inteligente

## 📖 Descripción
Despertador Inteligente es una aplicación de consola en Java que simula la gestión de alarmas personales. El proyecto permite crear alarmas con categoría, día de la semana, sonido y volumen, y ofrece funcionalidades como modo vacaciones, repetición "snooze" y retos matemáticos para desactivar alarmas.

## 🎯 Objetivos
- Crear una estructura sencilla para manejar alarmas en Java.
- Permitir la configuración de alarmas con días de la semana y atributos adicionales.
- Mostrar alarmas activas y detectar cuándo deben sonar según la hora y el día actual.
- Incluir funcionalidades extra como suspensión temporal (`snooze`) y desafíos matemáticos para apagar la alarma.

## 🛠️ Tecnologías
- Java 8+ (o compatible)
- Sin dependencias externas
- Organizado en las clases: `Alarm`, `AlarmManager`, `MathChallenge` y `Main`

## ⚙️ Instalación / Ejecución
1. Abre una terminal y navega hasta la carpeta raíz del proyecto.
2. Compila todos los archivos Java:
   `javac src/*.java`
3. Ejecuta el programa:
   `java -cp src Main`

> Nota: El proyecto se ejecuta desde la carpeta raíz del repositorio y asume que los archivos `.java` se encuentran en el subdirectorio `src/`.

## 📌 Estructura principal
- `src/Alarm.java` — modelo de alarma con hora, categoría, días de la semana, sonido, volumen y métodos como `snooze()`.
- `src/AlarmManager.java` — gestiona la lista de alarmas, comprueba alarmas activas y muestra las próximas alarmas.
- `src/MathChallenge.java` — genera un desafío matemático para apagar alarmas con reto activado.
- `src/Main.java` — clase principal de ejecución del programa.
