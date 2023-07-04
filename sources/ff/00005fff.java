package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/SetCabinOverheatProtectionBody;", "", "", "fanOnly", "on", "<init>", "(ZZ)V", "a", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetCabinOverheatProtectionBody {
    @ir.b(name = "fan_only")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21652a;
    @ir.b(name = "on")

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21653b;

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

    public SetCabinOverheatProtectionBody(boolean z11, boolean z12) {
        this.f21652a = z11;
        this.f21653b = z12;
    }

    public final boolean a() {
        return this.f21652a;
    }

    public final boolean b() {
        return this.f21653b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetCabinOverheatProtectionBody) {
            SetCabinOverheatProtectionBody setCabinOverheatProtectionBody = (SetCabinOverheatProtectionBody) obj;
            return this.f21652a == setCabinOverheatProtectionBody.f21652a && this.f21653b == setCabinOverheatProtectionBody.f21653b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21652a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        boolean z12 = this.f21653b;
        return i11 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        boolean z11 = this.f21652a;
        boolean z12 = this.f21653b;
        return "SetCabinOverheatProtectionBody(fanOnly=" + z11 + ", on=" + z12 + ")";
    }
}