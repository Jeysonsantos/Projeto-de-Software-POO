
package App.pack;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Matricula {
    public Aluno al;
    Aluno matricular()
    {
        String nome = JOptionPane.showInputDialog("Nome do aluno");
        String cpf = JOptionPane.showInputDialog("CPF");
        String matricu = JOptionPane.showInputDialog("Numero de matricula do aluno");
        String disci = JOptionPane.showInputDialog("Quantidade de disciplinas matriculadas");
        String email = JOptionPane.showInputDialog("Email do aluno");
        Aluno a = new Aluno(nome,cpf,matricu,disci,email);
        return a;
    }
    Object ListagemAlunos(ArrayList<Aluno> listAlun)
    {
        Object[] al = new String[100] ;
        for(int i = 0; i < listAlun.size(); i++)
        {
            al[i] = listAlun.get(i).nome.toString();
        }
        Object opt_alunos = JOptionPane.showInputDialog(null,"Escolha um aluno","Alunos", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_alunos;
    }
}
