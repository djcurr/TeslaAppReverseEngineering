package gu;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class r extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final k f28128a;

    /* renamed from: b  reason: collision with root package name */
    private final com.tesla.data.oapi.j f28129b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f28130c;

    /* renamed from: d  reason: collision with root package name */
    private final ot.f f28131d;

    /* renamed from: e  reason: collision with root package name */
    private final String f28132e;

    /* renamed from: f  reason: collision with root package name */
    private final Throwable f28133f;

    public r() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ r(k kVar, com.tesla.data.oapi.j jVar, JSONObject jSONObject, ot.f fVar, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : kVar, (i11 & 2) != 0 ? null : jVar, (i11 & 4) != 0 ? null : jSONObject, (i11 & 8) != 0 ? null : fVar, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : th2);
    }

    public final k a() {
        return this.f28128a;
    }

    public final String b() {
        return getMessage();
    }

    public final Throwable c() {
        return getCause();
    }

    public final JSONObject d() {
        return this.f28130c;
    }

    public final ot.f e() {
        return this.f28131d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return kotlin.jvm.internal.s.c(this.f28128a, rVar.f28128a) && this.f28129b == rVar.f28129b && kotlin.jvm.internal.s.c(this.f28130c, rVar.f28130c) && this.f28131d == rVar.f28131d && kotlin.jvm.internal.s.c(getMessage(), rVar.getMessage()) && kotlin.jvm.internal.s.c(getCause(), rVar.getCause());
        }
        return false;
    }

    public final com.tesla.data.oapi.j f() {
        return this.f28129b;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f28133f;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f28132e;
    }

    public int hashCode() {
        k kVar = this.f28128a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        com.tesla.data.oapi.j jVar = this.f28129b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        JSONObject jSONObject = this.f28130c;
        int hashCode3 = (hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        ot.f fVar = this.f28131d;
        return ((((hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31) + (getMessage() == null ? 0 : getMessage().hashCode())) * 31) + (getCause() != null ? getCause().hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        k kVar = this.f28128a;
        com.tesla.data.oapi.j jVar = this.f28129b;
        JSONObject jSONObject = this.f28130c;
        ot.f fVar = this.f28131d;
        String message = getMessage();
        Throwable cause = getCause();
        return "SignedCommandsException(params=" + kVar + ", statusCode=" + jVar + ", response=" + jSONObject + ", result=" + fVar + ", message=" + message + ", cause=" + cause + ")";
    }

    public r(k kVar, com.tesla.data.oapi.j jVar, JSONObject jSONObject, ot.f fVar, String str, Throwable th2) {
        super(str, th2);
        this.f28128a = kVar;
        this.f28129b = jVar;
        this.f28130c = jSONObject;
        this.f28131d = fVar;
        this.f28132e = str;
        this.f28133f = th2;
    }
}