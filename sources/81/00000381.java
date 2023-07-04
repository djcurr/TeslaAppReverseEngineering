package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.d0;
import java.util.List;

/* loaded from: classes.dex */
public interface p0 extends f1 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0.a<Integer> f2348b = d0.a.a("camerax.core.imageOutput.targetAspectRatio", z.a.class);

    /* renamed from: c  reason: collision with root package name */
    public static final d0.a<Integer> f2349c = d0.a.a("camerax.core.imageOutput.targetRotation", Integer.TYPE);

    /* renamed from: d  reason: collision with root package name */
    public static final d0.a<Size> f2350d = d0.a.a("camerax.core.imageOutput.targetResolution", Size.class);

    /* renamed from: e  reason: collision with root package name */
    public static final d0.a<Size> f2351e = d0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);

    /* renamed from: f  reason: collision with root package name */
    public static final d0.a<Size> f2352f = d0.a.a("camerax.core.imageOutput.maxResolution", Size.class);

    /* renamed from: g  reason: collision with root package name */
    public static final d0.a<List<Pair<Integer, Size[]>>> f2353g = d0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);

    default Size i(Size size) {
        return (Size) g(f2352f, size);
    }

    default List<Pair<Integer, Size[]>> k(List<Pair<Integer, Size[]>> list) {
        return (List) g(f2353g, list);
    }

    default boolean t() {
        return b(f2348b);
    }

    default int w() {
        return ((Integer) a(f2348b)).intValue();
    }

    default int x(int i11) {
        return ((Integer) g(f2349c, Integer.valueOf(i11))).intValue();
    }

    default Size y(Size size) {
        return (Size) g(f2351e, size);
    }

    default Size z(Size size) {
        return (Size) g(f2350d, size);
    }
}