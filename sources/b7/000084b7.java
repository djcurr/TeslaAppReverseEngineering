package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class x1 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<x1> f37701f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37702a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "departureTime", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f37703b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.PreconditioningTimes#ADAPTER", jsonName = "preconditioningTimes", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final kt.i f37704c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.OffPeakChargingTimes#ADAPTER", jsonName = "offPeakChargingTimes", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final kt.h f37705d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "offPeakHoursEndTime", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f37706e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<x1> {
        a(com.squareup.wire.b bVar, n00.d<x1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ScheduledDepartureAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public x1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.i iVar = null;
            boolean z11 = false;
            int i11 = 0;
            int i12 = 0;
            kt.h hVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new x1(z11, i11, iVar, hVar, i12, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 == 3) {
                    iVar = kt.i.f35783c.decode(reader);
                } else if (g11 == 4) {
                    hVar = kt.h.f35780c.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, x1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (value.g() != null) {
                kt.i.f35783c.encodeWithTag(writer, 3, value.g());
            }
            if (value.e() != null) {
                kt.h.f35780c.encodeWithTag(writer, 4, value.e());
            }
            if (value.f() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.f()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(x1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            if (value.g() != null) {
                z11 += kt.i.f35783c.encodedSizeWithTag(3, value.g());
            }
            if (value.e() != null) {
                z11 += kt.h.f35780c.encodedSizeWithTag(4, value.e());
            }
            return value.f() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.f())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public x1 redact(x1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.i g11 = value.g();
            kt.i redact = g11 == null ? null : kt.i.f35783c.redact(g11);
            kt.h e11 = value.e();
            return x1.b(value, false, 0, redact, e11 != null ? kt.h.f35780c.redact(e11) : null, 0, okio.i.f42656d, 19, null);
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
        f37701f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(x1.class), com.squareup.wire.o.PROTO_3);
    }

    public x1() {
        this(false, 0, null, null, 0, null, 63, null);
    }

    public /* synthetic */ x1(boolean z11, int i11, kt.i iVar, kt.h hVar, int i12, okio.i iVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? null : iVar, (i13 & 8) != 0 ? null : hVar, (i13 & 16) == 0 ? i12 : 0, (i13 & 32) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ x1 b(x1 x1Var, boolean z11, int i11, kt.i iVar, kt.h hVar, int i12, okio.i iVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = x1Var.f37702a;
        }
        if ((i13 & 2) != 0) {
            i11 = x1Var.f37703b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            iVar = x1Var.f37704c;
        }
        kt.i iVar3 = iVar;
        if ((i13 & 8) != 0) {
            hVar = x1Var.f37705d;
        }
        kt.h hVar2 = hVar;
        if ((i13 & 16) != 0) {
            i12 = x1Var.f37706e;
        }
        int i15 = i12;
        if ((i13 & 32) != 0) {
            iVar2 = x1Var.unknownFields();
        }
        return x1Var.a(z11, i14, iVar3, hVar2, i15, iVar2);
    }

    public final x1 a(boolean z11, int i11, kt.i iVar, kt.h hVar, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new x1(z11, i11, iVar, hVar, i12, unknownFields);
    }

    public final int c() {
        return this.f37703b;
    }

    public final boolean d() {
        return this.f37702a;
    }

    public final kt.h e() {
        return this.f37705d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), x1Var.unknownFields()) && this.f37702a == x1Var.f37702a && this.f37703b == x1Var.f37703b && kotlin.jvm.internal.s.c(this.f37704c, x1Var.f37704c) && kotlin.jvm.internal.s.c(this.f37705d, x1Var.f37705d) && this.f37706e == x1Var.f37706e;
        }
        return false;
    }

    public final int f() {
        return this.f37706e;
    }

    public final kt.i g() {
        return this.f37704c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37702a)) * 37) + Integer.hashCode(this.f37703b)) * 37;
            kt.i iVar = this.f37704c;
            int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 37;
            kt.h hVar = this.f37705d;
            int hashCode3 = ((hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 37) + Integer.hashCode(this.f37706e);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m752newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37702a;
        arrayList.add("enabled=" + z11);
        int i11 = this.f37703b;
        arrayList.add("departure_time=" + i11);
        kt.i iVar = this.f37704c;
        if (iVar != null) {
            arrayList.add("preconditioning_times=" + iVar);
        }
        kt.h hVar = this.f37705d;
        if (hVar != null) {
            arrayList.add("off_peak_charging_times=" + hVar);
        }
        int i12 = this.f37706e;
        arrayList.add("off_peak_hours_end_time=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "ScheduledDepartureAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m752newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z11, int i11, kt.i iVar, kt.h hVar, int i12, okio.i unknownFields) {
        super(f37701f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37702a = z11;
        this.f37703b = i11;
        this.f37704c = iVar;
        this.f37705d = hVar;
        this.f37706e = i12;
    }
}