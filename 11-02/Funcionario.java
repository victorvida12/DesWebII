public abstract class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public setNome(String nome) {
        this.nome = nome;
    }

    public setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        }
    }

    public setSalario(double salario) {
        if (salario >= 1621) {
            this.salario = salario;
        }
    }

    public void getNome() {
        return nome;
    }

    public void getCpf() {
        return nome;
    }

    public void getSalario() {
        return salario;
    }

    public abstract String getFuncao();
}