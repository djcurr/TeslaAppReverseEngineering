package freemarker.ext.beans;

/* loaded from: classes5.dex */
public abstract class j implements Cloneable {

    /* renamed from: a */
    private final ix.p f26944a;

    /* renamed from: b */
    protected q f26945b;

    /* renamed from: c */
    private boolean f26946c;

    /* renamed from: d */
    private int f26947d;

    /* renamed from: e */
    private ix.g f26948e;

    /* renamed from: f */
    private boolean f26949f;

    /* renamed from: g */
    private boolean f26950g;

    public j(ix.p pVar, boolean z11) {
        this.f26946c = false;
        this.f26947d = 0;
        this.f26948e = null;
        this.f26949f = false;
        this.f26950g = false;
        ix.q.a(pVar);
        pVar = z11 ? pVar : i.l(pVar);
        this.f26944a = pVar;
        this.f26945b = new q(pVar);
    }

    public Object a(boolean z11) {
        try {
            j jVar = (j) super.clone();
            if (z11) {
                jVar.f26945b = (q) this.f26945b.clone();
            }
            return jVar;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException("Failed to clone BeansWrapperConfiguration", e11);
        }
    }

    public int b() {
        return this.f26947d;
    }

    public ix.p c() {
        return this.f26944a;
    }

    public t d() {
        return this.f26945b.d();
    }

    public ix.g e() {
        return this.f26948e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            return this.f26944a.equals(jVar.f26944a) && this.f26946c == jVar.f26946c && this.f26947d == jVar.f26947d && this.f26948e == jVar.f26948e && this.f26949f == jVar.f26949f && this.f26950g == jVar.f26950g && this.f26945b.equals(jVar.f26945b);
        }
        return false;
    }

    public boolean f() {
        return this.f26950g;
    }

    public boolean g() {
        return this.f26946c;
    }

    public boolean h() {
        return this.f26949f;
    }

    public int hashCode() {
        int hashCode = (((((this.f26944a.hashCode() + 31) * 31) + (this.f26946c ? 1231 : 1237)) * 31) + this.f26947d) * 31;
        ix.g gVar = this.f26948e;
        return ((((((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + (this.f26949f ? 1231 : 1237)) * 31) + (this.f26950g ? 1231 : 1237)) * 31) + this.f26945b.hashCode();
    }

    public void i(t tVar) {
        this.f26945b.h(tVar);
    }

    public j(ix.p pVar) {
        this(pVar, false);
    }
}