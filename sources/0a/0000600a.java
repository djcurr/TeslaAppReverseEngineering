package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tesla/data/oapi/SetValetModeBody;", "", "", "on", "", "password", "<init>", "(ZLjava/lang/String;)V", "a", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetValetModeBody {
    @ir.b(name = "on")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21677a;
    @ir.b(name = "password")

    /* renamed from: b  reason: collision with root package name */
    private final String f21678b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public SetValetModeBody(boolean z11, String password) {
        s.g(password, "password");
        this.f21677a = z11;
        this.f21678b = password;
    }

    public final boolean a() {
        return this.f21677a;
    }

    public final String b() {
        return this.f21678b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetValetModeBody) {
            SetValetModeBody setValetModeBody = (SetValetModeBody) obj;
            return this.f21677a == setValetModeBody.f21677a && s.c(this.f21678b, setValetModeBody.f21678b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21677a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f21678b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f21677a;
        String str = this.f21678b;
        return "SetValetModeBody(on=" + z11 + ", password=" + str + ")";
    }
}