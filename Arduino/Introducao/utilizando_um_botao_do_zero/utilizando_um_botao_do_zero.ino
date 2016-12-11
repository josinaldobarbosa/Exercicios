int LED = 8;
int BOTAO = 12;
int ESTADO_BOTAO = 0;

void setup() {
  pinMode(LED, OUTPUT);
  pinMode(BOTAO, INPUT);  
}

void loop() {
  ESTADO_BOTAO = digitalRead(BOTAO);

  if (ESTADO_BOTAO == HIGH) {
    digitalWrite(LED, HIGH);
  } else {
    digitalWrite(LED, LOW);
  }
}
