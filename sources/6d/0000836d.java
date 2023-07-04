package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<a> f37331f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleAction#ADAPTER", tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final j2 f37332a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.GetSessionInfoRequest#ADAPTER", tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final xt.b f37333b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vault.RemoteCommand#ADAPTER", tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final zt.e f37334c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.managedcharging.ManagedChargingAction#ADAPTER", tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final st.h f37335d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.centerdisplay.server.Request#ADAPTER", tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final nt.b f37336e;

    /* renamed from: lt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0710a extends ProtoAdapter<a> {
        C0710a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Action", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a mo28decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            j2 j2Var = null;
            xt.b bVar = null;
            zt.e eVar = null;
            st.h hVar = null;
            nt.b bVar2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(j2Var, bVar, eVar, hVar, bVar2, reader.e(d11));
                } else if (g11 == 2) {
                    j2Var = j2.H3.mo28decode(reader);
                } else if (g11 == 3) {
                    bVar = xt.b.f57697b.mo28decode(reader);
                } else if (g11 == 4) {
                    eVar = zt.e.f60730c.mo28decode(reader);
                } else if (g11 == 5) {
                    hVar = st.h.f50644c.mo28decode(reader);
                } else if (g11 != 6) {
                    reader.m(g11);
                } else {
                    bVar2 = nt.b.f41866b.mo28decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            j2.H3.encodeWithTag(writer, 2, value.f());
            xt.b.f57697b.encodeWithTag(writer, 3, value.c());
            zt.e.f60730c.encodeWithTag(writer, 4, value.e());
            st.h.f50644c.encodeWithTag(writer, 5, value.d());
            nt.b.f41866b.encodeWithTag(writer, 6, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + j2.H3.encodedSizeWithTag(2, value.f()) + xt.b.f57697b.encodedSizeWithTag(3, value.c()) + zt.e.f60730c.encodedSizeWithTag(4, value.e()) + st.h.f50644c.encodedSizeWithTag(5, value.d()) + nt.b.f41866b.encodedSizeWithTag(6, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            j2 f11 = value.f();
            j2 redact = f11 == null ? null : j2.H3.redact(f11);
            xt.b c11 = value.c();
            xt.b redact2 = c11 == null ? null : xt.b.f57697b.redact(c11);
            zt.e e11 = value.e();
            zt.e redact3 = e11 == null ? null : zt.e.f60730c.redact(e11);
            st.h d11 = value.d();
            st.h redact4 = d11 == null ? null : st.h.f50644c.redact(d11);
            nt.b b11 = value.b();
            return value.a(redact, redact2, redact3, redact4, b11 != null ? nt.b.f41866b.redact(b11) : null, okio.i.f42656d);
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
        f37331f = new C0710a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(a.class), com.squareup.wire.o.PROTO_3);
    }

    public a() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ a(j2 j2Var, xt.b bVar, zt.e eVar, st.h hVar, nt.b bVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : j2Var, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? null : eVar, (i11 & 8) != 0 ? null : hVar, (i11 & 16) == 0 ? bVar2 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public final a a(j2 j2Var, xt.b bVar, zt.e eVar, st.h hVar, nt.b bVar2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new a(j2Var, bVar, eVar, hVar, bVar2, unknownFields);
    }

    public final nt.b b() {
        return this.f37336e;
    }

    public final xt.b c() {
        return this.f37333b;
    }

    public final st.h d() {
        return this.f37335d;
    }

    public final zt.e e() {
        return this.f37334c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37332a, aVar.f37332a) && kotlin.jvm.internal.s.c(this.f37333b, aVar.f37333b) && kotlin.jvm.internal.s.c(this.f37334c, aVar.f37334c) && kotlin.jvm.internal.s.c(this.f37335d, aVar.f37335d) && kotlin.jvm.internal.s.c(this.f37336e, aVar.f37336e);
        }
        return false;
    }

    public final j2 f() {
        return this.f37332a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            j2 j2Var = this.f37332a;
            int hashCode2 = (hashCode + (j2Var != null ? j2Var.hashCode() : 0)) * 37;
            xt.b bVar = this.f37333b;
            int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            zt.e eVar = this.f37334c;
            int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            st.h hVar = this.f37335d;
            int hashCode5 = (hashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            nt.b bVar2 = this.f37336e;
            int hashCode6 = hashCode5 + (bVar2 != null ? bVar2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m650newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        j2 j2Var = this.f37332a;
        if (j2Var != null) {
            arrayList.add("vehicleAction=" + j2Var);
        }
        xt.b bVar = this.f37333b;
        if (bVar != null) {
            arrayList.add("getSessioninfoRequest=" + bVar);
        }
        zt.e eVar = this.f37334c;
        if (eVar != null) {
            arrayList.add("vaultCommand=" + eVar);
        }
        st.h hVar = this.f37335d;
        if (hVar != null) {
            arrayList.add("managedChargingAction=" + hVar);
        }
        nt.b bVar2 = this.f37336e;
        if (bVar2 != null) {
            arrayList.add("centerDisplayRequest=" + bVar2);
        }
        l02 = wz.e0.l0(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m650newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j2 j2Var, xt.b bVar, zt.e eVar, st.h hVar, nt.b bVar2, okio.i unknownFields) {
        super(f37331f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37332a = j2Var;
        this.f37333b = bVar;
        this.f37334c = eVar;
        this.f37335d = hVar;
        this.f37336e = bVar2;
        if (!(mr.d.e(j2Var, bVar, eVar, hVar, bVar2) <= 1)) {
            throw new IllegalArgumentException("At most one of vehicleAction, getSessioninfoRequest, vaultCommand, managedChargingAction, centerDisplayRequest may be non-null".toString());
        }
    }
}