package mq;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a */
    protected s f38833a;

    public s(int i11) {
        this(i11, null);
    }

    public abstract a A(int i11, c0 c0Var, String str, boolean z11);

    public abstract void B(r rVar, r rVar2, r rVar3, String str);

    public abstract a C(int i11, c0 c0Var, String str, boolean z11);

    public abstract void D(int i11, String str);

    public abstract void E(int i11, int i12);

    public abstract void a(int i11, boolean z11);

    public abstract a b(String str, boolean z11);

    public abstract a c();

    public abstract void d(c cVar);

    public abstract void e();

    public abstract void f();

    public abstract void g(int i11, String str, String str2, String str3);

    public abstract void h(int i11, int i12, Object[] objArr, int i13, Object[] objArr2);

    public abstract void i(int i11, int i12);

    public abstract void j(int i11);

    public abstract a k(int i11, c0 c0Var, String str, boolean z11);

    public abstract void l(int i11, int i12);

    public abstract void m(String str, String str2, p pVar, Object... objArr);

    public abstract void n(int i11, r rVar);

    public abstract void o(r rVar);

    public abstract void p(Object obj);

    public abstract void q(int i11, r rVar);

    public abstract void r(String str, String str2, String str3, r rVar, r rVar2, int i11);

    public abstract a s(int i11, c0 c0Var, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z11);

    public abstract void t(r rVar, int[] iArr, r[] rVarArr);

    public abstract void u(int i11, int i12);

    public abstract void v(int i11, String str, String str2, String str3, boolean z11);

    public abstract void w(String str, int i11);

    public abstract void x(String str, int i11);

    public abstract a y(int i11, String str, boolean z11);

    public abstract void z(int i11, int i12, r rVar, r... rVarArr);

    public s(int i11, s sVar) {
        if (i11 != 589824 && i11 != 524288 && i11 != 458752 && i11 != 393216 && i11 != 327680 && i11 != 262144 && i11 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i11);
        }
        if (i11 == 17432576) {
            i.a(this);
        }
        this.f38833a = sVar;
    }
}