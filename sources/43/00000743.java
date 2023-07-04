package androidx.lifecycle;

import android.app.Application;

/* loaded from: classes.dex */
public class b extends p0 {
    private Application mApplication;

    public b(Application application) {
        this.mApplication = application;
    }

    public <T extends Application> T getApplication() {
        return (T) this.mApplication;
    }
}