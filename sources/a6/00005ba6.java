package com.stripe.android.ui.core.forms;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class FormFieldEntry {
    public static final int $stable = 0;
    private final boolean isComplete;
    private final String value;

    public FormFieldEntry(String str, boolean z11) {
        this.value = str;
        this.isComplete = z11;
    }

    public static /* synthetic */ FormFieldEntry copy$default(FormFieldEntry formFieldEntry, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formFieldEntry.value;
        }
        if ((i11 & 2) != 0) {
            z11 = formFieldEntry.isComplete;
        }
        return formFieldEntry.copy(str, z11);
    }

    public final String component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.isComplete;
    }

    public final FormFieldEntry copy(String str, boolean z11) {
        return new FormFieldEntry(str, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFieldEntry) {
            FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
            return s.c(this.value, formFieldEntry.value) && this.isComplete == formFieldEntry.isComplete;
        }
        return false;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.isComplete;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public String toString() {
        return "FormFieldEntry(value=" + ((Object) this.value) + ", isComplete=" + this.isComplete + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FormFieldEntry(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11);
    }
}