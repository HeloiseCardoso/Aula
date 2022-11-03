import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {


        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

        File arquivo = new File("/Users/pepperland/Desktop/heloise/Aula/src/DocumentoFuncionario-copia");
        //indicamos o arquivo que sera lido
        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()) {
            String linha = bufferedReader.readLine();
            String linhaSplit[] = linha.split("-");

            Funcionario funcionario1 = new Funcionario();
           // funcionario1.sequenciaNumerica();
            funcionario1.setMatricula(linhaSplit[0]);
            funcionario1.setNome(linhaSplit[1]);
            funcionario1.setSalario(linhaSplit[2]);
            funcionario1.setGratificacao(linhaSplit[3]);

            if (linhaSplit.length > 4) {

                Filho filho = new Filho();
                filho.setNomeFilho(linhaSplit[4]);
                filho.setDataNascimento(linhaSplit[5]);
                filho.setSexo(linhaSplit[6]);
                funcionario1.getDadosFilhos().add(filho);

            } else if (linhaSplit.length > 8) {

                Filho filho2 = new Filho();
                filho2.setNomeFilho(linhaSplit[7]);
                filho2.setDataNascimento(linhaSplit[8]);
                filho2.setSexo(linhaSplit[9]);
                funcionario1.getDadosFilhos().add(filho2);

            } else if (linhaSplit.length > 10) {

                Filho filho3 = new Filho();
                filho3.setNomeFilho(linhaSplit[10]);
                filho3.setDataNascimento(linhaSplit[11]);
                filho3.setSexo(linhaSplit[12]);
                funcionario1.getDadosFilhos().add(filho3);

            } else if (linhaSplit.length > 13 ) {

                Filho filho4 = new Filho();
                filho4.setNomeFilho(linhaSplit[13]);
                filho4.setDataNascimento(linhaSplit[14]);
                filho4.setSexo(linhaSplit[15]);
                funcionario1.getDadosFilhos().add(filho4);

            }

            listaFuncionario.add(funcionario1);

        }

        //Acessar o objeto na posicao i da lista
        for(int i=0; i<listaFuncionario.size(); i++){
            Funcionario funcionario1 = listaFuncionario.get(i);
            System.out.println(" matricula " + funcionario1.getMatricula() + " nome " + funcionario1.getNome() +" salario " + funcionario1.getSalario() + " gratificacao " + funcionario1.getGratificacao());

            ArrayList<Filho>dadosFilhos = funcionario1.getDadosFilhos();
            for(int j=0; j<dadosFilhos.size(); j++){
                System.out.println(" Filhos: " + dadosFilhos.get(j).getNomeFilho()+ " Data de Nascimento: " + dadosFilhos.get(j).getDataNascimento() + " Sexo: " + dadosFilhos.get(j).getSexo());

            }
        }

        bufferedReader.close();
        fileReader.close();
    }
}












