package user;

public class IdCount {
    static int ind;

    public static int genId() {
        ind += 1;
        return ind;
    }
}
