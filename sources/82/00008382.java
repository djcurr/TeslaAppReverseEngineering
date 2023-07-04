package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b1> f37347b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.MediaPlaybackStatus#ADAPTER", jsonName = "mediaPlaybackStatus", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.g f37348a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b1> {
        a(com.squareup.wire.b bVar, n00.d<b1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaPlayAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.g gVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b1(gVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        gVar = kt.g.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            kt.g.ADAPTER.encodeWithTag(writer, 1, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + kt.g.ADAPTER.encodedSizeWithTag(1, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b1 redact(b1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return b1.b(value, null, okio.i.f42656d, 1, null);
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
        f37347b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b1.class), com.squareup.wire.o.PROTO_3);
    }

    public b1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b1(kt.g gVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : gVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b1 b(b1 b1Var, kt.g gVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = b1Var.f37348a;
        }
        if ((i11 & 2) != 0) {
            iVar = b1Var.unknownFields();
        }
        return b1Var.a(gVar, iVar);
    }

    public final b1 a(kt.g gVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b1(gVar, unknownFields);
    }

    public final kt.g c() {
        return this.f37348a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b1Var.unknownFields()) && this.f37348a == b1Var.f37348a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            kt.g gVar = this.f37348a;
            int hashCode2 = hashCode + (gVar != null ? gVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m657newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.g gVar = this.f37348a;
        if (gVar != null) {
            arrayList.add("media_playback_status=" + gVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "MediaPlayAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m657newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kt.g gVar, okio.i unknownFields) {
        super(f37347b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37348a = gVar;
    }
}