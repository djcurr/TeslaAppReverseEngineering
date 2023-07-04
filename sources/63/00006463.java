package cu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import mt.l;
import n00.d;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<b> f23113e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "phoneKeyPaired", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23114a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortOpen", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23115b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "phoneKeyConnected", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23116c;
    @q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState#ADAPTER", jsonName = "closureState", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final l f23117d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.BleStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            l lVar = null;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(z11, z12, z13, lVar, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 3) {
                    z13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    lVar = l.f39108p1.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.f()));
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.c()));
            }
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.e()));
            }
            if (value.d() != null) {
                l.f39108p1.encodeWithTag(writer, 4, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.f()));
            }
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.c()));
            }
            if (value.e()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.e()));
            }
            return value.d() != null ? z11 + l.f39108p1.encodedSizeWithTag(4, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            l d11 = value.d();
            return b.b(value, false, false, false, d11 == null ? null : l.f39108p1.redact(d11), i.f42656d, 7, null);
        }
    }

    /* renamed from: cu.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0441b {
        private C0441b() {
        }

        public /* synthetic */ C0441b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0441b(null);
        f23113e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(false, false, false, null, null, 31, null);
    }

    public /* synthetic */ b(boolean z11, boolean z12, boolean z13, l lVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) == 0 ? z13 : false, (i11 & 8) != 0 ? null : lVar, (i11 & 16) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, boolean z11, boolean z12, boolean z13, l lVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = bVar.f23114a;
        }
        if ((i11 & 2) != 0) {
            z12 = bVar.f23115b;
        }
        boolean z14 = z12;
        if ((i11 & 4) != 0) {
            z13 = bVar.f23116c;
        }
        boolean z15 = z13;
        if ((i11 & 8) != 0) {
            lVar = bVar.f23117d;
        }
        l lVar2 = lVar;
        if ((i11 & 16) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(z11, z14, z15, lVar2, iVar);
    }

    public final b a(boolean z11, boolean z12, boolean z13, l lVar, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(z11, z12, z13, lVar, unknownFields);
    }

    public final boolean c() {
        return this.f23115b;
    }

    public final l d() {
        return this.f23117d;
    }

    public final boolean e() {
        return this.f23116c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && this.f23114a == bVar.f23114a && this.f23115b == bVar.f23115b && this.f23116c == bVar.f23116c && s.c(this.f23117d, bVar.f23117d);
        }
        return false;
    }

    public final boolean f() {
        return this.f23114a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f23114a)) * 37) + Boolean.hashCode(this.f23115b)) * 37) + Boolean.hashCode(this.f23116c)) * 37;
            l lVar = this.f23117d;
            int hashCode2 = hashCode + (lVar != null ? lVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m590newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f23114a;
        arrayList.add("phone_key_paired=" + z11);
        boolean z12 = this.f23115b;
        arrayList.add("charge_port_open=" + z12);
        boolean z13 = this.f23116c;
        arrayList.add("phone_key_connected=" + z13);
        l lVar = this.f23117d;
        if (lVar != null) {
            arrayList.add("closure_state=" + lVar);
        }
        l02 = e0.l0(arrayList, ", ", "BleStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m590newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z11, boolean z12, boolean z13, l lVar, i unknownFields) {
        super(f23113e, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f23114a = z11;
        this.f23115b = z12;
        this.f23116c = z13;
        this.f23117d = lVar;
    }
}