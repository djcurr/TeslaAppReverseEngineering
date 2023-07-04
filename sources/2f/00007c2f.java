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
public final class b extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b> f33968b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final double f33969a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsDoubleParameterValue", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            double d12 = 0.0d;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(d12, reader.e(d11));
                }
                if (g11 == 1) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!(value.c() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !((value.c() > 0.0d ? 1 : (value.c() == 0.0d ? 0 : -1)) == 0) ? z11 + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return b.b(value, 0.0d, i.f42656d, 1, null);
        }
    }

    /* renamed from: jt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0621b {
        private C0621b() {
        }

        public /* synthetic */ C0621b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0621b(null);
        f33968b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(0.0d, null, 3, null);
    }

    public /* synthetic */ b(double d11, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, double d11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = bVar.f33969a;
        }
        if ((i11 & 2) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(d11, iVar);
    }

    public final b a(double d11, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(d11, unknownFields);
    }

    public final double c() {
        return this.f33969a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (s.c(unknownFields(), bVar.unknownFields())) {
                return (this.f33969a > bVar.f33969a ? 1 : (this.f33969a == bVar.f33969a ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.f33969a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m621newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.f33969a;
        arrayList.add("value=" + d11);
        l02 = e0.l0(arrayList, ", ", "AnalyticsDoubleParameterValue{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m621newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(double d11, i unknownFields) {
        super(f33968b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f33969a = d11;
    }
}