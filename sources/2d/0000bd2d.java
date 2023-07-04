package wt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public static final ProtoAdapter<b> f56176a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/LogUploadRequestPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(reader.e(d11));
                }
                reader.m(g11);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            return value.unknownFields().z();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return value.a(i.f42656d);
        }
    }

    /* renamed from: wt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1274b {
        private C1274b() {
        }

        public /* synthetic */ C1274b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1274b(null);
        f56176a = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, 1, null);
    }

    public /* synthetic */ b(i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? i.f42656d : iVar);
    }

    public final b a(i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && s.c(unknownFields(), ((b) obj).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1123newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        return "LogUploadRequestPayload{}";
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1123newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i unknownFields) {
        super(f56176a, unknownFields);
        s.g(unknownFields, "unknownFields");
    }
}