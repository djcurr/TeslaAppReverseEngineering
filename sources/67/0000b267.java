package sg;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes3.dex */
public interface f<T extends View> {
    void setColors(T t11, ReadableArray readableArray);

    void setEnabled(T t11, boolean z11);

    void setNativeRefreshing(T t11, boolean z11);

    void setProgressBackgroundColor(T t11, Integer num);

    void setProgressViewOffset(T t11, float f11);

    void setRefreshing(T t11, boolean z11);

    void setSize(T t11, String str);
}