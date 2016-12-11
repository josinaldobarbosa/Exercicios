/*
    Utilizando o display de 7 segmentos, faça um dado de 6 números que mostra o
  valor quando você aperta um botão. (dica: pesquise no site do Arduino sobre a instrução
  random).
  by: JBarbosa
*/

const int A = 12;
const int B = 11;
const int C = 10;
const int D = 9;
const int E = 8;
const int F = 6;
const int G = 7;
const int DOT = 5;

const int CONTADOR_SIZE = 8;
const int BOTAO = 2;

void setup() {
  pinMode(BOTAO, INPUT);

  pinMode(A, OUTPUT);
  pinMode(B, OUTPUT);
  pinMode(C, OUTPUT);
  pinMode(D, OUTPUT);
  pinMode(E, OUTPUT);
  pinMode(F, OUTPUT);
  pinMode(G, OUTPUT);
  pinMode(DOT, OUTPUT);
}

void loop() {
  delay(150);

  if (digitalRead(BOTAO)) {

    PONTO();
    delay(1000);

    int valor = random(9);
    switch (valor) {
      case 0:
        ZERO();
        break;
      case 1:
        UM();
        break;
      case 2:
        DOIS();
        break;
      case 3:
        TREIS();
        break;
      case 4:
        QUATRO();
        break;
      case 5:
        CINCO();
        break;
      case 6:
        SEIS();
        break;
      case 7:
        SETE();
        break;
      case 8:
        OITO();
        break;
      case 9:
        NOVE();
        break;
    }
  }
}

// Sem lib para montar display
void clearContador() {
  digitalWrite(A, LOW);
  digitalWrite(B, LOW);
  digitalWrite(C, LOW);
  digitalWrite(D, LOW);
  digitalWrite(E, LOW);
  digitalWrite(F, LOW);
  digitalWrite(G, LOW);
  digitalWrite(DOT, LOW);
}

void PONTO() {
  clearContador();
  digitalWrite(DOT, HIGH);
}

void ZERO() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(E, HIGH);
  digitalWrite(F, HIGH);
}

void UM() {
  clearContador();
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
}

void DOIS() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(E, HIGH);
  digitalWrite(G, HIGH);
}

void TREIS() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(G, HIGH);
}

void QUATRO() {
  clearContador();
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}

void CINCO() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}

void SEIS() {
  clearContador();
  digitalWrite(C, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(E, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}

void SETE() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
}

void OITO() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(D, HIGH);
  digitalWrite(E, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}

void NOVE() {
  clearContador();
  digitalWrite(A, HIGH);
  digitalWrite(B, HIGH);
  digitalWrite(C, HIGH);
  digitalWrite(F, HIGH);
  digitalWrite(G, HIGH);
}
