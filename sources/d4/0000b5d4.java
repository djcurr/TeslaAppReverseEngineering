package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class g extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<g> f52539d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f52540a;
    @q(adapter = "com.tesla.generated.monitoring.HTTPMethod#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e f52541b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final long f52542c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.HTTPTraceStart", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            e eVar = e.GET;
            long d11 = reader.d();
            String str = "";
            long j11 = 0;
            while (true) {
                long j12 = j11;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new g(str, eVar, j12, reader.e(d11));
                    } else if (g11 == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (g11 == 2) {
                        try {
                            eVar = e.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    } else if (g11 != 3) {
                        reader.m(g11);
                    }
                }
                j11 = ProtoAdapter.INT64.decode(reader).longValue();
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.e());
            }
            if (value.c() != e.GET) {
                e.ADAPTER.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.e());
            }
            if (value.c() != e.GET) {
                z11 += e.ADAPTER.encodedSizeWithTag(2, value.c());
            }
            return value.d() != 0 ? z11 + ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            s.g(value, "value");
            return g.b(value, null, null, 0L, okio.i.f42656d, 7, null);
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
        f52539d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), o.PROTO_3);
    }

    public g() {
        this(null, null, 0L, null, 15, null);
    }

    public /* synthetic */ g(String str, e eVar, long j11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? e.GET : eVar, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ g b(g gVar, String str, e eVar, long j11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.f52540a;
        }
        if ((i11 & 2) != 0) {
            eVar = gVar.f52541b;
        }
        e eVar2 = eVar;
        if ((i11 & 4) != 0) {
            j11 = gVar.f52542c;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            iVar = gVar.unknownFields();
        }
        return gVar.a(str, eVar2, j12, iVar);
    }

    public final g a(String url, e method, long j11, okio.i unknownFields) {
        s.g(url, "url");
        s.g(method, "method");
        s.g(unknownFields, "unknownFields");
        return new g(url, method, j11, unknownFields);
    }

    public final e c() {
        return this.f52541b;
    }

    public final long d() {
        return this.f52542c;
    }

    public final String e() {
        return this.f52540a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(unknownFields(), gVar.unknownFields()) && s.c(this.f52540a, gVar.f52540a) && this.f52541b == gVar.f52541b && this.f52542c == gVar.f52542c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f52540a.hashCode()) * 37) + this.f52541b.hashCode()) * 37) + Long.hashCode(this.f52542c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1111newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f52540a);
        arrayList.add("url=" + i11);
        e eVar = this.f52541b;
        arrayList.add("method=" + eVar);
        long j11 = this.f52542c;
        arrayList.add("requestPayloadSize=" + j11);
        l02 = e0.l0(arrayList, ", ", "HTTPTraceStart{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1111newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String url, e method, long j11, okio.i unknownFields) {
        super(f52539d, unknownFields);
        s.g(url, "url");
        s.g(method, "method");
        s.g(unknownFields, "unknownFields");
        this.f52540a = url;
        this.f52541b = method;
        this.f52542c = j11;
    }
}