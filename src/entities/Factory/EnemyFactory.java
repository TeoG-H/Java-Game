package entities.Factory;

import entities.Enemy;


//TEO saptamana 7

public interface EnemyFactory {

        Enemy createEnemy(float x, float y, int type);
    }
