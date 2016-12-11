/*
  Projeto Frequencimetro
  by: JBarbosa
*/

#include <LiquidCrystal.h>

int freq = 0;
int BOTAO1 = 8;
int BOTAO2 = 9;
int estadoBotao1 = 0;
int estadoBotao2 = 0;
int BUZZER = 6;
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

void setup() {
  lcd.begin(16, 2);
  lcd.setCursor(0,0);
  lcd.print("Frequencia = ");
  lcd.setCursor(6,1);
  lcd.print("Hz");

  pinMode(BOTAO1, OUTPUT);
  pinMode(BOTAO2, OUTPUT);
  pinMode(BUZZER, OUTPUT);
}

void loop() {

  estadoBotao1 = digitalRead(BOTAO1);
  estadoBotao2 = digitalRead(BOTAO2);

  if (estadoBotao1 == HIGH) {
    freq = freq + 100;
  }

  if (estadoBotao2 == HIGH) {
    freq = freq - 100;
  }

  if (freq <= 0) {
    freq = 0;
  }

  if (freq >= 20000) {
    freq = 20000;
  }

  if (freq <= 99) {
    lcd.setCursor(0,1);
    lcd.print(" ");
    lcd.setCursor(1,1);
    lcd.print(" ");
    lcd.setCursor(2,1);
    lcd.print(" ");
    lcd.setCursor(3,1);
  }

  if (freq >= 100) {
    lcd.setCursor(0,1);
    lcd.print(" ");
    lcd.setCursor(1,1);
    lcd.print(" ");
    lcd.setCursor(2,1);
  }

  if (freq >= 1000) {
    lcd.setCursor(0,1);
    lcd.print(" ");
    lcd.setCursor(1,1);
  }

  if (freq >= 10000) {
    lcd.setCursor(0,1);
  }

  lcd.print(freq);
  tone(BUZZER, freq);
  
  delay(100);
}
