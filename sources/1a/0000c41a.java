package z2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.joran.action.ActionConst;
import f2.l0;
import java.util.ArrayList;
import o1.f;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: d  reason: collision with root package name */
    private b f60109d;

    /* renamed from: e  reason: collision with root package name */
    private final int f60110e;

    /* renamed from: f  reason: collision with root package name */
    private int f60111f = this.f60110e;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<e> f60112g = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends z0 implements l0 {

        /* renamed from: b  reason: collision with root package name */
        private final e f60113b;

        /* renamed from: c  reason: collision with root package name */
        private final h00.l<d, vz.b0> f60114c;

        /* renamed from: z2.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1372a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f60115a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l f60116b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1372a(e eVar, h00.l lVar) {
                super(1);
                this.f60115a = eVar;
                this.f60116b = lVar;
            }

            public final void a(y0 y0Var) {
                kotlin.jvm.internal.s.g(y0Var, "$this$null");
                y0Var.b("constrainAs");
                y0Var.a().b(ActionConst.REF_ATTRIBUTE, this.f60115a);
                y0Var.a().b("constrainBlock", this.f60116b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
                a(y0Var);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e ref, h00.l<? super d, vz.b0> constrainBlock) {
            super(x0.c() ? new C1372a(ref, constrainBlock) : x0.a());
            kotlin.jvm.internal.s.g(ref, "ref");
            kotlin.jvm.internal.s.g(constrainBlock, "constrainBlock");
            this.f60113b = ref;
            this.f60114c = constrainBlock;
        }

        @Override // o1.f
        public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
            return (R) l0.a.b(this, r11, pVar);
        }

        @Override // o1.f
        public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
            return (R) l0.a.c(this, r11, pVar);
        }

        @Override // f2.l0
        /* renamed from: b */
        public j J(x2.d dVar, Object obj) {
            kotlin.jvm.internal.s.g(dVar, "<this>");
            return new j(this.f60113b, this.f60114c);
        }

        public boolean equals(Object obj) {
            h00.l<d, vz.b0> lVar = this.f60114c;
            a aVar = obj instanceof a ? (a) obj : null;
            return kotlin.jvm.internal.s.c(lVar, aVar != null ? aVar.f60114c : null);
        }

        @Override // o1.f
        public o1.f g0(o1.f fVar) {
            return l0.a.d(this, fVar);
        }

        public int hashCode() {
            return this.f60114c.hashCode();
        }

        @Override // o1.f
        public boolean p(h00.l<? super f.c, Boolean> lVar) {
            return l0.a.a(this, lVar);
        }
    }

    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f60117a;

        public b(k this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f60117a = this$0;
        }

        public final e a() {
            return this.f60117a.e();
        }

        public final e b() {
            return this.f60117a.e();
        }

        public final e c() {
            return this.f60117a.e();
        }

        public final e d() {
            return this.f60117a.e();
        }
    }

    @Override // z2.h
    public void c() {
        super.c();
        this.f60111f = this.f60110e;
    }

    public final o1.f d(o1.f fVar, e ref, h00.l<? super d, vz.b0> constrainBlock) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(ref, "ref");
        kotlin.jvm.internal.s.g(constrainBlock, "constrainBlock");
        return fVar.g0(new a(ref, constrainBlock));
    }

    public final e e() {
        ArrayList<e> arrayList = this.f60112g;
        int i11 = this.f60111f;
        this.f60111f = i11 + 1;
        e eVar = (e) wz.u.e0(arrayList, i11);
        if (eVar == null) {
            e eVar2 = new e(Integer.valueOf(this.f60111f));
            this.f60112g.add(eVar2);
            return eVar2;
        }
        return eVar;
    }

    public final b f() {
        b bVar = this.f60109d;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f60109d = bVar2;
            return bVar2;
        }
        return bVar;
    }
}