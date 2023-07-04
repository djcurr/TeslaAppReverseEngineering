package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.s0;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 extends s0.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?>[] f5181f = {Application.class, l0.class};

    /* renamed from: g  reason: collision with root package name */
    private static final Class<?>[] f5182g = {l0.class};

    /* renamed from: a  reason: collision with root package name */
    private final Application f5183a;

    /* renamed from: b  reason: collision with root package name */
    private final s0.b f5184b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f5185c;

    /* renamed from: d  reason: collision with root package name */
    private final p f5186d;

    /* renamed from: e  reason: collision with root package name */
    private final SavedStateRegistry f5187e;

    public m0(Application application, androidx.savedstate.c cVar, Bundle bundle) {
        s0.b c11;
        this.f5187e = cVar.getSavedStateRegistry();
        this.f5186d = cVar.getLifecycle();
        this.f5185c = bundle;
        this.f5183a = application;
        if (application != null) {
            c11 = s0.a.f(application);
        } else {
            c11 = s0.d.c();
        }
        this.f5184b = c11;
    }

    private static <T> Constructor<T> a(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.s0.c
    public <T extends p0> T create(String str, Class<T> cls) {
        Constructor a11;
        T t11;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.f5183a != null) {
            a11 = a(cls, f5181f);
        } else {
            a11 = a(cls, f5182g);
        }
        if (a11 == null) {
            return (T) this.f5184b.create(cls);
        }
        SavedStateHandleController d11 = SavedStateHandleController.d(this.f5187e, this.f5186d, str, this.f5185c);
        if (isAssignableFrom) {
            try {
                Application application = this.f5183a;
                if (application != null) {
                    t11 = (T) a11.newInstance(application, d11.e());
                    t11.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", d11);
                    return t11;
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to access " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e13.getCause());
            }
        }
        t11 = (T) a11.newInstance(d11.e());
        t11.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", d11);
        return t11;
    }

    @Override // androidx.lifecycle.s0.e
    public void onRequery(p0 p0Var) {
        SavedStateHandleController.a(p0Var, this.f5187e, this.f5186d);
    }

    @Override // androidx.lifecycle.s0.c, androidx.lifecycle.s0.b
    public <T extends p0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}