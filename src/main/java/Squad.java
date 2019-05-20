public class Squad{
    private String mName;
    private int mSize;
    private String mCause;

    public Squad (String name, int size, String cause){
        mName = name;
        mSize = size;
        mCause = cause;
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
}