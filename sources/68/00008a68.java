package nd;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f40778c = new b();

    /* renamed from: a  reason: collision with root package name */
    private String f40779a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    private int f40780b = 5;

    private b() {
    }

    public static b g() {
        return f40778c;
    }

    private static String h(String str, Throwable th2) {
        return str + '\n' + i(th2);
    }

    private String j(String str) {
        if (this.f40779a != null) {
            return this.f40779a + ":" + str;
        }
        return str;
    }

    private void k(int i11, String str, String str2) {
        Log.println(i11, j(str), str2);
    }

    private void l(int i11, String str, String str2, Throwable th2) {
        Log.println(i11, j(str), h(str2, th2));
    }

    @Override // nd.c
    public void a(String str, String str2) {
        k(6, str, str2);
    }

    @Override // nd.c
    public void b(String str, String str2, Throwable th2) {
        l(3, str, str2, th2);
    }

    @Override // nd.c
    public void c(String str, String str2, Throwable th2) {
        l(6, str, str2, th2);
    }

    @Override // nd.c
    public void d(String str, String str2) {
        k(3, str, str2);
    }

    @Override // nd.c
    public void e(String str, String str2) {
        k(6, str, str2);
    }

    @Override // nd.c
    public boolean f(int i11) {
        return this.f40780b <= i11;
    }

    @Override // nd.c
    public void i(String str, String str2) {
        k(4, str, str2);
    }

    @Override // nd.c
    public void v(String str, String str2) {
        k(2, str, str2);
    }

    @Override // nd.c
    public void w(String str, String str2) {
        k(5, str, str2);
    }

    private static String i(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // nd.c
    public void d(String str, String str2, Throwable th2) {
        l(5, str, str2, th2);
    }

    @Override // nd.c
    public void e(String str, String str2, Throwable th2) {
        l(6, str, str2, th2);
    }
}