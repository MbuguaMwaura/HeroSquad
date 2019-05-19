public class Hero{
    private String mName;
    private int mAge;
    private String mPower;

    public Hero(String name, int age, String power){
        mName = name;
        mAge = age;
        mPower = power;
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
}