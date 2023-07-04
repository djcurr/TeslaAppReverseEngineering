package cw;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;

/* loaded from: classes6.dex */
public final class l implements x20.e<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private static final x20.e<Boolean> f23160b;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ x20.e<Boolean> f23161a = f23160b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f23160b = x20.h.b(0, null, null, 6, null);
    }

    public boolean a(boolean z11) {
        return this.f23161a.offer(Boolean.valueOf(z11));
    }

    @Override // x20.x
    public /* bridge */ /* synthetic */ Object b(Object obj, zz.d dVar) {
        return g(((Boolean) obj).booleanValue(), dVar);
    }

    @Override // x20.t
    public boolean c() {
        return this.f23161a.c();
    }

    @Override // x20.x
    public /* bridge */ /* synthetic */ Object d(Object obj) {
        return m(((Boolean) obj).booleanValue());
    }

    @Override // x20.t
    public Object e(zz.d<? super Boolean> dVar) {
        return this.f23161a.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<Boolean> f() {
        return this.f23161a.f();
    }

    public Object g(boolean z11, zz.d<? super b0> dVar) {
        return this.f23161a.b(Boolean.valueOf(z11), dVar);
    }

    public final Object h(boolean z11) {
        return x20.j.b(f23160b, Boolean.valueOf(z11));
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<x20.i<Boolean>> i() {
        return this.f23161a.i();
    }

    @Override // x20.t
    public x20.g<Boolean> iterator() {
        return this.f23161a.iterator();
    }

    @Override // x20.t
    public void j(CancellationException cancellationException) {
        this.f23161a.j(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super x20.i<Boolean>> dVar) {
        Object k11 = this.f23161a.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f23161a.l();
    }

    public Object m(boolean z11) {
        return this.f23161a.d(Boolean.valueOf(z11));
    }

    @Override // x20.x
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return a(((Boolean) obj).booleanValue());
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f23161a.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f23161a.r();
    }
}