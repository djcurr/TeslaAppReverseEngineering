package hv;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a */
    private final float[] f29436a;

    /* renamed from: b */
    private final long f29437b;

    /* renamed from: c */
    private final k f29438c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends u implements h00.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            e.this = r1;
        }

        @Override // h00.a
        public final Boolean invoke() {
            Float f11;
            float[] fArr = e.this.f29436a;
            int length = fArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    f11 = null;
                    break;
                }
                float f12 = fArr[i11];
                if (Math.abs(f12) > 0.2f) {
                    f11 = Float.valueOf(f12);
                    break;
                }
                i11++;
            }
            return Boolean.valueOf(f11 != null);
        }
    }

    static {
        new a(null);
    }

    public e(float[] values) {
        k a11;
        s.g(values, "values");
        this.f29436a = values;
        this.f29437b = System.currentTimeMillis();
        a11 = m.a(new b());
        this.f29438c = a11;
    }

    public final boolean b() {
        return TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.f29437b, TimeUnit.MILLISECONDS) < 300;
    }

    public final boolean c() {
        return ((Boolean) this.f29438c.getValue()).booleanValue();
    }

    public boolean equals(Object obj) {
        return s.c(this.f29436a, obj);
    }

    public int hashCode() {
        return this.f29436a.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f29436a);
        return "ReceivedDeviceMotion(values=" + arrays + ")";
    }
}