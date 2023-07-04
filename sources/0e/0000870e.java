package mq;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f38761a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38762b;

    /* renamed from: c  reason: collision with root package name */
    private final p f38763c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f38764d;

    public h(String str, String str2, p pVar, Object... objArr) {
        this.f38761a = str;
        this.f38762b = str2;
        this.f38763c = pVar;
        this.f38764d = objArr;
    }

    public p a() {
        return this.f38763c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return this.f38764d;
    }

    public String c() {
        return this.f38762b;
    }

    public String d() {
        return this.f38761a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f38761a.equals(hVar.f38761a) && this.f38762b.equals(hVar.f38762b) && this.f38763c.equals(hVar.f38763c) && Arrays.equals(this.f38764d, hVar.f38764d);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38761a.hashCode() ^ Integer.rotateLeft(this.f38762b.hashCode(), 8)) ^ Integer.rotateLeft(this.f38763c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f38764d), 24);
    }

    public String toString() {
        return this.f38761a + " : " + this.f38762b + ' ' + this.f38763c + ' ' + Arrays.toString(this.f38764d);
    }
}