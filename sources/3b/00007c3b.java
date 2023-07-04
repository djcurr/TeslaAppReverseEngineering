package jt;

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
public final class f extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<f> f33975f;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsParameterKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final g f33976a;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsBooleanParameterValue#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final jt.a f33977b;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsIntegerParameterValue#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final e f33978c;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsDoubleParameterValue#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final jt.b f33979d;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsStringParameterValue#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final h f33980e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsParameter", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(k reader) {
            s.g(reader, "reader");
            g gVar = g.SUCCESS;
            long d11 = reader.d();
            jt.a aVar = null;
            e eVar = null;
            jt.b bVar = null;
            h hVar = null;
            while (true) {
                g gVar2 = gVar;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new f(gVar2, aVar, eVar, bVar, hVar, reader.e(d11));
                    } else if (g11 == 1) {
                        try {
                            gVar = g.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    } else if (g11 == 2) {
                        aVar = jt.a.f33966b.decode(reader);
                    } else if (g11 == 3) {
                        eVar = e.f33973b.decode(reader);
                    } else if (g11 == 4) {
                        bVar = jt.b.f33968b.decode(reader);
                    } else if (g11 != 5) {
                        reader.m(g11);
                    } else {
                        hVar = h.f33981b.decode(reader);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, f value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.f() != g.SUCCESS) {
                g.ADAPTER.encodeWithTag(writer, 1, value.f());
            }
            jt.a.f33966b.encodeWithTag(writer, 2, value.c());
            e.f33973b.encodeWithTag(writer, 3, value.e());
            jt.b.f33968b.encodeWithTag(writer, 4, value.d());
            h.f33981b.encodeWithTag(writer, 5, value.g());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f() != g.SUCCESS) {
                z11 += g.ADAPTER.encodedSizeWithTag(1, value.f());
            }
            return z11 + jt.a.f33966b.encodedSizeWithTag(2, value.c()) + e.f33973b.encodedSizeWithTag(3, value.e()) + jt.b.f33968b.encodedSizeWithTag(4, value.d()) + h.f33981b.encodedSizeWithTag(5, value.g());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            s.g(value, "value");
            jt.a c11 = value.c();
            jt.a redact = c11 == null ? null : jt.a.f33966b.redact(c11);
            e e11 = value.e();
            e redact2 = e11 == null ? null : e.f33973b.redact(e11);
            jt.b d11 = value.d();
            jt.b redact3 = d11 == null ? null : jt.b.f33968b.redact(d11);
            h g11 = value.g();
            return f.b(value, null, redact, redact2, redact3, g11 != null ? h.f33981b.redact(g11) : null, i.f42656d, 1, null);
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
        f33975f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ f(g gVar, jt.a aVar, e eVar, jt.b bVar, h hVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? g.SUCCESS : gVar, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : eVar, (i11 & 8) != 0 ? null : bVar, (i11 & 16) == 0 ? hVar : null, (i11 & 32) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ f b(f fVar, g gVar, jt.a aVar, e eVar, jt.b bVar, h hVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = fVar.f33976a;
        }
        if ((i11 & 2) != 0) {
            aVar = fVar.f33977b;
        }
        jt.a aVar2 = aVar;
        if ((i11 & 4) != 0) {
            eVar = fVar.f33978c;
        }
        e eVar2 = eVar;
        if ((i11 & 8) != 0) {
            bVar = fVar.f33979d;
        }
        jt.b bVar2 = bVar;
        if ((i11 & 16) != 0) {
            hVar = fVar.f33980e;
        }
        h hVar2 = hVar;
        if ((i11 & 32) != 0) {
            iVar = fVar.unknownFields();
        }
        return fVar.a(gVar, aVar2, eVar2, bVar2, hVar2, iVar);
    }

    public final f a(g key, jt.a aVar, e eVar, jt.b bVar, h hVar, i unknownFields) {
        s.g(key, "key");
        s.g(unknownFields, "unknownFields");
        return new f(key, aVar, eVar, bVar, hVar, unknownFields);
    }

    public final jt.a c() {
        return this.f33977b;
    }

    public final jt.b d() {
        return this.f33979d;
    }

    public final e e() {
        return this.f33978c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && this.f33976a == fVar.f33976a && s.c(this.f33977b, fVar.f33977b) && s.c(this.f33978c, fVar.f33978c) && s.c(this.f33979d, fVar.f33979d) && s.c(this.f33980e, fVar.f33980e);
        }
        return false;
    }

    public final g f() {
        return this.f33976a;
    }

    public final h g() {
        return this.f33980e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f33976a.hashCode()) * 37;
            jt.a aVar = this.f33977b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            e eVar = this.f33978c;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            jt.b bVar = this.f33979d;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            h hVar = this.f33980e;
            int hashCode5 = hashCode4 + (hVar != null ? hVar.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m624newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        g gVar = this.f33976a;
        arrayList.add("key=" + gVar);
        jt.a aVar = this.f33977b;
        if (aVar != null) {
            arrayList.add("boolean=" + aVar);
        }
        e eVar = this.f33978c;
        if (eVar != null) {
            arrayList.add("integer=" + eVar);
        }
        jt.b bVar = this.f33979d;
        if (bVar != null) {
            arrayList.add("double=" + bVar);
        }
        h hVar = this.f33980e;
        if (hVar != null) {
            arrayList.add("string=" + hVar);
        }
        l02 = e0.l0(arrayList, ", ", "AnalyticsParameter{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m624newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g key, jt.a aVar, e eVar, jt.b bVar, h hVar, i unknownFields) {
        super(f33975f, unknownFields);
        s.g(key, "key");
        s.g(unknownFields, "unknownFields");
        this.f33976a = key;
        this.f33977b = aVar;
        this.f33978c = eVar;
        this.f33979d = bVar;
        this.f33980e = hVar;
        if (!(mr.d.e(aVar, eVar, bVar, hVar, new Object[0]) <= 1)) {
            throw new IllegalArgumentException("At most one of boolean, integer, double, string may be non-null".toString());
        }
    }
}