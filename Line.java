public class Line {
    
    private String[] line;

    private int lineSize;

    public Line(String[] line, int lineSize) {
        this.line = line;
        this.lineSize = lineSize;
    }

    private int getRobbiePosition() {
        for (int i = 0; i < lineSize; i++) {
            if (line[i].equals("R")) return i;
        }
        return -1;
    }

    public boolean isFriendsNear() {
        int robbiePosition = getRobbiePosition();
        boolean friend1 = false;
        for (int i = robbiePosition; i < robbiePosition + 5; i++) {
            if (i > lineSize) break;
            if (line[i].equals("F")) friend1 = true;
        }
        if (!friend1) return false;

        boolean friend2 = false;
        for (int i = robbiePosition; i > robbiePosition - 5; i--) {
            if (i < 0) break;
            if (line[i].equals("F")) friend2 = true;
        }

        if (!friend2) return false;

        return true;
    }

}