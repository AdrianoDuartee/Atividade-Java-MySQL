public class funcionario {
    private String nomeCompletoFuncionario;
    private String email;

    private String dataNasc;

    public funcionario(String nomeCompletoFuncionario, String email, String dataNasc) {

        this.nomeCompletoFuncionario = nomeCompletoFuncionario;
        this.email = email;
        this.dataNasc = dataNasc;
    }

    public String getNomeCompletoFuncionario() {
        return nomeCompletoFuncionario;
    }

    public void setNomeCompletoFuncionario(String nomeCompletoFuncionario) {
        this.nomeCompletoFuncionario = nomeCompletoFuncionario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "\n Funcionario {" +
                ", Nome Completo:'" + nomeCompletoFuncionario + '\'' +
                ", email: '" + email + '\'' +
                ", data de Nascimento: " + dataNasc +
                '}';
    }
}
