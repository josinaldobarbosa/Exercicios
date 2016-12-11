/* 
  Acende 3 leds com 3 botoes
  by: JBarbosa
*/

int LED_VERDE    = 10;
int LED_AMARELO  = 11;
int LED_VERMELHO = 12;

int BOTAO_VERDE    = 2;
int BOTAO_AMARELHO = 3;
int BOTAO_VERMELHO = 4;

void setup() {
  pinMode(LED_VERDE, OUTPUT);
  pinMode(LED_AMARELO, OUTPUT);
  pinMode(LED_VERMELHO, OUTPUT);

  pinMode(BOTAO_VERDE, INPUT);
  pinMode(BOTAO_AMARELHO, INPUT);
  pinMode(BOTAO_VERMELHO, INPUT);
}

void loop() {
   check_state(LED_VERDE   , BOTAO_VERDE);
   check_state(LED_AMARELO , BOTAO_AMARELHO);
   check_state(LED_VERMELHO, BOTAO_VERMELHO);
}

void check_state(int led, int botao) {
  int is_pressed = digitalRead(botao);
  if (is_pressed) {
    digitalWrite(led, HIGH);
  } else {
    digitalWrite(led, LOW);
  }
}
