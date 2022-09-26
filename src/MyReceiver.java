public class MyReceiver implements MyListener{
    @Override
    public void changeMyValue(MyEvent evt) {
        System.out.println("Value: " + evt.getValue());
    }    
}
