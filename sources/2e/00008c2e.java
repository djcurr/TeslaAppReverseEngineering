package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b extends l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f41564a;

    /* renamed from: b  reason: collision with root package name */
    private final transient a f41565b;

    /* renamed from: c  reason: collision with root package name */
    private final transient j f41566c;

    /* renamed from: d  reason: collision with root package name */
    private final transient q f41567d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f41568e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i11, List<q> list, List<d> list2, boolean z11, boolean z12) {
        this.f41564a = i11;
        a aVar = new a(list, z11, z12);
        this.f41565b = aVar;
        q n11 = aVar.n();
        this.f41567d = n11;
        this.f41566c = new j(n11, list2, z11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f41565b.m(aVar, gVar, this.f41566c);
    }

    @Override // net.time4j.tz.m
    public q b(net.time4j.base.f fVar) {
        if (fVar.g() < this.f41567d.e()) {
            return this.f41565b.b(fVar);
        }
        q b11 = this.f41566c.b(fVar);
        return b11 == null ? this.f41567d : b11;
    }

    @Override // net.time4j.tz.m
    public boolean c() {
        return this.f41566c.c() || this.f41565b.c();
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.f41565b.d();
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f41565b.p(aVar, gVar, this.f41566c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f41565b.l(bVar.f41565b, this.f41564a, bVar.f41564a) && this.f41566c.n().equals(bVar.f41566c.n());
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f41568e;
        if (i11 == 0) {
            int q11 = this.f41565b.q(this.f41564a) + (this.f41566c.n().hashCode() * 37);
            this.f41568e = q11;
            return q11;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<d> k() {
        return this.f41566c.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(ObjectOutput objectOutput) {
        this.f41565b.t(this.f41564a, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(b.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f41564a);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f41566c.n());
        sb2.append(']');
        return sb2.toString();
    }
}