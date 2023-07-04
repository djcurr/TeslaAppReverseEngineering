package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: a  reason: collision with root package name */
    public static final ProtoAdapter<f> f38962a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarStateNotAllowed", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(reader.e(d11));
                }
                reader.m(g11);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
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
        f38962a = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), com.squareup.wire.o.PROTO_3);
    }

    public f() {
        this(null, 1, null);
    }

    public /* synthetic */ f(okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar);
    }

    public final f a(okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f(unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.s.c(unknownFields(), ((f) obj).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m769newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        return "ChargeOnSolarStateNotAllowed{}";
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m769newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(okio.i unknownFields) {
        super(f38962a, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
    }
}