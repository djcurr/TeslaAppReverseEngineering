package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.s0;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public abstract class a extends s0.c {
    static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final Bundle mDefaultArgs;
    private final p mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public a(androidx.savedstate.c cVar, Bundle bundle) {
        this.mSavedStateRegistry = cVar.getSavedStateRegistry();
        this.mLifecycle = cVar.getLifecycle();
        this.mDefaultArgs = bundle;
    }

    @Override // androidx.lifecycle.s0.c
    public final <T extends p0> T create(String str, Class<T> cls) {
        SavedStateHandleController d11 = SavedStateHandleController.d(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        T t11 = (T) create(str, cls, d11.e());
        t11.setTagIfAbsent(TAG_SAVED_STATE_HANDLE_CONTROLLER, d11);
        return t11;
    }

    protected abstract <T extends p0> T create(String str, Class<T> cls, l0 l0Var);

    @Override // androidx.lifecycle.s0.e
    public void onRequery(p0 p0Var) {
        SavedStateHandleController.a(p0Var, this.mSavedStateRegistry, this.mLifecycle);
    }

    @Override // androidx.lifecycle.s0.c, androidx.lifecycle.s0.b
    public final <T extends p0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}