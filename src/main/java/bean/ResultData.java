package bean;

public class ResultData implements java.io.Serializable {

	private String name;
    private int lV;
    private int lesson;
    private int part;
    private boolean isAlreadyLearned;


    // getter
    public String getName() {
    	return name;
    }
    
    public int getLv() {
        return lV;
    }

    public int getLesson() {
        return lesson;
    }

    public int getPart() {
        return part;
    }
    
    public boolean getIsAlreadyLeaned() {
    	return isAlreadyLearned;
    }

    
    // setter
    public void setName(String name) {
    	this.name = name;
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
    
    public void setIsAlreadyLeaned(boolean isAlreadyLearned) {
    	this.isAlreadyLearned = isAlreadyLearned;
    }
}

