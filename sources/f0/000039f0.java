package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum f implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<f> internalValueMap = new Internal.EnumLiteMap<f>() { // from class: com.google.firebase.perf.v1.f.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public f findValueByNumber(int i11) {
            return f.forNumber(i11);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    private static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        static final Internal.EnumVerifier f17062a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return f.forNumber(i11) != null;
        }
    }

    f(int i11) {
        this.value = i11;
    }

    public static f forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static Internal.EnumLiteMap<f> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f17062a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static f valueOf(int i11) {
        return forNumber(i11);
    }
}