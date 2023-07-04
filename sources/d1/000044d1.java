package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum o1 implements Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);
    
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<o1> f19120b = new Internal.EnumLiteMap<o1>() { // from class: com.plaid.internal.o1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public o1 findValueByNumber(int i11) {
            return o1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19122a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19123a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return o1.forNumber(i11) != null;
        }
    }

    o1(int i11) {
        this.f19122a = i11;
    }

    public static o1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
            }
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<o1> internalGetValueMap() {
        return f19120b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19123a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19122a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o1 valueOf(int i11) {
        return forNumber(i11);
    }
}