public class Weapon {

    String name;
    int damage;
    String rarity;

    public void WeaponName() {
        System.out.println("weapon name: " + name);

    }
    public void WeaponDamage() {
        System.out.println("damage: " + damage);
    }
    public void WeaponRarity() {
        System.out.println("rarity: " + rarity);
    }
    public void AddDamage(int additionalDamage){
        int NewDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + NewDamage);

        this.damage = NewDamage;
    }

    public String showNameandRarity(){
        return this.name + " " + this.rarity;
    }

}
