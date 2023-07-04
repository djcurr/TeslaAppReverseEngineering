package u0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.h;
import l2.o;
import l2.t;
import l2.v;
import m0.p;
import m0.r;
import o0.l;
import o0.m;
import o1.e;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1182a extends u implements q<f, i, Integer, f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f52812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f52813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1182a(boolean z11, boolean z12, h hVar, h00.a<b0> aVar) {
            super(3);
            this.f52810a = z11;
            this.f52811b = z12;
            this.f52812c = hVar;
            this.f52813d = aVar;
        }

        public final f a(f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(-1824931993);
            f.a aVar = f.f42062f1;
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == i.f8486a.a()) {
                y11 = l.a();
                iVar.p(y11);
            }
            iVar.N();
            f a11 = a.a(aVar, this.f52810a, (m) y11, (p) iVar.A(r.a()), this.f52811b, this.f52812c, this.f52813d);
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ f invoke(f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements h00.l<v, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11) {
            super(1);
            this.f52814a = z11;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(v vVar) {
            invoke2(vVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(v semantics) {
            s.g(semantics, "$this$semantics");
            t.M(semantics, this.f52814a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f52816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f52817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f52818d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f52819e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.a f52820f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, m mVar, p pVar, boolean z12, h hVar, h00.a aVar) {
            super(1);
            this.f52815a = z11;
            this.f52816b = mVar;
            this.f52817c = pVar;
            this.f52818d = z12;
            this.f52819e = hVar;
            this.f52820f = aVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("selectable");
            y0Var.a().b("selected", Boolean.valueOf(this.f52815a));
            y0Var.a().b("interactionSource", this.f52816b);
            y0Var.a().b("indication", this.f52817c);
            y0Var.a().b("enabled", Boolean.valueOf(this.f52818d));
            y0Var.a().b("role", this.f52819e);
            y0Var.a().b("onClick", this.f52820f);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f52821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f52823c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.a f52824d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, boolean z12, h hVar, h00.a aVar) {
            super(1);
            this.f52821a = z11;
            this.f52822b = z12;
            this.f52823c = hVar;
            this.f52824d = aVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("selectable");
            y0Var.a().b("selected", Boolean.valueOf(this.f52821a));
            y0Var.a().b("enabled", Boolean.valueOf(this.f52822b));
            y0Var.a().b("role", this.f52823c);
            y0Var.a().b("onClick", this.f52824d);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final f a(f selectable, boolean z11, m interactionSource, p pVar, boolean z12, h hVar, h00.a<b0> onClick) {
        s.g(selectable, "$this$selectable");
        s.g(interactionSource, "interactionSource");
        s.g(onClick, "onClick");
        return x0.b(selectable, x0.c() ? new c(z11, interactionSource, pVar, z12, hVar, onClick) : x0.a(), o.b(m0.h.c(f.f42062f1, interactionSource, pVar, z12, null, hVar, onClick, 8, null), false, new b(z11), 1, null));
    }

    public static final f b(f selectable, boolean z11, boolean z12, h hVar, h00.a<b0> onClick) {
        s.g(selectable, "$this$selectable");
        s.g(onClick, "onClick");
        return e.a(selectable, x0.c() ? new d(z11, z12, hVar, onClick) : x0.a(), new C1182a(z11, z12, hVar, onClick));
    }

    public static /* synthetic */ f c(f fVar, boolean z11, boolean z12, h hVar, h00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            hVar = null;
        }
        return b(fVar, z11, z12, hVar, aVar);
    }
}