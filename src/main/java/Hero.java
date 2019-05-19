public class Hero{
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakeness;

    public Hero(String name, int age, String power, String weakeness){
        mName = name;
        mAge = age;
        mPower = power;
        mWeakeness = weakeness;
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
}