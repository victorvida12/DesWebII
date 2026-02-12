public class Gerente extends Funcionario  implements Autenticavel{
    private String senha = "123123";
    public String getFuncao() {
        return "Gerente";
    }

    @Override
    public boolean login(String senha)
}