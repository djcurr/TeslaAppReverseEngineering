package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class j extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<j> f44033e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final b0 f44034a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final b0 f44035b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#EMPTY", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final b0 f44036c;
    @q(adapter = "com.tesla.generated.commandcenter.AddKeyPayload#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final ot.a f44037d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, n00.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProxyCommandAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            ot.a aVar = null;
            b0 b0Var = null;
            b0 b0Var2 = null;
            b0 b0Var3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(b0Var, b0Var2, b0Var3, aVar, reader.e(d11));
                } else if (g11 == 1) {
                    ProtoAdapter.EMPTY.decode(reader);
                    b0Var = b0.f54756a;
                } else if (g11 == 2) {
                    ProtoAdapter.EMPTY.decode(reader);
                    b0Var2 = b0.f54756a;
                } else if (g11 == 3) {
                    ProtoAdapter.EMPTY.decode(reader);
                    b0Var3 = b0.f54756a;
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    aVar = ot.a.f43994d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j value) {
            s.g(writer, "writer");
            s.g(value, "value");
            ProtoAdapter<b0> protoAdapter = ProtoAdapter.EMPTY;
            protoAdapter.encodeWithTag(writer, 1, value.c());
            protoAdapter.encodeWithTag(writer, 2, value.e());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            ot.a.f43994d.encodeWithTag(writer, 4, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<b0> protoAdapter = ProtoAdapter.EMPTY;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.e()) + protoAdapter.encodedSizeWithTag(3, value.d()) + ot.a.f43994d.encodedSizeWithTag(4, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            b0 b0Var;
            b0 b0Var2;
            b0 b0Var3;
            s.g(value, "value");
            b0 c11 = value.c();
            if (c11 == null) {
                b0Var = null;
            } else {
                ProtoAdapter.EMPTY.redact(c11);
                b0Var = b0.f54756a;
            }
            b0 e11 = value.e();
            if (e11 == null) {
                b0Var2 = null;
            } else {
                ProtoAdapter.EMPTY.redact(e11);
                b0Var2 = b0.f54756a;
            }
            b0 d11 = value.d();
            if (d11 == null) {
                b0Var3 = null;
            } else {
                ProtoAdapter.EMPTY.redact(d11);
                b0Var3 = b0.f54756a;
            }
            ot.a b11 = value.b();
            return value.a(b0Var, b0Var2, b0Var3, b11 != null ? ot.a.f43994d.redact(b11) : null, okio.i.f42656d);
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
        f44033e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), o.PROTO_3);
    }

    public j() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ j(b0 b0Var, b0 b0Var2, b0 b0Var3, ot.a aVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : b0Var, (i11 & 2) != 0 ? null : b0Var2, (i11 & 4) != 0 ? null : b0Var3, (i11 & 8) == 0 ? aVar : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public final j a(b0 b0Var, b0 b0Var2, b0 b0Var3, ot.a aVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new j(b0Var, b0Var2, b0Var3, aVar, unknownFields);
    }

    public final ot.a b() {
        return this.f44037d;
    }

    public final b0 c() {
        return this.f44034a;
    }

    public final b0 d() {
        return this.f44036c;
    }

    public final b0 e() {
        return this.f44035b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(unknownFields(), jVar.unknownFields()) && s.c(this.f44034a, jVar.f44034a) && s.c(this.f44035b, jVar.f44035b) && s.c(this.f44036c, jVar.f44036c) && s.c(this.f44037d, jVar.f44037d);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            b0 b0Var = this.f44034a;
            int hashCode2 = (hashCode + (b0Var != null ? b0Var.hashCode() : 0)) * 37;
            b0 b0Var2 = this.f44035b;
            int hashCode3 = (hashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 37;
            b0 b0Var3 = this.f44036c;
            int hashCode4 = (hashCode3 + (b0Var3 != null ? b0Var3.hashCode() : 0)) * 37;
            ot.a aVar = this.f44037d;
            int hashCode5 = hashCode4 + (aVar != null ? aVar.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m962newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        b0 b0Var = this.f44034a;
        if (b0Var != null) {
            arrayList.add("lock=" + b0Var);
        }
        b0 b0Var2 = this.f44035b;
        if (b0Var2 != null) {
            arrayList.add("unlock=" + b0Var2);
        }
        b0 b0Var3 = this.f44036c;
        if (b0Var3 != null) {
            arrayList.add("remoteStart=" + b0Var3);
        }
        ot.a aVar = this.f44037d;
        if (aVar != null) {
            arrayList.add("addKey=" + aVar);
        }
        l02 = e0.l0(arrayList, ", ", "ProxyCommandAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m962newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b0 b0Var, b0 b0Var2, b0 b0Var3, ot.a aVar, okio.i unknownFields) {
        super(f44033e, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f44034a = b0Var;
        this.f44035b = b0Var2;
        this.f44036c = b0Var3;
        this.f44037d = aVar;
        if (!(mr.d.e(b0Var, b0Var2, b0Var3, aVar, new Object[0]) <= 1)) {
            throw new IllegalArgumentException("At most one of lock, unlock, remoteStart, addKey may be non-null".toString());
        }
    }
}