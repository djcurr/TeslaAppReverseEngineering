package yp;

import a40.a;
import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.List;
import mp.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class a extends mp.a {
    private static final /* synthetic */ a.InterfaceC0010a A = null;
    private static final /* synthetic */ a.InterfaceC0010a B = null;

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59671l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59672m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59673n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59674o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59675p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59676q = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59677t = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59678w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59679x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59680y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f59681z = null;

    /* renamed from: k  reason: collision with root package name */
    public b f59682k;

    static {
        n();
    }

    public a() {
        super("avcC");
        this.f59682k = new b();
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("AvcConfigurationBox.java", a.class);
        bVar.f("method-execution", bVar.e("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        bVar.f("method-execution", bVar.e("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        f59674o = bVar.f("method-execution", bVar.e("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        f59675p = bVar.f("method-execution", bVar.e("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        f59676q = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        f59677t = bVar.f("method-execution", bVar.e("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        bVar.f("method-execution", bVar.e("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        f59678w = bVar.f("method-execution", bVar.e("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        bVar.f("method-execution", bVar.e("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        f59679x = bVar.f("method-execution", bVar.e("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        bVar.f("method-execution", bVar.e("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        f59680y = bVar.f("method-execution", bVar.e("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        bVar.f("method-execution", bVar.e("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        bVar.f("method-execution", bVar.e("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        bVar.f("method-execution", bVar.e("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        bVar.f("method-execution", bVar.e("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        bVar.f("method-execution", bVar.e("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        f59681z = bVar.f("method-execution", bVar.e("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        A = bVar.f("method-execution", bVar.e("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        bVar.f("method-execution", bVar.e("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        bVar.f("method-execution", bVar.e("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        bVar.f("method-execution", bVar.e("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
        B = bVar.f("method-execution", bVar.e("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        bVar.f("method-execution", bVar.e("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        bVar.f("method-execution", bVar.e("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        bVar.f("method-execution", bVar.e("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        bVar.f("method-execution", bVar.e("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        f59671l = bVar.f("method-execution", bVar.e("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        f59672m = bVar.f("method-execution", bVar.e("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        f59673n = bVar.f("method-execution", bVar.e("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        this.f59682k = new b(byteBuffer);
    }

    @Override // mp.a
    public void c(ByteBuffer byteBuffer) {
        f.b().c(d40.b.c(A, this, this, byteBuffer));
        this.f59682k.a(byteBuffer);
    }

    @Override // mp.a
    public long d() {
        f.b().c(d40.b.b(f59681z, this, this));
        return this.f59682k.b();
    }

    public void o(int i11) {
        f.b().c(d40.b.c(f59674o, this, this, c40.a.d(i11)));
        this.f59682k.f59686d = i11;
    }

    public void p(int i11) {
        f.b().c(d40.b.c(f59672m, this, this, c40.a.d(i11)));
        this.f59682k.f59684b = i11;
    }

    public void q(int i11) {
        f.b().c(d40.b.c(f59680y, this, this, c40.a.d(i11)));
        this.f59682k.f59693k = i11;
    }

    public void r(int i11) {
        f.b().c(d40.b.c(f59679x, this, this, c40.a.d(i11)));
        this.f59682k.f59692j = i11;
    }

    public void s(int i11) {
        f.b().c(d40.b.c(f59678w, this, this, c40.a.d(i11)));
        this.f59682k.f59691i = i11;
    }

    public void t(int i11) {
        f.b().c(d40.b.c(f59671l, this, this, c40.a.d(i11)));
        this.f59682k.f59683a = i11;
    }

    public String toString() {
        f.b().c(d40.b.b(B, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f59682k + CoreConstants.CURLY_RIGHT;
    }

    public void u(int i11) {
        f.b().c(d40.b.c(f59675p, this, this, c40.a.d(i11)));
        this.f59682k.f59687e = i11;
    }

    public void v(List<byte[]> list) {
        f.b().c(d40.b.c(f59677t, this, this, list));
        this.f59682k.f59689g = list;
    }

    public void w(int i11) {
        f.b().c(d40.b.c(f59673n, this, this, c40.a.d(i11)));
        this.f59682k.f59685c = i11;
    }

    public void x(List<byte[]> list) {
        f.b().c(d40.b.c(f59676q, this, this, list));
        this.f59682k.f59688f = list;
    }
}