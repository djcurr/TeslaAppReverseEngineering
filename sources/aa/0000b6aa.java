package u1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final d f52887b = new d(null);

    /* renamed from: c  reason: collision with root package name */
    private static final a f52888c = new C1190a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d  reason: collision with root package name */
    private static final a f52889d = new c(new float[]{0.40024f, -0.2263f, BitmapDescriptorFactory.HUE_RED, 0.7076f, 1.16532f, BitmapDescriptorFactory.HUE_RED, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: a  reason: collision with root package name */
    private final float[] f52890a;

    /* renamed from: u1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1190a extends a {
        C1190a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f52888c;
        }

        public final a b() {
            return a.f52889d;
        }
    }

    static {
        new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    private a(float[] fArr) {
        this.f52890a = fArr;
    }

    public /* synthetic */ a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] c() {
        return this.f52890a;
    }
}