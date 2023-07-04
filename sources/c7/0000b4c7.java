package t7;

import ch.qos.logback.core.CoreConstants;
import e7.j;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51752a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51753b;

    public h(boolean z11, String str) {
        this.f51752a = z11;
        this.f51753b = str;
    }

    public final String a() {
        return this.f51753b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f51752a == hVar.f51752a && s.c(this.f51753b, hVar.f51753b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f51752a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        String str = this.f51753b;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VoucherOutputData(isValid=" + this.f51752a + ", paymentMethodType=" + ((Object) this.f51753b) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}