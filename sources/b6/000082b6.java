package l6;

import com.adobe.xmp.XMPException;

/* loaded from: classes.dex */
class g {

    /* renamed from: a  reason: collision with root package name */
    private String f37001a;

    /* renamed from: b  reason: collision with root package name */
    private int f37002b = 0;

    public g(String str) {
        this.f37001a = str;
    }

    public char a() {
        if (this.f37002b < this.f37001a.length()) {
            return this.f37001a.charAt(this.f37002b);
        }
        return (char) 0;
    }

    public char b(int i11) {
        if (i11 < this.f37001a.length()) {
            return this.f37001a.charAt(i11);
        }
        return (char) 0;
    }

    public int c(String str, int i11) {
        char b11 = b(this.f37002b);
        int i12 = 0;
        boolean z11 = false;
        while ('0' <= b11 && b11 <= '9') {
            i12 = (i12 * 10) + (b11 - '0');
            int i13 = this.f37002b + 1;
            this.f37002b = i13;
            b11 = b(i13);
            z11 = true;
        }
        if (z11) {
            if (i12 > i11) {
                return i11;
            }
            if (i12 < 0) {
                return 0;
            }
            return i12;
        }
        throw new XMPException(str, 5);
    }

    public boolean d() {
        return this.f37002b < this.f37001a.length();
    }

    public int e() {
        return this.f37002b;
    }

    public void f() {
        this.f37002b++;
    }
}