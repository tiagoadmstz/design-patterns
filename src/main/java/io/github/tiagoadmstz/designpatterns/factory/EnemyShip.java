package io.github.tiagoadmstz.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void followHeroShip(){
        System.out.println(String.format("%s is following the hero", getName()));
    }

    public void displayEnemyShip(){
        System.out.println(String.format("%s is on the screen", getName()));
    }

    public void enemyShipShoots(){
        System.out.println(String.format("%s attacks and does %s", getName(), getAmtDamage()));
    }

}
