package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<w0> f37678d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicKey", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37679a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagerType#ADAPTER", jsonName = "managerType", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final y0 f37680b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", jsonName = "latLon", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final kt.f f37681c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w0> {
        a(com.squareup.wire.b bVar, n00.d<w0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ManagedChargingSite", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            y0 y0Var = null;
            String str = "";
            kt.f fVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new w0(str, y0Var, fVar, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    y0Var = y0.f37719b.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    fVar = kt.f.f35777c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.e());
            }
            if (value.d() != null) {
                y0.f37719b.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != null) {
                kt.f.f35777c.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.e());
            }
            if (value.d() != null) {
                z11 += y0.f37719b.encodedSizeWithTag(2, value.d());
            }
            return value.c() != null ? z11 + kt.f.f35777c.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w0 redact(w0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            y0 d11 = value.d();
            y0 redact = d11 == null ? null : y0.f37719b.redact(d11);
            kt.f c11 = value.c();
            return w0.b(value, null, redact, c11 != null ? kt.f.f35777c.redact(c11) : null, okio.i.f42656d, 1, null);
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
        f37678d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w0.class), com.squareup.wire.o.PROTO_3);
    }

    public w0() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ w0(String str, y0 y0Var, kt.f fVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : y0Var, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ w0 b(w0 w0Var, String str, y0 y0Var, kt.f fVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = w0Var.f37679a;
        }
        if ((i11 & 2) != 0) {
            y0Var = w0Var.f37680b;
        }
        if ((i11 & 4) != 0) {
            fVar = w0Var.f37681c;
        }
        if ((i11 & 8) != 0) {
            iVar = w0Var.unknownFields();
        }
        return w0Var.a(str, y0Var, fVar, iVar);
    }

    public final w0 a(String public_key, y0 y0Var, kt.f fVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(public_key, "public_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w0(public_key, y0Var, fVar, unknownFields);
    }

    public final kt.f c() {
        return this.f37681c;
    }

    public final y0 d() {
        return this.f37680b;
    }

    public final String e() {
        return this.f37679a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37679a, w0Var.f37679a) && kotlin.jvm.internal.s.c(this.f37680b, w0Var.f37680b) && kotlin.jvm.internal.s.c(this.f37681c, w0Var.f37681c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f37679a.hashCode()) * 37;
            y0 y0Var = this.f37680b;
            int hashCode2 = (hashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 37;
            kt.f fVar = this.f37681c;
            int hashCode3 = hashCode2 + (fVar != null ? fVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m747newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37679a);
        arrayList.add("public_key=" + i11);
        y0 y0Var = this.f37680b;
        if (y0Var != null) {
            arrayList.add("manager_type=" + y0Var);
        }
        kt.f fVar = this.f37681c;
        if (fVar != null) {
            arrayList.add("lat_lon=" + fVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ManagedChargingSite{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m747newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(String public_key, y0 y0Var, kt.f fVar, okio.i unknownFields) {
        super(f37678d, unknownFields);
        kotlin.jvm.internal.s.g(public_key, "public_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37679a = public_key;
        this.f37680b = y0Var;
        this.f37681c = fVar;
    }
}