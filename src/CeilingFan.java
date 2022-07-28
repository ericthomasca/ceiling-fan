/**
 * Ceiling fan with 3 levels of speed and 2 directions.
 * @author Eric Thomas
 */
public class CeilingFan {
    private static int speed = 0;
    private static String direction = "clockwise";

    /**
     * Get the speed of the ceiling fan.
     * @return the speed of the ceiling fan.
     */
    public static int getSpeed() {
        return speed;
    }

    /**
     * Get the direction of the ceiling fan.
     * @return the direction of the ceiling fan.
     */
    public static String getDirection() {
        return direction;
    }

    /**
     * Set the speed of the ceiling fan. Every pull increases the speed by 1 to a maximum of 3.
     */
    public static void pullSpeedCord() {
        speed++;
        speed = speed % 4;
    }

    /**
     * Set the direction of the ceiling fan. Every pull reverses the direction.
     */
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
        CeilingFan.pullDirectionCord();
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
