package myProjects.cons.cons2.growingPlants;

public abstract class Plant {
    private String displayName;
    private int height;
    private int age;
    public Plant(String displayName, int height, int age){
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }
    public String getDisplayName(){ //getter
        return displayName;
    }
    public int getHeight(){//getter
        return height;
    }
    public int getAge(){//getter
        return age;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public abstract int getGrowthPerSeason();
    public void addYearToAge(){
        this.age++;
    }
    public void doSpring(){
        setHeight(getHeight() + getGrowthPerSeason());
        addYearToAge();
        System.out.println(getDisplayName() + " has grown in Spring, " + getHeight());
    }
    public abstract void doSummer();
    public abstract void doAutumn();
    public void doWinter(){
        System.out.println(getDisplayName() + " does not grow in Winter, " + getHeight());
    }

}
