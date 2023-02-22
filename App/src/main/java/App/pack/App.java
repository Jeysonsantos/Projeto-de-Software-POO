
package App.pack;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        ArrayList <Aluno> alunos = new ArrayList<Aluno>();
        Matricula mat = new Matricula();
        while(true){
            Object[] options = {"Matricular Aluno","Remover Aluno", "Alterar Nota","Alterar Dados", "Mostrar Informações", "Alterar Faltas", "Adicionar Notas", "Adicionar Faltas", "Adicionar Disciplinas", "Remover Disciplinas"};
            
            Object option = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option == null) break;
            else if(option == "Matricular Aluno")
            {
                Aluno a = mat.matricular();
                alunos.add(a);
            }
            else if(option == "Mostrar Informações")
            {
                Object opt_alunos = mat.ListagemAlunos(alunos);
                for(int i = 0; i < alunos.size(); i++)
                {
                    if(opt_alunos == null) break;
                    else if(opt_alunos == alunos.get(i).nome)
                    {
                        alunos.get(i).MostrarInfo();
                        break;
                    }
                }
            }
            else if(option == "Remover Aluno")
            {
                Object opt_alunos = mat.ListagemAlunos(alunos);
                for(int i = 0; i < alunos.size(); i++)
                {
                    if(opt_alunos == null) break;
                    else if(opt_alunos == alunos.get(i).nome)
                    {
                        alunos.remove(i);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Aluno "+opt_alunos +" Removido com sucesso !");
            }
            
            
        }
    }
}
