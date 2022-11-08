public class Island extends World {
    public int red;
    public int green;
    public int blue;
    public void go() {
        background();
        plane.teleport(400,300);
        tree();
        plane.teleport(90, 1000);
        rock();
        plane.teleport(90, 1100);
        rock();

        plane.loadBackGround("patrick.png");
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 2; row < 285; row++) {
            for (int col = 3; col < 212; col++) {

                plane.teleport(col,row);

        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();

        if (red <= 251 && green<= 130 && blue <= 117) {
            plane.setPixelColor(0, 9, 200);
        }
        plane.pausetime = 0;


    }}

    plane.teleport(962,33);
        plane.setColor(255,255,255);
        plane.fillCircle(100);
    }




    public void tree() {
        leaf();
        stump();
        leaf();

    }

    public void leaf() {
        plane.isTrail = true;
        plane.trailWidth = 40;
        plane.setColor(20, 150, 60);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.move(1);
        for (int x = 0; x < 120; x = x + 1) {
            plane.move(1);
            plane.turn(1);
        }
        plane.turn(120);
        plane.move(185);

    }

    public void stump() {
        plane.isTrail = true;
        plane.trailWidth = 50;
        plane.setColor(120, 100, 92);
        plane.startingAngle(90);
        plane.move(300);
    }

    public void rock() {
        plane.isTrail = true;
        plane.trailWidth = 100;
        plane.setColor(43, 12, 3);
        for (int x = 0; x < 360; x = x + 1) {
            plane.move(3);
            plane.turn(1);
        }
    }

    public void background() {
        plane.isTrail = true;
        plane.trailWidth = 100;
        for (int x = 0; x < 1000; x = x + 1) {
            for (int y = 0; y < 1000; y = y + 1) {
                System.out.println(y);
                // for (int z = 0; z < 1000; z = z + 1) {
                plane.teleport(x, y);
                plane.setPixelColor((y + 5) / 10, 20, (x + 1) / 10);
            }
                    }
                }}

