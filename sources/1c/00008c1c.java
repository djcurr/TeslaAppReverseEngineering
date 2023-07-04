package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends l {
    private static final long serialVersionUID = 1738909257417361021L;
    private final transient o A;

    /* renamed from: y  reason: collision with root package name */
    private final transient k f41527y;

    /* renamed from: z  reason: collision with root package name */
    private final transient m f41528z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar, m mVar) {
        this(kVar, mVar, l.f41537c);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        List<p> e11 = this.f41528z.e(aVar, gVar);
        if (e11.size() == 1) {
            return e11.get(0);
        }
        return p.s(this.f41528z.a(aVar, gVar).i());
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        q b11 = this.f41528z.b(fVar);
        if (b11 == null) {
            return this.f41528z.d();
        }
        return p.s(b11.i());
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.A;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        net.time4j.base.f b11;
        q b12;
        q b13 = this.f41528z.b(fVar);
        if (b13 == null) {
            return false;
        }
        int d11 = b13.d();
        if (d11 > 0) {
            return true;
        }
        if (d11 >= 0 && this.f41528z.c() && (b12 = this.f41528z.b((b11 = i.b(b13.e(), 0)))) != null) {
            if (b12.h() == b13.h()) {
                return b12.d() < 0;
            }
            return I(b11);
        }
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f41528z.isEmpty();
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        q a11 = this.f41528z.a(aVar, gVar);
        return a11 != null && a11.k();
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this.A == oVar ? this : new c(this.f41527y, this.f41528z, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f41527y.a().equals(cVar.f41527y.a()) && this.f41528z.equals(cVar.f41528z) && this.A.equals(cVar.A);
        }
        return false;
    }

    public int hashCode() {
        return this.f41527y.a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(c.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.f41527y.a());
        sb2.append(",history={");
        sb2.append(this.f41528z);
        sb2.append("},strategy=");
        sb2.append(this.A);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this.f41528z;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.f41527y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar, m mVar, o oVar) {
        Objects.requireNonNull(kVar, "Missing timezone id.");
        if ((kVar instanceof p) && !mVar.isEmpty()) {
            throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + kVar.a());
        }
        Objects.requireNonNull(mVar, "Missing timezone history.");
        Objects.requireNonNull(oVar, "Missing transition strategy.");
        this.f41527y = kVar;
        this.f41528z = mVar;
        this.A = oVar;
    }
}