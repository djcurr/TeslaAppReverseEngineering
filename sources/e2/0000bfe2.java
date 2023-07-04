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
public final class c extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<c> f57699e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f57700a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f57701b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f57702c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final okio.i f57703d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.HMAC_Personalized_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(iVar, i11, i12, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 3) {
                    i12 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.d());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 3, Integer.valueOf(value.e()));
            }
            if (!s.c(value.f(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.f());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.d());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.FIXED32.encodedSizeWithTag(3, Integer.valueOf(value.e()));
            }
            return !s.c(value.f(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.f()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            return c.b(value, null, 0, 0, null, okio.i.f42656d, 15, null);
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
        f57699e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, 0, 0, null, null, 31, null);
    }

    public /* synthetic */ c(okio.i iVar, int i11, int i12, okio.i iVar2, okio.i iVar3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.i.f42656d : iVar, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) == 0 ? i12 : 0, (i13 & 8) != 0 ? okio.i.f42656d : iVar2, (i13 & 16) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ c b(c cVar, okio.i iVar, int i11, int i12, okio.i iVar2, okio.i iVar3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iVar = cVar.f57700a;
        }
        if ((i13 & 2) != 0) {
            i11 = cVar.f57701b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = cVar.f57702c;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            iVar2 = cVar.f57703d;
        }
        okio.i iVar4 = iVar2;
        if ((i13 & 16) != 0) {
            iVar3 = cVar.unknownFields();
        }
        return cVar.a(iVar, i14, i15, iVar4, iVar3);
    }

    public final c a(okio.i epoch, int i11, int i12, okio.i tag, okio.i unknownFields) {
        s.g(epoch, "epoch");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        return new c(epoch, i11, i12, tag, unknownFields);
    }

    public final int c() {
        return this.f57701b;
    }

    public final okio.i d() {
        return this.f57700a;
    }

    public final int e() {
        return this.f57702c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f57700a, cVar.f57700a) && this.f57701b == cVar.f57701b && this.f57702c == cVar.f57702c && s.c(this.f57703d, cVar.f57703d);
        }
        return false;
    }

    public final okio.i f() {
        return this.f57703d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((unknownFields().hashCode() * 37) + this.f57700a.hashCode()) * 37) + Integer.hashCode(this.f57701b)) * 37) + Integer.hashCode(this.f57702c)) * 37) + this.f57703d.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1127newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f57700a;
        arrayList.add("epoch=" + iVar);
        int i11 = this.f57701b;
        arrayList.add("counter=" + i11);
        int i12 = this.f57702c;
        arrayList.add("expires_at=" + i12);
        okio.i iVar2 = this.f57703d;
        arrayList.add("tag=" + iVar2);
        l02 = e0.l0(arrayList, ", ", "HMAC_Personalized_Signature_Data{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1127newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(okio.i epoch, int i11, int i12, okio.i tag, okio.i unknownFields) {
        super(f57699e, unknownFields);
        s.g(epoch, "epoch");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        this.f57700a = epoch;
        this.f57701b = i11;
        this.f57702c = i12;
        this.f57703d = tag;
    }
}