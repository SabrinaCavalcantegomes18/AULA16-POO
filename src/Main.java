import classes.Animal;
import classes.Peixe;

public class Main {
    public static void main(String[] args) {
        // Criando um animal
        Animal animal = new Animal("Leão", 2.5f, 4, "Amarelo", "Savana", 58.0f);
        // Chamando o método dados para imprimir os dados do animal
        animal.dados();

        // Criando um peixe
        Peixe peixe = new Peixe("Tubarão", 3.0f, 0, "Cinza", "Oceano", 70.0f, "Carnívoro");
        // Chamando o método dadosPeixe para imprimir os dados do peixe
        peixe.dadosPeixe();
    }
}