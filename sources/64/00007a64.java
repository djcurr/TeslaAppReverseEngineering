package ix;

import freemarker.core.Configurable;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

/* loaded from: classes5.dex */
public class a extends Configurable implements Cloneable {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p E;
    private static final p F;
    static /* synthetic */ Class G;

    /* renamed from: x  reason: collision with root package name */
    public static final p f32816x;

    /* renamed from: y  reason: collision with root package name */
    public static final p f32817y;

    /* renamed from: z  reason: collision with root package name */
    public static final p f32818z;

    static {
        Date date;
        hx.b.i("freemarker.cache");
        p pVar = new p(2, 3, 0);
        f32816x = pVar;
        f32817y = new p(2, 3, 19);
        f32818z = new p(2, 3, 20);
        A = new p(2, 3, 21);
        B = new p(2, 3, 22);
        C = new p(2, 3, 23);
        E = pVar;
        pVar.toString();
        pVar.c();
        try {
            Properties properties = new Properties();
            Class cls = G;
            if (cls == null) {
                cls = b("freemarker.template.Configuration");
                G = cls;
            }
            InputStream resourceAsStream = cls.getClassLoader().getResourceAsStream("freemarker/version.properties");
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                resourceAsStream.close();
                String f11 = f(properties, "version");
                String f12 = f(properties, "buildTimestamp");
                if (f12.endsWith("Z")) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(f12.substring(0, f12.length() - 1));
                    stringBuffer.append("+0000");
                    f12 = stringBuffer.toString();
                }
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).parse(f12);
                } catch (ParseException unused) {
                    date = null;
                }
                F = new p(f11, Boolean.valueOf(f(properties, "isGAECompliant")), date);
                try {
                    Class.forName("freemarker.core._2_4_OrLaterMarker");
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            throw new RuntimeException("Version file is missing.");
        } catch (IOException e11) {
            throw new RuntimeException("Failed to load and parse freemarker/version.properties", e11);
        }
    }

    static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean c(p pVar) {
        return true;
    }

    public static g d(p pVar) {
        if (pVar.c() < q.f32844b) {
            return g.f32828a;
        }
        return new e(pVar).l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final o e(p pVar) {
        return o.f32832a;
    }

    private static String f(Properties properties, String str) {
        String property = properties.getProperty(str);
        if (property != null) {
            return property;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Version file is corrupt: \"");
        stringBuffer.append(str);
        stringBuffer.append("\" property is missing.");
        throw new RuntimeException(stringBuffer.toString());
    }

    public static p g() {
        return F;
    }
}