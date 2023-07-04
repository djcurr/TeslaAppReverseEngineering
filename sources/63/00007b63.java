package j9;

import android.content.Context;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f33292a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f33293b = new Object();

    public static long a(b bVar) {
        if (bVar != null) {
            String format = String.format("%s%s%s%s%s", bVar.g(), bVar.i(), Long.valueOf(bVar.a()), bVar.k(), bVar.d());
            if (f9.f.b(format)) {
                return 0L;
            }
            Adler32 adler32 = new Adler32();
            adler32.reset();
            adler32.update(format.getBytes());
            return adler32.getValue();
        }
        return 0L;
    }

    public static b b(Context context) {
        if (context != null) {
            synchronized (f33293b) {
                String e11 = d.a(context).e();
                if (f9.f.b(e11)) {
                    return null;
                }
                if (e11.endsWith("\n")) {
                    e11 = e11.substring(0, e11.length() - 1);
                }
                b bVar = new b();
                long currentTimeMillis = System.currentTimeMillis();
                String b11 = f9.d.b(context);
                String d11 = f9.d.d(context);
                bVar.h(b11);
                bVar.c(b11);
                bVar.e(currentTimeMillis);
                bVar.f(d11);
                bVar.j(e11);
                bVar.b(a(bVar));
                return bVar;
            }
        }
        return null;
    }

    public static synchronized b c(Context context) {
        synchronized (c.class) {
            b bVar = f33292a;
            if (bVar != null) {
                return bVar;
            }
            if (context != null) {
                b b11 = b(context);
                f33292a = b11;
                return b11;
            }
            return null;
        }
    }
}