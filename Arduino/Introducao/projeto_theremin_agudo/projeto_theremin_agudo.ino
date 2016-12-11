/*
 * Projeto Theremin agudo
 * by: JBarbosa
 */

const int BUZZER = 5;
const int LDR = A0;

int valorSensor = 0;
int nota = 0;

void setup() {}

void loop() {
  valorSensor = analogRead(LDR);
  nota = map(valorSensor, 1023, 0, 1000, 6000);
  tone(BUZZER, nota, 20);
  delay(10);
}
