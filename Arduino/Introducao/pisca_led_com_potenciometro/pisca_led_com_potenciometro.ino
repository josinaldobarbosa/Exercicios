/*
  Pisca o led com potenciometro
  by: JBarbosa
*/

const int POTENCIOMETRO = A0;
const int LED = 11;
int valorPotencia = 0;

void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {

  valorPotencia = analogRead(POTENCIOMETRO);
  digitalWrite(LED, HIGH);
  delay(valorPotencia);
  digitalWrite(LED, LOW);
  delay(valorPotencia);

}
