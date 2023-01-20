public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.attack();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.attack();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 10;
        archer.intelligence = 50;
        archer.name = "Maitiu";
        archer.sayMyName();
        archer.attack();
        


        Weapon sword = new Weapon();

        sword.name = "Excalibur";
        sword.damage = 10000;
        sword.rarity = "Legendary";
        sword.WeaponName();
        sword.WeaponDamage();
        sword.WeaponRarity();
        sword.AddDamage(10000);
        
        System.out.print(sword.showNameandRarity());


    }
}
