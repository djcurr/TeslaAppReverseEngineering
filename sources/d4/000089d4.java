package n6;

import com.adobe.xmp.XMPException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private int f40581a = 0;

    public c() {
    }

    public c(int i11) {
        b(i11);
        g(i11);
    }

    private void b(int i11) {
        int i12 = (~e()) & i11;
        if (i12 == 0) {
            a(i11);
            return;
        }
        throw new XMPException("The option bit(s) 0x" + Integer.toHexString(i12) + " are invalid!", 103);
    }

    protected void a(int i11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(int i11) {
        return (i11 & this.f40581a) != 0;
    }

    public int d() {
        return this.f40581a;
    }

    protected abstract int e();

    public boolean equals(Object obj) {
        return d() == ((c) obj).d();
    }

    public void f(int i11, boolean z11) {
        int i12;
        if (z11) {
            i12 = i11 | this.f40581a;
        } else {
            i12 = (~i11) & this.f40581a;
        }
        this.f40581a = i12;
    }

    public void g(int i11) {
        b(i11);
        this.f40581a = i11;
    }

    public int hashCode() {
        return d();
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.f40581a);
    }
}