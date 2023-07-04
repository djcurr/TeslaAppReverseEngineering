package fi;

import ci.i;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f26269a;

    /* renamed from: b  reason: collision with root package name */
    public final i f26270b;

    /* renamed from: c  reason: collision with root package name */
    public final i f26271c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26272d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26273e;

    public e(String str, i iVar, i iVar2, int i11, int i12) {
        ak.a.a(i11 == 0 || i12 == 0);
        this.f26269a = ak.a.d(str);
        this.f26270b = (i) ak.a.e(iVar);
        this.f26271c = (i) ak.a.e(iVar2);
        this.f26272d = i11;
        this.f26273e = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26272d == eVar.f26272d && this.f26273e == eVar.f26273e && this.f26269a.equals(eVar.f26269a) && this.f26270b.equals(eVar.f26270b) && this.f26271c.equals(eVar.f26271c);
    }

    public int hashCode() {
        return ((((((((527 + this.f26272d) * 31) + this.f26273e) * 31) + this.f26269a.hashCode()) * 31) + this.f26270b.hashCode()) * 31) + this.f26271c.hashCode();
    }
}