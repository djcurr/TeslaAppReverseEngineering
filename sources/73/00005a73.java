package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import g30.u1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class DropdownItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String apiValue;
    private final String displayText;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<DropdownItemSpec> serializer() {
            return DropdownItemSpec$$serializer.INSTANCE;
        }
    }

    public DropdownItemSpec() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ DropdownItemSpec(int i11, String str, String str2, q1 q1Var) {
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, DropdownItemSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiValue = (i11 & 1) == 0 ? null : str;
        if ((i11 & 2) == 0) {
            this.displayText = "Other";
        } else {
            this.displayText = str2;
        }
    }

    public static /* synthetic */ DropdownItemSpec copy$default(DropdownItemSpec dropdownItemSpec, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dropdownItemSpec.apiValue;
        }
        if ((i11 & 2) != 0) {
            str2 = dropdownItemSpec.displayText;
        }
        return dropdownItemSpec.copy(str, str2);
    }

    public static /* synthetic */ void getApiValue$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static final void write$Self(DropdownItemSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.apiValue != null) {
            output.D(serialDesc, 0, u1.f27647a, self.apiValue);
        }
        if (output.k(serialDesc, 1) || !s.c(self.displayText, "Other")) {
            output.p(serialDesc, 1, self.displayText);
        }
    }

    public final String component1() {
        return this.apiValue;
    }

    public final String component2() {
        return this.displayText;
    }

    public final DropdownItemSpec copy(String str, String displayText) {
        s.g(displayText, "displayText");
        return new DropdownItemSpec(str, displayText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownItemSpec) {
            DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) obj;
            return s.c(this.apiValue, dropdownItemSpec.apiValue) && s.c(this.displayText, dropdownItemSpec.displayText);
        }
        return false;
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public int hashCode() {
        String str = this.apiValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.displayText.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + ((Object) this.apiValue) + ", displayText=" + this.displayText + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DropdownItemSpec(String str, String displayText) {
        s.g(displayText, "displayText");
        this.apiValue = str;
        this.displayText = displayText;
    }

    public /* synthetic */ DropdownItemSpec(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? "Other" : str2);
    }
}