package cu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import lt.w2;
import n00.d;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<a> f23105h;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleId", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23106a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "snapshotHash", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23107b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPredelivery", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23108c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f23109d;
    @q(adapter = "com.tesla.generated.carserver.server.VehicleData#ADAPTER", jsonName = "vehicleData", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final w2 f23110e;
    @q(adapter = "com.tesla.generated.widget.BleStatus#ADAPTER", jsonName = "bleStatus", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final cu.b f23111f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final String f23112g;

    /* renamed from: cu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0440a extends ProtoAdapter<a> {
        C0440a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.AppVehicle", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            w2 w2Var = null;
            String str = "";
            String str2 = str;
            String str3 = str2;
            boolean z11 = false;
            cu.b bVar = null;
            String str4 = str3;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(str4, str, z11, str2, w2Var, bVar, str3, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        str4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        str = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 4:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        w2Var = w2.f37685n.decode(reader);
                        break;
                    case 6:
                        bVar = cu.b.f23113e.decode(reader);
                        break;
                    case 7:
                        str3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.h(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.h());
            }
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.f());
            }
            if (value.i()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.i()));
            }
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.e());
            }
            if (value.g() != null) {
                w2.f37685n.encodeWithTag(writer, 5, value.g());
            }
            if (value.c() != null) {
                cu.b.f23113e.encodeWithTag(writer, 6, value.c());
            }
            if (!s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.h(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.h());
            }
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.f());
            }
            if (value.i()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.i()));
            }
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.e());
            }
            if (value.g() != null) {
                z11 += w2.f37685n.encodedSizeWithTag(5, value.g());
            }
            if (value.c() != null) {
                z11 += cu.b.f23113e.encodedSizeWithTag(6, value.c());
            }
            return !s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(7, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            w2 g11 = value.g();
            w2 redact = g11 == null ? null : w2.f37685n.redact(g11);
            cu.b c11 = value.c();
            return a.b(value, null, null, false, null, redact, c11 != null ? cu.b.f23113e.redact(c11) : null, null, i.f42656d, 79, null);
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
        f23105h = new C0440a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ a(String str, String str2, boolean z11, String str3, w2 w2Var, cu.b bVar, String str4, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? null : w2Var, (i11 & 32) == 0 ? bVar : null, (i11 & 64) == 0 ? str4 : "", (i11 & 128) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, boolean z11, String str3, w2 w2Var, cu.b bVar, String str4, i iVar, int i11, Object obj) {
        return aVar.a((i11 & 1) != 0 ? aVar.f23106a : str, (i11 & 2) != 0 ? aVar.f23107b : str2, (i11 & 4) != 0 ? aVar.f23108c : z11, (i11 & 8) != 0 ? aVar.f23109d : str3, (i11 & 16) != 0 ? aVar.f23110e : w2Var, (i11 & 32) != 0 ? aVar.f23111f : bVar, (i11 & 64) != 0 ? aVar.f23112g : str4, (i11 & 128) != 0 ? aVar.unknownFields() : iVar);
    }

    public final a a(String vehicle_id, String snapshot_hash, boolean z11, String display_name, w2 w2Var, cu.b bVar, String connectionState, i unknownFields) {
        s.g(vehicle_id, "vehicle_id");
        s.g(snapshot_hash, "snapshot_hash");
        s.g(display_name, "display_name");
        s.g(connectionState, "connectionState");
        s.g(unknownFields, "unknownFields");
        return new a(vehicle_id, snapshot_hash, z11, display_name, w2Var, bVar, connectionState, unknownFields);
    }

    public final cu.b c() {
        return this.f23111f;
    }

    public final String d() {
        return this.f23112g;
    }

    public final String e() {
        return this.f23109d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f23106a, aVar.f23106a) && s.c(this.f23107b, aVar.f23107b) && this.f23108c == aVar.f23108c && s.c(this.f23109d, aVar.f23109d) && s.c(this.f23110e, aVar.f23110e) && s.c(this.f23111f, aVar.f23111f) && s.c(this.f23112g, aVar.f23112g);
        }
        return false;
    }

    public final String f() {
        return this.f23107b;
    }

    public final w2 g() {
        return this.f23110e;
    }

    public final String h() {
        return this.f23106a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + this.f23106a.hashCode()) * 37) + this.f23107b.hashCode()) * 37) + Boolean.hashCode(this.f23108c)) * 37) + this.f23109d.hashCode()) * 37;
            w2 w2Var = this.f23110e;
            int hashCode2 = (hashCode + (w2Var != null ? w2Var.hashCode() : 0)) * 37;
            cu.b bVar = this.f23111f;
            int hashCode3 = ((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.f23112g.hashCode();
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    public final boolean i() {
        return this.f23108c;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m589newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f23106a);
        arrayList.add("vehicle_id=" + i11);
        String i12 = mr.d.i(this.f23107b);
        arrayList.add("snapshot_hash=" + i12);
        boolean z11 = this.f23108c;
        arrayList.add("is_predelivery=" + z11);
        String i13 = mr.d.i(this.f23109d);
        arrayList.add("display_name=" + i13);
        w2 w2Var = this.f23110e;
        if (w2Var != null) {
            arrayList.add("vehicle_data=" + w2Var);
        }
        cu.b bVar = this.f23111f;
        if (bVar != null) {
            arrayList.add("ble_status=" + bVar);
        }
        String i14 = mr.d.i(this.f23112g);
        arrayList.add("connectionState=" + i14);
        l02 = e0.l0(arrayList, ", ", "AppVehicle{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m589newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String vehicle_id, String snapshot_hash, boolean z11, String display_name, w2 w2Var, cu.b bVar, String connectionState, i unknownFields) {
        super(f23105h, unknownFields);
        s.g(vehicle_id, "vehicle_id");
        s.g(snapshot_hash, "snapshot_hash");
        s.g(display_name, "display_name");
        s.g(connectionState, "connectionState");
        s.g(unknownFields, "unknownFields");
        this.f23106a = vehicle_id;
        this.f23107b = snapshot_hash;
        this.f23108c = z11;
        this.f23109d = display_name;
        this.f23110e = w2Var;
        this.f23111f = bVar;
        this.f23112g = connectionState;
    }
}