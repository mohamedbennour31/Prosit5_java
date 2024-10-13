package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {

    protected String habitat;
    public Aquatic() {

    }
    public Aquatic(String family, String name, int age, boolean isMammal ,String habitat)
    {
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                getName()+
                "habitat='" + habitat + '\'' +
                '}';
    }
    public void swim()
    {
        System.out.println("This aquatic animal is swimming");
    }
}
