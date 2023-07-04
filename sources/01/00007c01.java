package jj;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f33882a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33883b;

    public n(String str, String str2) {
        this.f33882a = str;
        this.f33883b = str2;
    }

    public String toString() {
        String str = this.f33882a;
        String str2 = this.f33883b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        return sb2.toString();
    }
}