package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x4.a<v> {
    @Override // x4.a
    public List<Class<? extends x4.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // x4.a
    /* renamed from: c */
    public v b(Context context) {
        if (androidx.startup.a.d(context).e(ProcessLifecycleInitializer.class)) {
            r.a(context);
            ProcessLifecycleOwner.i(context);
            return ProcessLifecycleOwner.h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}