package myProjects.Pokemon;
class Pokemon {
    String name;
    int hp;
    int maxHP;
    int damage;

    public void fight() {
     System.out.println("Покемон " + name + "дерётся");
    }

    //конструктор покемонов
    Pokemon (String name, int hp, int maxHP, int damage) {
      this.name = name;
      this.hp = hp;
      this.maxHP = maxHP;
      this.damage = damage;
    }


}
public class PokemonGame {
    public static void main(String[] args) {
    Pokemon A = new Pokemon("A", 10, 30, 20);



    }
}
