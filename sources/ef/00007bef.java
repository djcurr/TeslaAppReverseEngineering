package jj;

import ak.k0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f33826a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33827b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33828c;

    public d(String str, String str2, String str3) {
        this.f33826a = str;
        this.f33827b = str2;
        this.f33828c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return k0.c(this.f33826a, dVar.f33826a) && k0.c(this.f33827b, dVar.f33827b) && k0.c(this.f33828c, dVar.f33828c);
    }

    public int hashCode() {
        int hashCode = this.f33826a.hashCode() * 31;
        String str = this.f33827b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33828c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}