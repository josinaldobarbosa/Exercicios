int LED = 13;

void setup() {
  Serial.begin(9600);
  pinMode(LED, OUTPUT);
}

void loop() {
  boolean estado = digitalRead(LED);
  
  Serial.println(estado);
  
  if (estado) {
    digitalWrite(LED, false);
  } else {
    digitalWrite(LED, true);
  }
  
  delay(1000);
}
