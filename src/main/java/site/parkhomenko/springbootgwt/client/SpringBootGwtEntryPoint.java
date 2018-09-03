package site.parkhomenko.springbootgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class SpringBootGwtEntryPoint implements EntryPoint {

    public void onModuleLoad() {
        Button button = new Button();
        button.setText("Click Me!");
        button.addClickHandler(e -> Window.alert("Click Handler"));

        RootPanel.get().add(button);
    }
}
