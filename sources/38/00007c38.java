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
public final class e extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<e> f33973b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f33974a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsIntegerParameterValue", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            long j11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(j11, reader.e(d11));
                }
                if (g11 == 1) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, e value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != 0 ? z11 + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            s.g(value, "value");
            return e.b(value, 0L, i.f42656d, 1, null);
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
        f33973b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
    }

    public e() {
        this(0L, null, 3, null);
    }

    public /* synthetic */ e(long j11, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ e b(e eVar, long j11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = eVar.f33974a;
        }
        if ((i11 & 2) != 0) {
            iVar = eVar.unknownFields();
        }
        return eVar.a(j11, iVar);
    }

    public final e a(long j11, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new e(j11, unknownFields);
    }

    public final long c() {
        return this.f33974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(unknownFields(), eVar.unknownFields()) && this.f33974a == eVar.f33974a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Long.hashCode(this.f33974a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m623newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f33974a;
        arrayList.add("value=" + j11);
        l02 = e0.l0(arrayList, ", ", "AnalyticsIntegerParameterValue{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m623newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j11, i unknownFields) {
        super(f33973b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f33974a = j11;
    }
}