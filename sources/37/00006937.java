package expo.modules.core.interfaces;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.facebook.react.l;
import com.facebook.react.m;
import com.facebook.react.z;

/* loaded from: classes5.dex */
public interface ReactActivityHandler {
    default z createReactRootView(Activity activity) {
        return null;
    }

    default ViewGroup createReactRootViewContainer(Activity activity) {
        return null;
    }

    default m onDidCreateReactActivityDelegate(l lVar, m mVar) {
        return null;
    }

    default boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return false;
    }
}