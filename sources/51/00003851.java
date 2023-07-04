package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f16358b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile p f16359c;

    /* renamed from: d  reason: collision with root package name */
    static final p f16360d = new p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, y.e<?, ?>> f16361a;

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f16362a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16363b;

        a(Object obj, int i11) {
            this.f16362a = obj;
            this.f16363b = i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f16362a == aVar.f16362a && this.f16363b == aVar.f16363b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16362a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f16363b;
        }
    }

    p() {
        this.f16361a = new HashMap();
    }

    public static p b() {
        p pVar = f16359c;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f16359c;
                if (pVar == null) {
                    if (f16358b) {
                        pVar = o.a();
                    } else {
                        pVar = f16360d;
                    }
                    f16359c = pVar;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends q0> y.e<ContainingType, ?> a(ContainingType containingtype, int i11) {
        return (y.e<ContainingType, ?>) this.f16361a.get(new a(containingtype, i11));
    }

    p(boolean z11) {
        this.f16361a = Collections.emptyMap();
    }
}