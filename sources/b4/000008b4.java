package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f5941a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f5942b = new SavedStateRegistry();

    private b(c cVar) {
        this.f5941a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f5942b;
    }

    public void c(Bundle bundle) {
        p lifecycle = this.f5941a.getLifecycle();
        if (lifecycle.b() == p.c.INITIALIZED) {
            lifecycle.a(new Recreator(this.f5941a));
            this.f5942b.b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f5942b.c(bundle);
    }
}