package ix;

import freemarker.template.utility.NullArgumentException;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: a */
    public static final int f32843a = a.f32816x.c();

    /* renamed from: b */
    public static final int f32844b;

    /* renamed from: c */
    public static final int f32845c;

    static {
        a.f32817y.c();
        a.f32818z.c();
        f32844b = a.A.c();
        f32845c = a.B.c();
        a.C.c();
        p.d(2, 4, 0);
    }

    public static void a(p pVar) {
        NullArgumentException.a("incompatibleImprovements", pVar);
        int c11 = pVar.c();
        if (c11 <= a.g().c()) {
            if (c11 < f32843a) {
                throw new IllegalArgumentException("\"incompatibleImprovements\" must be at least 2.3.0.");
            }
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The FreeMarker version requested by \"incompatibleImprovements\" was ");
        stringBuffer.append(pVar);
        stringBuffer.append(", but the installed FreeMarker version is only ");
        stringBuffer.append(a.g());
        stringBuffer.append(". You may need to upgrade FreeMarker in your project.");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static boolean b(p pVar) {
        return a.c(pVar);
    }

    public static o c(p pVar) {
        return a.e(pVar);
    }
}