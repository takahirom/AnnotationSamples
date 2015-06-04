package advancedandroid.annotationsamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Size;
import android.util.Log;

public class SizeSampleActivity extends Activity {
    public static final String TAG = "test12345678901234567890";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logging("test12345678901234567890", "test");
        final String test = "test12345678901234567890";
        logging(test, "test");
        logging(TAG, "test");
    }

    private void logging(@Size(max=23) String tag, String message) {
        Log.d(tag,message);
    }
}
