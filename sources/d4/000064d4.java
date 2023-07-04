package d2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f23299a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23300b;

    private e(long j11, long j12) {
        this.f23299a = j11;
        this.f23300b = j12;
    }

    public /* synthetic */ e(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    public final long a() {
        return this.f23300b;
    }

    public final long b() {
        return this.f23299a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f23299a + ", position=" + ((Object) s1.f.s(a())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}