package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class q extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<q> f8178c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Integer f8179a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final Integer f8180b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q> {
        a(com.squareup.wire.b bVar, n00.d<q> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.BLEConfig", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q(num, num2, reader.e(d11));
                } else if (g11 == 1) {
                    num = ProtoAdapter.UINT32.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    num2 = ProtoAdapter.UINT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(writer, 1, value.c());
            protoAdapter.encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q redact(q value) {
            kotlin.jvm.internal.s.g(value, "value");
            return q.b(value, null, null, okio.i.f42656d, 3, null);
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
        f8178c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(q.class), com.squareup.wire.o.PROTO_3);
    }

    public q() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ q(Integer num, Integer num2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ q b(q qVar, Integer num, Integer num2, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = qVar.f8179a;
        }
        if ((i11 & 2) != 0) {
            num2 = qVar.f8180b;
        }
        if ((i11 & 4) != 0) {
            iVar = qVar.unknownFields();
        }
        return qVar.a(num, num2, iVar);
    }

    public final q a(Integer num, Integer num2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q(num, num2, unknownFields);
    }

    public final Integer c() {
        return this.f8179a;
    }

    public final Integer d() {
        return this.f8180b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), qVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f8179a, qVar.f8179a) && kotlin.jvm.internal.s.c(this.f8180b, qVar.f8180b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.f8179a;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f8180b;
            int hashCode3 = hashCode2 + (num2 != null ? num2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m64newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Integer num = this.f8179a;
        if (num != null) {
            arrayList.add("ADVInterval=" + num);
        }
        Integer num2 = this.f8180b;
        if (num2 != null) {
            arrayList.add("sleepClockAccuracy=" + num2);
        }
        l02 = wz.e0.l0(arrayList, ", ", "BLEConfig{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m64newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Integer num, Integer num2, okio.i unknownFields) {
        super(f8178c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8179a = num;
        this.f8180b = num2;
        if (!(mr.d.c(num, num2) <= 1)) {
            throw new IllegalArgumentException("At most one of ADVInterval, sleepClockAccuracy may be non-null".toString());
        }
    }
}