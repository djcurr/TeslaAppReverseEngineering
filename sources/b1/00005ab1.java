package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class LayoutFormDescriptor {
    public static final int $stable = 8;
    private final LayoutSpec layoutSpec;
    private final boolean showCheckbox;
    private final boolean showCheckboxControlledFields;

    public LayoutFormDescriptor(LayoutSpec layoutSpec, boolean z11, boolean z12) {
        this.layoutSpec = layoutSpec;
        this.showCheckbox = z11;
        this.showCheckboxControlledFields = z12;
    }

    public static /* synthetic */ LayoutFormDescriptor copy$default(LayoutFormDescriptor layoutFormDescriptor, LayoutSpec layoutSpec, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutSpec = layoutFormDescriptor.layoutSpec;
        }
        if ((i11 & 2) != 0) {
            z11 = layoutFormDescriptor.showCheckbox;
        }
        if ((i11 & 4) != 0) {
            z12 = layoutFormDescriptor.showCheckboxControlledFields;
        }
        return layoutFormDescriptor.copy(layoutSpec, z11, z12);
    }

    public final LayoutSpec component1() {
        return this.layoutSpec;
    }

    public final boolean component2() {
        return this.showCheckbox;
    }

    public final boolean component3() {
        return this.showCheckboxControlledFields;
    }

    public final LayoutFormDescriptor copy(LayoutSpec layoutSpec, boolean z11, boolean z12) {
        return new LayoutFormDescriptor(layoutSpec, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutFormDescriptor) {
            LayoutFormDescriptor layoutFormDescriptor = (LayoutFormDescriptor) obj;
            return s.c(this.layoutSpec, layoutFormDescriptor.layoutSpec) && this.showCheckbox == layoutFormDescriptor.showCheckbox && this.showCheckboxControlledFields == layoutFormDescriptor.showCheckboxControlledFields;
        }
        return false;
    }

    public final LayoutSpec getLayoutSpec() {
        return this.layoutSpec;
    }

    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public final boolean getShowCheckboxControlledFields() {
        return this.showCheckboxControlledFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        LayoutSpec layoutSpec = this.layoutSpec;
        int hashCode = (layoutSpec == null ? 0 : layoutSpec.hashCode()) * 31;
        boolean z11 = this.showCheckbox;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.showCheckboxControlledFields;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "LayoutFormDescriptor(layoutSpec=" + this.layoutSpec + ", showCheckbox=" + this.showCheckbox + ", showCheckboxControlledFields=" + this.showCheckboxControlledFields + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}