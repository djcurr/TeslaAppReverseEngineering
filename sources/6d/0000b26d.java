package sg;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public interface l<T extends View> {
    void setDisabled(T t11, boolean z11);

    void setEnabled(T t11, boolean z11);

    void setMaximumTrackImage(T t11, ReadableMap readableMap);

    void setMaximumTrackTintColor(T t11, Integer num);

    void setMaximumValue(T t11, double d11);

    void setMinimumTrackImage(T t11, ReadableMap readableMap);

    void setMinimumTrackTintColor(T t11, Integer num);

    void setMinimumValue(T t11, double d11);

    void setStep(T t11, double d11);

    void setTestID(T t11, String str);

    void setThumbImage(T t11, ReadableMap readableMap);

    void setThumbTintColor(T t11, Integer num);

    void setTrackImage(T t11, ReadableMap readableMap);

    void setValue(T t11, double d11);
}