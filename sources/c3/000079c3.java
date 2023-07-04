package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class o implements x0 {

    /* renamed from: b */
    public static final o f32468b = new o(new UUID(0, 0));

    /* renamed from: a */
    private final UUID f32469a;

    /* loaded from: classes5.dex */
    public static final class a implements n0<o> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public o a(t0 t0Var, d0 d0Var) {
            return new o(t0Var.D0());
        }
    }

    public o() {
        this((UUID) null);
    }

    private UUID a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o.class == obj.getClass() && this.f32469a.compareTo(((o) obj).f32469a) == 0;
    }

    public int hashCode() {
        return this.f32469a.hashCode();
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.G0(toString());
    }

    public String toString() {
        return this.f32469a.toString().replace("-", "");
    }

    public o(UUID uuid) {
        this.f32469a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public o(String str) {
        this.f32469a = a(str);
    }
}