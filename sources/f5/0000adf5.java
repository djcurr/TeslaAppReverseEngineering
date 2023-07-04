package qh;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48150a;

    /* renamed from: b  reason: collision with root package name */
    private final ai.a f48151b;

    /* renamed from: c  reason: collision with root package name */
    private final ai.a f48152c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48153d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, ai.a aVar, ai.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f48150a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f48151b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f48152c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f48153d = str;
    }

    @Override // qh.f
    public Context b() {
        return this.f48150a;
    }

    @Override // qh.f
    public String c() {
        return this.f48153d;
    }

    @Override // qh.f
    public ai.a d() {
        return this.f48152c;
    }

    @Override // qh.f
    public ai.a e() {
        return this.f48151b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f48150a.equals(fVar.b()) && this.f48151b.equals(fVar.e()) && this.f48152c.equals(fVar.d()) && this.f48153d.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f48150a.hashCode() ^ 1000003) * 1000003) ^ this.f48151b.hashCode()) * 1000003) ^ this.f48152c.hashCode()) * 1000003) ^ this.f48153d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f48150a + ", wallClock=" + this.f48151b + ", monotonicClock=" + this.f48152c + ", backendName=" + this.f48153d + "}";
    }
}