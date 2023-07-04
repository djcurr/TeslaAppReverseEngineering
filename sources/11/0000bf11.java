package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.p;

/* loaded from: classes5.dex */
public class h extends g {

    /* renamed from: l  reason: collision with root package name */
    private static a f57160l;

    /* renamed from: m  reason: collision with root package name */
    private static a[] f57161m;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f57162b;

    /* renamed from: c  reason: collision with root package name */
    private final k f57163c;

    /* renamed from: d  reason: collision with root package name */
    private final e f57164d;

    /* renamed from: e  reason: collision with root package name */
    private final int f57165e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f57166f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<a, byte[]> f57167g;

    /* renamed from: h  reason: collision with root package name */
    private final int f57168h;

    /* renamed from: i  reason: collision with root package name */
    private final p f57169i;

    /* renamed from: j  reason: collision with root package name */
    private int f57170j;

    /* renamed from: k  reason: collision with root package name */
    private i f57171k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f57172a;

        a(int i11) {
            this.f57172a = i11;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f57172a == this.f57172a;
        }

        public int hashCode() {
            return this.f57172a;
        }
    }

    static {
        a aVar = new a(1);
        f57160l = aVar;
        a[] aVarArr = new a[com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE];
        f57161m = aVarArr;
        aVarArr[1] = aVar;
        int i11 = 2;
        while (true) {
            a[] aVarArr2 = f57161m;
            if (i11 >= aVarArr2.length) {
                return;
            }
            aVarArr2[i11] = new a(i11);
            i11++;
        }
    }

    public h(k kVar, e eVar, int i11, byte[] bArr, int i12, byte[] bArr2) {
        super(true);
        this.f57163c = kVar;
        this.f57164d = eVar;
        this.f57170j = i11;
        this.f57162b = org.bouncycastle.util.a.h(bArr);
        this.f57165e = i12;
        this.f57166f = org.bouncycastle.util.a.h(bArr2);
        this.f57168h = 1 << (kVar.c() + 1);
        this.f57167g = new WeakHashMap();
        this.f57169i = b.a(kVar.b());
    }

    private byte[] b(int i11) {
        int c11 = 1 << k().c();
        if (i11 >= c11) {
            m.a(e(), this.f57169i);
            m.c(i11, this.f57169i);
            m.b((short) -32126, this.f57169i);
            m.a(l.a(i(), e(), i11 - c11, h()), this.f57169i);
            byte[] bArr = new byte[this.f57169i.getDigestSize()];
            this.f57169i.doFinal(bArr, 0);
            return bArr;
        }
        int i12 = i11 * 2;
        byte[] c12 = c(i12);
        byte[] c13 = c(i12 + 1);
        m.a(e(), this.f57169i);
        m.c(i11, this.f57169i);
        m.b((short) -31869, this.f57169i);
        m.a(c12, this.f57169i);
        m.a(c13, this.f57169i);
        byte[] bArr2 = new byte[this.f57169i.getDigestSize()];
        this.f57169i.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] d(a aVar) {
        synchronized (this.f57167g) {
            byte[] bArr = this.f57167g.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] b11 = b(aVar.f57172a);
            this.f57167g.put(aVar, b11);
            return b11;
        }
    }

    public static h f(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                k e11 = k.e(dataInputStream.readInt());
                e e12 = e.e(dataInputStream.readInt());
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream.readFully(bArr2);
                        return new h(e11, e12, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return f(t70.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    h f11 = f(dataInputStream3);
                    dataInputStream3.close();
                    return f11;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static h g(byte[] bArr, byte[] bArr2) {
        h f11 = f(bArr);
        f11.f57171k = i.b(bArr2);
        return f11;
    }

    byte[] c(int i11) {
        if (i11 < this.f57168h) {
            a[] aVarArr = f57161m;
            return d(i11 < aVarArr.length ? aVarArr[i11] : new a(i11));
        }
        return b(i11);
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f57162b);
    }

    public boolean equals(Object obj) {
        i iVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f57170j == hVar.f57170j && this.f57165e == hVar.f57165e && org.bouncycastle.util.a.c(this.f57162b, hVar.f57162b)) {
            k kVar = this.f57163c;
            if (kVar == null ? hVar.f57163c == null : kVar.equals(hVar.f57163c)) {
                e eVar = this.f57164d;
                if (eVar == null ? hVar.f57164d == null : eVar.equals(hVar.f57164d)) {
                    if (org.bouncycastle.util.a.c(this.f57166f, hVar.f57166f)) {
                        i iVar2 = this.f57171k;
                        if (iVar2 == null || (iVar = hVar.f57171k) == null) {
                            return true;
                        }
                        return iVar2.equals(iVar);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // x60.g, r70.c
    public byte[] getEncoded() {
        return x60.a.f().i(0).i(this.f57163c.f()).i(this.f57164d.f()).d(this.f57162b).i(this.f57170j).i(this.f57165e).i(this.f57166f.length).d(this.f57166f).b();
    }

    public byte[] h() {
        return org.bouncycastle.util.a.h(this.f57166f);
    }

    public int hashCode() {
        int F = ((this.f57170j * 31) + org.bouncycastle.util.a.F(this.f57162b)) * 31;
        k kVar = this.f57163c;
        int hashCode = (F + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e eVar = this.f57164d;
        int hashCode2 = (((((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f57165e) * 31) + org.bouncycastle.util.a.F(this.f57166f)) * 31;
        i iVar = this.f57171k;
        return hashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public e i() {
        return this.f57164d;
    }

    public i j() {
        i iVar;
        synchronized (this) {
            if (this.f57171k == null) {
                this.f57171k = new i(this.f57163c, this.f57164d, d(f57160l), this.f57162b);
            }
            iVar = this.f57171k;
        }
        return iVar;
    }

    public k k() {
        return this.f57163c;
    }
}