/*
  Medindo temperatura com sensor LM35
  by: JBarbosa
*/

const int LM35 = 0;
float temperatura = 0;
int ADClido = 0;

void setup() {
  Serial.begin(9600); // através do cabo USB AB você vai ler ou escrever valores no mundo externo.
  analogReference(INTERNAL); // referência das portas analógicas para passar a referência de 5V para 1,1V.
}

void loop() {

  ADClido = analogRead(LM35);
  temperatura = ADClido * 0.1075268817;

  Serial.print("Temperatura = ");
  Serial.print(temperatura);
  Serial.println(" *C");
  delay(1000);
  
}
