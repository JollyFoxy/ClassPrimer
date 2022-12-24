package CallBack;

import Interface.Program;

public class EventsApp {
    public static void main(String[] args) {
        Button tvButton=new Button(new ButtonClickHandler(){
            private boolean on = false;
            public void execute(){
                if(on){
                    System.out.println("TV ON");
                    on=false;
                }
                else {
                    System.out.println("TV OFF");
                }
            }
        });
        Button printButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Print ON...");
            }
        });
        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
interface EventHandler{
    void execute();
}
class Button{
    EventHandler handler;
    Button(EventHandler action){
        this.handler=action;
    }
    public void click(){
        handler.execute();
    }
}
class ButtonClickHandler implements EventHandler{
    @Override
    public void execute() {
        System.out.println("Click!!!");
    }
}