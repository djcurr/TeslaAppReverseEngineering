package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<a> f60715d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f60716a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f60717b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f60718c;

    /* renamed from: zt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1389a extends ProtoAdapter<a> {
        C1389a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.EncryptedData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            okio.i iVar3 = iVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(iVar, iVar2, iVar3, reader.e(d11));
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
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(c11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (!s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            if (!s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(c11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            if (!s.c(value.d(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d());
            }
            return !s.c(value.e(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, null, null, okio.i.f42656d, 7, null);
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
        f60715d = new C1389a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ a(okio.i iVar, okio.i iVar2, okio.i iVar3, okio.i iVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar4);
    }

    public static /* synthetic */ a b(a aVar, okio.i iVar, okio.i iVar2, okio.i iVar3, okio.i iVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = aVar.f60716a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = aVar.f60717b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = aVar.f60718c;
        }
        if ((i11 & 8) != 0) {
            iVar4 = aVar.unknownFields();
        }
        return aVar.a(iVar, iVar2, iVar3, iVar4);
    }

    public final a a(okio.i data_, okio.i iv2, okio.i tag, okio.i unknownFields) {
        s.g(data_, "data_");
        s.g(iv2, "iv");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        return new a(data_, iv2, tag, unknownFields);
    }

    public final okio.i c() {
        return this.f60716a;
    }

    public final okio.i d() {
        return this.f60717b;
    }

    public final okio.i e() {
        return this.f60718c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f60716a, aVar.f60716a) && s.c(this.f60717b, aVar.f60717b) && s.c(this.f60718c, aVar.f60718c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f60716a.hashCode()) * 37) + this.f60717b.hashCode()) * 37) + this.f60718c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1139newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f60716a;
        arrayList.add("data_=" + iVar);
        okio.i iVar2 = this.f60717b;
        arrayList.add("iv=" + iVar2);
        okio.i iVar3 = this.f60718c;
        arrayList.add("tag=" + iVar3);
        l02 = e0.l0(arrayList, ", ", "EncryptedData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1139newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okio.i data_, okio.i iv2, okio.i tag, okio.i unknownFields) {
        super(f60715d, unknownFields);
        s.g(data_, "data_");
        s.g(iv2, "iv");
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        this.f60716a = data_;
        this.f60717b = iv2;
        this.f60718c = tag;
    }
}