package advancedandroid.annotationsamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.WorkerThread;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundMethod();
        new AnnotationTest().callBackgroundMethod();
    }

    @WorkerThread
    private void backgroundMethod() {
        System.out.println("test");
    }
}
