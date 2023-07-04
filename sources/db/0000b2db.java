package st;

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
import wz.e0;

/* loaded from: classes6.dex */
public final class i extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<i> f50647b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32_VALUE", jsonName = "pollIntervalMs", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Integer f50648a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, n00.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.SessionConfigs", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            Integer num = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i(num, reader.e(d11));
                } else if (g11 == 1) {
                    num = ProtoAdapter.INT32_VALUE.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, i value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.b() != null) {
                ProtoAdapter.INT32_VALUE.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + ProtoAdapter.INT32_VALUE.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i redact(i value) {
            s.g(value, "value");
            Integer b11 = value.b();
            return value.a(b11 == null ? null : ProtoAdapter.INT32_VALUE.redact(b11), okio.i.f42656d);
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
        f50647b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), o.PROTO_3);
    }

    public i() {
        this(null, null, 3, null);
    }

    public /* synthetic */ i(Integer num, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final i a(Integer num, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new i(num, unknownFields);
    }

    public final Integer b() {
        return this.f50648a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return s.c(unknownFields(), iVar.unknownFields()) && s.c(this.f50648a, iVar.f50648a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.f50648a;
            int hashCode2 = hashCode + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1105newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Integer num = this.f50648a;
        if (num != null) {
            arrayList.add("poll_interval_ms=" + num);
        }
        l02 = e0.l0(arrayList, ", ", "SessionConfigs{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1105newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Integer num, okio.i unknownFields) {
        super(f50647b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f50648a = num;
    }
}