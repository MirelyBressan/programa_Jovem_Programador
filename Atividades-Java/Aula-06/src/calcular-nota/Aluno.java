/**Classe Aluno:
Atributos: nome, nota1, nota2.
Método: calculaMedia() e opcionalmente verificaAprovacao(). */

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public double calculaMedia(){
        return (nota1 + nota2) /2;
    }

    public String verificaAprovacao(){
        if (calculaMedia() >= 7.0){
            return "Aluno Aprovado!";
        } else {
            return "Aluno Reprovado!";
        }
    }
    
}
