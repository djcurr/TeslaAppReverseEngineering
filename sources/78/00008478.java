package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<t> f37611d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fieldNumber", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f37612a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f37613b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f37614c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t> {
        a(com.squareup.wire.b bVar, n00.d<t> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.EncryptedData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t(i11, iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(c11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(c11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c());
            }
            return !kotlin.jvm.internal.s.c(value.e(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t redact(t value) {
            kotlin.jvm.internal.s.g(value, "value");
            return t.b(value, 0, null, null, okio.i.f42656d, 7, null);
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
        f37611d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(t.class), com.squareup.wire.o.PROTO_3);
    }

    public t() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ t(int i11, okio.i iVar, okio.i iVar2, okio.i iVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? okio.i.f42656d : iVar, (i12 & 4) != 0 ? okio.i.f42656d : iVar2, (i12 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ t b(t tVar, int i11, okio.i iVar, okio.i iVar2, okio.i iVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = tVar.f37612a;
        }
        if ((i12 & 2) != 0) {
            iVar = tVar.f37613b;
        }
        if ((i12 & 4) != 0) {
            iVar2 = tVar.f37614c;
        }
        if ((i12 & 8) != 0) {
            iVar3 = tVar.unknownFields();
        }
        return tVar.a(i11, iVar, iVar2, iVar3);
    }

    public final t a(int i11, okio.i ciphertext, okio.i tag, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(ciphertext, "ciphertext");
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t(i11, ciphertext, tag, unknownFields);
    }

    public final okio.i c() {
        return this.f37613b;
    }

    public final int d() {
        return this.f37612a;
    }

    public final okio.i e() {
        return this.f37614c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), tVar.unknownFields()) && this.f37612a == tVar.f37612a && kotlin.jvm.internal.s.c(this.f37613b, tVar.f37613b) && kotlin.jvm.internal.s.c(this.f37614c, tVar.f37614c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f37612a)) * 37) + this.f37613b.hashCode()) * 37) + this.f37614c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m732newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f37612a;
        arrayList.add("field_number=" + i11);
        okio.i iVar = this.f37613b;
        arrayList.add("ciphertext=" + iVar);
        okio.i iVar2 = this.f37614c;
        arrayList.add("tag=" + iVar2);
        l02 = wz.e0.l0(arrayList, ", ", "EncryptedData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m732newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i11, okio.i ciphertext, okio.i tag, okio.i unknownFields) {
        super(f37611d, unknownFields);
        kotlin.jvm.internal.s.g(ciphertext, "ciphertext");
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37612a = i11;
        this.f37613b = ciphertext;
        this.f37614c = tag;
    }
}