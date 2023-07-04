package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import s2.r;
import wz.s0;

@a
/* loaded from: classes6.dex */
public final class SimpleTextSpec extends FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;
    private final Capitalization capitalization;
    private final KeyboardType keyboardType;
    private final int label;
    private final boolean showOptionalLabel;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<SimpleTextSpec> serializer() {
            return SimpleTextSpec$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Capitalization.values().length];
            iArr[Capitalization.None.ordinal()] = 1;
            iArr[Capitalization.Characters.ordinal()] = 2;
            iArr[Capitalization.Words.ordinal()] = 3;
            iArr[Capitalization.Sentences.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KeyboardType.values().length];
            iArr2[KeyboardType.Text.ordinal()] = 1;
            iArr2[KeyboardType.Ascii.ordinal()] = 2;
            iArr2[KeyboardType.Number.ordinal()] = 3;
            iArr2[KeyboardType.Phone.ordinal()] = 4;
            iArr2[KeyboardType.Uri.ordinal()] = 5;
            iArr2[KeyboardType.Email.ordinal()] = 6;
            iArr2[KeyboardType.Password.ordinal()] = 7;
            iArr2[KeyboardType.NumberPassword.ordinal()] = 8;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleTextSpec(int i11, IdentifierSpec identifierSpec, int i12, Capitalization capitalization, KeyboardType keyboardType, boolean z11, q1 q1Var) {
        super(null);
        if (3 != (i11 & 3)) {
            f1.a(i11, 3, SimpleTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.label = i12;
        if ((i11 & 4) == 0) {
            this.capitalization = Capitalization.None;
        } else {
            this.capitalization = capitalization;
        }
        if ((i11 & 8) == 0) {
            this.keyboardType = KeyboardType.Ascii;
        } else {
            this.keyboardType = keyboardType;
        }
        if ((i11 & 16) == 0) {
            this.showOptionalLabel = false;
        } else {
            this.showOptionalLabel = z11;
        }
    }

    public static /* synthetic */ SimpleTextSpec copy$default(SimpleTextSpec simpleTextSpec, IdentifierSpec identifierSpec, int i11, Capitalization capitalization, KeyboardType keyboardType, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = simpleTextSpec.getApiPath();
        }
        if ((i12 & 2) != 0) {
            i11 = simpleTextSpec.label;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            capitalization = simpleTextSpec.capitalization;
        }
        Capitalization capitalization2 = capitalization;
        if ((i12 & 8) != 0) {
            keyboardType = simpleTextSpec.keyboardType;
        }
        KeyboardType keyboardType2 = keyboardType;
        if ((i12 & 16) != 0) {
            z11 = simpleTextSpec.showOptionalLabel;
        }
        return simpleTextSpec.copy(identifierSpec, i13, capitalization2, keyboardType2, z11);
    }

    public static /* synthetic */ void getCapitalization$annotations() {
    }

    public static /* synthetic */ void getKeyboardType$annotations() {
    }

    public static /* synthetic */ void getLabel$annotations() {
    }

    public static /* synthetic */ void getShowOptionalLabel$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(SimpleTextSpec simpleTextSpec, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = s0.i();
        }
        return simpleTextSpec.transform(map);
    }

    public static final void write$Self(SimpleTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.n(serialDesc, 1, self.label);
        if (output.k(serialDesc, 2) || self.capitalization != Capitalization.None) {
            output.q(serialDesc, 2, Capitalization$$serializer.INSTANCE, self.capitalization);
        }
        if (output.k(serialDesc, 3) || self.keyboardType != KeyboardType.Ascii) {
            output.q(serialDesc, 3, KeyboardType$$serializer.INSTANCE, self.keyboardType);
        }
        if (output.k(serialDesc, 4) || self.showOptionalLabel) {
            output.C(serialDesc, 4, self.showOptionalLabel);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final int component2() {
        return this.label;
    }

    public final Capitalization component3() {
        return this.capitalization;
    }

    public final KeyboardType component4() {
        return this.keyboardType;
    }

    public final boolean component5() {
        return this.showOptionalLabel;
    }

    public final SimpleTextSpec copy(IdentifierSpec apiPath, int i11, Capitalization capitalization, KeyboardType keyboardType, boolean z11) {
        s.g(apiPath, "apiPath");
        s.g(capitalization, "capitalization");
        s.g(keyboardType, "keyboardType");
        return new SimpleTextSpec(apiPath, i11, capitalization, keyboardType, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleTextSpec) {
            SimpleTextSpec simpleTextSpec = (SimpleTextSpec) obj;
            return s.c(getApiPath(), simpleTextSpec.getApiPath()) && this.label == simpleTextSpec.label && this.capitalization == simpleTextSpec.capitalization && this.keyboardType == simpleTextSpec.keyboardType && this.showOptionalLabel == simpleTextSpec.showOptionalLabel;
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final int getLabel() {
        return this.label;
    }

    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((getApiPath().hashCode() * 31) + Integer.hashCode(this.label)) * 31) + this.capitalization.hashCode()) * 31) + this.keyboardType.hashCode()) * 31;
        boolean z11 = this.showOptionalLabel;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + getApiPath() + ", label=" + this.label + ", capitalization=" + this.capitalization + ", keyboardType=" + this.keyboardType + ", showOptionalLabel=" + this.showOptionalLabel + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        int b11;
        int g11;
        s.g(initialValues, "initialValues");
        IdentifierSpec apiPath = getApiPath();
        int i11 = this.label;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.capitalization.ordinal()];
        if (i12 == 1) {
            b11 = r.f50134a.b();
        } else if (i12 == 2) {
            b11 = r.f50134a.a();
        } else if (i12 == 3) {
            b11 = r.f50134a.d();
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            b11 = r.f50134a.c();
        }
        switch (WhenMappings.$EnumSwitchMapping$1[this.keyboardType.ordinal()]) {
            case 1:
                g11 = s2.s.f50139b.g();
                break;
            case 2:
                g11 = s2.s.f50139b.a();
                break;
            case 3:
                g11 = s2.s.f50139b.c();
                break;
            case 4:
                g11 = s2.s.f50139b.f();
                break;
            case 5:
                g11 = s2.s.f50139b.h();
                break;
            case 6:
                g11 = s2.s.f50139b.b();
                break;
            case 7:
                g11 = s2.s.f50139b.e();
                break;
            case 8:
                g11 = s2.s.f50139b.d();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleTextElement(apiPath, new SimpleTextFieldController(new SimpleTextFieldConfig(i11, b11, g11, null), this.showOptionalLabel, initialValues.get(getApiPath()))), null, 2, null);
    }

    public /* synthetic */ SimpleTextSpec(IdentifierSpec identifierSpec, int i11, Capitalization capitalization, KeyboardType keyboardType, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, (i12 & 4) != 0 ? Capitalization.None : capitalization, (i12 & 8) != 0 ? KeyboardType.Ascii : keyboardType, (i12 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextSpec(IdentifierSpec apiPath, int i11, Capitalization capitalization, KeyboardType keyboardType, boolean z11) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(capitalization, "capitalization");
        s.g(keyboardType, "keyboardType");
        this.apiPath = apiPath;
        this.label = i11;
        this.capitalization = capitalization;
        this.keyboardType = keyboardType;
        this.showOptionalLabel = z11;
    }
}