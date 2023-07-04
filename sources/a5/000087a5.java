package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;

/* loaded from: classes6.dex */
public final class q extends com.squareup.wire.f {

    /* renamed from: n  reason: collision with root package name */
    public static final ProtoAdapter<q> f39233n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.MediaPlaybackStatus#ADAPTER", jsonName = "mediaPlaybackStatus", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.g f39234a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolume", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final Float f39235b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingDuration", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final Integer f39236c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingElapsed", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final Integer f39237d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaInfo$MediaSourceType#ADAPTER", jsonName = "nowPlayingSource", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final c f39238e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingSourceString", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final String f39239f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingArtist", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final String f39240g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingTitle", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final String f39241h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingAlbum", tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final String f39242i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingStation", tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final String f39243j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeIncrement", tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final Float f39244k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeMax", tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final Float f39245l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "a2dpSourceName", tag = 15)

    /* renamed from: m  reason: collision with root package name */
    private final String f39246m;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q> {
        a(com.squareup.wire.b bVar, n00.d<q> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q decode(com.squareup.wire.k reader) {
            long j11;
            kt.g gVar;
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.g gVar2 = null;
            Float f11 = null;
            Integer num = null;
            Integer num2 = null;
            c cVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f12 = null;
            String str6 = null;
            Float f13 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q(gVar2, f11, num, num2, cVar, str, str2, str3, str4, str5, f12, f13, str6, reader.e(d11));
                }
                if (g11 != 15) {
                    switch (g11) {
                        case 1:
                            j11 = d11;
                            gVar = gVar2;
                            try {
                                gVar2 = kt.g.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                break;
                            }
                        case 2:
                            j11 = d11;
                            f11 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 3:
                            j11 = d11;
                            num = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 4:
                            j11 = d11;
                            num2 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 5:
                            try {
                                cVar = c.ADAPTER.decode(reader);
                                j11 = d11;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                j11 = d11;
                                gVar = gVar2;
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                break;
                            }
                        case 6:
                            str = ProtoAdapter.STRING.decode(reader);
                            j11 = d11;
                            break;
                        case 7:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            j11 = d11;
                            break;
                        case 8:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            j11 = d11;
                            break;
                        case 9:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            j11 = d11;
                            break;
                        case 10:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            j11 = d11;
                            break;
                        case 11:
                            f12 = ProtoAdapter.FLOAT.decode(reader);
                            j11 = d11;
                            break;
                        case 12:
                            f13 = ProtoAdapter.FLOAT.decode(reader);
                            j11 = d11;
                            break;
                        default:
                            reader.m(g11);
                            j11 = d11;
                            gVar = gVar2;
                            gVar2 = gVar;
                            break;
                    }
                } else {
                    j11 = d11;
                    str6 = ProtoAdapter.STRING.decode(reader);
                }
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            kt.g.ADAPTER.encodeWithTag(writer, 1, value.g());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 2, value.d());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 3, value.j());
            protoAdapter2.encodeWithTag(writer, 4, value.k());
            c.ADAPTER.encodeWithTag(writer, 5, value.l());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(writer, 6, value.m());
            protoAdapter3.encodeWithTag(writer, 7, value.i());
            protoAdapter3.encodeWithTag(writer, 8, value.o());
            protoAdapter3.encodeWithTag(writer, 9, value.h());
            protoAdapter3.encodeWithTag(writer, 10, value.n());
            protoAdapter.encodeWithTag(writer, 11, value.e());
            protoAdapter.encodeWithTag(writer, 12, value.f());
            protoAdapter3.encodeWithTag(writer, 15, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z() + kt.g.ADAPTER.encodedSizeWithTag(1, value.g());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(2, value.d());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.j()) + protoAdapter2.encodedSizeWithTag(4, value.k()) + c.ADAPTER.encodedSizeWithTag(5, value.l());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, value.m()) + protoAdapter3.encodedSizeWithTag(7, value.i()) + protoAdapter3.encodedSizeWithTag(8, value.o()) + protoAdapter3.encodedSizeWithTag(9, value.h()) + protoAdapter3.encodedSizeWithTag(10, value.n()) + protoAdapter.encodedSizeWithTag(11, value.e()) + protoAdapter.encodedSizeWithTag(12, value.f()) + protoAdapter3.encodedSizeWithTag(15, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q redact(q value) {
            kotlin.jvm.internal.s.g(value, "value");
            return q.b(value, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, 8191, null);
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
    public enum c implements com.squareup.wire.p {
        msNone(0),
        msAM(1),
        msFM(2),
        msXM(3),
        msSlacker(5),
        msLocalFiles(6),
        msiPod(7),
        msBluetooth(8),
        msAuxIn(9),
        msDAB(10),
        msRdio(11),
        msSpotify(12),
        msUSRadio(13),
        msEURadio(14),
        msMediaFile(16),
        msTuneIn(17),
        msStingray(18),
        msSiriusXM(19),
        msTidal(20),
        msQQMusic(21),
        msQQMusic2(22),
        msXimalaya(23),
        msOnlineRadio(24),
        msOnlineRadio2(25),
        msNetEaseMusic(26),
        msAppleMusic(27),
        msBrowser(28),
        msTheater(29),
        msGame(30),
        msTutorial(31),
        msToybox(32),
        msRecentsFavorites(33),
        msHomeApps(34),
        msSearch(35);
        
        public static final ProtoAdapter<c> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<c> {
            a(n00.d<c> dVar, com.squareup.wire.o oVar, c cVar) {
                super(dVar, oVar, cVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c d(int i11) {
                return c.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int i11) {
                switch (i11) {
                    case 0:
                        return c.msNone;
                    case 1:
                        return c.msAM;
                    case 2:
                        return c.msFM;
                    case 3:
                        return c.msXM;
                    case 4:
                    case 15:
                    default:
                        return null;
                    case 5:
                        return c.msSlacker;
                    case 6:
                        return c.msLocalFiles;
                    case 7:
                        return c.msiPod;
                    case 8:
                        return c.msBluetooth;
                    case 9:
                        return c.msAuxIn;
                    case 10:
                        return c.msDAB;
                    case 11:
                        return c.msRdio;
                    case 12:
                        return c.msSpotify;
                    case 13:
                        return c.msUSRadio;
                    case 14:
                        return c.msEURadio;
                    case 16:
                        return c.msMediaFile;
                    case 17:
                        return c.msTuneIn;
                    case 18:
                        return c.msStingray;
                    case 19:
                        return c.msSiriusXM;
                    case 20:
                        return c.msTidal;
                    case 21:
                        return c.msQQMusic;
                    case 22:
                        return c.msQQMusic2;
                    case 23:
                        return c.msXimalaya;
                    case 24:
                        return c.msOnlineRadio;
                    case 25:
                        return c.msOnlineRadio2;
                    case 26:
                        return c.msNetEaseMusic;
                    case 27:
                        return c.msAppleMusic;
                    case 28:
                        return c.msBrowser;
                    case 29:
                        return c.msTheater;
                    case 30:
                        return c.msGame;
                    case 31:
                        return c.msTutorial;
                    case 32:
                        return c.msToybox;
                    case 33:
                        return c.msRecentsFavorites;
                    case 34:
                        return c.msHomeApps;
                    case 35:
                        return c.msSearch;
                }
            }
        }

        static {
            c cVar;
            ADAPTER = new a(m0.b(c.class), com.squareup.wire.o.PROTO_3, cVar);
        }

        c(int i11) {
            this.value = i11;
        }

        public static final c fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new b(null);
        f39233n = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(q.class), com.squareup.wire.o.PROTO_3);
    }

    public q() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ q(kt.g gVar, Float f11, Integer num, Integer num2, c cVar, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : gVar, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : cVar, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : f12, (i11 & 2048) != 0 ? null : f13, (i11 & 4096) == 0 ? str6 : null, (i11 & PKIFailureInfo.certRevoked) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ q b(q qVar, kt.g gVar, Float f11, Integer num, Integer num2, c cVar, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.i iVar, int i11, Object obj) {
        return qVar.a((i11 & 1) != 0 ? qVar.f39234a : gVar, (i11 & 2) != 0 ? qVar.f39235b : f11, (i11 & 4) != 0 ? qVar.f39236c : num, (i11 & 8) != 0 ? qVar.f39237d : num2, (i11 & 16) != 0 ? qVar.f39238e : cVar, (i11 & 32) != 0 ? qVar.f39239f : str, (i11 & 64) != 0 ? qVar.f39240g : str2, (i11 & 128) != 0 ? qVar.f39241h : str3, (i11 & 256) != 0 ? qVar.f39242i : str4, (i11 & 512) != 0 ? qVar.f39243j : str5, (i11 & 1024) != 0 ? qVar.f39244k : f12, (i11 & 2048) != 0 ? qVar.f39245l : f13, (i11 & 4096) != 0 ? qVar.f39246m : str6, (i11 & PKIFailureInfo.certRevoked) != 0 ? qVar.unknownFields() : iVar);
    }

    public final q a(kt.g gVar, Float f11, Integer num, Integer num2, c cVar, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q(gVar, f11, num, num2, cVar, str, str2, str3, str4, str5, f12, f13, str6, unknownFields);
    }

    public final String c() {
        return this.f39246m;
    }

    public final Float d() {
        return this.f39235b;
    }

    public final Float e() {
        return this.f39244k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), qVar.unknownFields()) && this.f39234a == qVar.f39234a && kotlin.jvm.internal.s.b(this.f39235b, qVar.f39235b) && kotlin.jvm.internal.s.c(this.f39236c, qVar.f39236c) && kotlin.jvm.internal.s.c(this.f39237d, qVar.f39237d) && this.f39238e == qVar.f39238e && kotlin.jvm.internal.s.c(this.f39239f, qVar.f39239f) && kotlin.jvm.internal.s.c(this.f39240g, qVar.f39240g) && kotlin.jvm.internal.s.c(this.f39241h, qVar.f39241h) && kotlin.jvm.internal.s.c(this.f39242i, qVar.f39242i) && kotlin.jvm.internal.s.c(this.f39243j, qVar.f39243j) && kotlin.jvm.internal.s.b(this.f39244k, qVar.f39244k) && kotlin.jvm.internal.s.b(this.f39245l, qVar.f39245l) && kotlin.jvm.internal.s.c(this.f39246m, qVar.f39246m);
        }
        return false;
    }

    public final Float f() {
        return this.f39245l;
    }

    public final kt.g g() {
        return this.f39234a;
    }

    public final String h() {
        return this.f39242i;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            kt.g gVar = this.f39234a;
            int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 37;
            Float f11 = this.f39235b;
            int hashCode3 = (hashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Integer num = this.f39236c;
            int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f39237d;
            int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
            c cVar = this.f39238e;
            int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            String str = this.f39239f;
            int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.f39240g;
            int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.f39241h;
            int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.f39242i;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.f39243j;
            int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Float f12 = this.f39244k;
            int hashCode12 = (hashCode11 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.f39245l;
            int hashCode13 = (hashCode12 + (f13 != null ? f13.hashCode() : 0)) * 37;
            String str6 = this.f39246m;
            int hashCode14 = hashCode13 + (str6 != null ? str6.hashCode() : 0);
            this.hashCode = hashCode14;
            return hashCode14;
        }
        return i11;
    }

    public final String i() {
        return this.f39240g;
    }

    public final Integer j() {
        return this.f39236c;
    }

    public final Integer k() {
        return this.f39237d;
    }

    public final c l() {
        return this.f39238e;
    }

    public final String m() {
        return this.f39239f;
    }

    public final String n() {
        return this.f39243j;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m794newBuilder();
    }

    public final String o() {
        return this.f39241h;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.g gVar = this.f39234a;
        if (gVar != null) {
            arrayList.add("media_playback_status=" + gVar);
        }
        Float f11 = this.f39235b;
        if (f11 != null) {
            arrayList.add("audio_volume=" + f11);
        }
        Integer num = this.f39236c;
        if (num != null) {
            arrayList.add("now_playing_duration=" + num);
        }
        Integer num2 = this.f39237d;
        if (num2 != null) {
            arrayList.add("now_playing_elapsed=" + num2);
        }
        c cVar = this.f39238e;
        if (cVar != null) {
            arrayList.add("now_playing_source=" + cVar);
        }
        String str = this.f39239f;
        if (str != null) {
            String i11 = mr.d.i(str);
            arrayList.add("now_playing_source_string=" + i11);
        }
        String str2 = this.f39240g;
        if (str2 != null) {
            String i12 = mr.d.i(str2);
            arrayList.add("now_playing_artist=" + i12);
        }
        String str3 = this.f39241h;
        if (str3 != null) {
            String i13 = mr.d.i(str3);
            arrayList.add("now_playing_title=" + i13);
        }
        String str4 = this.f39242i;
        if (str4 != null) {
            String i14 = mr.d.i(str4);
            arrayList.add("now_playing_album=" + i14);
        }
        String str5 = this.f39243j;
        if (str5 != null) {
            String i15 = mr.d.i(str5);
            arrayList.add("now_playing_station=" + i15);
        }
        Float f12 = this.f39244k;
        if (f12 != null) {
            arrayList.add("audio_volume_increment=" + f12);
        }
        Float f13 = this.f39245l;
        if (f13 != null) {
            arrayList.add("audio_volume_max=" + f13);
        }
        String str6 = this.f39246m;
        if (str6 != null) {
            String i16 = mr.d.i(str6);
            arrayList.add("a2dp_source_name=" + i16);
        }
        l02 = e0.l0(arrayList, ", ", "MediaInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m794newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kt.g gVar, Float f11, Integer num, Integer num2, c cVar, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.i unknownFields) {
        super(f39233n, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39234a = gVar;
        this.f39235b = f11;
        this.f39236c = num;
        this.f39237d = num2;
        this.f39238e = cVar;
        this.f39239f = str;
        this.f39240g = str2;
        this.f39241h = str3;
        this.f39242i = str4;
        this.f39243j = str5;
        this.f39244k = f12;
        this.f39245l = f13;
        this.f39246m = str6;
    }
}