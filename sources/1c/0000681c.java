package es;

import com.tesla.analytics.TeslaAnalyticsService;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final k f25245a;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<TeslaAnalyticsService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25246a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final TeslaAnalyticsService invoke() {
            return new TeslaAnalyticsService();
        }
    }

    static {
        k a11;
        a11 = m.a(a.f25246a);
        f25245a = a11;
    }

    public static final c a() {
        return (c) f25245a.getValue();
    }
}