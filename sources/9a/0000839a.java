package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<d> f37360c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagedChargingSiteAddedOrUpdated#ADAPTER", jsonName = "addedOrUpdated", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final x0 f37361a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ExistingManagedChargingSiteNearby#ADAPTER", jsonName = "existingSiteNearby", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final w f37362b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AddManagedChargingSiteResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            x0 x0Var = null;
            w wVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(x0Var, wVar, reader.e(d11));
                } else if (g11 == 1) {
                    x0Var = x0.f37700a.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    wVar = w.f37677a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            x0.f37700a.encodeWithTag(writer, 1, value.b());
            w.f37677a.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + x0.f37700a.encodedSizeWithTag(1, value.b()) + w.f37677a.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            kotlin.jvm.internal.s.g(value, "value");
            x0 b11 = value.b();
            x0 redact = b11 == null ? null : x0.f37700a.redact(b11);
            w c11 = value.c();
            return value.a(redact, c11 != null ? w.f37677a.redact(c11) : null, okio.i.f42656d);
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
        f37360c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d.class), com.squareup.wire.o.PROTO_3);
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ d(x0 x0Var, w wVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : x0Var, (i11 & 2) != 0 ? null : wVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final d a(x0 x0Var, w wVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d(x0Var, wVar, unknownFields);
    }

    public final x0 b() {
        return this.f37361a;
    }

    public final w c() {
        return this.f37362b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37361a, dVar.f37361a) && kotlin.jvm.internal.s.c(this.f37362b, dVar.f37362b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            x0 x0Var = this.f37361a;
            int hashCode2 = (hashCode + (x0Var != null ? x0Var.hashCode() : 0)) * 37;
            w wVar = this.f37362b;
            int hashCode3 = hashCode2 + (wVar != null ? wVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m665newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        x0 x0Var = this.f37361a;
        if (x0Var != null) {
            arrayList.add("added_or_updated=" + x0Var);
        }
        w wVar = this.f37362b;
        if (wVar != null) {
            arrayList.add("existing_site_nearby=" + wVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "AddManagedChargingSiteResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m665newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x0 x0Var, w wVar, okio.i unknownFields) {
        super(f37360c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37361a = x0Var;
        this.f37362b = wVar;
        if (!(mr.d.c(x0Var, wVar) <= 1)) {
            throw new IllegalArgumentException("At most one of added_or_updated, existing_site_nearby may be non-null".toString());
        }
    }
}