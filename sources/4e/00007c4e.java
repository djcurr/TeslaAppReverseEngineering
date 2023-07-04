package ju;

import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33991a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f33992b;

    public c(boolean z11, JSONObject data) {
        s.g(data, "data");
        this.f33991a = z11;
        this.f33992b = data;
    }

    public final JSONObject a() {
        return this.f33992b;
    }

    public final boolean b() {
        return this.f33991a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f33991a == cVar.f33991a && s.c(this.f33992b, cVar.f33992b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f33991a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f33992b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f33991a;
        JSONObject jSONObject = this.f33992b;
        return "StreamMessageInfo(pongReceived=" + z11 + ", data=" + jSONObject + ")";
    }
}