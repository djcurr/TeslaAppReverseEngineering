package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<v0> f8220b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GetReaderKeyCommand#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final w0 f8221a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v0> {
        a(com.squareup.wire.b bVar, n00.d<v0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.GetReaderKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            w0 w0Var = w0.GET_READER_KEY_COMMAND_UNKNOWN;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v0(w0Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        w0Var = w0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != w0.GET_READER_KEY_COMMAND_UNKNOWN) {
                w0.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != w0.GET_READER_KEY_COMMAND_UNKNOWN ? z11 + w0.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v0 redact(v0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return v0.b(value, null, okio.i.f42656d, 1, null);
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
        f8220b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v0.class), com.squareup.wire.o.PROTO_3);
    }

    public v0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ v0(w0 w0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w0.GET_READER_KEY_COMMAND_UNKNOWN : w0Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ v0 b(v0 v0Var, w0 w0Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            w0Var = v0Var.f8221a;
        }
        if ((i11 & 2) != 0) {
            iVar = v0Var.unknownFields();
        }
        return v0Var.a(w0Var, iVar);
    }

    public final v0 a(w0 command, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(command, "command");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v0(command, unknownFields);
    }

    public final w0 c() {
        return this.f8221a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), v0Var.unknownFields()) && this.f8221a == v0Var.f8221a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8221a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m78newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        w0 w0Var = this.f8221a;
        arrayList.add("command=" + w0Var);
        l02 = wz.e0.l0(arrayList, ", ", "GetReaderKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m78newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 command, okio.i unknownFields) {
        super(f8220b, unknownFields);
        kotlin.jvm.internal.s.g(command, "command");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8221a = command;
    }
}