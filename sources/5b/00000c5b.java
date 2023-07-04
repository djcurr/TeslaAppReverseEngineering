package bc;

import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7596a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f7597b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f7598c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f7599d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f7600e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f7601f;

    static {
        Charset.forName("UTF-16");
        f7597b = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f7598c = Charset.forName("US-ASCII");
        f7599d = Charset.forName("UTF-16BE");
        f7600e = Charset.forName("UTF-16LE");
        f7601f = Charset.forName("Cp1252");
    }
}