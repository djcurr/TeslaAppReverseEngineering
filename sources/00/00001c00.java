package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.z0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<j.b> f13793a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<j.b> f13794b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final k.a f13795c = new k.a();

    /* renamed from: d  reason: collision with root package name */
    private final f.a f13796d = new f.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f13797e;

    /* renamed from: f  reason: collision with root package name */
    private z0 f13798f;

    protected abstract void A(zj.n nVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(z0 z0Var) {
        this.f13798f = z0Var;
        Iterator<j.b> it2 = this.f13793a.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, z0Var);
        }
    }

    protected abstract void C();

    @Override // com.google.android.exoplayer2.source.j
    public final void a(j.b bVar, zj.n nVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f13797e;
        ak.a.a(looper == null || looper == myLooper);
        z0 z0Var = this.f13798f;
        this.f13793a.add(bVar);
        if (this.f13797e == null) {
            this.f13797e = myLooper;
            this.f13794b.add(bVar);
            A(nVar);
        } else if (z0Var != null) {
            h(bVar);
            bVar.a(this, z0Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void b(j.b bVar) {
        this.f13793a.remove(bVar);
        if (this.f13793a.isEmpty()) {
            this.f13797e = null;
            this.f13798f = null;
            this.f13794b.clear();
            C();
            return;
        }
        l(bVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void d(Handler handler, k kVar) {
        ak.a.e(handler);
        ak.a.e(kVar);
        this.f13795c.g(handler, kVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void e(k kVar) {
        this.f13795c.C(kVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void h(j.b bVar) {
        ak.a.e(this.f13797e);
        boolean isEmpty = this.f13794b.isEmpty();
        this.f13794b.add(bVar);
        if (isEmpty) {
            y();
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void l(j.b bVar) {
        boolean z11 = !this.f13794b.isEmpty();
        this.f13794b.remove(bVar);
        if (z11 && this.f13794b.isEmpty()) {
            x();
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void o(Handler handler, com.google.android.exoplayer2.drm.f fVar) {
        ak.a.e(handler);
        ak.a.e(fVar);
        this.f13796d.g(handler, fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f.a s(int i11, j.a aVar) {
        return this.f13796d.t(i11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f.a t(j.a aVar) {
        return this.f13796d.t(0, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a u(int i11, j.a aVar, long j11) {
        return this.f13795c.F(i11, aVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a v(j.a aVar) {
        return this.f13795c.F(0, aVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a w(j.a aVar, long j11) {
        ak.a.e(aVar);
        return this.f13795c.F(0, aVar, j11);
    }

    protected void x() {
    }

    protected void y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        return !this.f13794b.isEmpty();
    }
}