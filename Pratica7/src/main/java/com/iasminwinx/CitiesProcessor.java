package com.iasminwinx;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption;
public class CitiesProcessor implements Iterable<City> {
    private Set<City> ProcessadorCitys;

    public Set<City> buildSetOfCities(Path file, ComparatorByState c){
        Set<City> leitor = new TreeSet<>();
        try{
            FileReader fr = new FileReader(String.valueOf(file));
            BufferedReader br = new BufferedReader(fr);
            String linha=null;
            while((linha = br.readLine())!=null){//lendo a linha enquanto ela for difernte de null
                String [] palavras = linha.split(",");// pego as palavras da linha e coloco num vetor
                String cidade = palavras[0];// É um objeto por isso pego ele no vetor pelo indice
                String estado = palavras[1];
                City c1 = new City(cidade,estado);
                leitor.add(c1);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe");;
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");;
        }
        return leitor;

    }

    public void WritesetofCities(Path destino,Comparator<City> comparator) throws IOException {


        try {

            Set<City> ordenado = new TreeSet<>(comparator);

            List<String> linhas= Files.readAllLines(destino,Charset.defaultCharset());

            Files.write(destino, linhas, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        }catch (IOException e){
            System.out.println( "Erro: na varredura do arquivo." );
        }




    }

    @Override
    public Iterator<City> iterator() {
        return ProcessadorCitys.iterator();
    }

    public void imprimiTreeset(Set<City> treeset){
        for(City c : treeset){
            System.out.println("Nome da Cidade:"+ c.getNome_cidade() + "Nome do estado onde está localizada:" + c.getEstado());
        }
    }

}
