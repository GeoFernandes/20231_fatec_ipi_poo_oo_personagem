public class TestePersonagem {
    static public void main (String [] args) {
        //p é uma variável de referência. Faz referência ao objeto construído com new.
        //Personagem p = new Personagem ();
        //java 10+
        var p = new Personagem ();

        //nome do objeto referenciado por p
        p.nome = "John";
        p.cacar();
        p.comer();
        p.dormir();
    }
}
