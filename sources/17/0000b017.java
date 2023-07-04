package r30;

import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes5.dex */
public class a {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f49124a;

    static {
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        f49124a = Charset.forName("UTF-8");
    }
}