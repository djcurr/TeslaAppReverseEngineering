package zl;

import com.adyen.checkout.components.model.payments.request.Address;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import zl.e;

/* loaded from: classes3.dex */
class f implements zl.a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f60514d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f60515a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60516b;

    /* renamed from: c  reason: collision with root package name */
    private e f60517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f60518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f60519b;

        a(f fVar, byte[] bArr, int[] iArr) {
            this.f60518a = bArr;
            this.f60519b = iArr;
        }

        @Override // zl.e.d
        public void a(InputStream inputStream, int i11) {
            try {
                inputStream.read(this.f60518a, this.f60519b[0], i11);
                int[] iArr = this.f60519b;
                iArr[0] = iArr[0] + i11;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f60520a;

        /* renamed from: b  reason: collision with root package name */
        public final int f60521b;

        b(byte[] bArr, int i11) {
            this.f60520a = bArr;
            this.f60521b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(File file, int i11) {
        this.f60515a = file;
        this.f60516b = i11;
    }

    private void f(long j11, String str) {
        int i11;
        if (this.f60517c == null) {
            return;
        }
        if (str == null) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            if (str.length() > this.f60516b / 4) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f60517c.m(String.format(Locale.US, "%d %s%n", Long.valueOf(j11), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f60514d));
            while (!this.f60517c.R() && this.f60517c.I0() > this.f60516b) {
                this.f60517c.C0();
            }
        } catch (IOException e11) {
            wl.f.f().e("There was a problem writing to the Crashlytics log.", e11);
        }
    }

    private b g() {
        if (this.f60515a.exists()) {
            h();
            e eVar = this.f60517c;
            if (eVar == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[eVar.I0()];
            try {
                this.f60517c.J(new a(this, bArr, iArr));
            } catch (IOException e11) {
                wl.f.f().e("A problem occurred while reading the Crashlytics log file.", e11);
            }
            return new b(bArr, iArr[0]);
        }
        return null;
    }

    private void h() {
        if (this.f60517c == null) {
            try {
                this.f60517c = new e(this.f60515a);
            } catch (IOException e11) {
                wl.f f11 = wl.f.f();
                f11.e("Could not open log file: " + this.f60515a, e11);
            }
        }
    }

    @Override // zl.a
    public void a() {
        com.google.firebase.crashlytics.internal.common.g.e(this.f60517c, "There was a problem closing the Crashlytics log file.");
        this.f60517c = null;
    }

    @Override // zl.a
    public String b() {
        byte[] c11 = c();
        if (c11 != null) {
            return new String(c11, f60514d);
        }
        return null;
    }

    @Override // zl.a
    public byte[] c() {
        b g11 = g();
        if (g11 == null) {
            return null;
        }
        int i11 = g11.f60521b;
        byte[] bArr = new byte[i11];
        System.arraycopy(g11.f60520a, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // zl.a
    public void d() {
        a();
        this.f60515a.delete();
    }

    @Override // zl.a
    public void e(long j11, String str) {
        h();
        f(j11, str);
    }
}