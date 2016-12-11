/*
    Utilizando o mesmo circuito do exercício anterior, acenda todos os LEDs da
  barra gráfica em uma ordem e depois apague do último que foi aceso para o primeiro (o
  contrário do exercício anterior).
  by: JBarbosa
*/

const int LEDS[] = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
const int sizeLEDS = 10;

int ledSpeed = 50;

void setup() {
  for (int i = 0; i < sizeLEDS; i++) {
    pinMode(LEDS[i], OUTPUT);
  }
}

void loop() {
  for (int i = 0; i < sizeLEDS; i++) {
    digitalWrite(LEDS[i], HIGH);
    delay(ledSpeed);
  }

  for (int i = sizeLEDS; i >= 0; i--) {
    digitalWrite(LEDS[i], LOW);
    delay(ledSpeed);
  }
}
