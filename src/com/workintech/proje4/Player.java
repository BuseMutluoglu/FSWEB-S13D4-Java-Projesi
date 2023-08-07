package com.workintech.proje4;

public class Player {

    String name;
    int healthPercentage;
    Weapon weapon;

    public void checkHealth(int healthPercentage){
        if(healthPercentage<100){
            this.healthPercentage=100;
        } else if(healthPercentage<0){
            this.healthPercentage=0;
        }
        else {
            this.healthPercentage=healthPercentage;
        }
    }

    public Player (String name, int healthPercentage, Weapon weapon){

        this.name=name;
        //TODO Buraya bir check metodu gir >100 olamaz <0 olamaz
        checkHealth(healthPercentage);
        this.weapon=weapon;
    }
    public int healthRemaining(){
        return healthPercentage;
    }

    //getter ve setter encaplationu etkilemez axcess modifierlar kapalıysa kapalı
    public void loseHealth(int damage){
        int healthRemain=healthPercentage-damage;
        if (healthRemain<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        checkHealth(healthPercentage);
    }
    public void restoreHealth(int healthPotion){
        checkHealth(healthPercentage+ healthPotion);
    }

    public String toString(){
        return "Name:" +name+" HealthPercentage: " + healthPercentage +
                "Weapon: " + (weapon.getDamage() + "-" + weapon.getAttackSpeed());
    }
}
