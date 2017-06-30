package xunqaing.bwie.com.exeception_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int a = 9/0;
               System.out.println("a = " + a);
           }
       });
    }
}
