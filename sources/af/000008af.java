package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f5935b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5936c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f5937d;

    /* renamed from: a  reason: collision with root package name */
    private o.b<String, b> f5934a = new o.b<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f5938e = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f5936c) {
            Bundle bundle = this.f5935b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f5935b.remove(str);
                if (this.f5935b.isEmpty()) {
                    this.f5935b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(p pVar, Bundle bundle) {
        if (!this.f5936c) {
            if (bundle != null) {
                this.f5935b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            pVar.a(new s() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.s
                public void g(v vVar, p.b bVar) {
                    if (bVar == p.b.ON_START) {
                        SavedStateRegistry.this.f5938e = true;
                    } else if (bVar == p.b.ON_STOP) {
                        SavedStateRegistry.this.f5938e = false;
                    }
                }
            });
            this.f5936c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5935b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.b<String, b>.d d11 = this.f5934a.d();
        while (d11.hasNext()) {
            Map.Entry next = d11.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.f5934a.h(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.f5938e) {
            if (this.f5937d == null) {
                this.f5937d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f5937d.b(cls.getName());
                return;
            } catch (NoSuchMethodException e11) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void f(String str) {
        this.f5934a.i(str);
    }
}