/* 
  Acende 3 leds com 3 botoes
  by: JBarbosa
*/

const int LED_VERDE    = 10;
const int LED_AMARELO  = 11;
const int LED_VERMELHO = 12;

const int BOTAO_VERDE    = 2;
const int BOTAO_AMARELHO = 3;
const int BOTAO_VERMELHO = 4;

const int BUZZER = 13;

void setup() {
  pinMode(LED_VERDE, OUTPUT);
  pinMode(LED_AMARELO, OUTPUT);
  pinMode(LED_VERMELHO, OUTPUT);

  pinMode(BOTAO_VERDE, INPUT);
  pinMode(BOTAO_AMARELHO, INPUT);
  pinMode(BOTAO_VERMELHO, INPUT);

  pinMode(BUZZER, OUTPUT);
}

void loop() {
   check_state(LED_VERDE   , BOTAO_VERDE    , 100);
   check_state(LED_AMARELO , BOTAO_AMARELHO , 200);
   check_state(LED_VERMELHO, BOTAO_VERMELHO , 500);
}

void check_state(int led, int botao, int tempoTom) {
  int is_pressed = digitalRead(botao);
  if (is_pressed) {
    digitalWrite(led, HIGH);
    
    digitalWrite(BUZZER, HIGH);
    delayMicroseconds(tempoTom);
    digitalWrite(BUZZER, LOW);
  } else {
    digitalWrite(led, LOW);
  }
}
