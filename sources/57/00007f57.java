package kotlin.text;

import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35186a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f35187b;

    /* renamed from: c  reason: collision with root package name */
    private static Charset f35188c;

    /* renamed from: d  reason: collision with root package name */
    private static Charset f35189d;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.s.f(forName, "forName(\"UTF-8\")");
        f35187b = forName;
        kotlin.jvm.internal.s.f(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        kotlin.jvm.internal.s.f(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        kotlin.jvm.internal.s.f(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        kotlin.jvm.internal.s.f(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        kotlin.jvm.internal.s.f(Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "forName(\"ISO-8859-1\")");
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f35189d;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            kotlin.jvm.internal.s.f(forName, "forName(\"UTF-32BE\")");
            f35189d = forName;
            return forName;
        }
        return charset;
    }

    public final Charset b() {
        Charset charset = f35188c;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            kotlin.jvm.internal.s.f(forName, "forName(\"UTF-32LE\")");
            f35188c = forName;
            return forName;
        }
        return charset;
    }
}