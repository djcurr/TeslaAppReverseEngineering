package ev;

import av.j;
import cv.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25256a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<ev.a> f25257b = new AtomicReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<i> f25258c = new AtomicReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private static final k f25259d;

    /* renamed from: e  reason: collision with root package name */
    private static final bv.b f25260e;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25261a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final j invoke() {
            b bVar = b.f25256a;
            return new j(bVar.b(), bVar.d(), bVar.a());
        }
    }

    static {
        k a11;
        a11 = m.a(a.f25261a);
        f25259d = a11;
        f25260e = bv.a.f8304a;
    }

    private b() {
    }

    private final Void f() {
        throw new IllegalStateException("WidgetModule is not initialized");
    }

    public final bv.b a() {
        return f25260e;
    }

    public final i b() {
        i iVar = f25258c.get();
        if (iVar != null) {
            return iVar;
        }
        f();
        throw new KotlinNothingValueException();
    }

    public final j c() {
        return (j) f25259d.getValue();
    }

    public final ev.a d() {
        ev.a aVar = f25257b.get();
        if (aVar != null) {
            return aVar;
        }
        f();
        throw new KotlinNothingValueException();
    }

    public final void e(ev.a widgetDependencies, i vehicleRepository) {
        s.g(widgetDependencies, "widgetDependencies");
        s.g(vehicleRepository, "vehicleRepository");
        f25257b.compareAndSet(null, widgetDependencies);
        f25258c.compareAndSet(null, vehicleRepository);
    }
}