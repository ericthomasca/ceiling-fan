public class CeilingFan {
    private static int speed = 0;
    private static String direction = "clockwise";

    public static int getSpeed() {
        return speed;
    }

    public static String getDirection() {
        return direction;
    }

    public static void pullSpeedCord() {
        speed++;
        speed = speed % 4;
    }

    public static void pullDirectionCord() {
        if (direction.equals("clockwise")) {
            direction = "counterclockwise";
        } else {
            direction = "clockwise";
        }
    }

    public static void main(String[] args) {
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        CeilingFan.pullSpeedCord();
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        CeilingFan.pullSpeedCord();
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        CeilingFan.pullSpeedCord();
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        CeilingFan.pullSpeedCord();
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        CeilingFan.pullSpeedCord();
        System.out.printf("Fan Speed: %d\n", CeilingFan.getSpeed());
        System.out.printf("Fan Direction: %s\n", CeilingFan.getDirection());
        CeilingFan.pullDirectionCord();
        System.out.printf("Fan Direction: %s\n", CeilingFan.getDirection());
        CeilingFan.pullDirectionCord();
        System.out.printf("Fan Direction: %s\n", CeilingFan.getDirection());
    }
}
