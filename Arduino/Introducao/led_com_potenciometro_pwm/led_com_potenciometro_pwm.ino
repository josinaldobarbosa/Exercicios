/*
  Led com potenciometro(PWM)
  by: JBarbosa
*/

const int POTENCIOMETRO = A0;
const int LED = 11;

int valorPotencia = 0;
int pwm = 0;

void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {
  valorPotencia = analogRead(POTENCIOMETRO);
  pwm = map(valorPotencia, 0, 1022, 0, 255); // coloquei 1022 no lugar de 1023, poque o potenciometro meio que estava oscilando refletindo visivelmente no led
  analogWrite(LED, pwm);
}
