package myProjects.cons.cons2.growingPlants;

public class Tree extends Plant{
    private static final int TREE_GROW_PER_SEASON =5;
    public Tree(String displayName, int height, int age){
        super(displayName, height, age);
    }
    @Override
    public void doSummer(){
        setHeight(getHeight() + getGrowthPerSeason());
        System.out.println(getDisplayName() + " has grown in Summer, " + getHeight());
    }
    @Override
    public void doAutumn(){
        System.out.println(getDisplayName() + " does not grow in Autumn, " + getHeight());
    }
    public int getGrowthPerSeason(){
        return TREE_GROW_PER_SEASON;
    }
}
