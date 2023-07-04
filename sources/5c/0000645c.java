package ct;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class n {

    /* renamed from: b  reason: collision with root package name */
    private static n f23102b;

    /* renamed from: a  reason: collision with root package name */
    private final b f23103a = new a();

    /* loaded from: classes6.dex */
    private static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private static final Charset f23104a = StandardCharsets.ISO_8859_1;

        private a() {
        }

        private byte[] c(String str) {
            return Base64.decode(str, 0);
        }

        private String d(byte[] bArr) {
            return Base64.encodeToString(bArr, 0);
        }

        @Override // ct.n.b
        public String a(String str) {
            c encrypt = ct.a.b().encrypt(str.getBytes(f23104a));
            return d(encrypt.b()) + ":" + d(encrypt.a());
        }

        @Override // ct.n.b
        public String b(String str) {
            String[] split = str.split(":");
            return new String(ct.a.b().decrypt(c(split[0]), c(split[1])), f23104a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface b {
        String a(String str);

        String b(String str);
    }

    private n() {
    }

    public static n c() {
        if (f23102b == null) {
            f23102b = new n();
        }
        return f23102b;
    }

    public String a(String str) {
        return this.f23103a.b(str);
    }

    public String b(String str) {
        return this.f23103a.a(str);
    }
}