package ot;

import bu.b4;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class l extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<l> f44040c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f44041a;
    @q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final b4 f44042b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l> {
        a(com.squareup.wire.b bVar, n00.d<l> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.SharedHMACWhitelistOperation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            b4 b4Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l(iVar, b4Var, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    b4Var = b4.f7947l.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != null) {
                b4.f7947l.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            return value.d() != null ? z11 + b4.f7947l.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l redact(l value) {
            s.g(value, "value");
            b4 d11 = value.d();
            return l.b(value, null, d11 == null ? null : b4.f7947l.redact(d11), okio.i.f42656d, 1, null);
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
        f44040c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(l.class), o.PROTO_3);
    }

    public l() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ l(okio.i iVar, b4 b4Var, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? null : b4Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ l b(l lVar, okio.i iVar, b4 b4Var, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = lVar.f44041a;
        }
        if ((i11 & 2) != 0) {
            b4Var = lVar.f44042b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = lVar.unknownFields();
        }
        return lVar.a(iVar, b4Var, iVar2);
    }

    public final l a(okio.i sharedHMAC, b4 b4Var, okio.i unknownFields) {
        s.g(sharedHMAC, "sharedHMAC");
        s.g(unknownFields, "unknownFields");
        return new l(sharedHMAC, b4Var, unknownFields);
    }

    public final okio.i c() {
        return this.f44041a;
    }

    public final b4 d() {
        return this.f44042b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return s.c(unknownFields(), lVar.unknownFields()) && s.c(this.f44041a, lVar.f44041a) && s.c(this.f44042b, lVar.f44042b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f44041a.hashCode()) * 37;
            b4 b4Var = this.f44042b;
            int hashCode2 = hashCode + (b4Var != null ? b4Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m964newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f44041a;
        arrayList.add("sharedHMAC=" + iVar);
        b4 b4Var = this.f44042b;
        if (b4Var != null) {
            arrayList.add("whitelistOperation=" + b4Var);
        }
        l02 = e0.l0(arrayList, ", ", "SharedHMACWhitelistOperation{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m964newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(okio.i sharedHMAC, b4 b4Var, okio.i unknownFields) {
        super(f44040c, unknownFields);
        s.g(sharedHMAC, "sharedHMAC");
        s.g(unknownFields, "unknownFields");
        this.f44041a = sharedHMAC;
        this.f44042b = b4Var;
    }
}