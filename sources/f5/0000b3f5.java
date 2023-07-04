package t1;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51384b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ColorFilter f51385a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b0 b(a aVar, long j11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = p.f51470a.z();
            }
            return aVar.a(j11, i11);
        }

        public final b0 a(long j11, int i11) {
            return d.a(j11, i11);
        }
    }

    public b0(ColorFilter nativeColorFilter) {
        kotlin.jvm.internal.s.g(nativeColorFilter, "nativeColorFilter");
        this.f51385a = nativeColorFilter;
    }

    public final ColorFilter a() {
        return this.f51385a;
    }
}