package advancedandroid.annotationsamples;

import android.support.annotation.WorkerThread;

/**
 * Created by takam on 2015/06/03.
 */
public class AnnotationTest {
    public void callBackgroundMethod() {
        // No error!!!???
        backgroundMethod();
    }
    @WorkerThread
    private void backgroundMethod() {
        System.out.println("test");
    }
}
