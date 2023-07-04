package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<w3> f8240d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureStatuses#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final g0 f8241a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleLockState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u3 f8242b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleSleepStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final v3 f8243c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w3> {
        a(com.squareup.wire.b bVar, n00.d<w3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.VehicleStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            u3 u3Var = u3.VEHICLELOCKSTATE_UNLOCKED;
            v3 v3Var = v3.VEHICLE_SLEEP_STATUS_UNKNOWN;
            long d11 = reader.d();
            g0 g0Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new w3(g0Var, u3Var, v3Var, reader.e(d11));
                } else if (g11 == 1) {
                    g0Var = g0.f8008h.decode(reader);
                } else if (g11 == 2) {
                    try {
                        u3Var = u3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        v3Var = v3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                g0.f8008h.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != u3.VEHICLELOCKSTATE_UNLOCKED) {
                u3.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            if (value.e() != v3.VEHICLE_SLEEP_STATUS_UNKNOWN) {
                v3.ADAPTER.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += g0.f8008h.encodedSizeWithTag(1, value.c());
            }
            if (value.d() != u3.VEHICLELOCKSTATE_UNLOCKED) {
                z11 += u3.ADAPTER.encodedSizeWithTag(2, value.d());
            }
            return value.e() != v3.VEHICLE_SLEEP_STATUS_UNKNOWN ? z11 + v3.ADAPTER.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w3 redact(w3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            g0 c11 = value.c();
            return w3.b(value, c11 == null ? null : g0.f8008h.redact(c11), null, null, okio.i.f42656d, 6, null);
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
        f8240d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w3.class), com.squareup.wire.o.PROTO_3);
    }

    public w3() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ w3(g0 g0Var, u3 u3Var, v3 v3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : g0Var, (i11 & 2) != 0 ? u3.VEHICLELOCKSTATE_UNLOCKED : u3Var, (i11 & 4) != 0 ? v3.VEHICLE_SLEEP_STATUS_UNKNOWN : v3Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ w3 b(w3 w3Var, g0 g0Var, u3 u3Var, v3 v3Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = w3Var.f8241a;
        }
        if ((i11 & 2) != 0) {
            u3Var = w3Var.f8242b;
        }
        if ((i11 & 4) != 0) {
            v3Var = w3Var.f8243c;
        }
        if ((i11 & 8) != 0) {
            iVar = w3Var.unknownFields();
        }
        return w3Var.a(g0Var, u3Var, v3Var, iVar);
    }

    public final w3 a(g0 g0Var, u3 vehicleLockState, v3 vehicleSleepStatus, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(vehicleLockState, "vehicleLockState");
        kotlin.jvm.internal.s.g(vehicleSleepStatus, "vehicleSleepStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w3(g0Var, vehicleLockState, vehicleSleepStatus, unknownFields);
    }

    public final g0 c() {
        return this.f8241a;
    }

    public final u3 d() {
        return this.f8242b;
    }

    public final v3 e() {
        return this.f8243c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w3) {
            w3 w3Var = (w3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8241a, w3Var.f8241a) && this.f8242b == w3Var.f8242b && this.f8243c == w3Var.f8243c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            g0 g0Var = this.f8241a;
            int hashCode2 = ((((hashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 37) + this.f8242b.hashCode()) * 37) + this.f8243c.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m83newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        g0 g0Var = this.f8241a;
        if (g0Var != null) {
            arrayList.add("closureStatuses=" + g0Var);
        }
        u3 u3Var = this.f8242b;
        arrayList.add("vehicleLockState=" + u3Var);
        v3 v3Var = this.f8243c;
        arrayList.add("vehicleSleepStatus=" + v3Var);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m83newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(g0 g0Var, u3 vehicleLockState, v3 vehicleSleepStatus, okio.i unknownFields) {
        super(f8240d, unknownFields);
        kotlin.jvm.internal.s.g(vehicleLockState, "vehicleLockState");
        kotlin.jvm.internal.s.g(vehicleSleepStatus, "vehicleSleepStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8241a = g0Var;
        this.f8242b = vehicleLockState;
        this.f8243c = vehicleSleepStatus;
    }
}