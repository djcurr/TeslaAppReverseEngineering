package atd.i0;

import java.security.Provider;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi;

/* loaded from: classes.dex */
public final class a extends Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6881a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f6882b;

    static {
        atd.s0.a.a(-797264853133888L);
        f6881a = new a();
        f6882b = String.format(Locale.US, atd.s0.a.a(-797282033003072L), Double.valueOf(1.0d));
    }

    private a() {
        super(atd.s0.a.a(-797402292087360L), 1.0d, f6882b);
        put(atd.s0.a.a(-797419471956544L), PSSSignatureSpi.SHA256withRSA.class.getName());
    }
}