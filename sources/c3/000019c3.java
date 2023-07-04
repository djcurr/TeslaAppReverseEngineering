package com.facebook.react.uimanager.layoutanimation;

/* loaded from: classes3.dex */
enum g {
    CREATE,
    UPDATE,
    DELETE;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12347a;

        static {
            int[] iArr = new int[g.values().length];
            f12347a = iArr;
            try {
                iArr[g.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12347a[g.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12347a[g.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String toString(g gVar) {
        int i11 = a.f12347a[gVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "delete";
                }
                throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + gVar);
            }
            return "update";
        }
        return "create";
    }
}