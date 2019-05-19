public class Hero{
    private String mName;
    private int mAge;

    public Hero(String name, int age){
        mName = name;
        mAge = age;
    }
    public String getName(){
        return mName;
    }
    public int getAge(){
        return mAge;
    }
}