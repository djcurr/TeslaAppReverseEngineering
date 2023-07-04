package xt;

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
public final class g extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<g> f57711c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f57712a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f57713b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.RSA_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(i11, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            if (!s.c(value.d(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.FIXED32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            return !s.c(value.d(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            s.g(value, "value");
            return g.b(value, 0, null, okio.i.f42656d, 3, null);
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
        f57711c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), o.PROTO_3);
    }

    public g() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ g(int i11, okio.i iVar, okio.i iVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? okio.i.f42656d : iVar, (i12 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ g b(g gVar, int i11, okio.i iVar, okio.i iVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gVar.f57712a;
        }
        if ((i12 & 2) != 0) {
            iVar = gVar.f57713b;
        }
        if ((i12 & 4) != 0) {
            iVar2 = gVar.unknownFields();
        }
        return gVar.a(i11, iVar, iVar2);
    }

    public final g a(int i11, okio.i signature, okio.i unknownFields) {
        s.g(signature, "signature");
        s.g(unknownFields, "unknownFields");
        return new g(i11, signature, unknownFields);
    }

    public final int c() {
        return this.f57712a;
    }

    public final okio.i d() {
        return this.f57713b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(unknownFields(), gVar.unknownFields()) && this.f57712a == gVar.f57712a && s.c(this.f57713b, gVar.f57713b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f57712a)) * 37) + this.f57713b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1131newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f57712a;
        arrayList.add("expires_at=" + i11);
        okio.i iVar = this.f57713b;
        arrayList.add("signature=" + iVar);
        l02 = e0.l0(arrayList, ", ", "RSA_Signature_Data{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1131newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i11, okio.i signature, okio.i unknownFields) {
        super(f57711c, unknownFields);
        s.g(signature, "signature");
        s.g(unknownFields, "unknownFields");
        this.f57712a = i11;
        this.f57713b = signature;
    }
}