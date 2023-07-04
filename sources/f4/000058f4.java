package com.stripe.android.stripe3ds2.transactions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public enum UiType {
    Text("01", true),
    SingleSelect("02", true),
    MultiSelect("03", true),
    OutOfBand("04", false),
    Html("05", false);
    
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final boolean requiresSubmitButton;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UiType fromCode$3ds2sdk_release(String str) {
            UiType[] values = UiType.values();
            int length = values.length;
            int i11 = 0;
            while (i11 < length) {
                UiType uiType = values[i11];
                i11++;
                if (s.c(str, uiType.getCode())) {
                    return uiType;
                }
            }
            return null;
        }
    }

    UiType(String str, boolean z11) {
        this.code = str;
        this.requiresSubmitButton = z11;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getRequiresSubmitButton$3ds2sdk_release() {
        return this.requiresSubmitButton;
    }
}