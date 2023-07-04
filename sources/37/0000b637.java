package tx;

import android.content.Context;
import android.location.Location;
import io.nlopez.smartlocation.geocoding.providers.AndroidGeocodingProvider;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f52642a;

    /* renamed from: b  reason: collision with root package name */
    private cy.b f52643b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52644c;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f52645a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f52646b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f52647c = true;

        public b(Context context) {
            this.f52645a = context;
        }

        public e a() {
            return new e(this.f52645a, cy.c.a(this.f52646b), this.f52647c);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final Map<Context, vx.a> f52648e = new WeakHashMap();

        /* renamed from: a  reason: collision with root package name */
        private final e f52649a;

        /* renamed from: b  reason: collision with root package name */
        private vx.a f52650b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f52651c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f52652d = false;

        public c(e eVar, vx.a aVar) {
            this.f52649a = eVar;
            Map<Context, vx.a> map = f52648e;
            if (!map.containsKey(eVar.f52642a)) {
                map.put(eVar.f52642a, aVar);
            }
            this.f52650b = map.get(eVar.f52642a);
            if (eVar.f52644c) {
                this.f52650b.a(eVar.f52642a, eVar.f52643b);
            }
        }

        public c a(Location location) {
            this.f52652d = true;
            this.f52650b.b(location, 1);
            return this;
        }

        public c b(String str) {
            this.f52651c = true;
            this.f52650b.d(str, 1);
            return this;
        }

        public void c(String str, tx.b bVar) {
            b(str);
            e(bVar);
        }

        public void d(Location location, tx.d dVar) {
            a(location);
            g(dVar);
        }

        public void e(tx.b bVar) {
            f(bVar, null);
        }

        public void f(tx.b bVar, tx.d dVar) {
            if (this.f52650b != null) {
                if (this.f52651c && bVar == null) {
                    this.f52649a.f52643b.d("Some places were added for geocoding but the listener was not specified!", new Object[0]);
                }
                if (this.f52652d && dVar == null) {
                    this.f52649a.f52643b.d("Some places were added for reverse geocoding but the listener was not specified!", new Object[0]);
                }
                this.f52650b.c(bVar, dVar);
                return;
            }
            throw new RuntimeException("A provider must be initialized");
        }

        public void g(tx.d dVar) {
            f(null, dVar);
        }

        public void h() {
            this.f52650b.stop();
        }
    }

    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: e  reason: collision with root package name */
        private static final Map<Context, yx.a> f52653e = new WeakHashMap();

        /* renamed from: a  reason: collision with root package name */
        private final e f52654a;

        /* renamed from: c  reason: collision with root package name */
        private yx.a f52656c;

        /* renamed from: b  reason: collision with root package name */
        private zx.b f52655b = zx.b.f61259d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f52657d = false;

        public d(e eVar, yx.a aVar) {
            this.f52654a = eVar;
            Map<Context, yx.a> map = f52653e;
            if (!map.containsKey(eVar.f52642a)) {
                map.put(eVar.f52642a, aVar);
            }
            this.f52656c = map.get(eVar.f52642a);
            if (eVar.f52644c) {
                this.f52656c.a(eVar.f52642a, eVar.f52643b);
            }
        }

        public d a(zx.b bVar) {
            this.f52655b = bVar;
            return this;
        }

        public Location b() {
            return this.f52656c.c();
        }

        public d c() {
            this.f52657d = true;
            return this;
        }

        public void d(tx.c cVar) {
            yx.a aVar = this.f52656c;
            if (aVar != null) {
                aVar.b(cVar, this.f52655b, this.f52657d);
                return;
            }
            throw new RuntimeException("A provider must be initialized");
        }

        public by.a e() {
            return by.a.e(this.f52654a.f52642a);
        }
    }

    public static e h(Context context) {
        return new b(context).a();
    }

    public c d() {
        return e(new AndroidGeocodingProvider());
    }

    public c e(vx.a aVar) {
        return new c(this, aVar);
    }

    public d f() {
        return g(new ay.b(this.f52642a));
    }

    public d g(yx.a aVar) {
        return new d(this, aVar);
    }

    private e(Context context, cy.b bVar, boolean z11) {
        this.f52642a = context;
        this.f52643b = bVar;
        this.f52644c = z11;
    }
}