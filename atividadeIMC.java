void main() {
    IO.println("Cálculo de IMC");
    String nome = IO.readln("Qual seu nome? ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar)").charAt(0);
    String alturaString = IO.readln("Qual sua altura (em metros)? ");
    Double altura = Double.parseDouble(alturaString);
    String pesoString = IO.readln("Qual seu peso (em Kg)? ");
    Double peso = Double.parseDouble(pesoString);
    Double imc = peso / altura * altura;
}
