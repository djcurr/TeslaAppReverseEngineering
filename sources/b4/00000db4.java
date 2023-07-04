package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<m2> f8100b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterLocation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final p3 f8101a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m2> {
        a(com.squareup.wire.b bVar, n00.d<m2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SetUpdaterLocation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            p3 p3Var = p3.UPDATER_LOCATION_NONE;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m2(p3Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        p3Var = p3.ADAPTER.decode(reader);
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
        public void encode(com.squareup.wire.l writer, m2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != p3.UPDATER_LOCATION_NONE) {
                p3.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != p3.UPDATER_LOCATION_NONE ? z11 + p3.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m2 redact(m2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return m2.b(value, null, okio.i.f42656d, 1, null);
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
        f8100b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m2.class), com.squareup.wire.o.PROTO_3);
    }

    public m2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ m2(p3 p3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p3.UPDATER_LOCATION_NONE : p3Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ m2 b(m2 m2Var, p3 p3Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            p3Var = m2Var.f8101a;
        }
        if ((i11 & 2) != 0) {
            iVar = m2Var.unknownFields();
        }
        return m2Var.a(p3Var, iVar);
    }

    public final m2 a(p3 updaterLocation, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(updaterLocation, "updaterLocation");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m2(updaterLocation, unknownFields);
    }

    public final p3 c() {
        return this.f8101a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), m2Var.unknownFields()) && this.f8101a == m2Var.f8101a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8101a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m52newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        p3 p3Var = this.f8101a;
        arrayList.add("updaterLocation=" + p3Var);
        l02 = wz.e0.l0(arrayList, ", ", "SetUpdaterLocation{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m52newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p3 updaterLocation, okio.i unknownFields) {
        super(f8100b, unknownFields);
        kotlin.jvm.internal.s.g(updaterLocation, "updaterLocation");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8101a = updaterLocation;
    }
}