public class TestePersonagem {
    static public void main (String [] args) {
        /*int idade = 18;
        if (idade >= 18) {
            System.out.println("Sim, pode dirigir");
        }
        else {
            System.out.println("Não, não pode dirigir");
        }

                            =

        System.out.println(idade >= 18 ? "Sim" : "Não");*/

        //p é uma variável de referência. Faz referência ao objeto construído com new.
        //Personagem p = new Personagem ();

        //variáveis declaradas no método main, são variáveis locais.
        //variáveis locais não inicializadas não são compiladas.

        //java 10+ (interferência de tipo)
        var p = new Personagem ();

        System.out.println(p.energia);

        //nome do objeto referenciado por p
        p.nome = "John";
        //Estado do objeto (coleção de valores) = 10, 0, 0, John
        p.cacar();
        p.comer();
        p.dormir();
    }
}
