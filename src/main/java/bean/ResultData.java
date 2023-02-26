package bean;

public class ResultData implements java.io.Serializable {

	private String name;
    private int level;
    private int lesson;
    private int part;
    private boolean isAlreadyLearned;


    // getter
    public String getName() {
    	return name;
    }
    
    public int getLevel() {
        return level;
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
    
    public void setLevel(int level) {
        this.level = level;
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

