import java.util.EventListener;
public interface MyListener extends EventListener {
    public void changeMyValue(MyEvent evt);
}