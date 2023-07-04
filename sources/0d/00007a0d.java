package io.sentry;

import java.util.UUID;

/* loaded from: classes5.dex */
public final class w3 implements x0 {

    /* renamed from: b  reason: collision with root package name */
    public static final w3 f32701b = new w3(new UUID(0, 0).toString());

    /* renamed from: a  reason: collision with root package name */
    private final String f32702a;

    /* loaded from: classes5.dex */
    public static final class a implements n0<w3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public w3 a(t0 t0Var, d0 d0Var) {
            return new w3(t0Var.D0());
        }
    }

    public w3(String str) {
        this.f32702a = (String) rz.j.a(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w3.class != obj.getClass()) {
            return false;
        }
        return this.f32702a.equals(((w3) obj).f32702a);
    }

    public int hashCode() {
        return this.f32702a.hashCode();
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.G0(this.f32702a);
    }

    public String toString() {
        return this.f32702a;
    }

    public w3() {
        this(UUID.randomUUID());
    }

    private w3(UUID uuid) {
        this(uuid.toString().replace("-", "").substring(0, 16));
    }
}