import java.util.List;
import java.util.ArrayList;

public class Squad{
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeroes;

    public Squad (String name, int size, String cause){
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<Hero>();
    }

    public String getName(){
        return mName;
    }

    public int getmSize(){
        return mSize;
    }

    public String getmCause(){
        return mCause;
    }
    public static List<Squad> all(){
        return instances;
    }
    public static void clear(){
       instances.clear();
    }
    public int getmId(){
        return mId;
    }
    public static Squad find(int id){
        return instances.get(id - 1);
    }
    public List<Hero> getmHeroes(){
        return mHeroes;
    }
}