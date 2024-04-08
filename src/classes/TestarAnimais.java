package classes;

public class TestarAnimais {
    public static void main(String[] args) {
        // Criando um objeto camelo do tipo Mamífero
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, "");

        // Criando um objeto tubarão do tipo Peixe
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");

        // Criando um objeto urso-do-canadá do tipo Mamifero
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");

        // Imprimindo os dados do camelo
        System.out.println("Dados do camelo:");
        camelo.dadosMamifero();

        // Imprimindo os dados do tubarão
        System.out.println("Dados do tubarão:");
        tubarao.dadosPeixe();

        // Imprimindo os dados do urso-do-canadá
        System.out.println("Dados do urso-do-canadá:");
        ursocanada.dadosMamifero();
    }
}