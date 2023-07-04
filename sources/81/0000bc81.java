package w8;

import android.content.Context;
import r8.d;
import u8.c;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a */
    public static a f55739a;

    /* renamed from: b */
    public static r8.a f55740b;

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f55739a == null) {
            f55740b = d.b(context, str);
            f55739a = new b();
        }
        return f55739a;
    }

    @Override // w8.a
    public c a(u8.d dVar) {
        return u8.b.b(f55740b.a(u8.b.a(dVar)));
    }

    @Override // w8.a
    public boolean logCollect(String str) {
        return f55740b.logCollect(str);
    }
}