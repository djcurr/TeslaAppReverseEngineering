package p001if;

import md.k;
import ud.a;

/* renamed from: if.d  reason: invalid package */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f30385a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30386b;

    /* renamed from: c  reason: collision with root package name */
    public final float f30387c;

    /* renamed from: d  reason: collision with root package name */
    public final float f30388d;

    public d(int i11, int i12) {
        this(i11, i12, 2048.0f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f30385a == dVar.f30385a && this.f30386b == dVar.f30386b;
        }
        return false;
    }

    public int hashCode() {
        return a.a(this.f30385a, this.f30386b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f30385a), Integer.valueOf(this.f30386b));
    }

    public d(int i11, int i12, float f11) {
        this(i11, i12, f11, 0.6666667f);
    }

    public d(int i11, int i12, float f11, float f12) {
        k.b(Boolean.valueOf(i11 > 0));
        k.b(Boolean.valueOf(i12 > 0));
        this.f30385a = i11;
        this.f30386b = i12;
        this.f30387c = f11;
        this.f30388d = f12;
    }
}