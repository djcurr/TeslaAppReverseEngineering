package io.sentry.android.core;

import android.content.Context;
import kz.a;

/* loaded from: classes5.dex */
final class r implements qz.q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32137a;

    /* renamed from: b  reason: collision with root package name */
    private final io.sentry.d0 f32138b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32139a;

        static {
            int[] iArr = new int[a.EnumC0686a.values().length];
            f32139a = iArr;
            try {
                iArr[a.EnumC0686a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32139a[a.EnumC0686a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32139a[a.EnumC0686a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, io.sentry.d0 d0Var) {
        this.f32137a = context;
        this.f32138b = d0Var;
    }

    boolean a(a.EnumC0686a enumC0686a) {
        int i11 = a.f32139a[enumC0686a.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    @Override // qz.q
    public boolean isConnected() {
        return a(kz.a.b(this.f32137a, this.f32138b));
    }
}