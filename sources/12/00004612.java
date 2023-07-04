package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.c0;
import com.plaid.internal.h7;
import com.plaid.internal.i0;
import com.plaid.internal.lc;
import com.plaid.internal.mb;
import com.plaid.internal.n;
import com.plaid.internal.n0;
import com.plaid.internal.n3;
import com.plaid.internal.q;
import com.plaid.internal.q7;
import com.plaid.internal.s2;
import com.plaid.internal.s3;
import com.plaid.internal.t1;
import com.plaid.internal.uc;
import com.plaid.internal.v;
import com.plaid.internal.w0;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import com.plaid.internal.x5;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class x2 implements k4 {
    public Provider<ab> A;

    /* renamed from: a */
    public final g5 f19747a;

    /* renamed from: b */
    public final m4 f19748b;

    /* renamed from: c */
    public final x2 f19749c = this;

    /* renamed from: d */
    public Provider<w5> f19750d;

    /* renamed from: e */
    public Provider<j6> f19751e;

    /* renamed from: f */
    public Provider<md> f19752f;

    /* renamed from: g */
    public Provider<WorkflowDatabase> f19753g;

    /* renamed from: h */
    public Provider<m6> f19754h;

    /* renamed from: i */
    public Provider<a8> f19755i;

    /* renamed from: j */
    public Provider<Application> f19756j;

    /* renamed from: k */
    public Provider<g3> f19757k;

    /* renamed from: l */
    public Provider<na> f19758l;

    /* renamed from: m */
    public Provider<k3> f19759m;

    /* renamed from: n */
    public Provider<i6> f19760n;

    /* renamed from: o */
    public Provider<w6> f19761o;

    /* renamed from: p */
    public Provider<l7> f19762p;

    /* renamed from: q */
    public Provider<be> f19763q;

    /* renamed from: r */
    public Provider<dd> f19764r;

    /* renamed from: s */
    public Provider<ce> f19765s;

    /* renamed from: t */
    public Provider<cb> f19766t;

    /* renamed from: u */
    public Provider<p5> f19767u;

    /* renamed from: v */
    public Provider<db> f19768v;

    /* renamed from: w */
    public Provider<e9> f19769w;

    /* renamed from: x */
    public Provider<com.plaid.internal.e> f19770x;

    /* renamed from: y */
    public Provider<bb> f19771y;

    /* renamed from: z */
    public Provider<kotlinx.serialization.json.a> f19772z;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public m4 f19773a;

        /* renamed from: b */
        public g5 f19774b;

        public a a(m4 m4Var) {
            this.f19773a = (m4) tw.h.b(m4Var);
            return this;
        }

        public a a(g5 g5Var) {
            this.f19774b = (g5) tw.h.b(g5Var);
            return this;
        }

        public k4 a() {
            if (this.f19773a == null) {
                this.f19773a = new m4();
            }
            tw.h.a(this.f19774b, g5.class);
            return new x2(this.f19773a, this.f19774b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 implements q7 {

        /* renamed from: a */
        public final x2 f19775a;

        public a0(x2 x2Var) {
            this.f19775a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(s7 s7Var) {
            s7 s7Var2 = s7Var;
            s7Var2.f19841c = this.f19775a.f19767u.mo0get();
            s7Var2.f19842d = this.f19775a.f19766t.mo0get();
            s7Var2.f19843e = this.f19775a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements n.a {

        /* renamed from: a */
        public final x2 f19776a;

        public b(x2 x2Var) {
            this.f19776a = x2Var;
        }

        public Object a() {
            return new c(this.f19776a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 implements mb.a {

        /* renamed from: a */
        public final x2 f19777a;

        public b0(x2 x2Var) {
            this.f19777a = x2Var;
        }

        public Object a() {
            return new c0(this.f19777a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements com.plaid.internal.n {

        /* renamed from: a */
        public final x2 f19778a;

        public c(x2 x2Var) {
            this.f19778a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(com.plaid.internal.t tVar) {
            com.plaid.internal.t tVar2 = tVar;
            tVar2.f19841c = this.f19778a.f19767u.mo0get();
            tVar2.f19842d = this.f19778a.f19766t.mo0get();
            tVar2.f19843e = this.f19778a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 implements mb {

        /* renamed from: a */
        public final x2 f19779a;

        public c0(x2 x2Var) {
            this.f19779a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(pb pbVar) {
            pb pbVar2 = pbVar;
            pbVar2.f19841c = this.f19779a.f19767u.mo0get();
            pbVar2.f19842d = this.f19779a.f19766t.mo0get();
            pbVar2.f19843e = this.f19779a.f19754h.mo0get();
            pbVar2.f19228h = x2.a(this.f19779a);
            tw.d.a(this.f19779a.f19772z);
            pbVar2.f19229i = this.f19779a.f19770x.mo0get();
            pbVar2.f19230j = this.f19779a.A.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements q.a {

        /* renamed from: a */
        public final x2 f19780a;

        public d(x2 x2Var) {
            this.f19780a = x2Var;
        }

        public Object a() {
            return new e(this.f19780a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 implements lc.a {

        /* renamed from: a */
        public final x2 f19781a;

        public d0(x2 x2Var) {
            this.f19781a = x2Var;
        }

        public Object a() {
            return new e0(this.f19781a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements com.plaid.internal.q {

        /* renamed from: a */
        public final x2 f19782a;

        public e(x2 x2Var) {
            this.f19782a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(com.plaid.internal.s sVar) {
            com.plaid.internal.s sVar2 = sVar;
            sVar2.f19841c = this.f19782a.f19767u.mo0get();
            sVar2.f19842d = this.f19782a.f19766t.mo0get();
            sVar2.f19843e = this.f19782a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 implements lc {

        /* renamed from: a */
        public final x2 f19783a;

        public e0(x2 x2Var) {
            this.f19783a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(sc scVar) {
            sc scVar2 = scVar;
            scVar2.f19841c = this.f19783a.f19767u.mo0get();
            scVar2.f19842d = this.f19783a.f19766t.mo0get();
            scVar2.f19843e = this.f19783a.f19754h.mo0get();
            scVar2.f19458l = new e4(this.f19783a.f19770x.mo0get());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements v.a {

        /* renamed from: a */
        public final x2 f19784a;

        public f(x2 x2Var) {
            this.f19784a = x2Var;
        }

        public Object a() {
            return new g(this.f19784a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 implements uc.a {

        /* renamed from: a */
        public final x2 f19785a;

        public f0(x2 x2Var) {
            this.f19785a = x2Var;
        }

        public Object a() {
            return new g0(this.f19785a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements com.plaid.internal.v {

        /* renamed from: a */
        public final x2 f19786a;

        public g(x2 x2Var) {
            this.f19786a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(com.plaid.internal.z zVar) {
            com.plaid.internal.z zVar2 = zVar;
            zVar2.f19841c = this.f19786a.f19767u.mo0get();
            zVar2.f19842d = this.f19786a.f19766t.mo0get();
            zVar2.f19843e = this.f19786a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 implements uc {

        /* renamed from: a */
        public final x2 f19787a;

        public g0(x2 x2Var) {
            this.f19787a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(yc ycVar) {
            yc ycVar2 = ycVar;
            ycVar2.f19841c = this.f19787a.f19767u.mo0get();
            ycVar2.f19842d = this.f19787a.f19766t.mo0get();
            ycVar2.f19843e = this.f19787a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements c0.a {

        /* renamed from: a */
        public final x2 f19788a;

        public h(x2 x2Var) {
            this.f19788a = x2Var;
        }

        public Object a() {
            return new i(this.f19788a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 implements Provider<Application> {

        /* renamed from: a */
        public final g5 f19789a;

        public h0(g5 g5Var) {
            this.f19789a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public Application mo0get() {
            return (Application) tw.h.d(this.f19789a.g());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements com.plaid.internal.c0 {

        /* renamed from: a */
        public final x2 f19790a;

        public i(x2 x2Var) {
            this.f19790a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(com.plaid.internal.f0 f0Var) {
            com.plaid.internal.f0 f0Var2 = f0Var;
            f0Var2.f19841c = this.f19790a.f19767u.mo0get();
            f0Var2.f19842d = this.f19790a.f19766t.mo0get();
            f0Var2.f19843e = this.f19790a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 implements Provider<l3> {

        /* renamed from: a */
        public final g5 f19791a;

        public i0(g5 g5Var) {
            this.f19791a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public l3 mo0get() {
            return (l3) tw.h.d(this.f19791a.f());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements i0.a {

        /* renamed from: a */
        public final x2 f19792a;

        public j(x2 x2Var) {
            this.f19792a = x2Var;
        }

        public Object a() {
            return new k(this.f19792a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 implements Provider<kotlinx.serialization.json.a> {

        /* renamed from: a */
        public final g5 f19793a;

        public j0(g5 g5Var) {
            this.f19793a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public kotlinx.serialization.json.a mo0get() {
            return (kotlinx.serialization.json.a) tw.h.d(this.f19793a.h());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements com.plaid.internal.i0 {

        /* renamed from: a */
        public final x2 f19794a;

        public k(x2 x2Var) {
            this.f19794a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(com.plaid.internal.k0 k0Var) {
            com.plaid.internal.k0 k0Var2 = k0Var;
            k0Var2.f19841c = this.f19794a.f19767u.mo0get();
            k0Var2.f19842d = this.f19794a.f19766t.mo0get();
            k0Var2.f19843e = this.f19794a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 implements Provider<j6> {

        /* renamed from: a */
        public final g5 f19795a;

        public k0(g5 g5Var) {
            this.f19795a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public j6 mo0get() {
            return (j6) tw.h.d(this.f19795a.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements n0.a {

        /* renamed from: a */
        public final x2 f19796a;

        public l(x2 x2Var) {
            this.f19796a = x2Var;
        }

        public Object a() {
            return new m(this.f19796a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 implements Provider<g9> {

        /* renamed from: a */
        public final g5 f19797a;

        public l0(g5 g5Var) {
            this.f19797a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public g9 mo0get() {
            return (g9) tw.h.d(this.f19797a.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements com.plaid.internal.n0 {

        /* renamed from: a */
        public final x2 f19798a;

        public m(x2 x2Var) {
            this.f19798a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(s0 s0Var) {
            s0 s0Var2 = s0Var;
            s0Var2.f19841c = this.f19798a.f19767u.mo0get();
            s0Var2.f19842d = this.f19798a.f19766t.mo0get();
            s0Var2.f19843e = this.f19798a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 implements Provider<ja> {

        /* renamed from: a */
        public final g5 f19799a;

        public m0(g5 g5Var) {
            this.f19799a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public ja mo0get() {
            return (ja) tw.h.d(this.f19799a.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n implements w0.a {

        /* renamed from: a */
        public final x2 f19800a;

        public n(x2 x2Var) {
            this.f19800a = x2Var;
        }

        public Object a() {
            return new o(this.f19800a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 implements Provider<WorkflowDatabase> {

        /* renamed from: a */
        public final g5 f19801a;

        public n0(g5 g5Var) {
            this.f19801a = g5Var;
        }

        @Override // javax.inject.Provider
        /* renamed from: get */
        public WorkflowDatabase mo0get() {
            return (WorkflowDatabase) tw.h.d(this.f19801a.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements w0 {

        /* renamed from: a */
        public final x2 f19802a;

        public o(x2 x2Var) {
            this.f19802a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(z0 z0Var) {
            z0 z0Var2 = z0Var;
            z0Var2.f19841c = this.f19802a.f19767u.mo0get();
            z0Var2.f19842d = this.f19802a.f19766t.mo0get();
            z0Var2.f19843e = this.f19802a.f19754h.mo0get();
            z0Var2.f19930h = (kotlinx.serialization.json.a) tw.h.d(this.f19802a.f19747a.h());
            z0Var2.f19931i = (g9) tw.h.d(this.f19802a.f19747a.b());
            z0Var2.f19932j = x2.a(this.f19802a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements t1.a {

        /* renamed from: a */
        public final x2 f19803a;

        public p(x2 x2Var) {
            this.f19803a = x2Var;
        }

        public Object a() {
            return new q(this.f19803a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements t1 {

        /* renamed from: a */
        public final x2 f19804a;

        public q(x2 x2Var) {
            this.f19804a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(x1 x1Var) {
            x1 x1Var2 = x1Var;
            x1Var2.f19841c = this.f19804a.f19767u.mo0get();
            x1Var2.f19842d = this.f19804a.f19766t.mo0get();
            x1Var2.f19843e = this.f19804a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements s2.a {

        /* renamed from: a */
        public final x2 f19805a;

        public r(x2 x2Var) {
            this.f19805a = x2Var;
        }

        public Object a() {
            return new s(this.f19805a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s implements s2 {

        /* renamed from: a */
        public final x2 f19806a;

        public s(x2 x2Var) {
            this.f19806a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(v2 v2Var) {
            v2 v2Var2 = v2Var;
            v2Var2.f19841c = this.f19806a.f19767u.mo0get();
            v2Var2.f19842d = this.f19806a.f19766t.mo0get();
            v2Var2.f19843e = this.f19806a.f19754h.mo0get();
            v2Var2.f19603l = new e4(this.f19806a.f19770x.mo0get());
        }
    }

    /* loaded from: classes2.dex */
    public static final class t implements n3.a {

        /* renamed from: a */
        public final x2 f19807a;

        public t(x2 x2Var) {
            this.f19807a = x2Var;
        }

        public Object a() {
            return new u(this.f19807a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u implements n3 {

        /* renamed from: a */
        public final x2 f19808a;

        public u(x2 x2Var) {
            this.f19808a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(q3 q3Var) {
            q3 q3Var2 = q3Var;
            q3Var2.f19841c = this.f19808a.f19767u.mo0get();
            q3Var2.f19842d = this.f19808a.f19766t.mo0get();
            q3Var2.f19843e = this.f19808a.f19754h.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class v implements s3.a {

        /* renamed from: a */
        public final x2 f19809a;

        public v(x2 x2Var) {
            this.f19809a = x2Var;
        }

        public Object a() {
            return new w(this.f19809a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w implements s3 {

        /* renamed from: a */
        public final x2 f19810a;

        public w(x2 x2Var) {
            this.f19810a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(u3 u3Var) {
            u3 u3Var2 = u3Var;
            u3Var2.f19841c = this.f19810a.f19767u.mo0get();
            u3Var2.f19842d = this.f19810a.f19766t.mo0get();
            u3Var2.f19843e = this.f19810a.f19754h.mo0get();
            u3Var2.f19558i = this.f19810a.f19771y.mo0get();
            u3Var2.f19559j = this.f19810a.f19761o.mo0get();
            u3Var2.f19560k = x2.a(this.f19810a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x implements h7.a {

        /* renamed from: a */
        public final x2 f19811a;

        public x(x2 x2Var) {
            this.f19811a = x2Var;
        }

        public Object a() {
            return new y(this.f19811a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y implements h7 {

        /* renamed from: a */
        public final x2 f19812a;

        public y(x2 x2Var) {
            this.f19812a = x2Var;
        }

        @Override // com.plaid.internal.od
        public void a(m7 m7Var) {
            m7 m7Var2 = m7Var;
            m7Var2.f19841c = this.f19812a.f19767u.mo0get();
            m7Var2.f19842d = this.f19812a.f19766t.mo0get();
            m7Var2.f19843e = this.f19812a.f19754h.mo0get();
            m7Var2.f19028l = this.f19812a.f19771y.mo0get();
            m7Var2.f19029m = this.f19812a.f19761o.mo0get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class z implements q7.a {

        /* renamed from: a */
        public final x2 f19813a;

        public z(x2 x2Var) {
            this.f19813a = x2Var;
        }

        public Object a() {
            return new a0(this.f19813a);
        }
    }

    public x2(m4 m4Var, g5 g5Var) {
        this.f19747a = g5Var;
        this.f19748b = m4Var;
        a(m4Var, g5Var);
    }

    public static md a(x2 x2Var) {
        return d5.a(x2Var.f19748b, (ja) tw.h.d(x2Var.f19747a.d()), (g9) tw.h.d(x2Var.f19747a.b()));
    }

    public static a q() {
        return new a();
    }

    @Override // com.plaid.internal.y7
    public w0.a b() {
        return new n(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public n0.a c() {
        return new l(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public h7.a d() {
        return new x(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public uc.a e() {
        return new f0(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public mb.a f() {
        return new b0(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public c0.a g() {
        return new h(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public q.a h() {
        return new d(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public s3.a i() {
        return new v(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public lc.a j() {
        return new d0(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public q7.a k() {
        return new z(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public s2.a l() {
        return new r(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public n.a m() {
        return new b(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public i0.a n() {
        return new j(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public t1.a o() {
        return new p(this.f19749c);
    }

    @Override // com.plaid.internal.y7
    public n3.a p() {
        return new t(this.f19749c);
    }

    public final void a(m4 m4Var, g5 g5Var) {
        this.f19750d = tw.d.b(x5.a.f19821a);
        this.f19751e = new k0(g5Var);
        d5 d5Var = new d5(m4Var, new m0(g5Var), new l0(g5Var));
        this.f19752f = d5Var;
        n0 n0Var = new n0(g5Var);
        this.f19753g = n0Var;
        this.f19754h = tw.d.b(new p6(d5Var, new s4(m4Var, n0Var)));
        this.f19755i = tw.d.b(new v4(m4Var, this.f19753g));
        h0 h0Var = new h0(g5Var);
        this.f19756j = h0Var;
        this.f19757k = new h3(tw.d.b(new b5(m4Var, h0Var)));
        this.f19758l = new oa(this.f19756j);
        Provider<k3> b11 = tw.d.b(new o4(m4Var, new i0(g5Var)));
        this.f19759m = b11;
        this.f19760n = tw.d.b(new r4(m4Var, this.f19752f, this.f19754h, this.f19755i, this.f19757k, tw.d.b(new a5(m4Var, this.f19756j, this.f19758l, b11))));
        Provider<w6> b12 = tw.d.b(new t4(m4Var, this.f19753g));
        this.f19761o = b12;
        u4 u4Var = new u4(m4Var, b12);
        this.f19762p = u4Var;
        this.f19763q = tw.d.b(new e5(m4Var, u4Var));
        c5 c5Var = new c5(m4Var, this.f19761o);
        this.f19764r = c5Var;
        this.f19765s = tw.d.b(new f5(m4Var, c5Var, this.f19759m));
        Provider<cb> b13 = tw.d.b(new x4(m4Var, this.f19755i));
        this.f19766t = b13;
        this.f19767u = tw.d.b(new q4(m4Var, this.f19750d, this.f19751e, this.f19760n, this.f19763q, this.f19765s, new d3(b13)));
        this.f19768v = tw.d.b(new z4(m4Var, this.f19764r));
        this.f19769w = tw.d.b(new p4(m4Var, this.f19756j));
        this.f19770x = tw.d.b(new n4(m4Var));
        this.f19771y = tw.d.b(new y4(m4Var, this.f19762p));
        this.f19772z = new j0(g5Var);
        this.A = tw.d.b(new w4(m4Var, this.f19751e));
    }

    @Override // com.plaid.internal.y7
    public v.a a() {
        return new f(this.f19749c);
    }

    @Override // com.plaid.internal.cd
    public void a(fd fdVar) {
        fdVar.f18596a = (kotlinx.serialization.json.a) tw.h.d(this.f19747a.h());
        fdVar.f18597b = this.f19767u.mo0get();
        fdVar.f18598c = this.f19768v.mo0get();
        fdVar.f18599d = this.f19769w.mo0get();
    }

    public void a(i5 i5Var) {
        this.f19759m.mo0get();
        i5Var.f18747b = this.f19750d.mo0get();
        i5Var.f18748c = this.f19767u.mo0get();
        WorkflowDatabase workflowDatabase = (WorkflowDatabase) tw.h.d(this.f19747a.e());
        i5Var.f18749d = (j6) tw.h.d(this.f19747a.c());
        i5Var.f18750e = (t8) tw.h.d(this.f19747a.a());
    }
}