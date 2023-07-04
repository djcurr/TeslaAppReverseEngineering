package jt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<c> f33970c;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsEventName#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final d f33971a;
    @q(adapter = "com.tesla.generated.analytics.AnalyticsParameter#ADAPTER", label = q.a.REPEATED, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f33972b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsEvent", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(k reader) {
            s.g(reader, "reader");
            d dVar = d.PREPARED_REPORT;
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(dVar, arrayList, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        dVar = d.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    arrayList.add(f.f33975f.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != d.PREPARED_REPORT) {
                d.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            f.f33975f.asRepeated().encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != d.PREPARED_REPORT) {
                z11 += d.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return z11 + f.f33975f.asRepeated().encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            return c.b(value, null, mr.d.a(value.d(), f.f33975f), i.f42656d, 1, null);
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
        f33970c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ c(d dVar, List list, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? d.PREPARED_REPORT : dVar, (i11 & 2) != 0 ? w.i() : list, (i11 & 4) != 0 ? i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c b(c cVar, d dVar, List list, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = cVar.f33971a;
        }
        if ((i11 & 2) != 0) {
            list = cVar.f33972b;
        }
        if ((i11 & 4) != 0) {
            iVar = cVar.unknownFields();
        }
        return cVar.a(dVar, list, iVar);
    }

    public final c a(d name, List<f> parameters, i unknownFields) {
        s.g(name, "name");
        s.g(parameters, "parameters");
        s.g(unknownFields, "unknownFields");
        return new c(name, parameters, unknownFields);
    }

    public final d c() {
        return this.f33971a;
    }

    public final List<f> d() {
        return this.f33972b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && this.f33971a == cVar.f33971a && s.c(this.f33972b, cVar.f33972b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f33971a.hashCode()) * 37) + this.f33972b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m622newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        d dVar = this.f33971a;
        arrayList.add("name=" + dVar);
        if (!this.f33972b.isEmpty()) {
            List<f> list = this.f33972b;
            arrayList.add("parameters=" + list);
        }
        l02 = e0.l0(arrayList, ", ", "AnalyticsEvent{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m622newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d name, List<f> parameters, i unknownFields) {
        super(f33970c, unknownFields);
        s.g(name, "name");
        s.g(parameters, "parameters");
        s.g(unknownFields, "unknownFields");
        this.f33971a = name;
        this.f33972b = mr.d.g("parameters", parameters);
    }
}