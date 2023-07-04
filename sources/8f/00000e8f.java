package bw;

import com.squareup.moshi.f;
import java.util.Set;

/* loaded from: classes6.dex */
public final class j implements tw.e<Set<f.d>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final j f8321a = new j();
    }

    public static j a() {
        return a.f8321a;
    }

    public static Set<f.d> c() {
        return (Set) tw.h.e(bw.a.h());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<f.d> get() {
        return c();
    }
}