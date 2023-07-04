package o1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import o1.b;
import x2.q;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0826a f42039a = C0826a.f42040a;

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0826a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0826a f42040a = new C0826a();

        /* renamed from: b  reason: collision with root package name */
        private static final a f42041b = new o1.b(-1.0f, -1.0f);

        /* renamed from: c  reason: collision with root package name */
        private static final a f42042c = new o1.b(BitmapDescriptorFactory.HUE_RED, -1.0f);

        /* renamed from: d  reason: collision with root package name */
        private static final a f42043d;

        /* renamed from: e  reason: collision with root package name */
        private static final a f42044e;

        /* renamed from: f  reason: collision with root package name */
        private static final a f42045f;

        /* renamed from: g  reason: collision with root package name */
        private static final a f42046g;

        /* renamed from: h  reason: collision with root package name */
        private static final c f42047h;

        /* renamed from: i  reason: collision with root package name */
        private static final c f42048i;

        /* renamed from: j  reason: collision with root package name */
        private static final c f42049j;

        /* renamed from: k  reason: collision with root package name */
        private static final b f42050k;

        /* renamed from: l  reason: collision with root package name */
        private static final b f42051l;

        static {
            new o1.b(1.0f, -1.0f);
            new o1.b(-1.0f, BitmapDescriptorFactory.HUE_RED);
            f42043d = new o1.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            f42044e = new o1.b(1.0f, BitmapDescriptorFactory.HUE_RED);
            new o1.b(-1.0f, 1.0f);
            f42045f = new o1.b(BitmapDescriptorFactory.HUE_RED, 1.0f);
            f42046g = new o1.b(1.0f, 1.0f);
            f42047h = new b.C0827b(-1.0f);
            f42048i = new b.C0827b(BitmapDescriptorFactory.HUE_RED);
            f42049j = new b.C0827b(1.0f);
            f42050k = new b.a(-1.0f);
            f42051l = new b.a(BitmapDescriptorFactory.HUE_RED);
            new b.a(1.0f);
        }

        private C0826a() {
        }

        public final c a() {
            return f42049j;
        }

        public final a b() {
            return f42045f;
        }

        public final a c() {
            return f42046g;
        }

        public final a d() {
            return f42043d;
        }

        public final a e() {
            return f42044e;
        }

        public final b f() {
            return f42051l;
        }

        public final c g() {
            return f42048i;
        }

        public final b h() {
            return f42050k;
        }

        public final c i() {
            return f42047h;
        }

        public final a j() {
            return f42042c;
        }

        public final a k() {
            return f42041b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(int i11, int i12, q qVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(int i11, int i12);
    }

    long a(long j11, long j12, q qVar);
}