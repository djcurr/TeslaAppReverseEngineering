package n7;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40680a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final MessageDigest f40681b = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);

    private a() {
    }

    public final byte[] a(byte[] byteArray) {
        s.g(byteArray, "byteArray");
        MessageDigest messageDigest = f40681b;
        messageDigest.reset();
        messageDigest.update(byteArray);
        byte[] digest = messageDigest.digest();
        s.f(digest, "digest.digest()");
        return digest;
    }

    public final String b(String string) {
        s.g(string, "string");
        Charset charset = d.f35187b;
        byte[] bytes = string.getBytes(charset);
        s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        return new String(a(bytes), charset);
    }
}