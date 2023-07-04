package kt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<f> f35777c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final float f35778a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final float f35779b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LatLong", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float f12 = 0.0f;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(f11, f12, reader.e(d11));
                }
                if (g11 == 1) {
                    f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.c()));
            }
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.c()));
            }
            return !(value.d() == BitmapDescriptorFactory.HUE_RED) ? z11 + ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            kotlin.jvm.internal.s.g(value, "value");
            return f.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.i.f42656d, 3, null);
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
        f35777c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), com.squareup.wire.o.PROTO_3);
    }

    public f() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    }

    public /* synthetic */ f(float f11, float f12, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f b(f fVar, float f11, float f12, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = fVar.f35778a;
        }
        if ((i11 & 2) != 0) {
            f12 = fVar.f35779b;
        }
        if ((i11 & 4) != 0) {
            iVar = fVar.unknownFields();
        }
        return fVar.a(f11, f12, iVar);
    }

    public final f a(float f11, float f12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f(f11, f12, unknownFields);
    }

    public final float c() {
        return this.f35778a;
    }

    public final float d() {
        return this.f35779b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), fVar.unknownFields())) {
                if (this.f35778a == fVar.f35778a) {
                    return (this.f35779b > fVar.f35779b ? 1 : (this.f35779b == fVar.f35779b ? 0 : -1)) == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Float.hashCode(this.f35778a)) * 37) + Float.hashCode(this.f35779b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m635newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        float f11 = this.f35778a;
        arrayList.add("latitude=" + f11);
        float f12 = this.f35779b;
        arrayList.add("longitude=" + f12);
        l02 = e0.l0(arrayList, ", ", "LatLong{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m635newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(float f11, float f12, okio.i unknownFields) {
        super(f35777c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35778a = f11;
        this.f35779b = f12;
    }
}