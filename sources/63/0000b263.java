package sg;

import android.view.View;

/* loaded from: classes3.dex */
public interface b<T extends View> {
    void closeDrawer(T t11);

    void openDrawer(T t11);

    void setDrawerBackgroundColor(T t11, Integer num);

    void setDrawerLockMode(T t11, String str);

    void setDrawerPosition(T t11, String str);

    void setDrawerWidth(T t11, Float f11);

    void setKeyboardDismissMode(T t11, String str);

    void setStatusBarBackgroundColor(T t11, Integer num);
}