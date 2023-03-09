public class Personagem {
    //variáveis de instância
    String nome;
    int energia;
    int fome;
    int sono;

        //isso é um método de instância
    void cacar () {
        System.out.println(nome + " cacando");
    }

    //%n = pular linha independente da plataforma. 
    void comer () {
        System.out.print(nome + " comendo%n");
    }

    void dormir () {
        System.out.printf("%s dormindo%n");
    }
}