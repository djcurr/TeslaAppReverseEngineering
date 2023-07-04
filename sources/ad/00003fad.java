package com.plaid.internal;

/* loaded from: classes2.dex */
public enum a7 {
    ASSERT,
    DEBUG,
    ERROR,
    INFO,
    VERBOSE,
    WARN;
    
    public static final a Companion = new a();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.plaid.internal.a7$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0325a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f18170a;

            static {
                int[] iArr = new int[a7.values().length];
                iArr[a7.ASSERT.ordinal()] = 1;
                iArr[a7.DEBUG.ordinal()] = 2;
                iArr[a7.ERROR.ordinal()] = 3;
                iArr[a7.INFO.ordinal()] = 4;
                iArr[a7.VERBOSE.ordinal()] = 5;
                iArr[a7.WARN.ordinal()] = 6;
                f18170a = iArr;
            }
        }
    }
}