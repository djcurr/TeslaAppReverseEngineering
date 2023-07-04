package gv;

import bu.a1;
import bu.a4;
import bu.b1;
import bu.b2;
import bu.b4;
import bu.d0;
import bu.d1;
import bu.f1;
import bu.g2;
import bu.j3;
import bu.n2;
import bu.n3;
import bu.o2;
import bu.z1;
import java.security.MessageDigest;
import java.util.List;
import java.util.UUID;
import okio.i;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import wz.w;

/* loaded from: classes6.dex */
public final class i {
    static {
        new i();
    }

    private i() {
    }

    public static final yt.f a(yt.b domain, byte[] protobufMessageAsBytes) {
        kotlin.jvm.internal.s.g(domain, "domain");
        kotlin.jvm.internal.s.g(protobufMessageAsBytes, "protobufMessageAsBytes");
        yt.a aVar = new yt.a(domain, null, null, 6, null);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.s.f(randomUUID, "randomUUID()");
        return new yt.f(aVar, new yt.a(null, zu.j.i(randomUUID), null, 5, null), null, null, null, 0, i.a.h(okio.i.f42657e, protobufMessageAsBytes, 0, 0, 3, null), null, null, null, null, 1980, null);
    }

    public static final o2 b(n2 signatureType, byte[] ciphertext, byte[] bArr, long j11, byte[] bArr2) {
        kotlin.jvm.internal.s.g(signatureType, "signatureType");
        kotlin.jvm.internal.s.g(ciphertext, "ciphertext");
        i.a aVar = okio.i.f42657e;
        o2 o2Var = new o2(null, 0, null, i.a.h(aVar, ciphertext, 0, 0, 3, null), signatureType, null, null, 103, null);
        return ((signatureType != n2.SIGNATURE_TYPE_AES_GCM && signatureType != n2.SIGNATURE_TYPE_AES_GCM_TOKEN) || bArr2 == null || bArr == null) ? o2Var : o2.b(o2Var, null, (int) j11, i.a.h(aVar, bArr2, 0, 0, 3, null), null, null, i.a.h(aVar, bArr, 0, 0, 3, null), null, 89, null);
    }

    public static final j3 c(o2 signedMessage) {
        kotlin.jvm.internal.s.g(signedMessage, "signedMessage");
        return new j3(signedMessage, null, null, 6, null);
    }

    public static final j3 d(n3 unsignedMessage) {
        kotlin.jvm.internal.s.g(unsignedMessage, "unsignedMessage");
        return new j3(null, unsignedMessage, null, 5, null);
    }

    public static final n3 e(bu.d detectedActivity) {
        kotlin.jvm.internal.s.g(detectedActivity, "detectedActivity");
        return new n3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, detectedActivity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 31, null);
    }

    public static final n3 f(bu.o authenticationResponse) {
        kotlin.jvm.internal.s.g(authenticationResponse, "authenticationResponse");
        return new n3(null, null, null, authenticationResponse, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 31, null);
    }

    public static final n3 g(d0 action) {
        kotlin.jvm.internal.s.g(action, "action");
        return new n3(null, null, null, null, action, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 31, null);
    }

    public static final n3 h(a1 state) {
        kotlin.jvm.internal.s.g(state, "state");
        return new n3(null, null, null, null, null, null, null, null, null, null, null, state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 31, null);
    }

    public static final n3 i(b1 informationRequest) {
        kotlin.jvm.internal.s.g(informationRequest, "informationRequest");
        return new n3(null, informationRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 31, null);
    }

    public static final n3 j(f1 keyMetadata) {
        kotlin.jvm.internal.s.g(keyMetadata, "keyMetadata");
        return new n3(null, null, null, null, null, null, null, null, null, keyMetadata, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 31, null);
    }

    public static final n3 k(g2 action) {
        kotlin.jvm.internal.s.g(action, "action");
        return new n3(null, null, action, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 31, null);
    }

    public static final n3 l(b4 whitelistOperation) {
        kotlin.jvm.internal.s.g(whitelistOperation, "whitelistOperation");
        return new n3(null, null, null, null, null, null, whitelistOperation, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 31, null);
    }

    public static final n3 m(String hardwareModel) {
        okio.i h11;
        kotlin.jvm.internal.s.g(hardwareModel, "hardwareModel");
        try {
            i.a aVar = okio.i.f42657e;
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            byte[] bytes = hardwareModel.getBytes(kotlin.text.d.f35187b);
            kotlin.jvm.internal.s.f(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            kotlin.jvm.internal.s.f(digest, "getInstance(\"SHA-256\")\n …dwareModel.toByteArray())");
            h11 = i.a.h(aVar, digest, 0, 0, 3, null);
        } catch (Exception unused) {
            i.a aVar2 = okio.i.f42657e;
            byte[] bytes2 = "DEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEF".getBytes(kotlin.text.d.f35187b);
            kotlin.jvm.internal.s.f(bytes2, "(this as java.lang.String).getBytes(charset)");
            h11 = i.a.h(aVar2, bytes2, 0, 0, 3, null);
        }
        return new n3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new bu.g(h11, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, -67108865, 31, null);
    }

    public static final n3 n(xt.b sessionInfoRequest) {
        kotlin.jvm.internal.s.g(sessionInfoRequest, "sessionInfoRequest");
        return new n3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, sessionInfoRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, 31, null);
    }

    public static final b4 o(b2 publicKey, boolean z11) {
        List l11;
        kotlin.jvm.internal.s.g(publicKey, "publicKey");
        b4 b4Var = new b4(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        if (z11) {
            l11 = w.l(a4.WHITELISTKEYPERMISSION_LOCAL_UNLOCK, a4.WHITELISTKEYPERMISSION_LOCAL_DRIVE, a4.WHITELISTKEYPERMISSION_REMOTE_UNLOCK, a4.WHITELISTKEYPERMISSION_REMOTE_DRIVE);
            return b4.b(b4.b(b4Var, null, null, null, null, null, new z1(publicKey, l11, 0, null, null, 28, null), null, null, null, null, null, null, 4063, null), new f1(d1.KEY_FORM_FACTOR_ANDROID_DEVICE, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
        }
        return b4.b(b4Var, null, null, publicKey, null, null, null, null, null, null, null, null, null, 4091, null);
    }
}