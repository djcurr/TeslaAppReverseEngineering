package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;

/* loaded from: classes6.dex */
public final class s extends com.squareup.wire.f {

    /* renamed from: n */
    public static final ProtoAdapter<s> f39250n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledTimeMsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a */
    private final long f39251a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "warningTimeRemainingMsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b */
    private final long f39252b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "expectedDurationSecOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c */
    private final int f39253c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "downloadPercOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d */
    private final int f39254d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "installPercOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e */
    private final int f39255e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "versionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: f */
    private final String f39256f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SoftwareUpdate$SoftwareUpdateStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: g */
    private final c f39257g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledTimeMs", tag = 102)

    /* renamed from: h */
    private final Long f39258h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "warningTimeRemainingMs", tag = 103)

    /* renamed from: i */
    private final Long f39259i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "expectedDurationSec", tag = 104)

    /* renamed from: j */
    private final Integer f39260j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "downloadPerc", tag = 105)

    /* renamed from: k */
    private final Integer f39261k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "installPerc", tag = 106)

    /* renamed from: l */
    private final Integer f39262l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 107)

    /* renamed from: m */
    private final String f39263m;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s> {
        a(com.squareup.wire.b bVar, n00.d<s> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SoftwareUpdate", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            c cVar = null;
            long j11 = 0;
            long j12 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            Long l11 = null;
            Long l12 = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = "";
            Integer num3 = null;
            while (true) {
                int g11 = reader.g();
                long j13 = j12;
                if (g11 == -1) {
                    return new s(j11, j13, i11, i12, i13, str2, cVar, l11, l12, num, num3, num2, str, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        cVar = c.f39264g.decode(reader);
                        break;
                    case 2:
                        j11 = ProtoAdapter.UINT64.decode(reader).longValue();
                        break;
                    case 3:
                        j12 = ProtoAdapter.UINT64.decode(reader).longValue();
                        continue;
                    case 4:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        switch (g11) {
                            case 102:
                                l11 = ProtoAdapter.UINT64.decode(reader);
                                break;
                            case 103:
                                l12 = ProtoAdapter.UINT64.decode(reader);
                                break;
                            case 104:
                                num = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 105:
                                num3 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 106:
                                num2 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 107:
                                str = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.m(g11);
                                break;
                        }
                }
                j12 = j13;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.j() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.j()));
            }
            if (value.o() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.o()));
            }
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.f()));
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.d()));
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.h()));
            }
            if (!kotlin.jvm.internal.s.c(value.m(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.m());
            }
            if (value.k() != null) {
                c.f39264g.encodeWithTag(writer, 1, value.k());
            }
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            protoAdapter.encodeWithTag(writer, 102, value.i());
            protoAdapter.encodeWithTag(writer, 103, value.n());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(writer, 104, value.e());
            protoAdapter2.encodeWithTag(writer, 105, value.c());
            protoAdapter2.encodeWithTag(writer, 106, value.g());
            ProtoAdapter.STRING.encodeWithTag(writer, 107, value.l());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.j() != 0) {
                z11 += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.j()));
            }
            if (value.o() != 0) {
                z11 += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.o()));
            }
            if (value.f() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.f()));
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.d()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.h()));
            }
            if (!kotlin.jvm.internal.s.c(value.m(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(7, value.m());
            }
            if (value.k() != null) {
                z11 += c.f39264g.encodedSizeWithTag(1, value.k());
            }
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(102, value.i()) + protoAdapter.encodedSizeWithTag(103, value.n());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            return encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(104, value.e()) + protoAdapter2.encodedSizeWithTag(105, value.c()) + protoAdapter2.encodedSizeWithTag(106, value.g()) + ProtoAdapter.STRING.encodedSizeWithTag(107, value.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s redact(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            c k11 = value.k();
            return s.b(value, 0L, 0L, 0, 0, 0, null, k11 == null ? null : c.f39264g.redact(k11), null, null, null, null, null, null, okio.i.f42656d, 8127, null);
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

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: g */
        public static final ProtoAdapter<c> f39264g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39265a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39266b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39267c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39268d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39269e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39270f;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SoftwareUpdate.SoftwareUpdateStatus", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                kt.u uVar5 = null;
                kt.u uVar6 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.g());
                protoAdapter.encodeWithTag(writer, 2, value.e());
                protoAdapter.encodeWithTag(writer, 3, value.f());
                protoAdapter.encodeWithTag(writer, 4, value.b());
                protoAdapter.encodeWithTag(writer, 5, value.d());
                protoAdapter.encodeWithTag(writer, 6, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.g()) + protoAdapter.encodedSizeWithTag(2, value.e()) + protoAdapter.encodedSizeWithTag(3, value.f()) + protoAdapter.encodedSizeWithTag(4, value.b()) + protoAdapter.encodedSizeWithTag(5, value.d()) + protoAdapter.encodedSizeWithTag(6, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u g11 = value.g();
                kt.u redact = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u e11 = value.e();
                kt.u redact2 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u f11 = value.f();
                kt.u redact3 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u b11 = value.b();
                kt.u redact4 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                kt.u redact5 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u c11 = value.c();
                return value.a(redact, redact2, redact3, redact4, redact5, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39264g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) == 0 ? uVar6 : null, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, unknownFields);
        }

        public final kt.u b() {
            return this.f39268d;
        }

        public final kt.u c() {
            return this.f39270f;
        }

        public final kt.u d() {
            return this.f39269e;
        }

        public final kt.u e() {
            return this.f39266b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39265a, cVar.f39265a) && kotlin.jvm.internal.s.c(this.f39266b, cVar.f39266b) && kotlin.jvm.internal.s.c(this.f39267c, cVar.f39267c) && kotlin.jvm.internal.s.c(this.f39268d, cVar.f39268d) && kotlin.jvm.internal.s.c(this.f39269e, cVar.f39269e) && kotlin.jvm.internal.s.c(this.f39270f, cVar.f39270f);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39267c;
        }

        public final kt.u g() {
            return this.f39265a;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39265a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39266b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39267c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39268d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39269e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39270f;
                int hashCode7 = hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m797newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39265a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39266b;
            if (uVar2 != null) {
                arrayList.add("Installing=" + uVar2);
            }
            kt.u uVar3 = this.f39267c;
            if (uVar3 != null) {
                arrayList.add("Scheduled=" + uVar3);
            }
            kt.u uVar4 = this.f39268d;
            if (uVar4 != null) {
                arrayList.add("Available=" + uVar4);
            }
            kt.u uVar5 = this.f39269e;
            if (uVar5 != null) {
                arrayList.add("DownloadingWifiWait=" + uVar5);
            }
            kt.u uVar6 = this.f39270f;
            if (uVar6 != null) {
                arrayList.add("Downloading=" + uVar6);
            }
            l02 = e0.l0(arrayList, ", ", "SoftwareUpdateStatus{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m797newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            super(f39264g, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39265a = uVar;
            this.f39266b = uVar2;
            this.f39267c = uVar3;
            this.f39268d = uVar4;
            this.f39269e = uVar5;
            this.f39270f = uVar6;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Installing, Scheduled, Available, DownloadingWifiWait, Downloading may be non-null".toString());
            }
        }
    }

    static {
        new b(null);
        f39250n = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(s.class), com.squareup.wire.o.PROTO_3);
    }

    public s() {
        this(0L, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ s(long j11, long j12, int i11, int i12, int i13, String str, c cVar, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str2, okio.i iVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j11, (i14 & 2) == 0 ? j12 : 0L, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) == 0 ? i13 : 0, (i14 & 32) != 0 ? "" : str, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? null : l11, (i14 & 256) != 0 ? null : l12, (i14 & 512) != 0 ? null : num, (i14 & 1024) != 0 ? null : num2, (i14 & 2048) != 0 ? null : num3, (i14 & 4096) != 0 ? null : str2, (i14 & PKIFailureInfo.certRevoked) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s b(s sVar, long j11, long j12, int i11, int i12, int i13, String str, c cVar, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str2, okio.i iVar, int i14, Object obj) {
        return sVar.a((i14 & 1) != 0 ? sVar.f39251a : j11, (i14 & 2) != 0 ? sVar.f39252b : j12, (i14 & 4) != 0 ? sVar.f39253c : i11, (i14 & 8) != 0 ? sVar.f39254d : i12, (i14 & 16) != 0 ? sVar.f39255e : i13, (i14 & 32) != 0 ? sVar.f39256f : str, (i14 & 64) != 0 ? sVar.f39257g : cVar, (i14 & 128) != 0 ? sVar.f39258h : l11, (i14 & 256) != 0 ? sVar.f39259i : l12, (i14 & 512) != 0 ? sVar.f39260j : num, (i14 & 1024) != 0 ? sVar.f39261k : num2, (i14 & 2048) != 0 ? sVar.f39262l : num3, (i14 & 4096) != 0 ? sVar.f39263m : str2, (i14 & PKIFailureInfo.certRevoked) != 0 ? sVar.unknownFields() : iVar);
    }

    public final s a(long j11, long j12, int i11, int i12, int i13, String version_OBSOLETE, c cVar, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(version_OBSOLETE, "version_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s(j11, j12, i11, i12, i13, version_OBSOLETE, cVar, l11, l12, num, num2, num3, str, unknownFields);
    }

    public final Integer c() {
        return this.f39261k;
    }

    public final int d() {
        return this.f39254d;
    }

    public final Integer e() {
        return this.f39260j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), sVar.unknownFields()) && this.f39251a == sVar.f39251a && this.f39252b == sVar.f39252b && this.f39253c == sVar.f39253c && this.f39254d == sVar.f39254d && this.f39255e == sVar.f39255e && kotlin.jvm.internal.s.c(this.f39256f, sVar.f39256f) && kotlin.jvm.internal.s.c(this.f39257g, sVar.f39257g) && kotlin.jvm.internal.s.c(this.f39258h, sVar.f39258h) && kotlin.jvm.internal.s.c(this.f39259i, sVar.f39259i) && kotlin.jvm.internal.s.c(this.f39260j, sVar.f39260j) && kotlin.jvm.internal.s.c(this.f39261k, sVar.f39261k) && kotlin.jvm.internal.s.c(this.f39262l, sVar.f39262l) && kotlin.jvm.internal.s.c(this.f39263m, sVar.f39263m);
        }
        return false;
    }

    public final int f() {
        return this.f39253c;
    }

    public final Integer g() {
        return this.f39262l;
    }

    public final int h() {
        return this.f39255e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.f39251a)) * 37) + Long.hashCode(this.f39252b)) * 37) + Integer.hashCode(this.f39253c)) * 37) + Integer.hashCode(this.f39254d)) * 37) + Integer.hashCode(this.f39255e)) * 37) + this.f39256f.hashCode()) * 37;
            c cVar = this.f39257g;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
            Long l11 = this.f39258h;
            int hashCode3 = (hashCode2 + (l11 != null ? l11.hashCode() : 0)) * 37;
            Long l12 = this.f39259i;
            int hashCode4 = (hashCode3 + (l12 != null ? l12.hashCode() : 0)) * 37;
            Integer num = this.f39260j;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f39261k;
            int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Integer num3 = this.f39262l;
            int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
            String str = this.f39263m;
            int hashCode8 = hashCode7 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }
        return i11;
    }

    public final Long i() {
        return this.f39258h;
    }

    public final long j() {
        return this.f39251a;
    }

    public final c k() {
        return this.f39257g;
    }

    public final String l() {
        return this.f39263m;
    }

    public final String m() {
        return this.f39256f;
    }

    public final Long n() {
        return this.f39259i;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m796newBuilder();
    }

    public final long o() {
        return this.f39252b;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f39251a;
        arrayList.add("scheduled_time_ms_OBSOLETE=" + j11);
        long j12 = this.f39252b;
        arrayList.add("warning_time_remaining_ms_OBSOLETE=" + j12);
        int i11 = this.f39253c;
        arrayList.add("expected_duration_sec_OBSOLETE=" + i11);
        int i12 = this.f39254d;
        arrayList.add("download_perc_OBSOLETE=" + i12);
        int i13 = this.f39255e;
        arrayList.add("install_perc_OBSOLETE=" + i13);
        String i14 = mr.d.i(this.f39256f);
        arrayList.add("version_OBSOLETE=" + i14);
        c cVar = this.f39257g;
        if (cVar != null) {
            arrayList.add("status=" + cVar);
        }
        Long l11 = this.f39258h;
        if (l11 != null) {
            arrayList.add("scheduled_time_ms=" + l11);
        }
        Long l12 = this.f39259i;
        if (l12 != null) {
            arrayList.add("warning_time_remaining_ms=" + l12);
        }
        Integer num = this.f39260j;
        if (num != null) {
            arrayList.add("expected_duration_sec=" + num);
        }
        Integer num2 = this.f39261k;
        if (num2 != null) {
            arrayList.add("download_perc=" + num2);
        }
        Integer num3 = this.f39262l;
        if (num3 != null) {
            arrayList.add("install_perc=" + num3);
        }
        String str = this.f39263m;
        if (str != null) {
            String i15 = mr.d.i(str);
            arrayList.add("version=" + i15);
        }
        l02 = e0.l0(arrayList, ", ", "SoftwareUpdate{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m796newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j11, long j12, int i11, int i12, int i13, String version_OBSOLETE, c cVar, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str, okio.i unknownFields) {
        super(f39250n, unknownFields);
        kotlin.jvm.internal.s.g(version_OBSOLETE, "version_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39251a = j11;
        this.f39252b = j12;
        this.f39253c = i11;
        this.f39254d = i12;
        this.f39255e = i13;
        this.f39256f = version_OBSOLETE;
        this.f39257g = cVar;
        this.f39258h = l11;
        this.f39259i = l12;
        this.f39260j = num;
        this.f39261k = num2;
        this.f39262l = num3;
        this.f39263m = str;
    }
}