public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Физическая защита");

        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());
    }
}

