import java.util.ArrayList;
public class MySource{
    private String source;
    private ArrayList<MyListener> listeners;
    public MySource(){
        listeners = new ArrayList<>();
    }

    public void setScore(String val){
        source = val;
        fireMyEvent(new MyEvent(this, source));
    }

    public String getScore(){
        return source;
    }

    public void addMyListener(MyListener l){
        listeners.add(l);
    }

    public void removeMyListener(MyListener l){
        listeners.remove(l);
    }

    public void fireMyEvent(MyEvent e){
        for(MyListener listener : listeners){
            listener.changeMyValue(e);
        }
    }
}
