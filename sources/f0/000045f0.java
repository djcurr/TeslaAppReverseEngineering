package com.plaid.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wa {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19678a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static b7 f19679b = g7.f18659a;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(a aVar, String str, Object[] args, boolean z11, int i11) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            kotlin.jvm.internal.s.g(args, "args");
            wa.f19679b.d(str, new Object[]{args}, z11);
        }

        public static void b(a aVar, String str, Object[] args, boolean z11, int i11) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            kotlin.jvm.internal.s.g(args, "args");
            wa.f19679b.b(str, new Object[]{args}, z11);
        }

        public static void c(a aVar, String str, boolean z11, int i11) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            wa.f19679b.a(str, Arrays.copyOf(new Object[0], 0), z11);
        }

        public static void a(a aVar, String str, boolean z11, int i11) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            wa.f19679b.d(str, Arrays.copyOf(new Object[0], 0), z11);
        }

        public static void b(a aVar, String str, boolean z11, int i11) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            wa.f19679b.b(str, Arrays.copyOf(new Object[0], 0), z11);
        }

        public static void a(a aVar, Throwable th2, String str, boolean z11, int i11) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            wa.f19679b.b(th2, str, Arrays.copyOf(new Object[0], 0), z11);
        }

        public static void b(a aVar, Throwable th2, String str, boolean z11, int i11) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            wa.f19679b.a(th2, str, Arrays.copyOf(new Object[0], 0), z11);
        }

        public static void a(a aVar, Throwable th2, boolean z11, int i11) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            wa.f19679b.a(th2, z11);
        }
    }
}