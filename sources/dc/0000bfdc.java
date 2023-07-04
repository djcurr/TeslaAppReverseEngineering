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
public final class a extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<a> f57691f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f57692a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f57693b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f57694c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "expiresAt", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f57695d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final okio.i f57696e;

    /* renamed from: xt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1309a extends ProtoAdapter<a> {
        C1309a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.AES_GCM_Personalized_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            int i11 = 0;
            int i12 = 0;
            okio.i iVar3 = iVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(iVar, iVar3, i11, i12, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    iVar3 = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 3) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 4) {
                    i12 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.d());
            }
            if (!s.c(value.f(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.f());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 4, Integer.valueOf(value.e()));
            }
            if (!s.c(value.g(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.g());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.d());
            }
            if (!s.c(value.f(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.f());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.FIXED32.encodedSizeWithTag(4, Integer.valueOf(value.e()));
            }
            return !s.c(value.g(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.g()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, null, 0, 0, null, okio.i.f42656d, 31, null);
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
        f57691f = new C1309a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, 0, 0, null, null, 63, null);
    }

    public /* synthetic */ a(okio.i iVar, okio.i iVar2, int i11, int i12, okio.i iVar3, okio.i iVar4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.i.f42656d : iVar, (i13 & 2) != 0 ? okio.i.f42656d : iVar2, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? okio.i.f42656d : iVar3, (i13 & 32) != 0 ? okio.i.f42656d : iVar4);
    }

    public static /* synthetic */ a b(a aVar, okio.i iVar, okio.i iVar2, int i11, int i12, okio.i iVar3, okio.i iVar4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iVar = aVar.f57692a;
        }
        if ((i13 & 2) != 0) {
            iVar2 = aVar.f57693b;
        }
        okio.i iVar5 = iVar2;
        if ((i13 & 4) != 0) {
            i11 = aVar.f57694c;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = aVar.f57695d;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            iVar3 = aVar.f57696e;
        }
        okio.i iVar6 = iVar3;
        if ((i13 & 32) != 0) {
            iVar4 = aVar.unknownFields();
        }
        return aVar.a(iVar, iVar5, i14, i15, iVar6, iVar4);
    }

    public final a a(okio.i epoch, okio.i nonce, int i11, int i12, okio.i tag, okio.i unknownFields) {
        s.g(epoch, "epoch");
        s.g(nonce, "nonce");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        return new a(epoch, nonce, i11, i12, tag, unknownFields);
    }

    public final int c() {
        return this.f57694c;
    }

    public final okio.i d() {
        return this.f57692a;
    }

    public final int e() {
        return this.f57695d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f57692a, aVar.f57692a) && s.c(this.f57693b, aVar.f57693b) && this.f57694c == aVar.f57694c && this.f57695d == aVar.f57695d && s.c(this.f57696e, aVar.f57696e);
        }
        return false;
    }

    public final okio.i f() {
        return this.f57693b;
    }

    public final okio.i g() {
        return this.f57696e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((unknownFields().hashCode() * 37) + this.f57692a.hashCode()) * 37) + this.f57693b.hashCode()) * 37) + Integer.hashCode(this.f57694c)) * 37) + Integer.hashCode(this.f57695d)) * 37) + this.f57696e.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1125newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f57692a;
        arrayList.add("epoch=" + iVar);
        okio.i iVar2 = this.f57693b;
        arrayList.add("nonce=" + iVar2);
        int i11 = this.f57694c;
        arrayList.add("counter=" + i11);
        int i12 = this.f57695d;
        arrayList.add("expires_at=" + i12);
        okio.i iVar3 = this.f57696e;
        arrayList.add("tag=" + iVar3);
        l02 = e0.l0(arrayList, ", ", "AES_GCM_Personalized_Signature_Data{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1125newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okio.i epoch, okio.i nonce, int i11, int i12, okio.i tag, okio.i unknownFields) {
        super(f57691f, unknownFields);
        s.g(epoch, "epoch");
        s.g(nonce, "nonce");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        this.f57692a = epoch;
        this.f57693b = nonce;
        this.f57694c = i11;
        this.f57695d = i12;
        this.f57696e = tag;
    }
}