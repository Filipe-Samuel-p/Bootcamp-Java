package sintaxeAndLogic.estruturaSequencial;

//Prof - Ausberto S. Castro Vera
// UENF - CCT - LCMAT - Ciencia da computacao
//Aluno: Filipe Samuel Pires Dos Santos

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Docente extends Pessoa {
    String disciplina;

    Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    void ministrarAula() {
        System.out.println("Bom dia turma");
    }

    void avaliarAluno() {
        System.out.println("Bom aluno, boas notas");
    }
}