package mq;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final int f38808a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38809b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38810c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38811d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38812e;

    public p(int i11, String str, String str2, String str3, boolean z11) {
        this.f38808a = i11;
        this.f38809b = str;
        this.f38810c = str2;
        this.f38811d = str3;
        this.f38812e = z11;
    }

    public String a() {
        return this.f38811d;
    }

    public String b() {
        return this.f38810c;
    }

    public String c() {
        return this.f38809b;
    }

    public int d() {
        return this.f38808a;
    }

    public boolean e() {
        return this.f38812e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f38808a == pVar.f38808a && this.f38812e == pVar.f38812e && this.f38809b.equals(pVar.f38809b) && this.f38810c.equals(pVar.f38810c) && this.f38811d.equals(pVar.f38811d);
        }
        return false;
    }

    public int hashCode() {
        return this.f38808a + (this.f38812e ? 64 : 0) + (this.f38809b.hashCode() * this.f38810c.hashCode() * this.f38811d.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38809b);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f38810c);
        sb2.append(this.f38811d);
        sb2.append(" (");
        sb2.append(this.f38808a);
        sb2.append(this.f38812e ? " itf" : "");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}