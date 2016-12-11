/*
  Teste
  by JBarbosa
 */

int LED = 13;
int TEMPO = 1000;

void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {
  digitalWrite(LED, HIGH);
  delay(TEMPO);
  digitalWrite(LED, LOW);
  delay(TEMPO);
}
