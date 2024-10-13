package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    final int nbrCages=25;
    private int nbrAnimal;
    public Zoo( String name, String city){
        this.animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;

    }
    public boolean addAnimal(Animal animal) {

        if(searchAnimal(animal) != -1)
        {
            System.out.println("L'animal existe déjà");
            return false;
        }
        if(!isZooFull())
        {
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            return true;
        }
        else
        {
            System.out.println("Vous avez dépassé la limite de nombre maximal d'animaux ou l'animal existe déjà");
            return false;
        }
    }
    public void displayAnimals(){
        for(int i=0;i<nbrCages;i++)
        {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal)!=-1)
        {
            animals[searchAnimal(animal)]=null;
            System.out.println("L'animal " + animal.getName() + " a été supprimé");
            nbrAnimal--;
            return true;
        }
        else return false;
    }
    public boolean isZooFull()
    {
        return nbrAnimal >= nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.nbrAnimal>z2.nbrAnimal)
        {
            System.out.println("Le zoo "+z1.name+ " contient plus d'animaux que le zoo " + z2.name);
        }
        else if (z1.nbrAnimal==z2.nbrAnimal)
        {
            System.out.println("Le zoo "+z1.name+ " contient le meme nombre d'animaux que le zoo " + z2.name);
        }
        else
        {
            System.out.println("Le zoo "+z2.name+ " contient plus d'animaux que le zoo " + z1.name);
        }
        return this;
    }
    public void setName(String name){
        if(!name.isEmpty()) {
            this.name=name;
        }
        else
        {
            System.out.println("Le nom ne doit pas etre vide");
        }
    }
    public int getNbrAnimal(){
        return nbrAnimal;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setNbrAnimal(int nbrAnimal){
        this.nbrAnimal=nbrAnimal;
    }
    public void setAnimals(Animal[] animals){
        this.animals=animals;
    }


}
