import static java.lang.Math.min;
public class Personagem {
    //variáveis de instância são globais. Retornam o valor 0.
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

        //isso é um método de instância
    void cacar () {
        if (energia >= 2) {
            System.out.println(nome + " cacando");
            //energia = energia - 2;
            energia -= 2;
        }
        else {
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1,10);
        sono = min(sono + 1, 10);
    }

    //\n = pular linha no formato print. 
    void comer () {
        if (fome >= 1) {
            System.out.print(nome + " comendo\n");
            energia = min (energia + 1, 10);
            //fome = fome - 1; fome--; --fome;
            fome -= 1;
        }
        else {
            System.out.println(nome + " sem fome");
        }
    }

    //%n = pular linha independente da plataforma. 
    void dormir () {
        if (sono >= 1) {
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10;
            sono--;
        }
        else {
            System.out.println(nome + " sem sono");
        }
    }
}