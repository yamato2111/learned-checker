// ユーザが入力した級、課、回

package bean;

public class UserSetting implements java.io.Serializable {

    private int level;
    private int lesson;
    private int part;

    public int getLevel() {
        return level;
    }

    public int getLesson() {
        return lesson;
    }

    public int getPart() {
        return part;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public void setPart(int part) {
        this.part = part;
    }

}