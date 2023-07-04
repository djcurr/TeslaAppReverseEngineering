package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata;
import com.plaid.internal.wa;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class e4 {

    /* renamed from: a  reason: collision with root package name */
    public final e f18519a;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18520a;

        static {
            int[] iArr = new int[i1.values().length];
            iArr[i1.SDK_ENCRYPTION_SCHEME_RSA_PKCS1.ordinal()] = 1;
            iArr[i1.SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1.ordinal()] = 2;
            iArr[i1.SDK_ENCRYPTION_SCHEME_UNKNOWN.ordinal()] = 3;
            f18520a = iArr;
        }
    }

    public e4(e base64Helper) {
        kotlin.jvm.internal.s.g(base64Helper, "base64Helper");
        this.f18519a = base64Helper;
    }

    public final String a(String message, Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        Cipher cipher;
        kotlin.jvm.internal.s.g(message, "message");
        if (common$SDKEncryptionMetadata != null) {
            String publicEncryptionPemKey = common$SDKEncryptionMetadata.getPublicEncryptionPemKey();
            if (!(publicEncryptionPemKey == null || publicEncryptionPemKey.length() == 0)) {
                try {
                    i1 scheme = common$SDKEncryptionMetadata.getScheme();
                    kotlin.jvm.internal.s.f(scheme, "encryption.scheme");
                    int i11 = a.f18520a[scheme.ordinal()];
                    if (i11 != 1) {
                        cipher = i11 != 2 ? null : Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                    } else {
                        cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
                    }
                    if (cipher == null) {
                        wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("This SDK doesn't support encryption scheme: ", common$SDKEncryptionMetadata.getScheme()), false, 2);
                        return null;
                    }
                    String publicEncryptionPemKey2 = common$SDKEncryptionMetadata.getPublicEncryptionPemKey();
                    kotlin.jvm.internal.s.f(publicEncryptionPemKey2, "encryption.publicEncryptionPemKey");
                    cipher.init(1, a(publicEncryptionPemKey2));
                    byte[] bytes = message.getBytes(kotlin.text.d.f35187b);
                    kotlin.jvm.internal.s.f(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] encrypted = cipher.doFinal(bytes);
                    e eVar = this.f18519a;
                    kotlin.jvm.internal.s.f(encrypted, "encrypted");
                    return eVar.a(encrypted, 2);
                } catch (Exception e11) {
                    wa.a.a(wa.f19678a, (Throwable) e11, false, 2);
                }
            }
        }
        return null;
    }

    public final PublicKey a(String str) {
        String D;
        String D2;
        String D3;
        String D4;
        D = kotlin.text.v.D(str, "\n", "", false, 4, null);
        D2 = kotlin.text.v.D(D, "\r", "", false, 4, null);
        D3 = kotlin.text.v.D(D2, "-----BEGIN RSA PUBLIC KEY-----", "", false, 4, null);
        D4 = kotlin.text.v.D(D3, "-----END RSA PUBLIC KEY-----", "", false, 4, null);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(this.f18519a.a(D4, 0));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        kotlin.jvm.internal.s.f(keyFactory, "getInstance(\"RSA\")");
        try {
            PublicKey generatePublic = keyFactory.generatePublic(x509EncodedKeySpec);
            kotlin.jvm.internal.s.f(generatePublic, "{\n      keyFactory.generatePublic(keySpec)\n    }");
            return generatePublic;
        } catch (Exception unused) {
            w40.t e11 = w40.t.e(org.bouncycastle.util.encoders.a.a(D4));
            PublicKey generatePublic2 = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(e11.f(), e11.h()));
            if (generatePublic2 != null) {
                return generatePublic2;
            }
            throw new RuntimeException("Unable to generate PKCS1 Public Key");
        }
    }
}