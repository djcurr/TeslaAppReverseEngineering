package bd;

import bc.k;
import cc.c;
import cc.e;
import cc.f;
import java.util.Stack;
import yb.b;

/* loaded from: classes.dex */
public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Stack<cc.b> f7620a = new Stack<>();

    /* renamed from: b  reason: collision with root package name */
    private cc.b f7621b;

    /* renamed from: c  reason: collision with root package name */
    protected cc.b f7622c;

    /* renamed from: d  reason: collision with root package name */
    protected final e f7623d;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(e eVar, cc.b bVar) {
        this.f7623d = eVar;
        this.f7621b = bVar;
    }

    private cc.b y() {
        cc.b bVar = this.f7622c;
        if (bVar != null) {
            return bVar;
        }
        c cVar = (c) this.f7623d.e(c.class);
        if (cVar != null) {
            return cVar;
        }
        z(c.class);
        return this.f7622c;
    }

    @Override // yb.b
    public void c() {
        this.f7622c = this.f7620a.empty() ? null : this.f7620a.pop();
    }

    @Override // yb.b
    public void d(int i11, k[] kVarArr) {
        this.f7622c.Q(i11, kVarArr);
    }

    @Override // yb.b
    public void e(int i11, short[] sArr) {
        this.f7622c.N(i11, sArr);
    }

    @Override // yb.b
    public void error(String str) {
        y().a(str);
    }

    @Override // yb.b
    public void f(int i11, long j11) {
        this.f7622c.L(i11, j11);
    }

    @Override // yb.b
    public void g(int i11, float[] fArr) {
        this.f7622c.I(i11, fArr);
    }

    @Override // yb.b
    public void h(int i11, f fVar) {
        this.f7622c.T(i11, fVar);
    }

    @Override // yb.b
    public void j(int i11, byte[] bArr) {
        this.f7622c.C(i11, bArr);
    }

    @Override // yb.b
    public void k(int i11, int i12) {
        this.f7622c.J(i11, i12);
    }

    @Override // yb.b
    public void m(int i11, k kVar) {
        this.f7622c.P(i11, kVar);
    }

    @Override // yb.b
    public void o(int i11, int[] iArr) {
        this.f7622c.K(i11, iArr);
    }

    @Override // yb.b
    public void p(int i11, short s11) {
        this.f7622c.J(i11, s11);
    }

    @Override // yb.b
    public void q(int i11, byte[] bArr) {
        this.f7622c.C(i11, bArr);
    }

    @Override // yb.b
    public void r(int i11, short[] sArr) {
        this.f7622c.N(i11, sArr);
    }

    @Override // yb.b
    public void s(int i11, int i12) {
        this.f7622c.J(i11, i12);
    }

    @Override // yb.b
    public void setDouble(int i11, double d11) {
        this.f7622c.F(i11, d11);
    }

    @Override // yb.b
    public void setFloat(int i11, float f11) {
        this.f7622c.H(i11, f11);
    }

    @Override // yb.b
    public void t(int i11, int i12) {
        this.f7622c.J(i11, i12);
    }

    @Override // yb.b
    public void u(int i11, double[] dArr) {
        this.f7622c.G(i11, dArr);
    }

    @Override // yb.b
    public void v(int i11, int[] iArr) {
        this.f7622c.N(i11, iArr);
    }

    @Override // yb.b
    public void w(int i11, byte b11) {
        this.f7622c.J(i11, b11);
    }

    @Override // yb.b
    public void warn(String str) {
        y().a(str);
    }

    @Override // yb.b
    public void x(int i11, long[] jArr) {
        this.f7622c.N(i11, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(Class<? extends cc.b> cls) {
        try {
            cc.b newInstance = cls.newInstance();
            cc.b bVar = this.f7622c;
            if (bVar == null) {
                cc.b bVar2 = this.f7621b;
                if (bVar2 != null) {
                    newInstance.O(bVar2);
                    this.f7621b = null;
                }
            } else {
                this.f7620a.push(bVar);
                newInstance.O(this.f7622c);
            }
            this.f7622c = newInstance;
            this.f7623d.a(newInstance);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        }
    }
}