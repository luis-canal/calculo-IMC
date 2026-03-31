void main() {
    IO.println("Cálculo de IMC");
    String nome = IO.readln("Qual seu nome? ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar): ").charAt(0);
    String alturaString = IO.readln("Qual sua altura (em metros)? ");
    Double altura = Double.parseDouble(alturaString);
    String pesoString = IO.readln("Qual seu peso (em Kg)? ");
    Double peso = Double.parseDouble(pesoString);
    Double imc = peso / (altura * altura);
    String classificacao = "";

    switch (genero) {
        case 'm':
        case 'M':
            if (imc >= 40) 
                classificacao = "Obesidade mórbida";
            else if (imc>= 30)
                classificacao = "Obesidade moderada";
            else if (imc>= 25)
                classificacao = "Obesidade leve";
            else if (imc>= 20)
                classificacao = "Normal";
            else
                classificacao = "Abaixo do normal";
            break;
        case 'f':
        case 'F':
        case 'n':
        case 'N':
            if (imc >= 39) 
                classificacao = "Obesidade mórbida";
            else if (imc>= 29)
                classificacao = "Obesidade moderada";
            else if (imc>= 24)
                classificacao = "Obesidade leve";
            else if (imc>= 19)
                classificacao = "Normal";
            else
                classificacao = "Abaixo do normal";
            break;
    
        default:
            IO.println("Gênero inválido");
            break;
    }

    IO.println("\nNome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + imc);
    IO.println("Classificação: " + classificacao);
}
