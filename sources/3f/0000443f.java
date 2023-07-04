package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum j1 implements Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);
    
    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<j1> f18858b = new Internal.EnumLiteMap<j1>() { // from class: com.plaid.internal.j1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public j1 findValueByNumber(int i11) {
            return j1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18860a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18861a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return j1.forNumber(i11) != null;
        }
    }

    j1(int i11) {
        this.f18860a = i11;
    }

    public static j1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
                }
                return SEARCH_BEHAVIOR_PANE_SEARCH_API;
            }
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        return SEARCH_BEHAVIOR_UNKNOWN;
    }

    public static Internal.EnumLiteMap<j1> internalGetValueMap() {
        return f18858b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18861a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18860a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static j1 valueOf(int i11) {
        return forNumber(i11);
    }
}