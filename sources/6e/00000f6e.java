package c2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c2.e;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c2.a f8741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f8742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c2.a aVar, d dVar) {
            super(1);
            this.f8741a = aVar;
            this.f8742b = dVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("nestedScroll");
            y0Var.a().b("connection", this.f8741a);
            y0Var.a().b("dispatcher", this.f8742b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements q<o1.f, i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c2.a f8744b;

        /* loaded from: classes.dex */
        public static final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            private final d f8745a;

            /* renamed from: b  reason: collision with root package name */
            private final c2.a f8746b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f8747c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c2.a f8748d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o0 f8749e;

            a(d dVar, c2.a aVar, o0 o0Var) {
                this.f8747c = dVar;
                this.f8748d = aVar;
                this.f8749e = o0Var;
                dVar.j(o0Var);
                this.f8745a = dVar;
                this.f8746b = aVar;
            }

            @Override // o1.f
            public <R> R C(R r11, p<? super R, ? super f.c, ? extends R> pVar) {
                return (R) e.a.b(this, r11, pVar);
            }

            @Override // o1.f
            public <R> R a0(R r11, p<? super f.c, ? super R, ? extends R> pVar) {
                return (R) e.a.c(this, r11, pVar);
            }

            @Override // o1.f
            public o1.f g0(o1.f fVar) {
                return e.a.d(this, fVar);
            }

            @Override // c2.e
            public c2.a getConnection() {
                return this.f8746b;
            }

            @Override // o1.f
            public boolean p(l<? super f.c, Boolean> lVar) {
                return e.a.a(this, lVar);
            }

            @Override // c2.e
            public d q0() {
                return this.f8745a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, c2.a aVar) {
            super(3);
            this.f8743a = dVar;
            this.f8744b = aVar;
        }

        public final o1.f a(o1.f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(100476458);
            iVar.x(-723524056);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = i.f8486a;
            if (y11 == aVar.a()) {
                Object sVar = new c1.s(c1.b0.j(zz.h.f61280a, iVar));
                iVar.p(sVar);
                y11 = sVar;
            }
            iVar.N();
            o0 a11 = ((c1.s) y11).a();
            iVar.N();
            d dVar = this.f8743a;
            iVar.x(100476571);
            if (dVar == null) {
                iVar.x(-3687241);
                Object y12 = iVar.y();
                if (y12 == aVar.a()) {
                    y12 = new d();
                    iVar.p(y12);
                }
                iVar.N();
                dVar = (d) y12;
            }
            iVar.N();
            c2.a aVar2 = this.f8744b;
            iVar.x(-3686095);
            boolean O = iVar.O(aVar2) | iVar.O(dVar) | iVar.O(a11);
            Object y13 = iVar.y();
            if (O || y13 == aVar.a()) {
                y13 = new a(dVar, aVar2, a11);
                iVar.p(y13);
            }
            iVar.N();
            a aVar3 = (a) y13;
            iVar.N();
            return aVar3;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, c2.a connection, d dVar) {
        s.g(fVar, "<this>");
        s.g(connection, "connection");
        return o1.e.a(fVar, x0.c() ? new a(connection, dVar) : x0.a(), new b(dVar, connection));
    }

    public static /* synthetic */ o1.f b(o1.f fVar, c2.a aVar, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        return a(fVar, aVar, dVar);
    }
}