package bw;

import com.withpersona.sdk.inquiry.network.JsonAdapterBinding;
import java.util.Set;

/* loaded from: classes6.dex */
public final class h implements tw.e<Set<JsonAdapterBinding<?>>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final h f8319a = new h();
    }

    public static h a() {
        return a.f8319a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) tw.h.e(bw.a.g());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}