package z5;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60226a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public final g a() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26 || f.f60225a) {
                return new h(false);
            }
            if (i11 != 26 && i11 != 27) {
                return new h(true);
            }
            return k.f60254e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private g() {
    }

    public abstract boolean a(c6.g gVar, g6.k kVar);

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}