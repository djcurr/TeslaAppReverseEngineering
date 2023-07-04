package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class x3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<x3> f8270d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8271a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8272b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f8273c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<x3> {
        a(com.squareup.wire.b bVar, n00.d<x3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.VerifyAndInstallApp", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public x3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            okio.i iVar3 = iVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new x3(iVar, iVar2, iVar3, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar3 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, x3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(x3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c());
            }
            return !kotlin.jvm.internal.s.c(value.d(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public x3 redact(x3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return x3.b(value, null, null, null, okio.i.f42656d, 7, null);
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
        f8270d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(x3.class), com.squareup.wire.o.PROTO_3);
    }

    public x3() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ x3(okio.i iVar, okio.i iVar2, okio.i iVar3, okio.i iVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar4);
    }

    public static /* synthetic */ x3 b(x3 x3Var, okio.i iVar, okio.i iVar2, okio.i iVar3, okio.i iVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = x3Var.f8271a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = x3Var.f8272b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = x3Var.f8273c;
        }
        if ((i11 & 8) != 0) {
            iVar4 = x3Var.unknownFields();
        }
        return x3Var.a(iVar, iVar2, iVar3, iVar4);
    }

    public final x3 a(okio.i sha256, okio.i rValue, okio.i sValue, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(sha256, "sha256");
        kotlin.jvm.internal.s.g(rValue, "rValue");
        kotlin.jvm.internal.s.g(sValue, "sValue");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new x3(sha256, rValue, sValue, unknownFields);
    }

    public final okio.i c() {
        return this.f8272b;
    }

    public final okio.i d() {
        return this.f8273c;
    }

    public final okio.i e() {
        return this.f8271a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), x3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8271a, x3Var.f8271a) && kotlin.jvm.internal.s.c(this.f8272b, x3Var.f8272b) && kotlin.jvm.internal.s.c(this.f8273c, x3Var.f8273c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8271a.hashCode()) * 37) + this.f8272b.hashCode()) * 37) + this.f8273c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m86newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8271a;
        arrayList.add("sha256=" + iVar);
        okio.i iVar2 = this.f8272b;
        arrayList.add("rValue=" + iVar2);
        okio.i iVar3 = this.f8273c;
        arrayList.add("sValue=" + iVar3);
        l02 = wz.e0.l0(arrayList, ", ", "VerifyAndInstallApp{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m86newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(okio.i sha256, okio.i rValue, okio.i sValue, okio.i unknownFields) {
        super(f8270d, unknownFields);
        kotlin.jvm.internal.s.g(sha256, "sha256");
        kotlin.jvm.internal.s.g(rValue, "rValue");
        kotlin.jvm.internal.s.g(sValue, "sValue");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8271a = sha256;
        this.f8272b = rValue;
        this.f8273c = sValue;
    }
}