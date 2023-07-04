package bq;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static BouncyCastleProvider f7900a;

    public static BouncyCastleProvider a() {
        if (f7900a == null) {
            f7900a = new BouncyCastleProvider();
        }
        return f7900a;
    }
}