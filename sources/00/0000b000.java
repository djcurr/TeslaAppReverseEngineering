package r2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: c  reason: collision with root package name */
    private final r f49109c;

    public final r c() {
        return this.f49109c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && s.c(this.f49109c, ((o) obj).f49109c);
    }

    public int hashCode() {
        return this.f49109c.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f49109c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}