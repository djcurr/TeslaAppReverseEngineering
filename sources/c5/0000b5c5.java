package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<b> f52524d;
    @q(adapter = "com.tesla.generated.monitoring.Trace#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final l f52525a;
    @q(adapter = "com.tesla.generated.monitoring.Attribute#ADAPTER", label = q.a.REPEATED, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final List<tt.a> f52526b;
    @q(adapter = "com.tesla.generated.monitoring.MetricRecording#ADAPTER", label = q.a.REPEATED, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final List<i> f52527c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.AttributeList", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            l lVar = l.IOS_DID_FINISH_LAUNCHING;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(lVar, arrayList, arrayList2, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        lVar = l.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    arrayList.add(tt.a.f52521c.decode(reader));
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    arrayList2.add(i.f52543c.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.e() != l.IOS_DID_FINISH_LAUNCHING) {
                l.ADAPTER.encodeWithTag(writer, 1, value.e());
            }
            tt.a.f52521c.asRepeated().encodeWithTag(writer, 2, value.c());
            i.f52543c.asRepeated().encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != l.IOS_DID_FINISH_LAUNCHING) {
                z11 += l.ADAPTER.encodedSizeWithTag(1, value.e());
            }
            return z11 + tt.a.f52521c.asRepeated().encodedSizeWithTag(2, value.c()) + i.f52543c.asRepeated().encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return b.b(value, null, mr.d.a(value.c(), tt.a.f52521c), mr.d.a(value.d(), i.f52543c), okio.i.f42656d, 1, null);
        }
    }

    /* renamed from: tt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1161b {
        private C1161b() {
        }

        public /* synthetic */ C1161b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1161b(null);
        f52524d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ b(l lVar, List list, List list2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? l.IOS_DID_FINISH_LAUNCHING : lVar, (i11 & 2) != 0 ? w.i() : list, (i11 & 4) != 0 ? w.i() : list2, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, l lVar, List list, List list2, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = bVar.f52525a;
        }
        if ((i11 & 2) != 0) {
            list = bVar.f52526b;
        }
        if ((i11 & 4) != 0) {
            list2 = bVar.f52527c;
        }
        if ((i11 & 8) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(lVar, list, list2, iVar);
    }

    public final b a(l trace, List<tt.a> attributes, List<i> metrics, okio.i unknownFields) {
        s.g(trace, "trace");
        s.g(attributes, "attributes");
        s.g(metrics, "metrics");
        s.g(unknownFields, "unknownFields");
        return new b(trace, attributes, metrics, unknownFields);
    }

    public final List<tt.a> c() {
        return this.f52526b;
    }

    public final List<i> d() {
        return this.f52527c;
    }

    public final l e() {
        return this.f52525a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && this.f52525a == bVar.f52525a && s.c(this.f52526b, bVar.f52526b) && s.c(this.f52527c, bVar.f52527c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f52525a.hashCode()) * 37) + this.f52526b.hashCode()) * 37) + this.f52527c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1107newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        l lVar = this.f52525a;
        arrayList.add("trace=" + lVar);
        if (!this.f52526b.isEmpty()) {
            List<tt.a> list = this.f52526b;
            arrayList.add("attributes=" + list);
        }
        if (!this.f52527c.isEmpty()) {
            List<i> list2 = this.f52527c;
            arrayList.add("metrics=" + list2);
        }
        l02 = e0.l0(arrayList, ", ", "AttributeList{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1107newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l trace, List<tt.a> attributes, List<i> metrics, okio.i unknownFields) {
        super(f52524d, unknownFields);
        s.g(trace, "trace");
        s.g(attributes, "attributes");
        s.g(metrics, "metrics");
        s.g(unknownFields, "unknownFields");
        this.f52525a = trace;
        this.f52526b = mr.d.g("attributes", attributes);
        this.f52527c = mr.d.g("metrics", metrics);
    }
}