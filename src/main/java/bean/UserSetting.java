// ユーザが入力した級、課、回

package bean;

public class UserSetting implements java.io.Serializable {

    private int lV;
    private int lesson;
    private int part;

    public int getLv() {
        return lV;
    }

    public int getLesson() {
        return lesson;
    }

    public int getPart() {
        return part;
    }

    public void setLv(int lV) {
        this.lV = lV;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public void setPart(int part) {
        this.part = part;
    }

}