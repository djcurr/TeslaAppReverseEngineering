package ab;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private static final c f373b = new c();

    private c() {
    }

    public static c c() {
        return f373b;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}