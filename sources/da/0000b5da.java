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
public final class i extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<i> f52543c;
    @q(adapter = "com.tesla.generated.monitoring.Metric#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final h f52544a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final long f52545b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, n00.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.MetricRecording", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            h hVar = h.OWNER_API_REQUEST;
            long d11 = reader.d();
            long j11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i(hVar, j11, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        hVar = h.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != h.OWNER_API_REQUEST) {
                h.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 2, Long.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != h.OWNER_API_REQUEST) {
                z11 += h.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return value.d() != 0 ? z11 + ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i redact(i value) {
            s.g(value, "value");
            return i.b(value, null, 0L, okio.i.f42656d, 3, null);
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
        f52543c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), o.PROTO_3);
    }

    public i() {
        this(null, 0L, null, 7, null);
    }

    public /* synthetic */ i(h hVar, long j11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? h.OWNER_API_REQUEST : hVar, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ i b(i iVar, h hVar, long j11, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = iVar.f52544a;
        }
        if ((i11 & 2) != 0) {
            j11 = iVar.f52545b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = iVar.unknownFields();
        }
        return iVar.a(hVar, j11, iVar2);
    }

    public final i a(h name, long j11, okio.i unknownFields) {
        s.g(name, "name");
        s.g(unknownFields, "unknownFields");
        return new i(name, j11, unknownFields);
    }

    public final h c() {
        return this.f52544a;
    }

    public final long d() {
        return this.f52545b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return s.c(unknownFields(), iVar.unknownFields()) && this.f52544a == iVar.f52544a && this.f52545b == iVar.f52545b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f52544a.hashCode()) * 37) + Long.hashCode(this.f52545b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1112newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        h hVar = this.f52544a;
        arrayList.add("name=" + hVar);
        long j11 = this.f52545b;
        arrayList.add("value=" + j11);
        l02 = e0.l0(arrayList, ", ", "MetricRecording{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1112newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h name, long j11, okio.i unknownFields) {
        super(f52543c, unknownFields);
        s.g(name, "name");
        s.g(unknownFields, "unknownFields");
        this.f52544a = name;
        this.f52545b = j11;
    }
}