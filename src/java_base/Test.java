package java_base;

public class Test {
    class King {
        private int healthPoints;
        private int gold;
        private Army army;

        public King(int healthPoints, int gold, Army army) {
            this.healthPoints = healthPoints;
            this.gold = gold;
            this.army = army;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public Army getArmy() {
            return army;
        }

        public void setArmy(Army army) {
            this.army = army;
        }

        public void attackEnemy(Enemy enemy) {
            // шо
        }
    }

    class Army {
        private Knight knight;
        private Infantry infantry;

        public Army(Knight knight, Infantry infantry) {
            this.knight = knight;
            this.infantry = infantry;
        }

        public Knight getKnight() {
            return knight;
        }

        public void setKnight(Knight knight) {
            this.knight = knight;
        }

        public Infantry getInfantry() {
            return infantry;
        }

        public void setInfantry(Infantry infantry) {
            this.infantry = infantry;
        }
    }

    class Knight {
        private int healthPoints;
        private int attackDamage;

        public Knight(int healthPoints, int attackDamage) {
            this.healthPoints = healthPoints;
            this.attackDamage = attackDamage;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getAttackDamage() {
            return attackDamage;
        }

        public void setAttackDamage(int attackDamage) {
            this.attackDamage = attackDamage;
        }
    }

    class Infantry {
        private int healthPoints;
        private int attackDamage;

        public Infantry(int healthPoints, int attackDamage) {
            this.healthPoints = healthPoints;
            this.attackDamage = attackDamage;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getAttackDamage() {
            return attackDamage;
        }

        public void setAttackDamage(int attackDamage) {
            this.attackDamage = attackDamage;
        }
    }

    class Enemy {
        private int type;
        private int healthPoints;
        private int attackDamage;
        private int goldReward;

        public Enemy(int type, int healthPoints, int attackDamage, int goldReward) {
            this.type = type;
            this.healthPoints = healthPoints;
            this.attackDamage = attackDamage;
            this.goldReward = goldReward;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getAttackDamage() {
            return attackDamage;
        }

        public void setAttackDamage(int attackDamage) {
            this.attackDamage = attackDamage;
        }

        public int getGoldReward() {
            return goldReward;
        }

        public void setGoldReward(int goldReward) {
            this.goldReward = goldReward;
        }

        public void attackKing(King king) {
            // Implement attack logic here
        }
    }

    public class Play {
        public void main(String[] args) {
            // Create army units
            Knight knight = new Knight(100, 20);
            Infantry infantry = new Infantry(80, 10);
            Army army = new Army(knight, infantry);

            // Create the king
            King king = new King(200, 1000, army);

            // Create enemies
            Enemy enemy1 = new Enemy(1, 50, 5, 0);
            Enemy enemy2 = new Enemy(2, 100, 10, 50);
            Enemy enemy3 = new Enemy(3, 200, 50, 100);

            // Example of game process
            king.attackEnemy(enemy1);
            king.attackEnemy(enemy2);
            king.attackEnemy(enemy3);
        }
    }

}

