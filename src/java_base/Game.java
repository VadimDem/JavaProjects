package java_base;

public class Game {
    class King{
        private int healthPoints;
        private int gold;


        public King(int healthPoints, int gold) {
            this.healthPoints = healthPoints;
            this.gold = gold;
            

        }

        public int getHealthPoints(){
            return healthPoints;
        }

        public int getGold(){
            return gold;
        }


    }

}