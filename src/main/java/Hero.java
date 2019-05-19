import java.util.List;
import java.util.ArrayList;

public class Hero{
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakeness;
    private String mCatchPhrase;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;

    public Hero(String name, int age, String power, String weakeness, String catchPhrase){
        mName = name;
        mAge = age;
        mPower = power;
        mWeakeness = weakeness;
        mCatchPhrase = catchPhrase;
        instances.add(this);
        mId = instances.size();
    }
    public String getName(){
        return mName;
    }
    public int getAge(){
        return mAge;
    }
    public String getPower(){
        return mPower;
    }
    public String getWeakeness(){
        return mWeakeness;
    }
    public String getCatchPhrase(){
        return mCatchPhrase;
    }
    public static List<Hero> all(){
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
    public int getId(){
        return mId;
    }
}