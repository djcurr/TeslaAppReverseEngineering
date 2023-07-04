package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public enum s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f16592id;

    s(int i11) {
        this.f16592id = i11;
    }

    public static s determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f16592id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f16592id);
    }
}