public class Hero{
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakeness;
    private String mCatchPhrase;

    public Hero(String name, int age, String power, String weakeness, String catchPhrase){
        mName = name;
        mAge = age;
        mPower = power;
        mWeakeness = weakeness;
        mCatchPhrase = catchPhrase;
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
}