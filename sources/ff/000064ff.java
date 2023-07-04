package d2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Map<t, a> f23421a = new LinkedHashMap();

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f23422a;

        /* renamed from: b  reason: collision with root package name */
        private final long f23423b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f23424c;

        private a(long j11, long j12, boolean z11, int i11) {
            this.f23422a = j11;
            this.f23423b = j12;
            this.f23424c = z11;
        }

        public /* synthetic */ a(long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, z11, i11);
        }

        public final boolean a() {
            return this.f23424c;
        }

        public final long b() {
            return this.f23423b;
        }

        public final long c() {
            return this.f23422a;
        }
    }

    public final void a() {
        this.f23421a.clear();
    }

    public final g b(w pointerInputEvent, f0 positionCalculator) {
        long c11;
        boolean a11;
        long h11;
        kotlin.jvm.internal.s.g(pointerInputEvent, "pointerInputEvent");
        kotlin.jvm.internal.s.g(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.b().size());
        List<x> b11 = pointerInputEvent.b();
        int size = b11.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            x xVar = b11.get(i11);
            a aVar = this.f23421a.get(t.a(xVar.c()));
            if (aVar == null) {
                a11 = z11;
                c11 = xVar.i();
                h11 = xVar.e();
            } else {
                c11 = aVar.c();
                a11 = aVar.a();
                h11 = positionCalculator.h(aVar.b());
            }
            linkedHashMap.put(t.a(xVar.c()), new u(xVar.c(), xVar.i(), xVar.e(), xVar.a(), c11, h11, a11, new d(z11, z11, 3, null), xVar.h(), xVar.b(), xVar.g(), null));
            if (xVar.a()) {
                this.f23421a.put(t.a(xVar.c()), new a(xVar.i(), xVar.f(), xVar.a(), xVar.h(), null));
            } else {
                this.f23421a.remove(t.a(xVar.c()));
            }
            i11 = i12;
            z11 = false;
        }
        return new g(linkedHashMap, pointerInputEvent);
    }
}