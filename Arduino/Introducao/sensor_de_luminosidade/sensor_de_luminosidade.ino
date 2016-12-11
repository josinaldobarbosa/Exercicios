/*
  Sensor de luminosidade com led
  by: JBarbosa
*/

//OBS: calibrar antes o sensor
//OBS: colocar uma media
const int ESCURO = 10;

const int LDR = 0;
const int LED = 6;

int valorLido = 0;
int pwm = 0;

void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {
  valorLido = analogRead(LDR);

  if (valorLido <= ESCURO) {
    analogWrite(LED, pwm);
    pwm++;
    delay(100);
  } else {
    digitalWrite(LED, LOW);
    pwm = 0;
  }

  if (pwm > 255) {
    pwm = 255;
  }
}
