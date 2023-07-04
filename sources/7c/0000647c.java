package cw;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;

/* loaded from: classes6.dex */
public final class g implements x20.e<Uri> {

    /* renamed from: b  reason: collision with root package name */
    private static final x20.e<Uri> f23155b;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ x20.e<Uri> f23156a = f23155b;

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
        f23155b = x20.h.b(0, null, null, 6, null);
    }

    @Override // x20.x
    /* renamed from: a */
    public boolean offer(Uri uri) {
        return this.f23156a.offer(uri);
    }

    @Override // x20.t
    public boolean c() {
        return this.f23156a.c();
    }

    @Override // x20.t
    public Object e(zz.d<? super Uri> dVar) {
        return this.f23156a.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<Uri> f() {
        return this.f23156a.f();
    }

    @Override // x20.x
    /* renamed from: g */
    public Object b(Uri uri, zz.d<? super b0> dVar) {
        return this.f23156a.b(uri, dVar);
    }

    public final Object h(Uri uri) {
        return x20.j.b(f23155b, uri);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<x20.i<Uri>> i() {
        return this.f23156a.i();
    }

    @Override // x20.t
    public x20.g<Uri> iterator() {
        return this.f23156a.iterator();
    }

    @Override // x20.t
    public void j(CancellationException cancellationException) {
        this.f23156a.j(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super x20.i<? extends Uri>> dVar) {
        Object k11 = this.f23156a.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f23156a.l();
    }

    @Override // x20.x
    /* renamed from: m */
    public Object d(Uri uri) {
        return this.f23156a.d(uri);
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f23156a.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f23156a.r();
    }
}