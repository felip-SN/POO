
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author Felipe
 */

public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno objAluno = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        objAluno.setMensalidade(1500);
        
        System.out.println("Registro escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + objAluno.getMensalidade());
        
        Professor objProfessor = new Professor(1515, "Felipe S. N.", "25/03/2002");
        objProfessor.setSalario(3000);
        
        System.out.println("\nRegistro academico: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salario: " + objProfessor.getSalario());
    }
    
}
