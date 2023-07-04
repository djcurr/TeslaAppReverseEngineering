package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<i3> f8053d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8054a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "HMACSignature", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8055b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RCISignature#ADAPTER", jsonName = "rciSignature", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final e2 f8056c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i3> {
        a(com.squareup.wire.b bVar, n00.d<i3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ToRCI", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = null;
            e2 e2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i3(iVar, iVar2, e2Var, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    e2Var = e2.f7984c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            e2.f7984c.encodeWithTag(writer, 3, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            return z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d()) + e2.f7984c.encodedSizeWithTag(3, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i3 redact(i3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            e2 e11 = value.e();
            return i3.b(value, null, null, e11 == null ? null : e2.f7984c.redact(e11), okio.i.f42656d, 3, null);
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
        f8053d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i3.class), com.squareup.wire.o.PROTO_3);
    }

    public i3() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ i3(okio.i iVar, okio.i iVar2, e2 e2Var, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? null : iVar2, (i11 & 4) != 0 ? null : e2Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ i3 b(i3 i3Var, okio.i iVar, okio.i iVar2, e2 e2Var, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i3Var.f8054a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = i3Var.f8055b;
        }
        if ((i11 & 4) != 0) {
            e2Var = i3Var.f8056c;
        }
        if ((i11 & 8) != 0) {
            iVar3 = i3Var.unknownFields();
        }
        return i3Var.a(iVar, iVar2, e2Var, iVar3);
    }

    public final i3 a(okio.i command, okio.i iVar, e2 e2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(command, "command");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i3(command, iVar, e2Var, unknownFields);
    }

    public final okio.i c() {
        return this.f8054a;
    }

    public final okio.i d() {
        return this.f8055b;
    }

    public final e2 e() {
        return this.f8056c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i3) {
            i3 i3Var = (i3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), i3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8054a, i3Var.f8054a) && kotlin.jvm.internal.s.c(this.f8055b, i3Var.f8055b) && kotlin.jvm.internal.s.c(this.f8056c, i3Var.f8056c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f8054a.hashCode()) * 37;
            okio.i iVar = this.f8055b;
            int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 37;
            e2 e2Var = this.f8056c;
            int hashCode3 = hashCode2 + (e2Var != null ? e2Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m40newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8054a;
        arrayList.add("command=" + iVar);
        okio.i iVar2 = this.f8055b;
        if (iVar2 != null) {
            arrayList.add("HMAC_signature=" + iVar2);
        }
        e2 e2Var = this.f8056c;
        if (e2Var != null) {
            arrayList.add("rci_signature=" + e2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ToRCI{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m40newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(okio.i command, okio.i iVar, e2 e2Var, okio.i unknownFields) {
        super(f8053d, unknownFields);
        kotlin.jvm.internal.s.g(command, "command");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8054a = command;
        this.f8055b = iVar;
        this.f8056c = e2Var;
        if (!(mr.d.c(iVar, e2Var) <= 1)) {
            throw new IllegalArgumentException("At most one of HMAC_signature, rci_signature may be non-null".toString());
        }
    }
}