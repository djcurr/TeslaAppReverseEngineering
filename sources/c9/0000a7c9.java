package ov;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kt.u;
import okhttp3.internal.http2.Http2Connection;
import okio.i;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: p2  reason: collision with root package name */
    public static final ProtoAdapter<b> f44703p2;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayTeslapn", label = q.a.OMIT_IDENTITY, tag = 23)
    private final String A;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$Shorted12VCellTestMode#ADAPTER", jsonName = "shorted12vCellTestMode", label = q.a.OMIT_IDENTITY, tag = 24)
    private final e B;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayVersion", label = q.a.OMIT_IDENTITY, tag = 25)
    private final String C;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplaySerialNumber", label = q.a.OMIT_IDENTITY, tag = 26)
    private final String E;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayPartNumber", label = q.a.OMIT_IDENTITY, tag = 27)
    private final String F;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayAssemblyNumber", label = q.a.OMIT_IDENTITY, tag = 28)
    private final String G;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayModel", label = q.a.OMIT_IDENTITY, tag = 29)
    private final String H;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayTouchControllerType", label = q.a.OMIT_IDENTITY, tag = 30)
    private final String K;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "centerDisplayTouchFirmwareVersion", label = q.a.OMIT_IDENTITY, tag = 31)
    private final String L;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "centerDisplayTemperature", label = q.a.OMIT_IDENTITY, tag = 32)
    private final float O;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayVersion", label = q.a.OMIT_IDENTITY, tag = 33)
    private final String P;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplaySerialNumber", label = q.a.OMIT_IDENTITY, tag = 34)
    private final String Q;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icuDisplayPartNumber", label = q.a.OMIT_IDENTITY, tag = 43)
    private final String Q1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayPartNumber", label = q.a.OMIT_IDENTITY, tag = 35)
    private final String R;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayAssemblyNumber", label = q.a.OMIT_IDENTITY, tag = 36)
    private final String T;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icuDisplayAssemblyNumber", label = q.a.OMIT_IDENTITY, tag = 44)
    private final String V1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayModel", label = q.a.OMIT_IDENTITY, tag = 37)
    private final String Y;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autoPresentHandles", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f44704a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navMapRelease", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f44705b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayTouchControllerType", label = q.a.OMIT_IDENTITY, tag = 38)

    /* renamed from: b1  reason: collision with root package name */
    private final String f44706b1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icuDisplayModel", label = q.a.OMIT_IDENTITY, tag = 45)

    /* renamed from: b2  reason: collision with root package name */
    private final String f44707b2;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cfgPackmass", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f44708c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "walkUpUnlock", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f44709d;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallBackupAntenna", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final c f44710e;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallGpsAntenna", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final c f44711f;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallSpeaker", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final c f44712g;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rearDisplayTouchFirmwareVersion", label = q.a.OMIT_IDENTITY, tag = 39)

    /* renamed from: g1  reason: collision with root package name */
    private final String f44713g1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "icuDisplayTemperature", label = q.a.OMIT_IDENTITY, tag = 46)

    /* renamed from: g2  reason: collision with root package name */
    private final float f44714g2;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallMicrophone", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final c f44715h;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallSimStatus", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final c f44716i;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallEnsSignal", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final c f44717j;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallCellStatus", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final c f44718k;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallModemFirmwareOk", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final c f44719l;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallComponentStatus#ADAPTER", jsonName = "ecallManualButton", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: m  reason: collision with root package name */
    private final c f44720m;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "ecallNrqstAvg", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: n  reason: collision with root package name */
    private final float f44721n;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "ecallAnaMicRmsAmp", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: o  reason: collision with root package name */
    private final float f44722o;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "ecallDigMicRmsAmp", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: p  reason: collision with root package name */
    private final float f44723p;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "rearDisplayTemperature", label = q.a.OMIT_IDENTITY, tag = 40)

    /* renamed from: p1  reason: collision with root package name */
    private final float f44724p1;
    @q(adapter = "com.teslamotors.protocol.M3ProductVitals$ECallMicType#ADAPTER", jsonName = "ecallActiveMicType", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: q  reason: collision with root package name */
    private final d f44725q;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ecallNumber", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: t  reason: collision with root package name */
    private final String f44726t;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ecallCallCount", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: w  reason: collision with root package name */
    private final int f44727w;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "edidVersion", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: x  reason: collision with root package name */
    private final String f44728x;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icuDisplayVersion", label = q.a.OMIT_IDENTITY, tag = 41)

    /* renamed from: x1  reason: collision with root package name */
    private final String f44729x1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displaySn", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: y  reason: collision with root package name */
    private final String f44730y;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icuDisplaySerialNumber", label = q.a.OMIT_IDENTITY, tag = 42)

    /* renamed from: y1  reason: collision with root package name */
    private final String f44731y1;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayFatpsn", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: z  reason: collision with root package name */
    private final String f44732z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.M3ProductVitals", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            c cVar = null;
            int i11 = 0;
            int i12 = 0;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            c cVar2 = null;
            c cVar3 = null;
            c cVar4 = null;
            c cVar5 = null;
            c cVar6 = null;
            c cVar7 = null;
            c cVar8 = null;
            d dVar = null;
            e eVar = null;
            String str = "";
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            String str6 = str5;
            String str7 = str6;
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            String str11 = str10;
            String str12 = str11;
            String str13 = str12;
            String str14 = str13;
            String str15 = str14;
            String str16 = str15;
            String str17 = str16;
            String str18 = str17;
            String str19 = str18;
            String str20 = str19;
            String str21 = str20;
            String str22 = str21;
            String str23 = str22;
            String str24 = str23;
            String str25 = str24;
            String str26 = str25;
            String str27 = str26;
            c cVar9 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(str, str2, i11, str3, cVar, cVar2, cVar3, cVar9, cVar4, cVar5, cVar6, cVar7, cVar8, f11, f12, f13, dVar, str4, i12, str5, str6, str7, str8, eVar, str9, str10, str11, str12, str13, str14, str15, f14, str16, str17, str18, str19, str20, str21, str22, f15, str23, str24, str25, str26, str27, f16, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        String decode = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var = b0.f54756a;
                        str = decode;
                        break;
                    case 2:
                        String decode2 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var2 = b0.f54756a;
                        str2 = decode2;
                        break;
                    case 3:
                        int intValue = ProtoAdapter.INT32.decode(reader).intValue();
                        b0 b0Var3 = b0.f54756a;
                        i11 = intValue;
                        break;
                    case 4:
                        String decode3 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var4 = b0.f54756a;
                        str3 = decode3;
                        break;
                    case 5:
                        cVar = c.f44733g.decode(reader);
                        b0 b0Var5 = b0.f54756a;
                        break;
                    case 6:
                        cVar2 = c.f44733g.decode(reader);
                        b0 b0Var6 = b0.f54756a;
                        break;
                    case 7:
                        cVar3 = c.f44733g.decode(reader);
                        b0 b0Var7 = b0.f54756a;
                        break;
                    case 8:
                        cVar9 = c.f44733g.decode(reader);
                        b0 b0Var8 = b0.f54756a;
                        break;
                    case 9:
                        c decode4 = c.f44733g.decode(reader);
                        b0 b0Var9 = b0.f54756a;
                        cVar4 = decode4;
                        break;
                    case 10:
                        c decode5 = c.f44733g.decode(reader);
                        b0 b0Var10 = b0.f54756a;
                        cVar5 = decode5;
                        break;
                    case 11:
                        c decode6 = c.f44733g.decode(reader);
                        b0 b0Var11 = b0.f54756a;
                        cVar6 = decode6;
                        break;
                    case 12:
                        c decode7 = c.f44733g.decode(reader);
                        b0 b0Var12 = b0.f54756a;
                        cVar7 = decode7;
                        break;
                    case 13:
                        c decode8 = c.f44733g.decode(reader);
                        b0 b0Var13 = b0.f54756a;
                        cVar8 = decode8;
                        break;
                    case 14:
                        float floatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var14 = b0.f54756a;
                        f11 = floatValue;
                        break;
                    case 15:
                        float floatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var15 = b0.f54756a;
                        f12 = floatValue2;
                        break;
                    case 16:
                        float floatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var16 = b0.f54756a;
                        f13 = floatValue3;
                        break;
                    case 17:
                        d decode9 = d.f44740d.decode(reader);
                        b0 b0Var17 = b0.f54756a;
                        dVar = decode9;
                        break;
                    case 18:
                        String decode10 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var18 = b0.f54756a;
                        str4 = decode10;
                        break;
                    case 19:
                        int intValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        b0 b0Var19 = b0.f54756a;
                        i12 = intValue2;
                        break;
                    case 20:
                        String decode11 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var20 = b0.f54756a;
                        str5 = decode11;
                        break;
                    case 21:
                        String decode12 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var21 = b0.f54756a;
                        str6 = decode12;
                        break;
                    case 22:
                        String decode13 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var22 = b0.f54756a;
                        str7 = decode13;
                        break;
                    case 23:
                        String decode14 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var23 = b0.f54756a;
                        str8 = decode14;
                        break;
                    case 24:
                        e decode15 = e.f44744d.decode(reader);
                        b0 b0Var24 = b0.f54756a;
                        eVar = decode15;
                        break;
                    case 25:
                        String decode16 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var25 = b0.f54756a;
                        str9 = decode16;
                        break;
                    case 26:
                        String decode17 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var26 = b0.f54756a;
                        str10 = decode17;
                        break;
                    case 27:
                        String decode18 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var27 = b0.f54756a;
                        str11 = decode18;
                        break;
                    case 28:
                        String decode19 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var28 = b0.f54756a;
                        str12 = decode19;
                        break;
                    case 29:
                        String decode20 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var29 = b0.f54756a;
                        str13 = decode20;
                        break;
                    case 30:
                        String decode21 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var30 = b0.f54756a;
                        str14 = decode21;
                        break;
                    case 31:
                        String decode22 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var31 = b0.f54756a;
                        str15 = decode22;
                        break;
                    case 32:
                        float floatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var32 = b0.f54756a;
                        f14 = floatValue4;
                        break;
                    case 33:
                        String decode23 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var33 = b0.f54756a;
                        str16 = decode23;
                        break;
                    case 34:
                        String decode24 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var34 = b0.f54756a;
                        str17 = decode24;
                        break;
                    case 35:
                        String decode25 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var35 = b0.f54756a;
                        str18 = decode25;
                        break;
                    case 36:
                        String decode26 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var36 = b0.f54756a;
                        str19 = decode26;
                        break;
                    case 37:
                        String decode27 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var37 = b0.f54756a;
                        str20 = decode27;
                        break;
                    case 38:
                        String decode28 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var38 = b0.f54756a;
                        str21 = decode28;
                        break;
                    case 39:
                        String decode29 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var39 = b0.f54756a;
                        str22 = decode29;
                        break;
                    case 40:
                        float floatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var40 = b0.f54756a;
                        f15 = floatValue5;
                        break;
                    case 41:
                        String decode30 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var41 = b0.f54756a;
                        str23 = decode30;
                        break;
                    case 42:
                        String decode31 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var42 = b0.f54756a;
                        str24 = decode31;
                        break;
                    case 43:
                        String decode32 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var43 = b0.f54756a;
                        str25 = decode32;
                        break;
                    case 44:
                        String decode33 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var44 = b0.f54756a;
                        str26 = decode33;
                        break;
                    case 45:
                        String decode34 = ProtoAdapter.STRING.decode(reader);
                        b0 b0Var45 = b0.f54756a;
                        str27 = decode34;
                        break;
                    case 46:
                        float floatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        b0 b0Var46 = b0.f54756a;
                        f16 = floatValue6;
                        break;
                    default:
                        reader.m(g11);
                        b0 b0Var47 = b0.f54756a;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            if (!s.c(value.L(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.L());
            }
            if (value.l() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.l()));
            }
            if (!s.c(value.V(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.V());
            }
            if (value.r() != null) {
                c.f44733g.encodeWithTag(writer, 5, value.r());
            }
            if (value.w() != null) {
                c.f44733g.encodeWithTag(writer, 6, value.w());
            }
            if (value.D() != null) {
                c.f44733g.encodeWithTag(writer, 7, value.D());
            }
            if (value.y() != null) {
                c.f44733g.encodeWithTag(writer, 8, value.y());
            }
            if (value.C() != null) {
                c.f44733g.encodeWithTag(writer, 9, value.C());
            }
            if (value.v() != null) {
                c.f44733g.encodeWithTag(writer, 10, value.v());
            }
            if (value.t() != null) {
                c.f44733g.encodeWithTag(writer, 11, value.t());
            }
            if (value.z() != null) {
                c.f44733g.encodeWithTag(writer, 12, value.z());
            }
            if (value.x() != null) {
                c.f44733g.encodeWithTag(writer, 13, value.x());
            }
            if (!(value.A() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 14, Float.valueOf(value.A()));
            }
            if (!(value.q() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 15, Float.valueOf(value.q()));
            }
            if (!(value.u() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 16, Float.valueOf(value.u()));
            }
            if (value.p() != null) {
                d.f44740d.encodeWithTag(writer, 17, value.p());
            }
            if (!s.c(value.B(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 18, value.B());
            }
            if (value.s() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.s()));
            }
            if (!s.c(value.E(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 20, value.E());
            }
            if (!s.c(value.n(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 21, value.n());
            }
            if (!s.c(value.m(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 22, value.m());
            }
            if (!s.c(value.o(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 23, value.o());
            }
            if (value.U() != null) {
                e.f44744d.encodeWithTag(writer, 24, value.U());
            }
            if (!s.c(value.k(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 25, value.k());
            }
            if (!s.c(value.g(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 26, value.g());
            }
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 27, value.f());
            }
            if (!s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 28, value.d());
            }
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 29, value.e());
            }
            if (!s.c(value.i(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 30, value.i());
            }
            if (!s.c(value.j(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 31, value.j());
            }
            if (!(value.h() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 32, Float.valueOf(value.h()));
            }
            if (!s.c(value.T(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 33, value.T());
            }
            if (!s.c(value.P(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 34, value.P());
            }
            if (!s.c(value.O(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 35, value.O());
            }
            if (!s.c(value.M(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 36, value.M());
            }
            if (!s.c(value.N(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 37, value.N());
            }
            if (!s.c(value.R(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 38, value.R());
            }
            if (!s.c(value.S(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 39, value.S());
            }
            if (!(value.Q() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 40, Float.valueOf(value.Q()));
            }
            if (!s.c(value.K(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 41, value.K());
            }
            if (!s.c(value.I(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 42, value.I());
            }
            if (!s.c(value.H(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 43, value.H());
            }
            if (!s.c(value.F(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 44, value.F());
            }
            if (!s.c(value.G(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 45, value.G());
            }
            if (!(value.J() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 46, Float.valueOf(value.J()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.c());
            }
            if (!s.c(value.L(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.L());
            }
            if (value.l() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.l()));
            }
            if (!s.c(value.V(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.V());
            }
            if (value.r() != null) {
                z11 += c.f44733g.encodedSizeWithTag(5, value.r());
            }
            if (value.w() != null) {
                z11 += c.f44733g.encodedSizeWithTag(6, value.w());
            }
            if (value.D() != null) {
                z11 += c.f44733g.encodedSizeWithTag(7, value.D());
            }
            if (value.y() != null) {
                z11 += c.f44733g.encodedSizeWithTag(8, value.y());
            }
            if (value.C() != null) {
                z11 += c.f44733g.encodedSizeWithTag(9, value.C());
            }
            if (value.v() != null) {
                z11 += c.f44733g.encodedSizeWithTag(10, value.v());
            }
            if (value.t() != null) {
                z11 += c.f44733g.encodedSizeWithTag(11, value.t());
            }
            if (value.z() != null) {
                z11 += c.f44733g.encodedSizeWithTag(12, value.z());
            }
            if (value.x() != null) {
                z11 += c.f44733g.encodedSizeWithTag(13, value.x());
            }
            if (!(value.A() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(14, Float.valueOf(value.A()));
            }
            if (!(value.q() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(15, Float.valueOf(value.q()));
            }
            if (!(value.u() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(16, Float.valueOf(value.u()));
            }
            if (value.p() != null) {
                z11 += d.f44740d.encodedSizeWithTag(17, value.p());
            }
            if (!s.c(value.B(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(18, value.B());
            }
            if (value.s() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.s()));
            }
            if (!s.c(value.E(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(20, value.E());
            }
            if (!s.c(value.n(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(21, value.n());
            }
            if (!s.c(value.m(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(22, value.m());
            }
            if (!s.c(value.o(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(23, value.o());
            }
            if (value.U() != null) {
                z11 += e.f44744d.encodedSizeWithTag(24, value.U());
            }
            if (!s.c(value.k(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(25, value.k());
            }
            if (!s.c(value.g(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(26, value.g());
            }
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(27, value.f());
            }
            if (!s.c(value.d(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(28, value.d());
            }
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(29, value.e());
            }
            if (!s.c(value.i(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(30, value.i());
            }
            if (!s.c(value.j(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(31, value.j());
            }
            if (!(value.h() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(32, Float.valueOf(value.h()));
            }
            if (!s.c(value.T(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(33, value.T());
            }
            if (!s.c(value.P(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(34, value.P());
            }
            if (!s.c(value.O(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(35, value.O());
            }
            if (!s.c(value.M(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(36, value.M());
            }
            if (!s.c(value.N(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(37, value.N());
            }
            if (!s.c(value.R(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(38, value.R());
            }
            if (!s.c(value.S(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(39, value.S());
            }
            if (!(value.Q() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(40, Float.valueOf(value.Q()));
            }
            if (!s.c(value.K(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(41, value.K());
            }
            if (!s.c(value.I(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(42, value.I());
            }
            if (!s.c(value.H(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(43, value.H());
            }
            if (!s.c(value.F(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(44, value.F());
            }
            if (!s.c(value.G(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(45, value.G());
            }
            return !(value.J() == BitmapDescriptorFactory.HUE_RED) ? z11 + ProtoAdapter.FLOAT.encodedSizeWithTag(46, Float.valueOf(value.J())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            c r11 = value.r();
            c redact = r11 == null ? null : c.f44733g.redact(r11);
            c w11 = value.w();
            c redact2 = w11 == null ? null : c.f44733g.redact(w11);
            c D = value.D();
            c redact3 = D == null ? null : c.f44733g.redact(D);
            c y11 = value.y();
            c redact4 = y11 == null ? null : c.f44733g.redact(y11);
            c C = value.C();
            c redact5 = C == null ? null : c.f44733g.redact(C);
            c v11 = value.v();
            c redact6 = v11 == null ? null : c.f44733g.redact(v11);
            c t11 = value.t();
            c redact7 = t11 == null ? null : c.f44733g.redact(t11);
            c z11 = value.z();
            c redact8 = z11 == null ? null : c.f44733g.redact(z11);
            c x11 = value.x();
            c redact9 = x11 == null ? null : c.f44733g.redact(x11);
            d p11 = value.p();
            d redact10 = p11 == null ? null : d.f44740d.redact(p11);
            e U = value.U();
            return b.b(value, null, null, 0, null, redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, redact10, null, 0, null, null, null, null, U == null ? null : e.f44744d.redact(U), null, null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, i.f42656d, -8462321, 16383, null);
        }
    }

    /* renamed from: ov.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0951b {
        private C0951b() {
        }

        public /* synthetic */ C0951b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends f {

        /* renamed from: g  reason: collision with root package name */
        public static final ProtoAdapter<c> f44733g;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final u f44734a;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final u f44735b;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final u f44736c;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d  reason: collision with root package name */
        private final u f44737d;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e  reason: collision with root package name */
        private final u f44738e;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f  reason: collision with root package name */
        private final u f44739f;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.M3ProductVitals.ECallComponentStatus", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(k reader) {
                s.g(reader, "reader");
                long d11 = reader.d();
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                u uVar4 = null;
                u uVar5 = null;
                u uVar6 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(l writer, c value) {
                s.g(writer, "writer");
                s.g(value, "value");
                ProtoAdapter<u> protoAdapter = u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.f());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.e());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                protoAdapter.encodeWithTag(writer, 5, value.g());
                protoAdapter.encodeWithTag(writer, 6, value.d());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<u> protoAdapter = u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.g()) + protoAdapter.encodedSizeWithTag(6, value.d());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                s.g(value, "value");
                u f11 = value.f();
                u redact = f11 == null ? null : u.f35845a.redact(f11);
                u b11 = value.b();
                u redact2 = b11 == null ? null : u.f35845a.redact(b11);
                u e11 = value.e();
                u redact3 = e11 == null ? null : u.f35845a.redact(e11);
                u c11 = value.c();
                u redact4 = c11 == null ? null : u.f35845a.redact(c11);
                u g11 = value.g();
                u redact5 = g11 == null ? null : u.f35845a.redact(g11);
                u d11 = value.d();
                return value.a(redact, redact2, redact3, redact4, redact5, d11 != null ? u.f35845a.redact(d11) : null, i.f42656d);
            }
        }

        /* renamed from: ov.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0952b {
            private C0952b() {
            }

            public /* synthetic */ C0952b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0952b(null);
            f44733g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public /* synthetic */ c(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) == 0 ? uVar6 : null, (i11 & 64) != 0 ? i.f42656d : iVar);
        }

        public final c a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, i unknownFields) {
            s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, unknownFields);
        }

        public final u b() {
            return this.f44735b;
        }

        public final u c() {
            return this.f44737d;
        }

        public final u d() {
            return this.f44739f;
        }

        public final u e() {
            return this.f44736c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f44734a, cVar.f44734a) && s.c(this.f44735b, cVar.f44735b) && s.c(this.f44736c, cVar.f44736c) && s.c(this.f44737d, cVar.f44737d) && s.c(this.f44738e, cVar.f44738e) && s.c(this.f44739f, cVar.f44739f);
            }
            return false;
        }

        public final u f() {
            return this.f44734a;
        }

        public final u g() {
            return this.f44738e;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                u uVar = this.f44734a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                u uVar2 = this.f44735b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                u uVar3 = this.f44736c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                u uVar4 = this.f44737d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                u uVar5 = this.f44738e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                u uVar6 = this.f44739f;
                int hashCode7 = hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m1031newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            u uVar = this.f44734a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            u uVar2 = this.f44735b;
            if (uVar2 != null) {
                arrayList.add("Connected=" + uVar2);
            }
            u uVar3 = this.f44736c;
            if (uVar3 != null) {
                arrayList.add("OK=" + uVar3);
            }
            u uVar4 = this.f44737d;
            if (uVar4 != null) {
                arrayList.add("Disconnected=" + uVar4);
            }
            u uVar5 = this.f44738e;
            if (uVar5 != null) {
                arrayList.add("UnknownFailure=" + uVar5);
            }
            u uVar6 = this.f44739f;
            if (uVar6 != null) {
                arrayList.add("HardwareFailure=" + uVar6);
            }
            l02 = e0.l0(arrayList, ", ", "ECallComponentStatus{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m1031newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, i unknownFields) {
            super(f44733g, unknownFields);
            s.g(unknownFields, "unknownFields");
            this.f44734a = uVar;
            this.f44735b = uVar2;
            this.f44736c = uVar3;
            this.f44737d = uVar4;
            this.f44738e = uVar5;
            this.f44739f = uVar6;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Connected, OK, Disconnected, UnknownFailure, HardwareFailure may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends f {

        /* renamed from: d  reason: collision with root package name */
        public static final ProtoAdapter<d> f44740d;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final u f44741a;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final u f44742b;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final u f44743c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.M3ProductVitals.ECallMicType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public d decode(k reader) {
                s.g(reader, "reader");
                long d11 = reader.d();
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new d(uVar, uVar2, uVar3, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = u.f35845a.decode(reader);
                    } else if (g11 != 3) {
                        reader.m(g11);
                    } else {
                        uVar3 = u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(l writer, d value) {
                s.g(writer, "writer");
                s.g(value, "value");
                ProtoAdapter<u> protoAdapter = u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                protoAdapter.encodeWithTag(writer, 3, value.d());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(d value) {
                s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<u> protoAdapter = u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.d());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public d redact(d value) {
                s.g(value, "value");
                u b11 = value.b();
                u redact = b11 == null ? null : u.f35845a.redact(b11);
                u c11 = value.c();
                u redact2 = c11 == null ? null : u.f35845a.redact(c11);
                u d11 = value.d();
                return value.a(redact, redact2, d11 != null ? u.f35845a.redact(d11) : null, i.f42656d);
            }
        }

        /* renamed from: ov.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0953b {
            private C0953b() {
            }

            public /* synthetic */ C0953b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0953b(null);
            f44740d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
        }

        public d() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ d(u uVar, u uVar2, u uVar3, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? i.f42656d : iVar);
        }

        public final d a(u uVar, u uVar2, u uVar3, i unknownFields) {
            s.g(unknownFields, "unknownFields");
            return new d(uVar, uVar2, uVar3, unknownFields);
        }

        public final u b() {
            return this.f44741a;
        }

        public final u c() {
            return this.f44742b;
        }

        public final u d() {
            return this.f44743c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f44741a, dVar.f44741a) && s.c(this.f44742b, dVar.f44742b) && s.c(this.f44743c, dVar.f44743c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                u uVar = this.f44741a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                u uVar2 = this.f44742b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                u uVar3 = this.f44743c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m1032newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            u uVar = this.f44741a;
            if (uVar != null) {
                arrayList.add("ECallAnalogMic=" + uVar);
            }
            u uVar2 = this.f44742b;
            if (uVar2 != null) {
                arrayList.add("ECallDigitalMic=" + uVar2);
            }
            u uVar3 = this.f44743c;
            if (uVar3 != null) {
                arrayList.add("ECallMicUnknown=" + uVar3);
            }
            l02 = e0.l0(arrayList, ", ", "ECallMicType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m1032newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u uVar, u uVar2, u uVar3, i unknownFields) {
            super(f44740d, unknownFields);
            s.g(unknownFields, "unknownFields");
            this.f44741a = uVar;
            this.f44742b = uVar2;
            this.f44743c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of ECallAnalogMic, ECallDigitalMic, ECallMicUnknown may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends f {

        /* renamed from: d  reason: collision with root package name */
        public static final ProtoAdapter<e> f44744d;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final u f44745a;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final u f44746b;
        @q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final u f44747c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.M3ProductVitals.Shorted12VCellTestMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public e decode(k reader) {
                s.g(reader, "reader");
                long d11 = reader.d();
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(uVar, uVar2, uVar3, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = u.f35845a.decode(reader);
                    } else if (g11 != 3) {
                        reader.m(g11);
                    } else {
                        uVar3 = u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(l writer, e value) {
                s.g(writer, "writer");
                s.g(value, "value");
                ProtoAdapter<u> protoAdapter = u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.c());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(e value) {
                s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<u> protoAdapter = u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public e redact(e value) {
                s.g(value, "value");
                u c11 = value.c();
                u redact = c11 == null ? null : u.f35845a.redact(c11);
                u d11 = value.d();
                u redact2 = d11 == null ? null : u.f35845a.redact(d11);
                u b11 = value.b();
                return value.a(redact, redact2, b11 != null ? u.f35845a.redact(b11) : null, i.f42656d);
            }
        }

        /* renamed from: ov.b$e$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0954b {
            private C0954b() {
            }

            public /* synthetic */ C0954b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0954b(null);
            f44744d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
        }

        public e() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ e(u uVar, u uVar2, u uVar3, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? i.f42656d : iVar);
        }

        public final e a(u uVar, u uVar2, u uVar3, i unknownFields) {
            s.g(unknownFields, "unknownFields");
            return new e(uVar, uVar2, uVar3, unknownFields);
        }

        public final u b() {
            return this.f44747c;
        }

        public final u c() {
            return this.f44745a;
        }

        public final u d() {
            return this.f44746b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return s.c(unknownFields(), eVar.unknownFields()) && s.c(this.f44745a, eVar.f44745a) && s.c(this.f44746b, eVar.f44746b) && s.c(this.f44747c, eVar.f44747c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                u uVar = this.f44745a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                u uVar2 = this.f44746b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                u uVar3 = this.f44747c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m1033newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            u uVar = this.f44745a;
            if (uVar != null) {
                arrayList.add("Shorted12VCellTestModeDisabled=" + uVar);
            }
            u uVar2 = this.f44746b;
            if (uVar2 != null) {
                arrayList.add("Shorted12VCellTestModeShadow=" + uVar2);
            }
            u uVar3 = this.f44747c;
            if (uVar3 != null) {
                arrayList.add("Shorted12VCellTestModeActive=" + uVar3);
            }
            l02 = e0.l0(arrayList, ", ", "Shorted12VCellTestMode{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m1033newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u uVar, u uVar2, u uVar3, i unknownFields) {
            super(f44744d, unknownFields);
            s.g(unknownFields, "unknownFields");
            this.f44745a = uVar;
            this.f44746b = uVar2;
            this.f44747c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of Shorted12VCellTestModeDisabled, Shorted12VCellTestModeShadow, Shorted12VCellTestModeActive may be non-null".toString());
            }
        }
    }

    static {
        new C0951b(null);
        f44703p2 = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, -1, 32767, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(java.lang.String r47, java.lang.String r48, int r49, java.lang.String r50, ov.b.c r51, ov.b.c r52, ov.b.c r53, ov.b.c r54, ov.b.c r55, ov.b.c r56, ov.b.c r57, ov.b.c r58, ov.b.c r59, float r60, float r61, float r62, ov.b.d r63, java.lang.String r64, int r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, ov.b.e r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, float r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, float r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, float r92, okio.i r93, int r94, int r95, kotlin.jvm.internal.DefaultConstructorMarker r96) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.b.<init>(java.lang.String, java.lang.String, int, java.lang.String, ov.b$c, ov.b$c, ov.b$c, ov.b$c, ov.b$c, ov.b$c, ov.b$c, ov.b$c, ov.b$c, float, float, float, ov.b$d, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ov.b$e, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, okio.i, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ b b(b bVar, String str, String str2, int i11, String str3, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, float f11, float f12, float f13, d dVar, String str4, int i12, String str5, String str6, String str7, String str8, e eVar, String str9, String str10, String str11, String str12, String str13, String str14, String str15, float f14, String str16, String str17, String str18, String str19, String str20, String str21, String str22, float f15, String str23, String str24, String str25, String str26, String str27, float f16, i iVar, int i13, int i14, Object obj) {
        return bVar.a((i13 & 1) != 0 ? bVar.f44704a : str, (i13 & 2) != 0 ? bVar.f44705b : str2, (i13 & 4) != 0 ? bVar.f44708c : i11, (i13 & 8) != 0 ? bVar.f44709d : str3, (i13 & 16) != 0 ? bVar.f44710e : cVar, (i13 & 32) != 0 ? bVar.f44711f : cVar2, (i13 & 64) != 0 ? bVar.f44712g : cVar3, (i13 & 128) != 0 ? bVar.f44715h : cVar4, (i13 & 256) != 0 ? bVar.f44716i : cVar5, (i13 & 512) != 0 ? bVar.f44717j : cVar6, (i13 & 1024) != 0 ? bVar.f44718k : cVar7, (i13 & 2048) != 0 ? bVar.f44719l : cVar8, (i13 & 4096) != 0 ? bVar.f44720m : cVar9, (i13 & PKIFailureInfo.certRevoked) != 0 ? bVar.f44721n : f11, (i13 & 16384) != 0 ? bVar.f44722o : f12, (i13 & 32768) != 0 ? bVar.f44723p : f13, (i13 & 65536) != 0 ? bVar.f44725q : dVar, (i13 & 131072) != 0 ? bVar.f44726t : str4, (i13 & 262144) != 0 ? bVar.f44727w : i12, (i13 & PKIFailureInfo.signerNotTrusted) != 0 ? bVar.f44728x : str5, (i13 & PKIFailureInfo.badCertTemplate) != 0 ? bVar.f44730y : str6, (i13 & PKIFailureInfo.badSenderNonce) != 0 ? bVar.f44732z : str7, (i13 & 4194304) != 0 ? bVar.A : str8, (i13 & 8388608) != 0 ? bVar.B : eVar, (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bVar.C : str9, (i13 & 33554432) != 0 ? bVar.E : str10, (i13 & 67108864) != 0 ? bVar.F : str11, (i13 & 134217728) != 0 ? bVar.G : str12, (i13 & 268435456) != 0 ? bVar.H : str13, (i13 & PKIFailureInfo.duplicateCertReq) != 0 ? bVar.K : str14, (i13 & 1073741824) != 0 ? bVar.L : str15, (i13 & Integer.MIN_VALUE) != 0 ? bVar.O : f14, (i14 & 1) != 0 ? bVar.P : str16, (i14 & 2) != 0 ? bVar.Q : str17, (i14 & 4) != 0 ? bVar.R : str18, (i14 & 8) != 0 ? bVar.T : str19, (i14 & 16) != 0 ? bVar.Y : str20, (i14 & 32) != 0 ? bVar.f44706b1 : str21, (i14 & 64) != 0 ? bVar.f44713g1 : str22, (i14 & 128) != 0 ? bVar.f44724p1 : f15, (i14 & 256) != 0 ? bVar.f44729x1 : str23, (i14 & 512) != 0 ? bVar.f44731y1 : str24, (i14 & 1024) != 0 ? bVar.Q1 : str25, (i14 & 2048) != 0 ? bVar.V1 : str26, (i14 & 4096) != 0 ? bVar.f44707b2 : str27, (i14 & PKIFailureInfo.certRevoked) != 0 ? bVar.f44714g2 : f16, (i14 & 16384) != 0 ? bVar.unknownFields() : iVar);
    }

    public final float A() {
        return this.f44721n;
    }

    public final String B() {
        return this.f44726t;
    }

    public final c C() {
        return this.f44716i;
    }

    public final c D() {
        return this.f44712g;
    }

    public final String E() {
        return this.f44728x;
    }

    public final String F() {
        return this.V1;
    }

    public final String G() {
        return this.f44707b2;
    }

    public final String H() {
        return this.Q1;
    }

    public final String I() {
        return this.f44731y1;
    }

    public final float J() {
        return this.f44714g2;
    }

    public final String K() {
        return this.f44729x1;
    }

    public final String L() {
        return this.f44705b;
    }

    public final String M() {
        return this.T;
    }

    public final String N() {
        return this.Y;
    }

    public final String O() {
        return this.R;
    }

    public final String P() {
        return this.Q;
    }

    public final float Q() {
        return this.f44724p1;
    }

    public final String R() {
        return this.f44706b1;
    }

    public final String S() {
        return this.f44713g1;
    }

    public final String T() {
        return this.P;
    }

    public final e U() {
        return this.B;
    }

    public final String V() {
        return this.f44709d;
    }

    public final b a(String auto_present_handles, String nav_map_release, int i11, String walk_up_unlock, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, float f11, float f12, float f13, d dVar, String ecall_number, int i12, String edid_version, String display_sn, String display_fatpsn, String display_teslapn, e eVar, String center_display_version, String center_display_serial_number, String center_display_part_number, String center_display_assembly_number, String center_display_model, String center_display_touch_controller_type, String center_display_touch_firmware_version, float f14, String rear_display_version, String rear_display_serial_number, String rear_display_part_number, String rear_display_assembly_number, String rear_display_model, String rear_display_touch_controller_type, String rear_display_touch_firmware_version, float f15, String icu_display_version, String icu_display_serial_number, String icu_display_part_number, String icu_display_assembly_number, String icu_display_model, float f16, i unknownFields) {
        s.g(auto_present_handles, "auto_present_handles");
        s.g(nav_map_release, "nav_map_release");
        s.g(walk_up_unlock, "walk_up_unlock");
        s.g(ecall_number, "ecall_number");
        s.g(edid_version, "edid_version");
        s.g(display_sn, "display_sn");
        s.g(display_fatpsn, "display_fatpsn");
        s.g(display_teslapn, "display_teslapn");
        s.g(center_display_version, "center_display_version");
        s.g(center_display_serial_number, "center_display_serial_number");
        s.g(center_display_part_number, "center_display_part_number");
        s.g(center_display_assembly_number, "center_display_assembly_number");
        s.g(center_display_model, "center_display_model");
        s.g(center_display_touch_controller_type, "center_display_touch_controller_type");
        s.g(center_display_touch_firmware_version, "center_display_touch_firmware_version");
        s.g(rear_display_version, "rear_display_version");
        s.g(rear_display_serial_number, "rear_display_serial_number");
        s.g(rear_display_part_number, "rear_display_part_number");
        s.g(rear_display_assembly_number, "rear_display_assembly_number");
        s.g(rear_display_model, "rear_display_model");
        s.g(rear_display_touch_controller_type, "rear_display_touch_controller_type");
        s.g(rear_display_touch_firmware_version, "rear_display_touch_firmware_version");
        s.g(icu_display_version, "icu_display_version");
        s.g(icu_display_serial_number, "icu_display_serial_number");
        s.g(icu_display_part_number, "icu_display_part_number");
        s.g(icu_display_assembly_number, "icu_display_assembly_number");
        s.g(icu_display_model, "icu_display_model");
        s.g(unknownFields, "unknownFields");
        return new b(auto_present_handles, nav_map_release, i11, walk_up_unlock, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, f11, f12, f13, dVar, ecall_number, i12, edid_version, display_sn, display_fatpsn, display_teslapn, eVar, center_display_version, center_display_serial_number, center_display_part_number, center_display_assembly_number, center_display_model, center_display_touch_controller_type, center_display_touch_firmware_version, f14, rear_display_version, rear_display_serial_number, rear_display_part_number, rear_display_assembly_number, rear_display_model, rear_display_touch_controller_type, rear_display_touch_firmware_version, f15, icu_display_version, icu_display_serial_number, icu_display_part_number, icu_display_assembly_number, icu_display_model, f16, unknownFields);
    }

    public final String c() {
        return this.f44704a;
    }

    public final String d() {
        return this.G;
    }

    public final String e() {
        return this.H;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f44704a, bVar.f44704a) && s.c(this.f44705b, bVar.f44705b) && this.f44708c == bVar.f44708c && s.c(this.f44709d, bVar.f44709d) && s.c(this.f44710e, bVar.f44710e) && s.c(this.f44711f, bVar.f44711f) && s.c(this.f44712g, bVar.f44712g) && s.c(this.f44715h, bVar.f44715h) && s.c(this.f44716i, bVar.f44716i) && s.c(this.f44717j, bVar.f44717j) && s.c(this.f44718k, bVar.f44718k) && s.c(this.f44719l, bVar.f44719l) && s.c(this.f44720m, bVar.f44720m)) {
                if (this.f44721n == bVar.f44721n) {
                    if (this.f44722o == bVar.f44722o) {
                        if ((this.f44723p == bVar.f44723p) && s.c(this.f44725q, bVar.f44725q) && s.c(this.f44726t, bVar.f44726t) && this.f44727w == bVar.f44727w && s.c(this.f44728x, bVar.f44728x) && s.c(this.f44730y, bVar.f44730y) && s.c(this.f44732z, bVar.f44732z) && s.c(this.A, bVar.A) && s.c(this.B, bVar.B) && s.c(this.C, bVar.C) && s.c(this.E, bVar.E) && s.c(this.F, bVar.F) && s.c(this.G, bVar.G) && s.c(this.H, bVar.H) && s.c(this.K, bVar.K) && s.c(this.L, bVar.L)) {
                            if ((this.O == bVar.O) && s.c(this.P, bVar.P) && s.c(this.Q, bVar.Q) && s.c(this.R, bVar.R) && s.c(this.T, bVar.T) && s.c(this.Y, bVar.Y) && s.c(this.f44706b1, bVar.f44706b1) && s.c(this.f44713g1, bVar.f44713g1)) {
                                if ((this.f44724p1 == bVar.f44724p1) && s.c(this.f44729x1, bVar.f44729x1) && s.c(this.f44731y1, bVar.f44731y1) && s.c(this.Q1, bVar.Q1) && s.c(this.V1, bVar.V1) && s.c(this.f44707b2, bVar.f44707b2)) {
                                    return (this.f44714g2 > bVar.f44714g2 ? 1 : (this.f44714g2 == bVar.f44714g2 ? 0 : -1)) == 0;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final String f() {
        return this.F;
    }

    public final String g() {
        return this.E;
    }

    public final float h() {
        return this.O;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + this.f44704a.hashCode()) * 37) + this.f44705b.hashCode()) * 37) + Integer.hashCode(this.f44708c)) * 37) + this.f44709d.hashCode()) * 37;
            c cVar = this.f44710e;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
            c cVar2 = this.f44711f;
            int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 37;
            c cVar3 = this.f44712g;
            int hashCode4 = (hashCode3 + (cVar3 != null ? cVar3.hashCode() : 0)) * 37;
            c cVar4 = this.f44715h;
            int hashCode5 = (hashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 37;
            c cVar5 = this.f44716i;
            int hashCode6 = (hashCode5 + (cVar5 != null ? cVar5.hashCode() : 0)) * 37;
            c cVar6 = this.f44717j;
            int hashCode7 = (hashCode6 + (cVar6 != null ? cVar6.hashCode() : 0)) * 37;
            c cVar7 = this.f44718k;
            int hashCode8 = (hashCode7 + (cVar7 != null ? cVar7.hashCode() : 0)) * 37;
            c cVar8 = this.f44719l;
            int hashCode9 = (hashCode8 + (cVar8 != null ? cVar8.hashCode() : 0)) * 37;
            c cVar9 = this.f44720m;
            int hashCode10 = (((((((hashCode9 + (cVar9 != null ? cVar9.hashCode() : 0)) * 37) + Float.hashCode(this.f44721n)) * 37) + Float.hashCode(this.f44722o)) * 37) + Float.hashCode(this.f44723p)) * 37;
            d dVar = this.f44725q;
            int hashCode11 = (((((((((((((hashCode10 + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.f44726t.hashCode()) * 37) + Integer.hashCode(this.f44727w)) * 37) + this.f44728x.hashCode()) * 37) + this.f44730y.hashCode()) * 37) + this.f44732z.hashCode()) * 37) + this.A.hashCode()) * 37;
            e eVar = this.B;
            int hashCode12 = ((((((((((((((((((((((((((((((((((((((((((((hashCode11 + (eVar != null ? eVar.hashCode() : 0)) * 37) + this.C.hashCode()) * 37) + this.E.hashCode()) * 37) + this.F.hashCode()) * 37) + this.G.hashCode()) * 37) + this.H.hashCode()) * 37) + this.K.hashCode()) * 37) + this.L.hashCode()) * 37) + Float.hashCode(this.O)) * 37) + this.P.hashCode()) * 37) + this.Q.hashCode()) * 37) + this.R.hashCode()) * 37) + this.T.hashCode()) * 37) + this.Y.hashCode()) * 37) + this.f44706b1.hashCode()) * 37) + this.f44713g1.hashCode()) * 37) + Float.hashCode(this.f44724p1)) * 37) + this.f44729x1.hashCode()) * 37) + this.f44731y1.hashCode()) * 37) + this.Q1.hashCode()) * 37) + this.V1.hashCode()) * 37) + this.f44707b2.hashCode()) * 37) + Float.hashCode(this.f44714g2);
            this.hashCode = hashCode12;
            return hashCode12;
        }
        return i11;
    }

    public final String i() {
        return this.K;
    }

    public final String j() {
        return this.L;
    }

    public final String k() {
        return this.C;
    }

    public final int l() {
        return this.f44708c;
    }

    public final String m() {
        return this.f44732z;
    }

    public final String n() {
        return this.f44730y;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1030newBuilder();
    }

    public final String o() {
        return this.A;
    }

    public final d p() {
        return this.f44725q;
    }

    public final float q() {
        return this.f44722o;
    }

    public final c r() {
        return this.f44710e;
    }

    public final int s() {
        return this.f44727w;
    }

    public final c t() {
        return this.f44718k;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f44704a);
        arrayList.add("auto_present_handles=" + i11);
        String i12 = mr.d.i(this.f44705b);
        arrayList.add("nav_map_release=" + i12);
        int i13 = this.f44708c;
        arrayList.add("cfg_packmass=" + i13);
        String i14 = mr.d.i(this.f44709d);
        arrayList.add("walk_up_unlock=" + i14);
        c cVar = this.f44710e;
        if (cVar != null) {
            arrayList.add("ecall_backup_antenna=" + cVar);
        }
        c cVar2 = this.f44711f;
        if (cVar2 != null) {
            arrayList.add("ecall_gps_antenna=" + cVar2);
        }
        c cVar3 = this.f44712g;
        if (cVar3 != null) {
            arrayList.add("ecall_speaker=" + cVar3);
        }
        c cVar4 = this.f44715h;
        if (cVar4 != null) {
            arrayList.add("ecall_microphone=" + cVar4);
        }
        c cVar5 = this.f44716i;
        if (cVar5 != null) {
            arrayList.add("ecall_sim_status=" + cVar5);
        }
        c cVar6 = this.f44717j;
        if (cVar6 != null) {
            arrayList.add("ecall_ens_signal=" + cVar6);
        }
        c cVar7 = this.f44718k;
        if (cVar7 != null) {
            arrayList.add("ecall_cell_status=" + cVar7);
        }
        c cVar8 = this.f44719l;
        if (cVar8 != null) {
            arrayList.add("ecall_modem_firmware_ok=" + cVar8);
        }
        c cVar9 = this.f44720m;
        if (cVar9 != null) {
            arrayList.add("ecall_manual_button=" + cVar9);
        }
        float f11 = this.f44721n;
        arrayList.add("ecall_nrqst_avg=" + f11);
        float f12 = this.f44722o;
        arrayList.add("ecall_ana_mic_rms_amp=" + f12);
        float f13 = this.f44723p;
        arrayList.add("ecall_dig_mic_rms_amp=" + f13);
        d dVar = this.f44725q;
        if (dVar != null) {
            arrayList.add("ecall_active_mic_type=" + dVar);
        }
        String i15 = mr.d.i(this.f44726t);
        arrayList.add("ecall_number=" + i15);
        int i16 = this.f44727w;
        arrayList.add("ecall_call_count=" + i16);
        String i17 = mr.d.i(this.f44728x);
        arrayList.add("edid_version=" + i17);
        String i18 = mr.d.i(this.f44730y);
        arrayList.add("display_sn=" + i18);
        String i19 = mr.d.i(this.f44732z);
        arrayList.add("display_fatpsn=" + i19);
        String i21 = mr.d.i(this.A);
        arrayList.add("display_teslapn=" + i21);
        e eVar = this.B;
        if (eVar != null) {
            arrayList.add("shorted_12v_cell_test_mode=" + eVar);
        }
        String i22 = mr.d.i(this.C);
        arrayList.add("center_display_version=" + i22);
        String i23 = mr.d.i(this.E);
        arrayList.add("center_display_serial_number=" + i23);
        String i24 = mr.d.i(this.F);
        arrayList.add("center_display_part_number=" + i24);
        String i25 = mr.d.i(this.G);
        arrayList.add("center_display_assembly_number=" + i25);
        String i26 = mr.d.i(this.H);
        arrayList.add("center_display_model=" + i26);
        String i27 = mr.d.i(this.K);
        arrayList.add("center_display_touch_controller_type=" + i27);
        String i28 = mr.d.i(this.L);
        arrayList.add("center_display_touch_firmware_version=" + i28);
        float f14 = this.O;
        arrayList.add("center_display_temperature=" + f14);
        String i29 = mr.d.i(this.P);
        arrayList.add("rear_display_version=" + i29);
        String i31 = mr.d.i(this.Q);
        arrayList.add("rear_display_serial_number=" + i31);
        String i32 = mr.d.i(this.R);
        arrayList.add("rear_display_part_number=" + i32);
        String i33 = mr.d.i(this.T);
        arrayList.add("rear_display_assembly_number=" + i33);
        String i34 = mr.d.i(this.Y);
        arrayList.add("rear_display_model=" + i34);
        String i35 = mr.d.i(this.f44706b1);
        arrayList.add("rear_display_touch_controller_type=" + i35);
        String i36 = mr.d.i(this.f44713g1);
        arrayList.add("rear_display_touch_firmware_version=" + i36);
        float f15 = this.f44724p1;
        arrayList.add("rear_display_temperature=" + f15);
        String i37 = mr.d.i(this.f44729x1);
        arrayList.add("icu_display_version=" + i37);
        String i38 = mr.d.i(this.f44731y1);
        arrayList.add("icu_display_serial_number=" + i38);
        String i39 = mr.d.i(this.Q1);
        arrayList.add("icu_display_part_number=" + i39);
        String i41 = mr.d.i(this.V1);
        arrayList.add("icu_display_assembly_number=" + i41);
        String i42 = mr.d.i(this.f44707b2);
        arrayList.add("icu_display_model=" + i42);
        float f16 = this.f44714g2;
        arrayList.add("icu_display_temperature=" + f16);
        l02 = e0.l0(arrayList, ", ", "M3ProductVitals{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final float u() {
        return this.f44723p;
    }

    public final c v() {
        return this.f44717j;
    }

    public final c w() {
        return this.f44711f;
    }

    public final c x() {
        return this.f44720m;
    }

    public final c y() {
        return this.f44715h;
    }

    public final c z() {
        return this.f44719l;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1030newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String auto_present_handles, String nav_map_release, int i11, String walk_up_unlock, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, float f11, float f12, float f13, d dVar, String ecall_number, int i12, String edid_version, String display_sn, String display_fatpsn, String display_teslapn, e eVar, String center_display_version, String center_display_serial_number, String center_display_part_number, String center_display_assembly_number, String center_display_model, String center_display_touch_controller_type, String center_display_touch_firmware_version, float f14, String rear_display_version, String rear_display_serial_number, String rear_display_part_number, String rear_display_assembly_number, String rear_display_model, String rear_display_touch_controller_type, String rear_display_touch_firmware_version, float f15, String icu_display_version, String icu_display_serial_number, String icu_display_part_number, String icu_display_assembly_number, String icu_display_model, float f16, i unknownFields) {
        super(f44703p2, unknownFields);
        s.g(auto_present_handles, "auto_present_handles");
        s.g(nav_map_release, "nav_map_release");
        s.g(walk_up_unlock, "walk_up_unlock");
        s.g(ecall_number, "ecall_number");
        s.g(edid_version, "edid_version");
        s.g(display_sn, "display_sn");
        s.g(display_fatpsn, "display_fatpsn");
        s.g(display_teslapn, "display_teslapn");
        s.g(center_display_version, "center_display_version");
        s.g(center_display_serial_number, "center_display_serial_number");
        s.g(center_display_part_number, "center_display_part_number");
        s.g(center_display_assembly_number, "center_display_assembly_number");
        s.g(center_display_model, "center_display_model");
        s.g(center_display_touch_controller_type, "center_display_touch_controller_type");
        s.g(center_display_touch_firmware_version, "center_display_touch_firmware_version");
        s.g(rear_display_version, "rear_display_version");
        s.g(rear_display_serial_number, "rear_display_serial_number");
        s.g(rear_display_part_number, "rear_display_part_number");
        s.g(rear_display_assembly_number, "rear_display_assembly_number");
        s.g(rear_display_model, "rear_display_model");
        s.g(rear_display_touch_controller_type, "rear_display_touch_controller_type");
        s.g(rear_display_touch_firmware_version, "rear_display_touch_firmware_version");
        s.g(icu_display_version, "icu_display_version");
        s.g(icu_display_serial_number, "icu_display_serial_number");
        s.g(icu_display_part_number, "icu_display_part_number");
        s.g(icu_display_assembly_number, "icu_display_assembly_number");
        s.g(icu_display_model, "icu_display_model");
        s.g(unknownFields, "unknownFields");
        this.f44704a = auto_present_handles;
        this.f44705b = nav_map_release;
        this.f44708c = i11;
        this.f44709d = walk_up_unlock;
        this.f44710e = cVar;
        this.f44711f = cVar2;
        this.f44712g = cVar3;
        this.f44715h = cVar4;
        this.f44716i = cVar5;
        this.f44717j = cVar6;
        this.f44718k = cVar7;
        this.f44719l = cVar8;
        this.f44720m = cVar9;
        this.f44721n = f11;
        this.f44722o = f12;
        this.f44723p = f13;
        this.f44725q = dVar;
        this.f44726t = ecall_number;
        this.f44727w = i12;
        this.f44728x = edid_version;
        this.f44730y = display_sn;
        this.f44732z = display_fatpsn;
        this.A = display_teslapn;
        this.B = eVar;
        this.C = center_display_version;
        this.E = center_display_serial_number;
        this.F = center_display_part_number;
        this.G = center_display_assembly_number;
        this.H = center_display_model;
        this.K = center_display_touch_controller_type;
        this.L = center_display_touch_firmware_version;
        this.O = f14;
        this.P = rear_display_version;
        this.Q = rear_display_serial_number;
        this.R = rear_display_part_number;
        this.T = rear_display_assembly_number;
        this.Y = rear_display_model;
        this.f44706b1 = rear_display_touch_controller_type;
        this.f44713g1 = rear_display_touch_firmware_version;
        this.f44724p1 = f15;
        this.f44729x1 = icu_display_version;
        this.f44731y1 = icu_display_serial_number;
        this.Q1 = icu_display_part_number;
        this.V1 = icu_display_assembly_number;
        this.f44707b2 = icu_display_model;
        this.f44714g2 = f16;
    }
}