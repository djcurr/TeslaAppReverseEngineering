package xs;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f57687a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57688b;

    public a(boolean z11, int i11) {
        this.f57687a = z11;
        this.f57688b = i11;
    }

    public final int a() {
        return this.f57688b;
    }

    public final boolean b() {
        return this.f57687a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f57687a == aVar.f57687a && this.f57688b == aVar.f57688b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f57687a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + Integer.hashCode(this.f57688b);
    }

    public String toString() {
        boolean z11 = this.f57687a;
        int i11 = this.f57688b;
        return "RetryPolicy(retry=" + z11 + ", delaySeconds=" + i11 + ")";
    }

    public /* synthetic */ a(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i12 & 2) != 0 ? 0 : i11);
    }
}