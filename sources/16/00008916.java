package n10;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import k20.d0;
import k20.e0;
import k20.k0;

/* loaded from: classes5.dex */
public final class g implements g20.r {

    /* renamed from: a  reason: collision with root package name */
    public static final g f40203a = new g();

    private g() {
    }

    @Override // g20.r
    public d0 a(p10.q proto, String flexibleId, k0 lowerBound, k0 upperBound) {
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(flexibleId, "flexibleId");
        kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.s.g(upperBound, "upperBound");
        if (!kotlin.jvm.internal.s.c(flexibleId, "kotlin.jvm.PlatformType")) {
            k0 j11 = k20.v.j("Error java flexible type with id: " + flexibleId + ". (" + lowerBound + CallerDataConverter.DEFAULT_RANGE_DELIMITER + upperBound + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            kotlin.jvm.internal.s.f(j11, "createErrorType(\"Error j…owerBound..$upperBound)\")");
            return j11;
        } else if (proto.r(s10.a.f49979g)) {
            return new j10.f(lowerBound, upperBound);
        } else {
            return e0.d(lowerBound, upperBound);
        }
    }
}