package advancedandroid.annotationsamples;

import android.content.Context;
import android.content.res.Resources;

@SuppressWarnings("UnusedDeclaration")
public class ResourceAnnotation {
    public void testResourceTypeParameters(Context context, int unknown) {
        Resources resources = context.getResources();
        String ok1 = resources.getString(R.string.app_name);
        String ok2 = resources.getString(unknown);
        String ok3 = resources.getString(android.R.string.ok);
        int ok4 = resources.getColor(android.R.color.black);
        if (testResourceTypeReturnValues(context, true) == R.drawable.ic_launcher) { // ok
        }

        //String ok2 = resources.getString(R.string.app_name, 1, 2, 3);
        float error1 = resources.getDimension(/*Expected resource of type dimen*/R.string.app_name/**/);
        boolean error2 = resources.getBoolean(/*Expected resource of type bool*/R.string.app_name/**/);
        boolean error3 = resources.getBoolean(/*Expected resource of type bool*/android.R.drawable.btn_star/**/);
        if (testResourceTypeReturnValues(context, true) == /*Expected resource of type drawable*/R.string.app_name/**/) {
        }
        @SuppressWarnings("UnnecessaryLocalVariable")
        int flow = R.string.app_name;
        @SuppressWarnings("UnnecessaryLocalVariable")
        int flow2 = flow;
        boolean error4 = resources.getBoolean(/*Expected resource of type bool*/flow2/**/);
    }

    @android.support.annotation.DrawableRes
    public int testResourceTypeReturnValues(Context context, boolean useString) {
        if (useString) {
            return /*Expected resource of type drawable*/R.string.app_name/**/; // error
        } else {
            return R.drawable.ic_launcher; // ok
        }
    }

    public static final class R {
        public static final class drawable {
            public static final int ic_launcher = 0x7f020057;
        }

        public static final class string {
            public static final int app_name = 0x7f0a000e;
        }
    }
}

