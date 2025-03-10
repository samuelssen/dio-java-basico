package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);
        analisarCandidato(1500.0);  
    }
    static void analisarCandidato(double salarioPretendido){ 
        double salarioBase = 2000.0; 

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{ 
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
