/*
  Medindo temperatura com sensor LM35, buzzer de alerta e uma barra gráfica
  by: JBarbosa
*/

#define SIZEARRAY(x)  (sizeof(x) / sizeof((x)[0])) // serve para saber o tamanho do array

const int LM35 = 0;
const int BUZZER = 12;

const float ALERT_TEMP = 25;
float temperatura = 0;
int ADClido = 0;

const int LED[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
const float TEMP[] = {23.50, 24.00, 24.50, 25.00, 25.50, 26.00, 26.50, 27.00, 27.50, 28.00};

void setup() {
  analogReference(INTERNAL);
  pinMode(BUZZER, OUTPUT);

  for (int i = 0; i < SIZEARRAY(LED); i++) {
    pinMode(LED[i], OUTPUT);
  }
}

void loop() {

  ADClido = analogRead(LM35);
  temperatura = ADClido * 0.1075268817;

  for (int i = 0; i < SIZEARRAY(LED); i++) {
    checkTemp(TEMP[i], LED[i]);
  }

  int lastTemp = TEMP[SIZEARRAY(TEMP) -1];
  if (temperatura > lastTemp) {
    digitalWrite(BUZZER, HIGH);
  } else {
    digitalWrite(BUZZER, LOW);
  }

}

void checkTemp(float temp_limit, int led) {
  if (temperatura > temp_limit) {
      digitalWrite(led, HIGH);
    } else {
      digitalWrite(led, LOW);
    }
}


