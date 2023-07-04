package com.stripe.android.financialconnections;

import androidx.lifecycle.l0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetState {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_AUTHFLOW_ACTIVE = "key_authflow_active";
    private static final String KEY_MANIFEST = "key_manifest";
    private final boolean activityRecreated;
    private final boolean authFlowActive;
    private final FinancialConnectionsSessionManifest manifest;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FinancialConnectionsSheetState() {
        this(false, null, false, 7, null);
    }

    public FinancialConnectionsSheetState(boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, boolean z12) {
        this.activityRecreated = z11;
        this.manifest = financialConnectionsSessionManifest;
        this.authFlowActive = z12;
    }

    public static /* synthetic */ FinancialConnectionsSheetState copy$default(FinancialConnectionsSheetState financialConnectionsSheetState, boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = financialConnectionsSheetState.activityRecreated;
        }
        if ((i11 & 2) != 0) {
            financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
        }
        if ((i11 & 4) != 0) {
            z12 = financialConnectionsSheetState.authFlowActive;
        }
        return financialConnectionsSheetState.copy(z11, financialConnectionsSessionManifest, z12);
    }

    public final boolean component1() {
        return this.activityRecreated;
    }

    public final FinancialConnectionsSessionManifest component2() {
        return this.manifest;
    }

    public final boolean component3() {
        return this.authFlowActive;
    }

    public final FinancialConnectionsSheetState copy(boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, boolean z12) {
        return new FinancialConnectionsSheetState(z11, financialConnectionsSessionManifest, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSheetState) {
            FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
            return this.activityRecreated == financialConnectionsSheetState.activityRecreated && s.c(this.manifest, financialConnectionsSheetState.manifest) && this.authFlowActive == financialConnectionsSheetState.authFlowActive;
        }
        return false;
    }

    public final FinancialConnectionsSheetState from$financial_connections_release(l0 savedStateHandle) {
        s.g(savedStateHandle, "savedStateHandle");
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) savedStateHandle.c(KEY_MANIFEST);
        if (financialConnectionsSessionManifest == null) {
            financialConnectionsSessionManifest = this.manifest;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
        Boolean bool = (Boolean) savedStateHandle.c(KEY_AUTHFLOW_ACTIVE);
        return copy$default(this, false, financialConnectionsSessionManifest2, bool == null ? this.authFlowActive : bool.booleanValue(), 1, null);
    }

    public final boolean getActivityRecreated() {
        return this.activityRecreated;
    }

    public final boolean getAuthFlowActive() {
        return this.authFlowActive;
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.activityRecreated;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        int hashCode = (i11 + (financialConnectionsSessionManifest == null ? 0 : financialConnectionsSessionManifest.hashCode())) * 31;
        boolean z12 = this.authFlowActive;
        return hashCode + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final void to$financial_connections_release(l0 savedStateHandle, FinancialConnectionsSheetState previousValue) {
        s.g(savedStateHandle, "savedStateHandle");
        s.g(previousValue, "previousValue");
        if (!s.c(previousValue.manifest, this.manifest)) {
            savedStateHandle.h(KEY_MANIFEST, this.manifest);
        }
        boolean z11 = previousValue.authFlowActive;
        boolean z12 = this.authFlowActive;
        if (z11 != z12) {
            savedStateHandle.h(KEY_AUTHFLOW_ACTIVE, Boolean.valueOf(z12));
        }
    }

    public String toString() {
        return "FinancialConnectionsSheetState(activityRecreated=" + this.activityRecreated + ", manifest=" + this.manifest + ", authFlowActive=" + this.authFlowActive + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FinancialConnectionsSheetState(boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : financialConnectionsSessionManifest, (i11 & 4) != 0 ? false : z12);
    }
}