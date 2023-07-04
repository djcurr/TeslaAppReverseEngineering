package ov;

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
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class d extends f {

    /* renamed from: d */
    public static final ProtoAdapter<d> f45187d;
    @q(adapter = "com.teslamotors.protocol.CommonVitals#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final ov.a f45188a;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final ov.b f45189b;
    @q(adapter = "com.teslamotors.protocol.SXProductVitals#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final c f45190c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Vitals", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d mo28decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            ov.a aVar = null;
            ov.b bVar = null;
            c cVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(aVar, bVar, cVar, reader.e(d11));
                } else if (g11 == 1) {
                    aVar = ov.a.T.mo28decode(reader);
                } else if (g11 == 2) {
                    bVar = ov.b.f44703p2.mo28decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    cVar = c.H7.mo28decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.b() != null) {
                ov.a.T.encodeWithTag(writer, 1, value.b());
            }
            if (value.c() != null) {
                ov.b.f44703p2.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != null) {
                c.H7.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.b() != null) {
                z11 += ov.a.T.encodedSizeWithTag(1, value.b());
            }
            if (value.c() != null) {
                z11 += ov.b.f44703p2.encodedSizeWithTag(2, value.c());
            }
            return value.d() != null ? z11 + c.H7.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            ov.a b11 = value.b();
            ov.a redact = b11 == null ? null : ov.a.T.redact(b11);
            ov.b c11 = value.c();
            ov.b redact2 = c11 == null ? null : ov.b.f44703p2.redact(c11);
            c d11 = value.d();
            return value.a(redact, redact2, d11 != null ? c.H7.redact(d11) : null, i.f42656d);
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
        f45187d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ d(ov.a aVar, ov.b bVar, c cVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? i.f42656d : iVar);
    }

    public final d a(ov.a aVar, ov.b bVar, c cVar, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new d(aVar, bVar, cVar, unknownFields);
    }

    public final ov.a b() {
        return this.f45188a;
    }

    public final ov.b c() {
        return this.f45189b;
    }

    public final c d() {
        return this.f45190c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f45188a, dVar.f45188a) && s.c(this.f45189b, dVar.f45189b) && s.c(this.f45190c, dVar.f45190c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ov.a aVar = this.f45188a;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            ov.b bVar = this.f45189b;
            int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            c cVar = this.f45190c;
            int hashCode4 = hashCode3 + (cVar != null ? cVar.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1090newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        ov.a aVar = this.f45188a;
        if (aVar != null) {
            arrayList.add("commonVitals=" + aVar);
        }
        ov.b bVar = this.f45189b;
        if (bVar != null) {
            arrayList.add("m3productVitals=" + bVar);
        }
        c cVar = this.f45190c;
        if (cVar != null) {
            arrayList.add("sxproductVitals=" + cVar);
        }
        l02 = e0.l0(arrayList, ", ", "Vitals{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m1090newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ov.a aVar, ov.b bVar, c cVar, i unknownFields) {
        super(f45187d, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f45188a = aVar;
        this.f45189b = bVar;
        this.f45190c = cVar;
    }
}