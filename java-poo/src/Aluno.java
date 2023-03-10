import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Aluno extends Pessoa{

    private String matricula;
    public ArrayList<Disciplina> disciplinas;
    private String curso;


    public String getMatricula(){return this.matricula;}

    
    public String getEmail(){return this.email;}
    public ArrayList<Disciplina> getDici(){return this.disciplinas;}

    public void setNome(){this.nome = JOptionPane.showInputDialog("Nome do aluno");}
    public void setCPF(){this.cpf = JOptionPane.showInputDialog("CPF");}
    public void setMatricula(){this.matricula = JOptionPane.showInputDialog("Numero de matricula do aluno");}
    
    
    public void setDici(ArrayList<Professor> Professores){

    Object[] options = {1,2,3,4,5,6,7,8,9};
    Object op = JOptionPane.showInputDialog(null,"Escolha quantas disciplinas deseja cadastrar:","Opções",JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    Disciplina disciplina= new Disciplina();
    ArrayList<Disciplina> disci = new ArrayList<Disciplina>();
    
    if(op==null){return;}

    int opint = op.hashCode();
    for(int i=0;i<opint;i++)
    {
        disciplina.setNomeDisciplina();
        disciplina.setNota();
        disciplina.setProfessor(Professores);
        disci.add(disciplina);

    }
    this.disciplinas = disci;
}
    Object ListagemDici(ArrayList<Disciplina> listDici)
    {
        Object[] d = new String[9];
        for(int i = 0; i < listDici.size(); i++)
        {
           d[i]  = listDici.get(i).getNomeDisciplina(); 
        } 
        Object opt_dici = JOptionPane.showInputDialog(null, "Escolha a disciplinas que deseja remover", "Disciplinas", JOptionPane.INFORMATION_MESSAGE, null, d, d[0]);
        return opt_dici;
    }
    Object ListagemAlunos(ArrayList<Aluno> listAlun)
    {
        Object[] al = new String[100] ;
        for(int i = 0; i < listAlun.size(); i++)
        {
            al[i] = listAlun.get(i).nome;
        }
        Object opt_alunos = JOptionPane.showInputDialog(null,"Escolha um aluno","Alunos", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_alunos;
    }

    @Override
    void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nMatricula: " + this.matricula +
                "\nEmail: " + this.email);
        
        if(this.disciplinas == null)
        {
            JOptionPane.showMessageDialog(null,"Sem disciplinas matriculadas !\nEscolha a opção 'Adicionar disciplinas' para cadastrar");
            return ;
        }
        else{
            for(int i=0;i<this.disciplinas.size();i++){
                int aux=i+1;
                JOptionPane.showMessageDialog(null,"Disciplina "+aux+": "+this.disciplinas.get(i).getNomeDisciplina() +
                "\nNome do Professor: " + this.disciplinas.get(i).getNomeprofessor() +
                "\nNota: " + this.disciplinas.get(i).getNota());
        }
    }
    }
}



