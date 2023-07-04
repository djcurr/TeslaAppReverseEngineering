package sg;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes3.dex */
public interface j<T extends View> {
    void setAnimated(T t11, boolean z11);

    void setAnimationType(T t11, String str);

    void setHardwareAccelerated(T t11, boolean z11);

    void setIdentifier(T t11, int i11);

    void setPresentationStyle(T t11, String str);

    void setStatusBarTranslucent(T t11, boolean z11);

    void setSupportedOrientations(T t11, ReadableArray readableArray);

    void setTransparent(T t11, boolean z11);

    void setVisible(T t11, boolean z11);
}