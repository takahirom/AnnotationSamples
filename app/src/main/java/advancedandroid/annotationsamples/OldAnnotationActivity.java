package advancedandroid.annotationsamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;

public class OldAnnotationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nonNullMethod(null);
    }

    public void nonNullMethod(@NonNull String nonNullString){
    }
}
