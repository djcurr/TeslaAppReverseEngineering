package jj;

import ak.k0;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f33837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33838b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33839c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33840d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33841e;

    public g(String str, String str2, String str3, String str4, String str5) {
        this.f33837a = str;
        this.f33838b = str2;
        this.f33839c = str3;
        this.f33840d = str4;
        this.f33841e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return k0.c(this.f33837a, gVar.f33837a) && k0.c(this.f33838b, gVar.f33838b) && k0.c(this.f33839c, gVar.f33839c) && k0.c(this.f33840d, gVar.f33840d) && k0.c(this.f33841e, gVar.f33841e);
    }

    public int hashCode() {
        String str = this.f33837a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33838b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f33839c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f33840d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f33841e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}