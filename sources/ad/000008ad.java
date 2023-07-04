package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements s {

    /* renamed from: a */
    private final c f5932a;

    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.b {

        /* renamed from: a */
        final Set<String> f5933a = new HashSet();

        public a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5933a));
            return bundle;
        }

        public void b(String str) {
            this.f5933a.add(str);
        }
    }

    public Recreator(c cVar) {
        this.f5932a = cVar;
    }

    private void a(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f5932a);
                } catch (Exception e11) {
                    throw new RuntimeException("Failed to instantiate " + str, e11);
                }
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("Class " + str + " wasn't found", e13);
        }
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        if (bVar == p.b.ON_CREATE) {
            vVar.getLifecycle().c(this);
            Bundle a11 = this.f5932a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a11 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a11.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it2 = stringArrayList.iterator();
                while (it2.hasNext()) {
                    a(it2.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}