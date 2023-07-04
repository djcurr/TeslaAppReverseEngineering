package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.k;
import java.util.Objects;

/* loaded from: classes7.dex */
public interface c extends k, Comparable {
    default f a() {
        Objects.requireNonNull((j$.time.f) ((LocalDateTime) this).o());
        return g.f32874a;
    }

    default long j(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        LocalDateTime localDateTime = (LocalDateTime) this;
        return ((((j$.time.f) localDateTime.o()).t() * 86400) + localDateTime.p().p()) - zoneOffset.n();
    }
}