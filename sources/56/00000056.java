package a30;

import a00.c;
import h00.l;
import hy.o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.u;
import v20.p;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: a30.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0008a<T> implements o<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.o<T> f229a;

        /* JADX WARN: Multi-variable type inference failed */
        C0008a(v20.o<? super T> oVar) {
            this.f229a = oVar;
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            a.b(this.f229a, bVar);
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            v20.o<T> oVar = this.f229a;
            q.a aVar = q.f54772b;
            oVar.resumeWith(q.b(r.a(th2)));
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            v20.o<T> oVar = this.f229a;
            q.a aVar = q.f54772b;
            oVar.resumeWith(q.b(t11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends u implements l<Throwable, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ iy.b f230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b bVar) {
            super(1);
            this.f230a = bVar;
        }

        public final void a(Throwable th2) {
            this.f230a.dispose();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    public static final <T> Object a(hy.q<T> qVar, d<? super T> dVar) {
        d c11;
        Object d11;
        c11 = c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        qVar.a(new C0008a(pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            h.c(dVar);
        }
        return s11;
    }

    public static final void b(v20.o<?> oVar, iy.b bVar) {
        oVar.T(new b(bVar));
    }
}