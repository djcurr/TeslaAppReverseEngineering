package ab;

import bb.j;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private final Object f374b;

    public d(Object obj) {
        this.f374b = j.d(obj);
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f374b.toString().getBytes(ha.b.f29009a));
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f374b.equals(((d) obj).f374b);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return this.f374b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f374b + CoreConstants.CURLY_RIGHT;
    }
}