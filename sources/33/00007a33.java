package it;

import com.tesla.features.FeaturesConfig;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32752a = a.f32753a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f32753a = new a();

        private a() {
        }

        public final d a(ct.i realmHelper) {
            s.g(realmHelper, "realmHelper");
            return new g(realmHelper);
        }
    }

    FeaturesConfig a();

    void b(FeaturesConfig featuresConfig);
}