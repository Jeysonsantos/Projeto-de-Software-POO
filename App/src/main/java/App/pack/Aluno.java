package App.pack;
import javax.swing.JOptionPane;

public class Aluno {

    public String nome;
    public String cpf;
    public String nMatricula;
    public String nDisciplinas;    
    public String email;
    public Aluno( String nome, String cpf, String nMatricula, String nDisciplinas, String email)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.nMatricula = nMatricula;
        this.nDisciplinas = nDisciplinas;
        this.email = email;
    }
    void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nMatricula: " + this.nMatricula +
                "\nQuantidade de disciplinas: " + this.nDisciplinas + 
                "\nEmail: " + this.email );
    }
}
