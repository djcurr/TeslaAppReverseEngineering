package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum f1 implements Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);
    
    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<f1> f18568b = new Internal.EnumLiteMap<f1>() { // from class: com.plaid.internal.f1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public f1 findValueByNumber(int i11) {
            return f1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18570a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18571a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return f1.forNumber(i11) != null;
        }
    }

    f1(int i11) {
        this.f18570a = i11;
    }

    public static f1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
        }
        return GRID_SELECTION_BEHAVIOR_UNKNOWN;
    }

    public static Internal.EnumLiteMap<f1> internalGetValueMap() {
        return f18568b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18571a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18570a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static f1 valueOf(int i11) {
        return forNumber(i11);
    }
}