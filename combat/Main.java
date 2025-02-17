public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("sania", "sword", 500);

        // System.out.println(player.getName());
        // System.out.println(player.getHealth());
        // System.out.println(player.getWeapon());

        player.damagebyGun1();
        player.damagebyGun1();
        player.damagebyGun2();
        player.heal();

        // Player2 betterPlayer = new Player2("lucky", "machine gun", 80, false);
        // betterPlayer.damagebyGun1();
    }
}
