package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum n1 implements Internal.EnumLite {
    URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION(0),
    URL_BEHAVIOR_PREFER_UNIVERSAL_LINK(1),
    UNRECOGNIZED(-1);
    
    public static final int URL_BEHAVIOR_PREFER_UNIVERSAL_LINK_VALUE = 1;
    public static final int URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<n1> f19050b = new Internal.EnumLiteMap<n1>() { // from class: com.plaid.internal.n1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public n1 findValueByNumber(int i11) {
            return n1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19052a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19053a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return n1.forNumber(i11) != null;
        }
    }

    n1(int i11) {
        this.f19052a = i11;
    }

    public static n1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return URL_BEHAVIOR_PREFER_UNIVERSAL_LINK;
        }
        return URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION;
    }

    public static Internal.EnumLiteMap<n1> internalGetValueMap() {
        return f19050b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19053a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19052a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n1 valueOf(int i11) {
        return forNumber(i11);
    }
}