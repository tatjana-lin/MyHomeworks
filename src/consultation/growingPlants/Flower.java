package myProjects.cons.cons2.growingPlants;

public class Flower extends Plant{
    private static final int FLOWER_GROW_PER_SEASON = 2;
    public Flower(String displayName, int height, int age){
        super(displayName, height, age);
    }
    @Override
    public void doSummer(){
        setHeight(getHeight() + getGrowthPerSeason());
        System.out.println(getDisplayName() + " does not grow in Summer, but flourishing " + getHeight());
    }
    @Override
    public void doAutumn(){
        setHeight(0);
        System.out.println(getDisplayName() + " is cut to zero in Autumn, " + getHeight());
    }
    public int getGrowthPerSeason(){
        return FLOWER_GROW_PER_SEASON;
    }

}
