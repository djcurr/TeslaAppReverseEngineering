package j9;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.signers.PSSSigner;

/* loaded from: classes.dex */
public class d {

    /* renamed from: j */
    public static d f33295j;

    /* renamed from: a */
    public Context f33297a;

    /* renamed from: c */
    public e f33299c;

    /* renamed from: d */
    public String f33300d;

    /* renamed from: e */
    public String f33301e;

    /* renamed from: f */
    public h9.a f33302f;

    /* renamed from: g */
    public h9.a f33303g;

    /* renamed from: i */
    public static final Object f33294i = new Object();

    /* renamed from: k */
    public static final String f33296k = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: b */
    public String f33298b = null;

    /* renamed from: h */
    public Pattern f33304h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f33297a = null;
        this.f33299c = null;
        this.f33300d = "xx_utdid_key";
        this.f33301e = "xx_utdid_domain";
        this.f33302f = null;
        this.f33303g = null;
        this.f33297a = context;
        this.f33303g = new h9.a(context, f33296k, "Alvin2", false, true);
        this.f33302f = new h9.a(context, ".DataStorage", "ContextData", false, true);
        this.f33299c = new e();
        this.f33300d = String.format("K_%d", Integer.valueOf(f9.f.a(this.f33300d)));
        this.f33301e = String.format("D_%d", Integer.valueOf(f9.f.a(this.f33301e)));
    }

    public static d a(Context context) {
        if (context != null && f33295j == null) {
            synchronized (f33294i) {
                if (f33295j == null) {
                    d dVar = new d(context);
                    f33295j = dVar;
                    dVar.i();
                }
            }
        }
        return f33295j;
    }

    public static String c(byte[] bArr) {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, PSSSigner.TRAILER_IMPLICIT, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(f9.e.b(bArr2), mac.getAlgorithm()));
        return f9.b.e(mac.doFinal(bArr), 2);
    }

    private boolean d(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f33304h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void f(String str) {
        h9.a aVar;
        if (d(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (aVar = this.f33303g) == null) {
                return;
            }
            aVar.b("UTDID2", str);
            this.f33303g.c();
        }
    }

    private void h(String str) {
        h9.a aVar;
        if (str == null || (aVar = this.f33302f) == null || str.equals(aVar.a(this.f33300d))) {
            return;
        }
        this.f33302f.b(this.f33300d, str);
        this.f33302f.c();
    }

    private void i() {
        h9.a aVar = this.f33303g;
        if (aVar != null) {
            if (f9.f.b(aVar.a("UTDID2"))) {
                String a11 = this.f33303g.a("UTDID");
                if (!f9.f.b(a11)) {
                    f(a11);
                }
            }
            boolean z11 = false;
            boolean z12 = true;
            if (!f9.f.b(this.f33303g.a("DID"))) {
                this.f33303g.e("DID");
                z11 = true;
            }
            if (!f9.f.b(this.f33303g.a("EI"))) {
                this.f33303g.e("EI");
                z11 = true;
            }
            if (f9.f.b(this.f33303g.a("SI"))) {
                z12 = z11;
            } else {
                this.f33303g.e("SI");
            }
            if (z12) {
                this.f33303g.c();
            }
        }
    }

    private byte[] j() {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nextInt = new Random().nextInt();
        byte[] a11 = f9.c.a((int) (System.currentTimeMillis() / 1000));
        byte[] a12 = f9.c.a(nextInt);
        byteArrayOutputStream.write(a11, 0, 4);
        byteArrayOutputStream.write(a12, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = f9.d.b(this.f33297a);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(f9.c.a(f9.f.a(str)), 0, 4);
        byteArrayOutputStream.write(f9.c.a(f9.f.a(c(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private String k() {
        h9.a aVar = this.f33303g;
        if (aVar != null) {
            String a11 = aVar.a("UTDID2");
            if (f9.f.b(a11) || this.f33299c.a(a11) == null) {
                return null;
            }
            return a11;
        }
        return null;
    }

    public synchronized String b() {
        String g11 = g();
        this.f33298b = g11;
        if (!TextUtils.isEmpty(g11)) {
            return this.f33298b;
        }
        try {
            byte[] j11 = j();
            if (j11 != null) {
                String e11 = f9.b.e(j11, 2);
                this.f33298b = e11;
                f(e11);
                String b11 = this.f33299c.b(j11);
                if (b11 != null) {
                    h(b11);
                }
                return this.f33298b;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return null;
    }

    public synchronized String e() {
        String str = this.f33298b;
        if (str != null) {
            return str;
        }
        return b();
    }

    public synchronized String g() {
        String k11 = k();
        if (d(k11)) {
            h(this.f33299c.a(k11));
            this.f33298b = k11;
            return k11;
        }
        String a11 = this.f33302f.a(this.f33300d);
        if (!f9.f.b(a11)) {
            String a12 = new f().a(a11);
            if (!d(a12)) {
                a12 = this.f33299c.c(a11);
            }
            if (d(a12) && !f9.f.b(a12)) {
                this.f33298b = a12;
                f(a12);
                return this.f33298b;
            }
        }
        return null;
    }
}