package am;

import am.c0;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0.a f888a;

    /* renamed from: b  reason: collision with root package name */
    private final c0.c f889b;

    /* renamed from: c  reason: collision with root package name */
    private final c0.b f890c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f888a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f889b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f890c = bVar;
    }

    @Override // am.c0
    public c0.a a() {
        return this.f888a;
    }

    @Override // am.c0
    public c0.b c() {
        return this.f890c;
    }

    @Override // am.c0
    public c0.c d() {
        return this.f889b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f888a.equals(c0Var.a()) && this.f889b.equals(c0Var.d()) && this.f890c.equals(c0Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f888a.hashCode() ^ 1000003) * 1000003) ^ this.f889b.hashCode()) * 1000003) ^ this.f890c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f888a + ", osData=" + this.f889b + ", deviceData=" + this.f890c + "}";
    }
}