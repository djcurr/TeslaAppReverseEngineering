package com.google.common.base;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o {

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15929a;

        /* renamed from: b  reason: collision with root package name */
        private final C0289b f15930b;

        /* renamed from: c  reason: collision with root package name */
        private C0289b f15931c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15932d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15933e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class a extends C0289b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.common.base.o$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0289b {

            /* renamed from: a  reason: collision with root package name */
            String f15934a;

            /* renamed from: b  reason: collision with root package name */
            Object f15935b;

            /* renamed from: c  reason: collision with root package name */
            C0289b f15936c;

            private C0289b() {
            }
        }

        private C0289b f() {
            C0289b c0289b = new C0289b();
            this.f15931c.f15936c = c0289b;
            this.f15931c = c0289b;
            return c0289b;
        }

        private b g(Object obj) {
            f().f15935b = obj;
            return this;
        }

        private b h(String str, Object obj) {
            C0289b f11 = f();
            f11.f15935b = obj;
            f11.f15934a = (String) u.o(str);
            return this;
        }

        private a i() {
            a aVar = new a();
            this.f15931c.f15936c = aVar;
            this.f15931c = aVar;
            return aVar;
        }

        private b j(String str, Object obj) {
            a i11 = i();
            i11.f15935b = obj;
            i11.f15934a = (String) u.o(str);
            return this;
        }

        private static boolean l(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof r) {
                    return !((r) obj).c();
                }
                return obj.getClass().isArray() && Array.getLength(obj) == 0;
            }
        }

        public b a(String str, double d11) {
            return j(str, String.valueOf(d11));
        }

        public b b(String str, int i11) {
            return j(str, String.valueOf(i11));
        }

        public b c(String str, long j11) {
            return j(str, String.valueOf(j11));
        }

        public b d(String str, Object obj) {
            return h(str, obj);
        }

        public b e(String str, boolean z11) {
            return j(str, String.valueOf(z11));
        }

        public b k(Object obj) {
            return g(obj);
        }

        public b m() {
            this.f15932d = true;
            return this;
        }

        public String toString() {
            boolean z11 = this.f15932d;
            boolean z12 = this.f15933e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f15929a);
            sb2.append(CoreConstants.CURLY_LEFT);
            String str = "";
            for (C0289b c0289b = this.f15930b.f15936c; c0289b != null; c0289b = c0289b.f15936c) {
                Object obj = c0289b.f15935b;
                if (!(c0289b instanceof a)) {
                    if (obj == null) {
                        if (z11) {
                        }
                    } else if (z12 && l(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = c0289b.f15934a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb2.append(obj);
                }
                str = ", ";
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }

        private b(String str) {
            C0289b c0289b = new C0289b();
            this.f15930b = c0289b;
            this.f15931c = c0289b;
            this.f15932d = false;
            this.f15933e = false;
            this.f15929a = (String) u.o(str);
        }
    }

    public static <T> T a(T t11, T t12) {
        if (t11 != null) {
            return t11;
        }
        Objects.requireNonNull(t12, "Both parameters are null");
        return t12;
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}