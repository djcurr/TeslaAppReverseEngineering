package af;

import af.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import md.k;
import md.p;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static d f409d;

    /* renamed from: a  reason: collision with root package name */
    private int f410a;

    /* renamed from: b  reason: collision with root package name */
    private List<c.a> f411b;

    /* renamed from: c  reason: collision with root package name */
    private final a f412c = new a();

    private d() {
        f();
    }

    public static c b(InputStream inputStream) {
        return d().a(inputStream);
    }

    public static c c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e11) {
            throw p.a(e11);
        }
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (f409d == null) {
                f409d = new d();
            }
            dVar = f409d;
        }
        return dVar;
    }

    private static int e(int i11, InputStream inputStream, byte[] bArr) {
        k.g(inputStream);
        k.g(bArr);
        k.b(Boolean.valueOf(bArr.length >= i11));
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i11);
                return md.a.b(inputStream, bArr, 0, i11);
            } finally {
                inputStream.reset();
            }
        }
        return md.a.b(inputStream, bArr, 0, i11);
    }

    private void f() {
        this.f410a = this.f412c.b();
        List<c.a> list = this.f411b;
        if (list != null) {
            for (c.a aVar : list) {
                this.f410a = Math.max(this.f410a, aVar.b());
            }
        }
    }

    public c a(InputStream inputStream) {
        k.g(inputStream);
        int i11 = this.f410a;
        byte[] bArr = new byte[i11];
        int e11 = e(i11, inputStream, bArr);
        c a11 = this.f412c.a(bArr, e11);
        if (a11 == null || a11 == c.f407b) {
            List<c.a> list = this.f411b;
            if (list != null) {
                for (c.a aVar : list) {
                    c a12 = aVar.a(bArr, e11);
                    if (a12 != null && a12 != c.f407b) {
                        return a12;
                    }
                }
            }
            return c.f407b;
        }
        return a11;
    }
}