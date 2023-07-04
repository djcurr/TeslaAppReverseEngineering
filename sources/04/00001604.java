package com.facebook.common.util;

/* loaded from: classes.dex */
public enum a {
    YES,
    NO,
    UNSET;

    /* renamed from: com.facebook.common.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0207a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11059a;

        static {
            int[] iArr = new int[a.values().length];
            f11059a = iArr;
            try {
                iArr[a.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11059a[a.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11059a[a.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static a fromDbValue(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return UNSET;
            }
            return NO;
        }
        return YES;
    }

    public boolean asBoolean() {
        int i11 = C0207a.f11059a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("Unrecognized TriState value: " + this);
                }
                throw new IllegalStateException("No boolean equivalent for UNSET");
            }
            return false;
        }
        return true;
    }

    public Boolean asBooleanObject() {
        int i11 = C0207a.f11059a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return null;
                }
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public int getDbValue() {
        int i11 = C0207a.f11059a[ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 3;
            }
        }
        return i12;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static a valueOf(boolean z11) {
        return z11 ? YES : NO;
    }

    public static a valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public boolean asBoolean(boolean z11) {
        int i11 = C0207a.f11059a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return z11;
                }
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            return false;
        }
        return true;
    }
}