package com.facebook.hermes.intl;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.facebook.hermes.intl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C0211a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11177a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11178b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f11179c;

        static {
            int[] iArr = new int[b.values().length];
            f11179c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11179c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11179c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f11178b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11178b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f11177a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11177a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11177a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11177a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11177a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C0211a.f11179c[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "false";
                    }
                    throw new IllegalArgumentException();
                }
                return "lower";
            }
            return "upper";
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C0211a.f11177a[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return "";
                            }
                            throw new IllegalArgumentException();
                        }
                        return "variant";
                    }
                    return "case";
                }
                return "accent";
            }
            return "base";
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C0211a.f11178b[ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "search";
                }
                throw new IllegalArgumentException();
            }
            return "sort";
        }
    }

    int a(String str, String str2);

    c b();

    a c(ye.b<?> bVar);

    a d(boolean z11);

    a e(b bVar);

    a f(boolean z11);

    a g(c cVar);
}