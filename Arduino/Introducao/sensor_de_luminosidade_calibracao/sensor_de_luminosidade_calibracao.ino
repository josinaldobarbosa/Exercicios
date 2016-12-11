/*
  Calibrando sensor de luminosidade
  by: JBarbosa
*/

const int LDR = 0;
int valorLido = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  valorLido = analogRead(LDR);
  Serial.print("valor lido pelo LDR = ");
  Serial.println(valorLido);
  delay(500);
}
