package f50;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import n60.e;
import n60.x;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static f50.j f25839a = new k();

    /* renamed from: b  reason: collision with root package name */
    static f50.j f25840b = new p();

    /* renamed from: c  reason: collision with root package name */
    static f50.j f25841c = new q();

    /* renamed from: d  reason: collision with root package name */
    static f50.j f25842d = new r();

    /* renamed from: e  reason: collision with root package name */
    static f50.j f25843e = new s();

    /* renamed from: f  reason: collision with root package name */
    static f50.j f25844f = new t();

    /* renamed from: g  reason: collision with root package name */
    static f50.j f25845g = new u();

    /* renamed from: h  reason: collision with root package name */
    static f50.j f25846h = new v();

    /* renamed from: i  reason: collision with root package name */
    static f50.j f25847i = new w();

    /* renamed from: j  reason: collision with root package name */
    static f50.j f25848j = new a();

    /* renamed from: k  reason: collision with root package name */
    static f50.j f25849k = new b();

    /* renamed from: l  reason: collision with root package name */
    static f50.j f25850l = new c();

    /* renamed from: m  reason: collision with root package name */
    static f50.j f25851m = new d();

    /* renamed from: n  reason: collision with root package name */
    static f50.j f25852n = new e();

    /* renamed from: o  reason: collision with root package name */
    static f50.j f25853o = new C0511f();

    /* renamed from: p  reason: collision with root package name */
    static f50.j f25854p = new g();

    /* renamed from: q  reason: collision with root package name */
    static f50.j f25855q = new h();

    /* renamed from: r  reason: collision with root package name */
    static f50.j f25856r = new i();

    /* renamed from: s  reason: collision with root package name */
    static f50.j f25857s = new j();

    /* renamed from: t  reason: collision with root package name */
    static f50.j f25858t = new l();

    /* renamed from: u  reason: collision with root package name */
    static f50.j f25859u = new m();

    /* renamed from: v  reason: collision with root package name */
    static f50.j f25860v = new n();

    /* renamed from: w  reason: collision with root package name */
    static f50.j f25861w = new o();

    /* renamed from: x  reason: collision with root package name */
    static final Hashtable f25862x = new Hashtable();

    /* renamed from: y  reason: collision with root package name */
    static final Hashtable f25863y = new Hashtable();

    /* renamed from: z  reason: collision with root package name */
    static final Hashtable f25864z = new Hashtable();

    /* loaded from: classes5.dex */
    static class a extends f50.j {
        a() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309");
            BigInteger valueOf = BigInteger.valueOf(2L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 1, 2, 8, f.g("07A526C63D3E25A256A007699F5447E32AE456B50E"), f.g("03F7061798EB99E238FD6F1BF95B48FEEB4854252B"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class b extends f50.j {
        b() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("010092537397ECA4F6145799D62B0A19CE06FE26AD");
            BigInteger valueOf = BigInteger.valueOf(65390L);
            n60.e e11 = f.e(new e.C0796e(176, 1, 2, 43, f.g("E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B"), f.g("5DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "038D16C2866798B600F9F08BB4A8E860F3298CE04A5798"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class c extends f50.j {
        c() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("40000000000000000000000004A20E90C39067C893BBB9A5");
            BigInteger valueOf = BigInteger.valueOf(2L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 9, f.g("2866537B676752636A68F56554E12640276B649EF7526267"), f.g("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D"), g11, valueOf, org.bouncycastle.util.encoders.b.b("4E13CA542744D696E67687561517552F279A8C84"));
        }
    }

    /* loaded from: classes5.dex */
    static class d extends f50.j {
        d() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("20000000000000000000000050508CB89F652824E06B8173");
            BigInteger valueOf = BigInteger.valueOf(4L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 9, f.g("401028774D7777C7B7666D1366EA432071274F89FF01E718"), f.g("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class e extends f50.j {
        e() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("155555555555555555555555610C0B196812BFB6288A3EA3");
            BigInteger valueOf = BigInteger.valueOf(6L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 9, f.g("6C01074756099122221056911C77D77E77A777E7E7E77FCB"), f.g("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "03375D4CE24FDE434489DE8746E71786015009E66E38A926DD"), g11, valueOf);
        }
    }

    /* renamed from: f50.f$f  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0511f extends f50.j {
        C0511f() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D");
            BigInteger valueOf = BigInteger.valueOf(65096L);
            n60.e e11 = f.e(new e.C0796e(208, 1, 2, 83, BigInteger.valueOf(0L), f.g("C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class g extends f50.j {
        g() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447");
            BigInteger valueOf = BigInteger.valueOf(4L);
            n60.e e11 = f.e(new e.C0796e(239, 36, f.g("32010857077C5431123A46B808906756F543423E8D27877578125778AC76"), f.g("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class h extends f50.j {
        h() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("1555555555555555555555555555553C6F2885259C31E3FCDF154624522D");
            BigInteger valueOf = BigInteger.valueOf(6L);
            n60.e e11 = f.e(new e.C0796e(239, 36, f.g("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F"), f.g("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class i extends f50.j {
        i() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF");
            BigInteger valueOf = BigInteger.valueOf(10L);
            n60.e e11 = f.e(new e.C0796e(239, 36, f.g("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F"), f.g("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class j extends f50.j {
        j() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0100FAF51354E0E39E4892DF6E319C72C8161603FA45AA7B998A167B8F1E629521");
            BigInteger valueOf = BigInteger.valueOf(65286L);
            n60.e e11 = f.e(new e.C0796e(272, 1, 3, 56, f.g("91A091F03B5FBA4AB2CCF49C4EDD220FB028712D42BE752B2C40094DBACDB586FB20"), f.g("7167EFC92BB2E3CE7C8AAAFF34E12A9C557003D7C73A6FAF003F99F6CC8482E540F7"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "026108BABB2CEEBCF787058A056CBE0CFE622D7723A289E08A07AE13EF0D10D171DD8D"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class k extends f50.j {
        k() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("ffffffffffffffffffffffff99def836146bc9b1b4d22831");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(f.g("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), f.g("fffffffffffffffffffffffffffffffefffffffffffffffc"), f.g("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012"), g11, valueOf, org.bouncycastle.util.encoders.b.b("3045AE6FC8422f64ED579528D38120EAE12196D5"));
        }
    }

    /* loaded from: classes5.dex */
    static class l extends f50.j {
        l() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0101D556572AABAC800101D556572AABAC8001022D5C91DD173F8FB561DA6899164443051D");
            BigInteger valueOf = BigInteger.valueOf(65070L);
            n60.e e11 = f.e(new e.C0796e(304, 1, 2, 11, f.g("FD0D693149A118F651E6DCE6802085377E5F882D1B510B44160074C1288078365A0396C8E681"), f.g("BDDB97E555A50A908E43B01C798EA5DAA6788F1EA2794EFCF57166B8C14039601E55827340BE"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "02197B07845E9BE2D96ADB0F5F3C7F2CFFBD7A3EB8B6FEC35C7FD67F26DDF6285A644F740A2614"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class m extends f50.j {
        m() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("01AF286BCA1AF286BCA1AF286BCA1AF286BCA1AF286BC9FB8F6B85C556892C20A7EB964FE7719E74F490758D3B");
            BigInteger valueOf = BigInteger.valueOf(76L);
            n60.e e11 = f.e(new e.C0796e(359, 68, f.g("5667676A654B20754F356EA92017D946567C46675556F19556A04616B567D223A5E05656FB549016A96656A557"), f.g("2472E2D0197C49363F1FE7F5B6DB075D52B6947D135D8CA445805D39BC345626089687742B6329E70680231988"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "033C258EF3047767E7EDE0F1FDAA79DAEE3841366A132E163ACED4ED2401DF9C6BDCDE98E8E707C07A2239B1B097"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class n extends f50.j {
        n() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("010090512DA9AF72B08349D98A5DD4C7B0532ECA51CE03E2D10F3B7AC579BD87E909AE40A6F131E9CFCE5BD967");
            BigInteger valueOf = BigInteger.valueOf(65392L);
            n60.e e11 = f.e(new e.C0796e(368, 1, 2, 85, f.g("E0D2EE25095206F5E2A4F9ED229F1F256E79A0E2B455970D8D0D865BD94778C576D62F0AB7519CCD2A1A906AE30D"), f.g("FC1217D4320A90452C760A58EDCD30C8DD069B3C34453837A34ED50CB54917E1C2112D84D164F444F8F74786046A"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "021085E2755381DCCCE3C1557AFA10C2F0C0C2825646C5B34A394CBCFA8BC16B22E7E789E927BE216F02E1FB136A5F"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class o extends f50.j {
        o() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0340340340340340340340340340340340340340340340340340340323C313FAB50589703B5EC68D3587FEC60D161CC149C1AD4A91");
            BigInteger valueOf = BigInteger.valueOf(10080L);
            n60.e e11 = f.e(new e.C0796e(431, 120, f.g("1A827EF00DD6FC0E234CAF046C6A5D8A85395B236CC4AD2CF32A0CADBDC9DDF620B0EB9906D0957F6C6FEACD615468DF104DE296CD8F"), f.g("10D9B4A3D9047D8B154359ABFB1B7F5485B04CEB868237DDC9DEDA982A679A5A919B626D4E50A8DD731B107A9962381FB5D807BF2618"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "02120FC05D3C67A99DE161D2F4092622FECA701BE4F50F4758714E8A87BBF2A658EF8C21E7C5EFE965361F6C2999C0C247B0DBD70CE6B7"), g11, valueOf);
        }
    }

    /* loaded from: classes5.dex */
    static class p extends f50.j {
        p() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(f.g("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), f.g("fffffffffffffffffffffffffffffffefffffffffffffffc"), f.g("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a"), g11, valueOf, org.bouncycastle.util.encoders.b.b("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
        }
    }

    /* loaded from: classes5.dex */
    static class q extends f50.j {
        q() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("ffffffffffffffffffffffff7a62d031c83f4294f640ec13");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(f.g("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), f.g("fffffffffffffffffffffffffffffffefffffffffffffffc"), f.g("22123dc2395a05caa7423daeccc94760a7d462256bd56916"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "027d29778100c65a1da1783716588dce2b8b4aee8e228f1896"), g11, valueOf, org.bouncycastle.util.encoders.b.b("c469684435deb378c4b65ca9591e2a5763059a2e"));
        }
    }

    /* loaded from: classes5.dex */
    static class r extends f50.j {
        r() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("7fffffffffffffffffffffff7fffff9e5e9a9f5d9071fbd1522688909d0b");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), f.g("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), f.g("6b016c3bdcf18941d0d654921475ca71a9db2fb27d1d37796185c2942c0a"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "020ffa963cdca8816ccc33b8642bedf905c3d358573d3f27fbbd3b3cb9aaaf"), g11, valueOf, org.bouncycastle.util.encoders.b.b("e43bb460f0b80cc0c0b075798e948060f8321b7d"));
        }
    }

    /* loaded from: classes5.dex */
    static class s extends f50.j {
        s() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), f.g("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), f.g("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7"), g11, valueOf, org.bouncycastle.util.encoders.b.b("e8b4011604095303ca3b8099982be09fcb9ae616"));
        }
    }

    /* loaded from: classes5.dex */
    static class t extends f50.j {
        t() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), f.g("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), f.g("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a"), g11, valueOf, org.bouncycastle.util.encoders.b.b("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
        }
    }

    /* loaded from: classes5.dex */
    static class u extends f50.j {
        u() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551");
            BigInteger valueOf = BigInteger.valueOf(1L);
            n60.e e11 = f.e(new e.f(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951"), f.g("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc"), f.g("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "036b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296"), g11, valueOf, org.bouncycastle.util.encoders.b.b("c49d360886e704936a6678e1139d26b7819f7e90"));
        }
    }

    /* loaded from: classes5.dex */
    static class v extends f50.j {
        v() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("0400000000000000000001E60FC8821CC74DAEAFC1");
            BigInteger valueOf = BigInteger.valueOf(2L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 1, 2, 8, f.g("072546B5435234A422E0789675F432C89435DE5242"), f.g("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "0307AF69989546103D79329FCC3D74880F33BBE803CB"), g11, valueOf, org.bouncycastle.util.encoders.b.b("D2C0FB15760860DEF1EEF4D696E6768756151754"));
        }
    }

    /* loaded from: classes5.dex */
    static class w extends f50.j {
        w() {
        }

        @Override // f50.j
        protected f50.i a() {
            BigInteger g11 = f.g("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7");
            BigInteger valueOf = BigInteger.valueOf(2L);
            n60.e e11 = f.e(new e.C0796e((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 1, 2, 8, f.g("0108B39E77C4B108BED981ED0E890E117C511CF072"), f.g("0667ACEB38AF4E488C407433FFAE4F1C811638DF20"), g11, valueOf));
            return new f50.i(e11, f.d(e11, "030024266E4EB5106D0A964D92C4860E2671DB9B6CC5"), g11, valueOf);
        }
    }

    static {
        f("prime192v1", f50.o.G0, f25839a);
        f("prime192v2", f50.o.H0, f25840b);
        f("prime192v3", f50.o.I0, f25841c);
        f("prime239v1", f50.o.J0, f25842d);
        f("prime239v2", f50.o.K0, f25843e);
        f("prime239v3", f50.o.L0, f25844f);
        f("prime256v1", f50.o.M0, f25845g);
        f("c2pnb163v1", f50.o.f25899p0, f25846h);
        f("c2pnb163v2", f50.o.f25900q0, f25847i);
        f("c2pnb163v3", f50.o.f25901r0, f25848j);
        f("c2pnb176w1", f50.o.f25902s0, f25849k);
        f("c2tnb191v1", f50.o.f25903t0, f25850l);
        f("c2tnb191v2", f50.o.f25904u0, f25851m);
        f("c2tnb191v3", f50.o.f25905v0, f25852n);
        f("c2pnb208w1", f50.o.f25906w0, f25853o);
        f("c2tnb239v1", f50.o.f25907x0, f25854p);
        f("c2tnb239v2", f50.o.f25908y0, f25855q);
        f("c2tnb239v3", f50.o.f25909z0, f25856r);
        f("c2pnb272w1", f50.o.A0, f25857s);
        f("c2pnb304w1", f50.o.B0, f25858t);
        f("c2tnb359v1", f50.o.C0, f25859u);
        f("c2pnb368w1", f50.o.D0, f25860v);
        f("c2tnb431r1", f50.o.E0, f25861w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f50.k d(n60.e eVar, String str) {
        f50.k kVar = new f50.k(eVar, org.bouncycastle.util.encoders.b.b(str));
        x.c(kVar.e());
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n60.e e(n60.e eVar) {
        return eVar;
    }

    static void f(String str, org.bouncycastle.asn1.k kVar, f50.j jVar) {
        f25862x.put(str, kVar);
        f25864z.put(kVar, str);
        f25863y.put(kVar, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger g(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.b.b(str));
    }

    public static f50.i h(String str) {
        org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) f25862x.get(r70.m.g(str));
        if (kVar != null) {
            return i(kVar);
        }
        return null;
    }

    public static f50.i i(org.bouncycastle.asn1.k kVar) {
        f50.j jVar = (f50.j) f25863y.get(kVar);
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public static String j(org.bouncycastle.asn1.k kVar) {
        return (String) f25864z.get(kVar);
    }

    public static Enumeration k() {
        return f25862x.keys();
    }

    public static org.bouncycastle.asn1.k l(String str) {
        return (org.bouncycastle.asn1.k) f25862x.get(r70.m.g(str));
    }
}