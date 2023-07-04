package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.g0;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
abstract class m implements g0 {

    /* renamed from: a  reason: collision with root package name */
    protected final g0 f2453a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<a> f2454b = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(g0 g0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(g0 g0Var) {
        this.f2453a = g0Var;
    }

    @Override // androidx.camera.core.g0
    public synchronized Rect M0() {
        return this.f2453a.M0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(a aVar) {
        this.f2454b.add(aVar);
    }

    @Override // androidx.camera.core.g0
    public synchronized void c0(Rect rect) {
        this.f2453a.c0(rect);
    }

    @Override // androidx.camera.core.g0, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f2453a.close();
        }
        g();
    }

    protected void g() {
        HashSet<a> hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f2454b);
        }
        for (a aVar : hashSet) {
            aVar.a(this);
        }
    }

    @Override // androidx.camera.core.g0
    public synchronized int getFormat() {
        return this.f2453a.getFormat();
    }

    @Override // androidx.camera.core.g0
    public synchronized int getHeight() {
        return this.f2453a.getHeight();
    }

    @Override // androidx.camera.core.g0
    public synchronized int getWidth() {
        return this.f2453a.getWidth();
    }

    @Override // androidx.camera.core.g0
    public synchronized z.j0 l1() {
        return this.f2453a.l1();
    }

    @Override // androidx.camera.core.g0
    public synchronized Image u1() {
        return this.f2453a.u1();
    }

    @Override // androidx.camera.core.g0
    public synchronized g0.a[] x0() {
        return this.f2453a.x0();
    }
}