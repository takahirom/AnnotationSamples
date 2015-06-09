package advancedandroid.annotationsamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.view.View;

public class ThreadSampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundMethod();
        new AnnotationTest().callBackgroundMethod();
        mainThreadMethod();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mainThreadMethod();
            }
        }).start();
    }

    @MainThread
    private void mainThreadMethod() {

    }

    @WorkerThread
    private void backgroundMethod() {
        System.out.println("test");
    }
}
