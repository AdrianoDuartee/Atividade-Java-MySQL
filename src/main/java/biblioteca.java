import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class biblioteca {
    ArrayList<livro> listaLivros = new ArrayList<livro>();
    ArrayList<cliente> listaClientes = new ArrayList<cliente>();
    ArrayList<emprestimo> listagemEmprestimos = new ArrayList<emprestimo>();

    public ArrayList<livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public ArrayList<cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<emprestimo> getListagemEmprestimos() {
        return listagemEmprestimos;
    }

    public void setListagemEmprestimos(ArrayList<emprestimo> listagemEmprestimos) {
        this.listagemEmprestimos = listagemEmprestimos;
    }

    public void emprestimo(cliente Cliente, livro Livro){
        if (listaClientes.contains(Cliente)){
            if (listaLivros.contains(Livro)){
                listaLivros.remove(Livro);
                System.out.println("Empréstimo: " + livro.getTitulo() + ", ID Cliente: " + cliente.getNomeCompletoCliente());
            }else {
                System.out.println("Livro " + livro.getTitulo() + " indisponível no acervo");
            }
        }else {
            System.out.println("Cliente " + cliente.getNomeCompletoCliente() + " não cadastrado, faça o cadastro para prosseguir!");
        }
    }

    public void devolverLivro(livro Livro){
        if (listagemEmprestimos.contains(Livro)) {
            listagemEmprestimos.remove(Livro);
            listaLivros.add(Livro);
            System.out.println("FLivro " + livro.getTitulo() + " devolvido!");
        }else {
            System.out.println("O livro " + livro.getTitulo() + " não consta como alugado.");
        }
    }
    public void cadastrarLivro(livro Livro){
        if (listaLivros.contains(Livro)){
            System.out.println("Livro " + livro.getTitulo() + " já consta no acervo!");
        }else {
            listaLivros.add(Livro);
            System.out.println("Livro " + livro.getTitulo() + " cadastrado com sucesso!");
        }
    }

    public void cadastrarCliente(cliente Cliente){
        if (listaClientes.contains(Cliente)){
            System.out.println("Cliente " + cliente.getNomeCompletoCliente() + " já possui cadastro!");
        }else {
            listaClientes.add(Cliente);
            System.out.println("Cliente " + cliente.getNomeCompletoCliente() + " cadastrado com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLivros=" + listaLivros +
                ", listaClientes=" + listaClientes +
                ", listagemEmprestimos=" + listagemEmprestimos +
                '}';
    }
}
