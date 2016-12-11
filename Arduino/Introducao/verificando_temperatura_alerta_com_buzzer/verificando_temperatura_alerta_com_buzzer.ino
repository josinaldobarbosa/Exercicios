/*
  Medindo temperatura com sensor LM35 e um buzzer de alerta
  by: JBarbosa
*/

const int LM35 = 0;
const int BUZZER = 12;

const float ALERT_TEMP = 25;
float temperatura = 0;
int ADClido = 0;

void setup() {
  Serial.begin(9600); // através do cabo USB AB você vai ler ou escrever valores no mundo externo.
  analogReference(INTERNAL); // referência das portas analógicas para passar a referência de 5V para 1,1V.
  pinMode(BUZZER, OUTPUT);
}

void loop() {

  ADClido = analogRead(LM35);
  temperatura = ADClido * 0.1075268817;

  if (temperatura > ALERT_TEMP) {
    digitalWrite(BUZZER, HIGH);
  } else {
    digitalWrite(BUZZER, LOW);
  }
  
}
