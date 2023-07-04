package t0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.y;
import c1.z;
import f2.g0;
import f2.o;
import g2.b;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0.b f51256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0.b bVar) {
            super(1);
            this.f51256a = bVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("bringIntoViewRequester");
            y0Var.a().b("bringIntoViewRequester", this.f51256a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements q<o1.f, i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0.b f51257a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends u implements l<z, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0.b f51258a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t0.a f51259b;

            /* renamed from: t0.d$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1134a implements y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t0.b f51260a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ t0.a f51261b;

                public C1134a(t0.b bVar, t0.a aVar) {
                    this.f51260a = bVar;
                    this.f51261b = aVar;
                }

                @Override // c1.y
                public void dispose() {
                    ((t0.c) this.f51260a).b().q(this.f51261b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0.b bVar, t0.a aVar) {
                super(1);
                this.f51258a = bVar;
                this.f51259b = aVar;
            }

            @Override // h00.l
            public final y invoke(z DisposableEffect) {
                s.g(DisposableEffect, "$this$DisposableEffect");
                ((t0.c) this.f51258a).b().b(this.f51259b);
                return new C1134a(this.f51258a, this.f51259b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t0.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1135b extends u implements l<o, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0.a f51262a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1135b(t0.a aVar) {
                super(1);
                this.f51262a = aVar;
            }

            public final void a(o it2) {
                s.g(it2, "it");
                this.f51262a.d(it2);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(o oVar) {
                a(oVar);
                return b0.f54756a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements g2.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t0.a f51263a;

            c(t0.a aVar) {
                this.f51263a = aVar;
            }

            @Override // o1.f
            public <R> R C(R r11, p<? super R, ? super f.c, ? extends R> pVar) {
                return (R) b.a.b(this, r11, pVar);
            }

            @Override // o1.f
            public <R> R a0(R r11, p<? super f.c, ? super R, ? extends R> pVar) {
                return (R) b.a.c(this, r11, pVar);
            }

            @Override // o1.f
            public o1.f g0(o1.f fVar) {
                return b.a.d(this, fVar);
            }

            @Override // g2.b
            public void n0(g2.e scope) {
                s.g(scope, "scope");
                this.f51263a.e((e) scope.g0(e.f51264j1.a()));
            }

            @Override // o1.f
            public boolean p(l<? super f.c, Boolean> lVar) {
                return b.a.a(this, lVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0.b bVar) {
            super(3);
            this.f51257a = bVar;
        }

        public final o1.f a(o1.f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(-1614341944);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = i.f8486a;
            if (y11 == aVar.a()) {
                y11 = new t0.a(new f(), null, null, 6, null);
                iVar.p(y11);
            }
            iVar.N();
            t0.a aVar2 = (t0.a) y11;
            iVar.x(-1614341844);
            t0.b bVar = this.f51257a;
            if (bVar instanceof t0.c) {
                c1.b0.a(bVar, new a(bVar, aVar2), iVar, 0);
            }
            iVar.N();
            o1.f a11 = g0.a(g.b(o1.f.f42062f1, aVar2.a()), new C1135b(aVar2));
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = new c(aVar2);
                iVar.p(y12);
            }
            iVar.N();
            o1.f g02 = a11.g0((o1.f) y12);
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final t0.b a() {
        return new c();
    }

    public static final o1.f b(o1.f fVar, t0.b bringIntoViewRequester) {
        s.g(fVar, "<this>");
        s.g(bringIntoViewRequester, "bringIntoViewRequester");
        return o1.e.a(fVar, x0.c() ? new a(bringIntoViewRequester) : x0.a(), new b(bringIntoViewRequester));
    }
}