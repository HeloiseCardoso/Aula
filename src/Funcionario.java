import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String matricula;
    private String gratificacao;
    private String salario;
    private ArrayList<Filho>dadosFilhos=new ArrayList<Filho>();

    Scanner scanner = new Scanner(System.in);

    public void sequenciaNumerica(){
        System.out.println("valor inicial da sequencia?");
        int sequencia = scanner.nextInt();
        for(int i=sequencia; i<=98; i++){
            int sequenciaN =  i;
            System.out.println("00"+sequenciaN);
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(String gratificacao) {
        this.gratificacao = gratificacao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ArrayList<Filho> getDadosFilhos() {
        return dadosFilhos;
    }

    public void setDadosFilhos(ArrayList<Filho> dadosFilhos) {
        this.dadosFilhos = dadosFilhos;
    }
}
