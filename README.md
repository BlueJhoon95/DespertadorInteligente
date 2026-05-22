# ⏰ Despertador Inteligente

## 📖 Descripción
Este proyecto es un simulador de un Despertador Inteligente programado en Java. Permite gestionar múltiples alarmas, organizarlas y asegurarnos de que el usuario se despierte mediante retos interactivos. 

El proyecto se ha desarrollado siguiendo el flujo de trabajo profesional con Git y GitHub (Git Flow con ramas de funcionalidad y Pull Requests).

## 🚀 Instrucciones de compilación y ejecución
Para probar el programa desde la consola de comandos, sigue estos pasos:

1. Abre una terminal y navega hasta la carpeta raíz del proyecto.
2. Compila todos los archivos Java ejecutando el siguiente comando:
   `javac src/*.java`
3. Ejecuta la clase principal con el siguiente comando:
   `java -cp src Main`

## ✨ Funcionalidades Avanzadas Implementadas
Además de los atributos básicos (hora y minuto), se han implementado tres funcionalidades avanzadas en las clases `Alarm`, `AlarmManager` y `MathChallenge`:

1. **Categorías Personalizadas:** Cada alarma tiene un atributo `category` que permite identificar para qué es (ej. "Trabajo", "Gimnasio").
2. **Modo Vacaciones:** Un interruptor en `AlarmManager` que, al activarse, silencia automáticamente todas las alarmas programadas.
3. **Reto Matemático para Apagar:** Si una alarma tiene activado el reto, el usuario debe resolver una suma generada aleatoriamente (clase `MathChallenge`) antes de que la alarma se desactive. Si falla, sigue sonando.