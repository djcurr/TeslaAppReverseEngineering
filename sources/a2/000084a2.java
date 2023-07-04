package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v2 extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<v2> f37672e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.f f37673a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final kt.u f37674b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final kt.u f37675c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final kt.u f37676d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v2> {
        a(com.squareup.wire.b bVar, n00.d<v2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlWindowAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.f fVar = null;
            kt.u uVar = null;
            kt.u uVar2 = null;
            kt.u uVar3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v2(fVar, uVar, uVar2, uVar3, reader.e(d11));
                } else if (g11 == 1) {
                    fVar = kt.f.f35777c.decode(reader);
                } else if (g11 == 2) {
                    uVar = kt.u.f35845a.decode(reader);
                } else if (g11 == 3) {
                    uVar2 = kt.u.f35845a.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    uVar3 = kt.u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                kt.f.f35777c.encodeWithTag(writer, 1, value.c());
            }
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            protoAdapter.encodeWithTag(writer, 2, value.d());
            protoAdapter.encodeWithTag(writer, 3, value.e());
            protoAdapter.encodeWithTag(writer, 4, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += kt.f.f35777c.encodedSizeWithTag(1, value.c());
            }
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v2 redact(v2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.f c11 = value.c();
            kt.f redact = c11 == null ? null : kt.f.f35777c.redact(c11);
            kt.u d11 = value.d();
            kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
            kt.u e11 = value.e();
            kt.u redact3 = e11 == null ? null : kt.u.f35845a.redact(e11);
            kt.u b11 = value.b();
            return value.a(redact, redact2, redact3, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
        f37672e = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v2.class), com.squareup.wire.o.PROTO_3);
    }

    public v2() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ v2(kt.f fVar, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? null : uVar, (i11 & 4) != 0 ? null : uVar2, (i11 & 8) == 0 ? uVar3 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public final v2 a(kt.f fVar, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v2(fVar, uVar, uVar2, uVar3, unknownFields);
    }

    public final kt.u b() {
        return this.f37676d;
    }

    public final kt.f c() {
        return this.f37673a;
    }

    public final kt.u d() {
        return this.f37674b;
    }

    public final kt.u e() {
        return this.f37675c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2) {
            v2 v2Var = (v2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), v2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37673a, v2Var.f37673a) && kotlin.jvm.internal.s.c(this.f37674b, v2Var.f37674b) && kotlin.jvm.internal.s.c(this.f37675c, v2Var.f37675c) && kotlin.jvm.internal.s.c(this.f37676d, v2Var.f37676d);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            kt.f fVar = this.f37673a;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37;
            kt.u uVar = this.f37674b;
            int hashCode3 = (hashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 37;
            kt.u uVar2 = this.f37675c;
            int hashCode4 = (hashCode3 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            kt.u uVar3 = this.f37676d;
            int hashCode5 = hashCode4 + (uVar3 != null ? uVar3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m745newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.f fVar = this.f37673a;
        if (fVar != null) {
            arrayList.add("location=" + fVar);
        }
        kt.u uVar = this.f37674b;
        if (uVar != null) {
            arrayList.add("unknown=" + uVar);
        }
        kt.u uVar2 = this.f37675c;
        if (uVar2 != null) {
            arrayList.add("vent=" + uVar2);
        }
        kt.u uVar3 = this.f37676d;
        if (uVar3 != null) {
            arrayList.add("close=" + uVar3);
        }
        l02 = wz.e0.l0(arrayList, ", ", "VehicleControlWindowAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m745newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(kt.f fVar, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
        super(f37672e, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37673a = fVar;
        this.f37674b = uVar;
        this.f37675c = uVar2;
        this.f37676d = uVar3;
        if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
            throw new IllegalArgumentException("At most one of unknown, vent, close may be non-null".toString());
        }
    }
}