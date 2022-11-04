public class cliente {
    private static String nomeCompletoCliente;
    private String cpf;
    private String email;

    public cliente(String nomeCompletoCliente, String cpf, String email) {

        this.nomeCompletoCliente = nomeCompletoCliente;
        this.cpf = cpf;
        this.email = email;

        if(nomeCompletoCliente.length() < 3) {
            System.out.println("Digite o nome completo");
        } else{
            this.nomeCompletoCliente = nomeCompletoCliente;
        }

        if(cpf.length() != 11) {
            System.out.println("Digite um número de CPF válido com 11 dígitos");
        } else {
            this.cpf = cpf;
        }
    }

    public static String getNomeCompletoCliente() {
        return nomeCompletoCliente;
    }

    public void setNomeCompletoCliente(String nomeCompletoCliente) {
        this.nomeCompletoCliente = nomeCompletoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n Cliente {" +
                ", Nome Completo:'" + nomeCompletoCliente + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", email: " + email +
                '}';
    }
}
