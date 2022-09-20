public class Principal {
    public static void main(String[] args) {
        Gato animalGato = new Gato();
        animalGato.nome = "Garfield";
        animalGato.idade = 5;

        System.out.println("O nome do gato é: " + animalGato.nome);
        System.out.println("A idade do gato é: " + animalGato.idade);

        System.out.println(animalGato.miar());
    }
}
