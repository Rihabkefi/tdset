public class Main {
    public static void main(String[] args) {
        Enseignant enseignant1 = new Enseignant(1, "Doe", "John");
        Enseignant enseignant2 = new Enseignant(2, "Smith", "Jane");

        EspritHashSet espritHashSet = new EspritHashSet();
        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);

        System.out.println("Enseignants dans EspritHashSet :");
        espritHashSet.displayEnseignants();

        System.out.println("Recherche de l'enseignant avec ID 1 : " + espritHashSet.rechercherEnseignant(1));

        EspritTreeSet espritTreeSet = new EspritTreeSet();
        espritTreeSet.ajouterEnseignant(enseignant2);
        espritTreeSet.ajouterEnseignant(enseignant1);

        System.out.println("\nEnseignants dans EspritTreeSet :");
        espritTreeSet.displayEnseignants();

        System.out.println("Recherche de l'enseignant avec ID 2 : " + espritTreeSet.rechercherEnseignant(2));

    }
}
