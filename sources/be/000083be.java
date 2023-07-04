package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f0 extends com.squareup.wire.f {

    /* renamed from: a  reason: collision with root package name */
    public static final ProtoAdapter<f0> f37384a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f0> {
        a(com.squareup.wire.b bVar, n00.d<f0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetManagedChargingSitesRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f0(reader.e(d11));
                }
                reader.m(g11);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f0 redact(f0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(okio.i.f42656d);
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
        f37384a = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f0.class), com.squareup.wire.o.PROTO_3);
    }

    public f0() {
        this(null, 1, null);
    }

    public /* synthetic */ f0(okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar);
    }

    public final f0 a(okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f0(unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof f0) && kotlin.jvm.internal.s.c(unknownFields(), ((f0) obj).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m676newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        return "GetManagedChargingSitesRequest{}";
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m676newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(okio.i unknownFields) {
        super(f37384a, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
    }
}