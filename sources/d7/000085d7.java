package m10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final h f38278a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38279b;

    public i(h qualifier, boolean z11) {
        kotlin.jvm.internal.s.g(qualifier, "qualifier");
        this.f38278a = qualifier;
        this.f38279b = z11;
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = iVar.f38278a;
        }
        if ((i11 & 2) != 0) {
            z11 = iVar.f38279b;
        }
        return iVar.a(hVar, z11);
    }

    public final i a(h qualifier, boolean z11) {
        kotlin.jvm.internal.s.g(qualifier, "qualifier");
        return new i(qualifier, z11);
    }

    public final h c() {
        return this.f38278a;
    }

    public final boolean d() {
        return this.f38279b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f38278a == iVar.f38278a && this.f38279b == iVar.f38279b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f38278a.hashCode() * 31;
        boolean z11 = this.f38279b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f38278a + ", isForWarningOnly=" + this.f38279b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ i(h hVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i11 & 2) != 0 ? false : z11);
    }
}