package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final a0 f36067a = new u(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    private static final a0 f36068b = new u(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* renamed from: c  reason: collision with root package name */
    private static final a0 f36069c;

    /* loaded from: classes.dex */
    static final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36070a = new a();

        a() {
        }

        @Override // l0.a0
        public final float a(float f11) {
            return f11;
        }
    }

    static {
        new u(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        f36069c = a.f36070a;
    }

    public static final a0 a() {
        return f36067a;
    }

    public static final a0 b() {
        return f36069c;
    }

    public static final a0 c() {
        return f36068b;
    }
}