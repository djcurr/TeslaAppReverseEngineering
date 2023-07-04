package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum k1 implements Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);
    
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<k1> f18913b = new Internal.EnumLiteMap<k1>() { // from class: com.plaid.internal.k1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public k1 findValueByNumber(int i11) {
            return k1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18915a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18916a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return k1.forNumber(i11) != null;
        }
    }

    k1(int i11) {
        this.f18915a = i11;
    }

    public static k1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return null;
                            }
                            return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
                        }
                        return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
                    }
                    return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
                }
                return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
            }
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        return SELECTION_LIST_BEHAVIOR_UNKNOWN;
    }

    public static Internal.EnumLiteMap<k1> internalGetValueMap() {
        return f18913b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18916a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18915a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static k1 valueOf(int i11) {
        return forNumber(i11);
    }
}