import java.io.*;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido: " + livro);
    }

    public void registrarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro registrado: " + membro);
    }

    public void registrarEmprestimo(Livro livro, Membro membro) {
        Emprestimo emprestimo = new Emprestimo(livro, membro, new Date());
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo registrado: " + emprestimo);
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
        System.out.println("Livro devolvido: " + emprestimo);
    }

    public void salvarDadosEmArquivo(String nomeArquivo) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(nomeArquivo));
            for (Livro livro : livros) {
                writer.write("Livro:" + livro + "\n");
            }
            for (Membro membro : membros) {
                writer.write("Membro:" + membro + "\n");
            }
            for (Emprestimo emprestimo : emprestimos) {
                writer.write("Emprestimo:" + emprestimo + "\n");
            }
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void carregarDadosDeArquivo(String nomeArquivo) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}