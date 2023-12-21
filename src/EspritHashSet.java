import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{
    HashSet<Enseignant> hash = new HashSet<>();
  public   void ajouterEnseignant(Enseignant e){
      hash.add(e);

    }
   public boolean rechercherEnseignant(Enseignant e){
     return hash.contains(e);
   }
     public  boolean rechercherEnseignant(int id){
         for (Enseignant e : hash) {
             if (e.getId() == id) {
                 return true;
             }
         }
         return false;

    }
  public   void supprimerEnseignant(Enseignant e){
      hash.remove(e);
  }
   public void displayEnseignants(){
      for (Enseignant e : hash){
          System.out.println(e);
      }
   }
}
