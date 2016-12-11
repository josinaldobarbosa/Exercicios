/*
  Projeto Alarme Multipropósito
  by: JBarbosa
*/

#define SIZEARRAY(x)  (sizeof(x) / sizeof((x)[0])) // serve para saber o tamanho do array

const int LED[] = {5, 6, 7, 8, 9, 10, 11};
const int LDR = 0;
const int LM35 = 1;
const int BUZZER = 2;

int valorLDR = 0;
int ADClido = 0;
float temperatura = 0;
int pwm = 0;

void setup() {
  for (int i = 0; i < SIZEARRAY(LED); i++) {
    pinMode(LED[i], OUTPUT);
  }
  pinMode(BUZZER, OUTPUT);
}

void loop() {
  valorLDR = analogRead(LDR);
  ADClido = analogRead(LM35);
  temperatura = ADClido * 0.4887585532;

  checkTemperatura(LED[0], 20.00);
  checkTemperatura(LED[1], 24.00);
  checkTemperatura(LED[2], 26.00);

  checkLDR(LED[5], 100);
  checkLDR(LED[4], 200);
  
  if (valorLDR > 350) {
    digitalWrite(LED[3], HIGH);
    digitalWrite(LED[6], LOW);
    digitalWrite(BUZZER, LOW);
  } else {
    digitalWrite(LED[3], LOW);
    digitalWrite(LED[6], HIGH);
    digitalWrite(BUZZER, HIGH);
  }

}

void checkTemperatura(int led, float valor) {
  if (temperatura > valor) {
    digitalWrite(led, HIGH);
  } else {
    digitalWrite(led, LOW);
  }
}

void checkLDR(int led, int valor) {
  if (valorLDR > valor) {
    digitalWrite(led, HIGH);
  } else {
    digitalWrite(led, LOW);
  }
}
