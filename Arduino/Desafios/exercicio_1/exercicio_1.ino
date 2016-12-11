/*
    Utilizando a barra gráfica de LEDs, faça um código com poucas linhas, no qual
  cada um dos LEDs é aceso em uma ordem, e depois eles são apagados um a um, na ordem
  que foram acesos. (dica: use a rotina condicional for).
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
  changeLed(HIGH);
  changeLed(LOW);
}

void changeLed(int ledStatus) {
  for (int i = 0; i < sizeLEDS; i++) {
    digitalWrite(LEDS[i], ledStatus);
    delay(ledSpeed);
  }
}
