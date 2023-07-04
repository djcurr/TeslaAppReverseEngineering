package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<a> f38948i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateNotAllowed#ADAPTER", jsonName = "notAllowed", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final f f38949a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateNoChargeRecommended#ADAPTER", jsonName = "noChargeRecommended", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e f38950b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateChargingOnExcessSolar#ADAPTER", jsonName = "chargingOnExcessSolar", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final c f38951c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateChargingOnAnything#ADAPTER", jsonName = "chargingOnAnything", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final mt.b f38952d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateUserDisabled#ADAPTER", jsonName = "userDisabled", tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final g f38953e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateWaitingForServer#ADAPTER", jsonName = "waitingForServer", tag = 7)

    /* renamed from: f  reason: collision with root package name */
    private final i f38954f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateError#ADAPTER", tag = 8)

    /* renamed from: g  reason: collision with root package name */
    private final d f38955g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateUserStopped#ADAPTER", jsonName = "userStopped", tag = 9)

    /* renamed from: h  reason: collision with root package name */
    private final h f38956h;

    /* renamed from: mt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0751a extends ProtoAdapter<a> {
        C0751a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            f fVar = null;
            e eVar = null;
            c cVar = null;
            mt.b bVar = null;
            g gVar = null;
            i iVar = null;
            d dVar = null;
            h hVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(fVar, eVar, cVar, bVar, gVar, iVar, dVar, hVar, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        fVar = f.f38962a.decode(reader);
                        break;
                    case 2:
                        eVar = e.f38960b.decode(reader);
                        break;
                    case 3:
                        cVar = c.f38958a.decode(reader);
                        break;
                    case 4:
                        bVar = mt.b.f38957a.decode(reader);
                        break;
                    case 5:
                    default:
                        reader.m(g11);
                        break;
                    case 6:
                        gVar = g.f38963a.decode(reader);
                        break;
                    case 7:
                        iVar = i.f38965a.decode(reader);
                        break;
                    case 8:
                        dVar = d.f38959a.decode(reader);
                        break;
                    case 9:
                        hVar = h.f38964a.decode(reader);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            f.f38962a.encodeWithTag(writer, 1, value.f());
            e.f38960b.encodeWithTag(writer, 2, value.e());
            c.f38958a.encodeWithTag(writer, 3, value.c());
            mt.b.f38957a.encodeWithTag(writer, 4, value.b());
            g.f38963a.encodeWithTag(writer, 6, value.g());
            i.f38965a.encodeWithTag(writer, 7, value.i());
            d.f38959a.encodeWithTag(writer, 8, value.d());
            h.f38964a.encodeWithTag(writer, 9, value.h());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + f.f38962a.encodedSizeWithTag(1, value.f()) + e.f38960b.encodedSizeWithTag(2, value.e()) + c.f38958a.encodedSizeWithTag(3, value.c()) + mt.b.f38957a.encodedSizeWithTag(4, value.b()) + g.f38963a.encodedSizeWithTag(6, value.g()) + i.f38965a.encodedSizeWithTag(7, value.i()) + d.f38959a.encodedSizeWithTag(8, value.d()) + h.f38964a.encodedSizeWithTag(9, value.h());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            f f11 = value.f();
            f redact = f11 == null ? null : f.f38962a.redact(f11);
            e e11 = value.e();
            e redact2 = e11 == null ? null : e.f38960b.redact(e11);
            c c11 = value.c();
            c redact3 = c11 == null ? null : c.f38958a.redact(c11);
            mt.b b11 = value.b();
            mt.b redact4 = b11 == null ? null : mt.b.f38957a.redact(b11);
            g g11 = value.g();
            g redact5 = g11 == null ? null : g.f38963a.redact(g11);
            i i11 = value.i();
            i redact6 = i11 == null ? null : i.f38965a.redact(i11);
            d d11 = value.d();
            d redact7 = d11 == null ? null : d.f38959a.redact(d11);
            h h11 = value.h();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, h11 != null ? h.f38964a.redact(h11) : null, okio.i.f42656d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f38948i = new C0751a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), com.squareup.wire.o.PROTO_3);
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ a(f fVar, e eVar, c cVar, mt.b bVar, g gVar, i iVar, d dVar, h hVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? null : eVar, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : bVar, (i11 & 16) != 0 ? null : gVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? null : dVar, (i11 & 128) == 0 ? hVar : null, (i11 & 256) != 0 ? okio.i.f42656d : iVar2);
    }

    public final a a(f fVar, e eVar, c cVar, mt.b bVar, g gVar, i iVar, d dVar, h hVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new a(fVar, eVar, cVar, bVar, gVar, iVar, dVar, hVar, unknownFields);
    }

    public final mt.b b() {
        return this.f38952d;
    }

    public final c c() {
        return this.f38951c;
    }

    public final d d() {
        return this.f38955g;
    }

    public final e e() {
        return this.f38950b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f38949a, aVar.f38949a) && kotlin.jvm.internal.s.c(this.f38950b, aVar.f38950b) && kotlin.jvm.internal.s.c(this.f38951c, aVar.f38951c) && kotlin.jvm.internal.s.c(this.f38952d, aVar.f38952d) && kotlin.jvm.internal.s.c(this.f38953e, aVar.f38953e) && kotlin.jvm.internal.s.c(this.f38954f, aVar.f38954f) && kotlin.jvm.internal.s.c(this.f38955g, aVar.f38955g) && kotlin.jvm.internal.s.c(this.f38956h, aVar.f38956h);
        }
        return false;
    }

    public final f f() {
        return this.f38949a;
    }

    public final g g() {
        return this.f38953e;
    }

    public final h h() {
        return this.f38956h;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            f fVar = this.f38949a;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37;
            e eVar = this.f38950b;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            c cVar = this.f38951c;
            int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            mt.b bVar = this.f38952d;
            int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            g gVar = this.f38953e;
            int hashCode6 = (hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            i iVar = this.f38954f;
            int hashCode7 = (hashCode6 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            d dVar = this.f38955g;
            int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            h hVar = this.f38956h;
            int hashCode9 = hashCode8 + (hVar != null ? hVar.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final i i() {
        return this.f38954f;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m764newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        f fVar = this.f38949a;
        if (fVar != null) {
            arrayList.add("not_allowed=" + fVar);
        }
        e eVar = this.f38950b;
        if (eVar != null) {
            arrayList.add("no_charge_recommended=" + eVar);
        }
        c cVar = this.f38951c;
        if (cVar != null) {
            arrayList.add("charging_on_excess_solar=" + cVar);
        }
        mt.b bVar = this.f38952d;
        if (bVar != null) {
            arrayList.add("charging_on_anything=" + bVar);
        }
        g gVar = this.f38953e;
        if (gVar != null) {
            arrayList.add("user_disabled=" + gVar);
        }
        i iVar = this.f38954f;
        if (iVar != null) {
            arrayList.add("waiting_for_server=" + iVar);
        }
        d dVar = this.f38955g;
        if (dVar != null) {
            arrayList.add("error=" + dVar);
        }
        h hVar = this.f38956h;
        if (hVar != null) {
            arrayList.add("user_stopped=" + hVar);
        }
        l02 = e0.l0(arrayList, ", ", "ChargeOnSolarState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m764newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, e eVar, c cVar, mt.b bVar, g gVar, i iVar, d dVar, h hVar, okio.i unknownFields) {
        super(f38948i, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f38949a = fVar;
        this.f38950b = eVar;
        this.f38951c = cVar;
        this.f38952d = bVar;
        this.f38953e = gVar;
        this.f38954f = iVar;
        this.f38955g = dVar;
        this.f38956h = hVar;
        if (!(mr.d.e(fVar, eVar, cVar, bVar, gVar, iVar, dVar, hVar) <= 1)) {
            throw new IllegalArgumentException("At most one of not_allowed, no_charge_recommended, charging_on_excess_solar, charging_on_anything, user_disabled, waiting_for_server, error, user_stopped may be non-null".toString());
        }
    }
}