package advancedandroid.annotationsamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.CheckResult;
import android.support.annotation.IntRange;
import android.support.annotation.Size;
import android.util.Log;

public class ConstraintsAnnotationSampleActivity extends Activity {
    public static final String TAG = "test12345678901234567890";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logging("test12345678901234567890", "test"); // error
        final String test = "test12345678901234567890";
        logging(test, "test"); // in 1.3 EAP.0 no error
        logging(TAG, "test"); // in 1.3 EAP.0 no error

        foo("fo"); // error
        foo("foo"); // no error
        foo("fooo"); // error
        foo("fooooo"); // no error

        foo(101); // error
        foo(100);

        add3(3);
        final int i = add3(3); // no error

    }

    private void logging(@Size(max=23) String tag, String message) {
        Log.d(tag,message);
    }

    private void foo(@Size(multiple=3) String size) {
        System.out.println(size);
    }

    private void foo(@IntRange(from=3,to=100) int size) {
        System.out.println(size);
    }

    @CheckResult
    private int add3(int i) {
        return 3 + i;
    }
}
