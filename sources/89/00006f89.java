package g3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    p f27513d;

    /* renamed from: f  reason: collision with root package name */
    int f27515f;

    /* renamed from: g  reason: collision with root package name */
    public int f27516g;

    /* renamed from: a  reason: collision with root package name */
    public d f27510a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27511b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27512c = false;

    /* renamed from: e  reason: collision with root package name */
    a f27514e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    int f27517h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f27518i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27519j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f27520k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f27521l = new ArrayList();

    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f27513d = pVar;
    }

    @Override // g3.d
    public void a(d dVar) {
        for (f fVar : this.f27521l) {
            if (!fVar.f27519j) {
                return;
            }
        }
        this.f27512c = true;
        d dVar2 = this.f27510a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f27511b) {
            this.f27513d.a(this);
            return;
        }
        f fVar2 = null;
        int i11 = 0;
        for (f fVar3 : this.f27521l) {
            if (!(fVar3 instanceof g)) {
                i11++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i11 == 1 && fVar2.f27519j) {
            g gVar = this.f27518i;
            if (gVar != null) {
                if (!gVar.f27519j) {
                    return;
                }
                this.f27515f = this.f27517h * gVar.f27516g;
            }
            d(fVar2.f27516g + this.f27515f);
        }
        d dVar3 = this.f27510a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f27520k.add(dVar);
        if (this.f27519j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f27521l.clear();
        this.f27520k.clear();
        this.f27519j = false;
        this.f27516g = 0;
        this.f27512c = false;
        this.f27511b = false;
    }

    public void d(int i11) {
        if (this.f27519j) {
            return;
        }
        this.f27519j = true;
        this.f27516g = i11;
        for (d dVar : this.f27520k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27513d.f27541b.r());
        sb2.append(":");
        sb2.append(this.f27514e);
        sb2.append("(");
        sb2.append(this.f27519j ? Integer.valueOf(this.f27516g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f27521l.size());
        sb2.append(":d=");
        sb2.append(this.f27520k.size());
        sb2.append(">");
        return sb2.toString();
    }
}