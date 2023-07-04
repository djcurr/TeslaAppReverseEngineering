package com.stripe.android.paymentsheet.forms;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.i;
import g30.q0;
import g30.q1;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class PaymentMethodRequirements {
    private final Boolean confirmPMFromCustomer;
    private final Set<PIRequirement> piRequirements;
    private final Set<SIRequirement> siRequirements;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<PaymentMethodRequirements> serializer() {
            return PaymentMethodRequirements$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaymentMethodRequirements(int i11, Set set, Set set2, Boolean bool, q1 q1Var) {
        if (7 != (i11 & 7)) {
            f1.a(i11, 7, PaymentMethodRequirements$$serializer.INSTANCE.getDescriptor());
        }
        this.piRequirements = set;
        this.siRequirements = set2;
        this.confirmPMFromCustomer = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodRequirements copy$default(PaymentMethodRequirements paymentMethodRequirements, Set set, Set set2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = paymentMethodRequirements.piRequirements;
        }
        if ((i11 & 2) != 0) {
            set2 = paymentMethodRequirements.siRequirements;
        }
        if ((i11 & 4) != 0) {
            bool = paymentMethodRequirements.confirmPMFromCustomer;
        }
        return paymentMethodRequirements.copy(set, set2, bool);
    }

    public static final void write$Self(PaymentMethodRequirements self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.D(serialDesc, 0, new q0(new c30.d(m0.b(PIRequirement.class), new Annotation[0])), self.piRequirements);
        output.D(serialDesc, 1, new q0(new c30.d(m0.b(SIRequirement.class), new Annotation[0])), self.siRequirements);
        output.D(serialDesc, 2, i.f27597a, self.confirmPMFromCustomer);
    }

    public final Set<PIRequirement> component1() {
        return this.piRequirements;
    }

    public final Set<SIRequirement> component2() {
        return this.siRequirements;
    }

    public final Boolean component3() {
        return this.confirmPMFromCustomer;
    }

    public final PaymentMethodRequirements copy(Set<? extends PIRequirement> set, Set<? extends SIRequirement> set2, Boolean bool) {
        return new PaymentMethodRequirements(set, set2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethodRequirements) {
            PaymentMethodRequirements paymentMethodRequirements = (PaymentMethodRequirements) obj;
            return s.c(this.piRequirements, paymentMethodRequirements.piRequirements) && s.c(this.siRequirements, paymentMethodRequirements.siRequirements) && s.c(this.confirmPMFromCustomer, paymentMethodRequirements.confirmPMFromCustomer);
        }
        return false;
    }

    public final Boolean getConfirmPMFromCustomer() {
        return this.confirmPMFromCustomer;
    }

    public final Set<PIRequirement> getPiRequirements() {
        return this.piRequirements;
    }

    public final Set<SIRequirement> getSiRequirements() {
        return this.siRequirements;
    }

    public int hashCode() {
        Set<PIRequirement> set = this.piRequirements;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<SIRequirement> set2 = this.siRequirements;
        int hashCode2 = (hashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Boolean bool = this.confirmPMFromCustomer;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodRequirements(piRequirements=" + this.piRequirements + ", siRequirements=" + this.siRequirements + ", confirmPMFromCustomer=" + this.confirmPMFromCustomer + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodRequirements(Set<? extends PIRequirement> set, Set<? extends SIRequirement> set2, Boolean bool) {
        this.piRequirements = set;
        this.siRequirements = set2;
        this.confirmPMFromCustomer = bool;
    }
}