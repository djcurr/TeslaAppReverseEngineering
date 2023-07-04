package au;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<a> f6967c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "modifiedAt", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f6968a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f6969b;

    /* renamed from: au.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0129a extends ProtoAdapter<a> {
        C0129a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.UnencryptedItem", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            long d11 = reader.d();
            long j11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(j11, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.d()));
            }
            if (!s.c(value.c(), i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.d()));
            }
            return !s.c(value.c(), i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, 0L, null, i.f42656d, 3, null);
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
        f6967c = new C0129a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(0L, null, null, 7, null);
    }

    public /* synthetic */ a(long j11, i iVar, i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? i.f42656d : iVar, (i11 & 4) != 0 ? i.f42656d : iVar2);
    }

    public static /* synthetic */ a b(a aVar, long j11, i iVar, i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.f6968a;
        }
        if ((i11 & 2) != 0) {
            iVar = aVar.f6969b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = aVar.unknownFields();
        }
        return aVar.a(j11, iVar, iVar2);
    }

    public final a a(long j11, i data_, i unknownFields) {
        s.g(data_, "data_");
        s.g(unknownFields, "unknownFields");
        return new a(j11, data_, unknownFields);
    }

    public final i c() {
        return this.f6969b;
    }

    public final long d() {
        return this.f6968a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && this.f6968a == aVar.f6968a && s.c(this.f6969b, aVar.f6969b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.f6968a)) * 37) + this.f6969b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m6newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f6968a;
        arrayList.add("modified_at=" + j11);
        i iVar = this.f6969b;
        arrayList.add("data_=" + iVar);
        l02 = e0.l0(arrayList, ", ", "UnencryptedItem{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m6newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j11, i data_, i unknownFields) {
        super(f6967c, unknownFields);
        s.g(data_, "data_");
        s.g(unknownFields, "unknownFields");
        this.f6968a = j11;
        this.f6969b = data_;
    }
}