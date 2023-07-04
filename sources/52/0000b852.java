package v0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final b f53779a = new a();

    /* loaded from: classes.dex */
    public static final class a implements b {
        a() {
        }

        @Override // v0.b
        public float a(long j11, x2.d density) {
            s.g(density, "density");
            return BitmapDescriptorFactory.HUE_RED;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(int i11) {
        return new e(i11);
    }

    public static final b b(float f11) {
        return new d(f11, null);
    }

    public static final b c() {
        return f53779a;
    }
}