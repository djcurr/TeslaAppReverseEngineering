package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class q2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<q2> f8184c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8185a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage_information_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final p2 f8186b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q2> {
        a(com.squareup.wire.b bVar, n00.d<q2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SignedMessage_status", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            p2 p2Var = p2.SIGNEDMESSAGE_INFORMATION_NONE;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q2(i11, p2Var, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        p2Var = p2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            if (value.d() != p2.SIGNEDMESSAGE_INFORMATION_NONE) {
                p2.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            return value.d() != p2.SIGNEDMESSAGE_INFORMATION_NONE ? z11 + p2.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q2 redact(q2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return q2.b(value, 0, null, okio.i.f42656d, 3, null);
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
        f8184c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(q2.class), com.squareup.wire.o.PROTO_3);
    }

    public q2() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ q2(int i11, p2 p2Var, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? p2.SIGNEDMESSAGE_INFORMATION_NONE : p2Var, (i12 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ q2 b(q2 q2Var, int i11, p2 p2Var, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = q2Var.f8185a;
        }
        if ((i12 & 2) != 0) {
            p2Var = q2Var.f8186b;
        }
        if ((i12 & 4) != 0) {
            iVar = q2Var.unknownFields();
        }
        return q2Var.a(i11, p2Var, iVar);
    }

    public final q2 a(int i11, p2 signedMessageInformation, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(signedMessageInformation, "signedMessageInformation");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q2(i11, signedMessageInformation, unknownFields);
    }

    public final int c() {
        return this.f8185a;
    }

    public final p2 d() {
        return this.f8186b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), q2Var.unknownFields()) && this.f8185a == q2Var.f8185a && this.f8186b == q2Var.f8186b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8185a)) * 37) + this.f8186b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m66newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8185a;
        arrayList.add("counter=" + i11);
        p2 p2Var = this.f8186b;
        arrayList.add("signedMessageInformation=" + p2Var);
        l02 = wz.e0.l0(arrayList, ", ", "SignedMessage_status{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m66newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(int i11, p2 signedMessageInformation, okio.i unknownFields) {
        super(f8184c, unknownFields);
        kotlin.jvm.internal.s.g(signedMessageInformation, "signedMessageInformation");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8185a = i11;
        this.f8186b = signedMessageInformation;
    }
}