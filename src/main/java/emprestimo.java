import java.time.LocalDate;

public class emprestimo {
    private String titulo;
    private String nomeCompletoFuncionario;
    private String nomeCompletoCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public emprestimo(String titulo, String nomeCompletoFuncionario, String nomeCompletoCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.titulo = titulo;
        this.nomeCompletoFuncionario = nomeCompletoFuncionario;
        this.nomeCompletoCliente = nomeCompletoCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeCompletoFuncionario() {
        return nomeCompletoFuncionario;
    }

    public void setNomeCompletoFuncionario(String nomeCompletoFuncionario) {
        this.nomeCompletoFuncionario = nomeCompletoFuncionario;
    }

    public String getNomeCompletoCliente() {
        return nomeCompletoCliente;
    }

    public void setNomeCompletoCliente(String nomeCompletoCliente) {
        this.nomeCompletoCliente = nomeCompletoCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "\n Empréstimo { " +
                "titulo: " + titulo +
                ", Nome do Funcionario: " + nomeCompletoFuncionario +
                ", Nome do Cliente: " + nomeCompletoCliente +
                ", Data do empréstimo: " + dataEmprestimo +
                ", Data de devolução: " + dataDevolucao +
                '}';
    }
}
