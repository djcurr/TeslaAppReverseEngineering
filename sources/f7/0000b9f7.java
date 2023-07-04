package va;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Set<com.bumptech.glide.request.d> f54450a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final List<com.bumptech.glide.request.d> f54451b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f54452c;

    public boolean a(com.bumptech.glide.request.d dVar) {
        boolean z11 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f54450a.remove(dVar);
        if (!this.f54451b.remove(dVar) && !remove) {
            z11 = false;
        }
        if (z11) {
            dVar.clear();
        }
        return z11;
    }

    public void b() {
        for (com.bumptech.glide.request.d dVar : bb.k.j(this.f54450a)) {
            a(dVar);
        }
        this.f54451b.clear();
    }

    public boolean c() {
        return this.f54452c;
    }

    public void d() {
        this.f54452c = true;
        for (com.bumptech.glide.request.d dVar : bb.k.j(this.f54450a)) {
            if (dVar.isRunning() || dVar.isComplete()) {
                dVar.clear();
                this.f54451b.add(dVar);
            }
        }
    }

    public void e() {
        this.f54452c = true;
        for (com.bumptech.glide.request.d dVar : bb.k.j(this.f54450a)) {
            if (dVar.isRunning()) {
                dVar.d();
                this.f54451b.add(dVar);
            }
        }
    }

    public void f() {
        for (com.bumptech.glide.request.d dVar : bb.k.j(this.f54450a)) {
            if (!dVar.isComplete() && !dVar.f()) {
                dVar.clear();
                if (!this.f54452c) {
                    dVar.i();
                } else {
                    this.f54451b.add(dVar);
                }
            }
        }
    }

    public void g() {
        this.f54452c = false;
        for (com.bumptech.glide.request.d dVar : bb.k.j(this.f54450a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.i();
            }
        }
        this.f54451b.clear();
    }

    public void h(com.bumptech.glide.request.d dVar) {
        this.f54450a.add(dVar);
        if (!this.f54452c) {
            dVar.i();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f54451b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f54450a.size() + ", isPaused=" + this.f54452c + "}";
    }
}