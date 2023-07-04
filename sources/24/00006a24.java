package expo.modules.interfaces.permissions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lexpo/modules/interfaces/permissions/PermissionsResponse;", "", "Lexpo/modules/interfaces/permissions/PermissionsStatus;", "component1", "", "component2", PermissionsResponse.STATUS_KEY, PermissionsResponse.CAN_ASK_AGAIN_KEY, "copy", "", "toString", "", "hashCode", "other", "equals", "Lexpo/modules/interfaces/permissions/PermissionsStatus;", "getStatus", "()Lexpo/modules/interfaces/permissions/PermissionsStatus;", "Z", "getCanAskAgain", "()Z", "<init>", "(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V", "Companion", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class PermissionsResponse {
    public static final String CAN_ASK_AGAIN_KEY = "canAskAgain";
    public static final Companion Companion = new Companion(null);
    public static final String EXPIRES_KEY = "expires";
    public static final String GRANTED_KEY = "granted";
    public static final String PERMISSION_EXPIRES_NEVER = "never";
    public static final String SCOPE_ALWAYS = "always";
    public static final String SCOPE_IN_USE = "whenInUse";
    public static final String SCOPE_KEY = "scope";
    public static final String SCOPE_NONE = "none";
    public static final String STATUS_KEY = "status";
    private final boolean canAskAgain;
    private final PermissionsStatus status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;", "", "", "CAN_ASK_AGAIN_KEY", "Ljava/lang/String;", "EXPIRES_KEY", "GRANTED_KEY", "PERMISSION_EXPIRES_NEVER", "SCOPE_ALWAYS", "SCOPE_IN_USE", "SCOPE_KEY", "SCOPE_NONE", "STATUS_KEY", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PermissionsResponse(PermissionsStatus status, boolean z11) {
        s.g(status, "status");
        this.status = status;
        this.canAskAgain = z11;
    }

    public static /* synthetic */ PermissionsResponse copy$default(PermissionsResponse permissionsResponse, PermissionsStatus permissionsStatus, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            permissionsStatus = permissionsResponse.status;
        }
        if ((i11 & 2) != 0) {
            z11 = permissionsResponse.canAskAgain;
        }
        return permissionsResponse.copy(permissionsStatus, z11);
    }

    public final PermissionsStatus component1() {
        return this.status;
    }

    public final boolean component2() {
        return this.canAskAgain;
    }

    public final PermissionsResponse copy(PermissionsStatus status, boolean z11) {
        s.g(status, "status");
        return new PermissionsResponse(status, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PermissionsResponse) {
            PermissionsResponse permissionsResponse = (PermissionsResponse) obj;
            return this.status == permissionsResponse.status && this.canAskAgain == permissionsResponse.canAskAgain;
        }
        return false;
    }

    public final boolean getCanAskAgain() {
        return this.canAskAgain;
    }

    public final PermissionsStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        boolean z11 = this.canAskAgain;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        PermissionsStatus permissionsStatus = this.status;
        boolean z11 = this.canAskAgain;
        return "PermissionsResponse(status=" + permissionsStatus + ", canAskAgain=" + z11 + ")";
    }

    public /* synthetic */ PermissionsResponse(PermissionsStatus permissionsStatus, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(permissionsStatus, (i11 & 2) != 0 ? true : z11);
    }
}