package v20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.e;
import zz.g;

/* loaded from: classes5.dex */
public abstract class j0 extends zz.a implements zz.e {

    /* renamed from: a */
    public static final a f53957a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a extends zz.b<zz.e, j0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v20.j0$a$a */
        /* loaded from: classes5.dex */
        public static final class C1211a extends kotlin.jvm.internal.u implements h00.l<g.b, j0> {

            /* renamed from: a */
            public static final C1211a f53958a = new C1211a();

            C1211a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final j0 invoke(g.b bVar) {
                if (bVar instanceof j0) {
                    return (j0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(zz.e.f61277h3, C1211a.f53958a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j0() {
        super(zz.e.f61277h3);
    }

    @Override // zz.e
    public final void C(zz.d<?> dVar) {
        ((kotlinx.coroutines.internal.i) dVar).p();
    }

    @Override // zz.e
    public final <T> zz.d<T> D0(zz.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.i(this, dVar);
    }

    public abstract void I0(zz.g gVar, Runnable runnable);

    public void J0(zz.g gVar, Runnable runnable) {
        I0(gVar, runnable);
    }

    public boolean P0(zz.g gVar) {
        return true;
    }

    public j0 Q0(int i11) {
        kotlinx.coroutines.internal.p.a(i11);
        return new kotlinx.coroutines.internal.o(this, i11);
    }

    @Override // zz.a, zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // zz.a, zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return s0.a(this) + '@' + s0.b(this);
    }
}