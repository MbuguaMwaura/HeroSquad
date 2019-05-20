import java.util.List;
import java.util.ArrayList;

public class Squad{
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;

    public Squad (String name, int size, String cause){
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
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
}