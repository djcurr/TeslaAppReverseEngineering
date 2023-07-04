package bl;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final i f7866a;

    /* renamed from: b  reason: collision with root package name */
    private final e f7867b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7868c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7869d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7870e;

    /* renamed from: f  reason: collision with root package name */
    private final c f7871f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(i iVar, c cVar, e eVar, int i11, String str, String str2) {
        this.f7866a = iVar;
        this.f7871f = cVar;
        this.f7867b = eVar;
        this.f7868c = i11;
        this.f7869d = str;
        this.f7870e = str2;
    }

    private void d(int i11) {
        this.f7867b.b(i11);
    }

    private void e() {
        this.f7867b.c(561);
    }

    private void f(int i11, k kVar) {
        this.f7866a.b(i11, kVar);
        if (this.f7866a.a()) {
            this.f7867b.a(i11);
        } else {
            this.f7867b.c(i11);
        }
    }

    public e a() {
        return this.f7867b;
    }

    public int b() {
        return this.f7868c;
    }

    public String c() {
        return this.f7869d;
    }

    public void g(PublicKey publicKey, int i11, String str, String str2) {
        k kVar;
        String str3 = null;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            try {
                if (TextUtils.isEmpty(str)) {
                    Log.e("LicenseValidator", "Signature verification failed: signedData is empty. (Device not signed-in to any Google accounts?)");
                    e();
                    return;
                }
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(cl.a.a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    e();
                    return;
                }
                try {
                    k a11 = k.a(str);
                    if (a11.f7875a != i11) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        e();
                        return;
                    } else if (a11.f7876b != this.f7868c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        e();
                        return;
                    } else if (!a11.f7877c.equals(this.f7869d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        e();
                        return;
                    } else if (!a11.f7878d.equals(this.f7870e)) {
                        Log.e("LicenseValidator", "Version codes don't match.");
                        e();
                        return;
                    } else {
                        String str4 = a11.f7879e;
                        if (TextUtils.isEmpty(str4)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            e();
                            return;
                        }
                        str3 = str4;
                        kVar = a11;
                    }
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    e();
                    return;
                }
            } catch (Base64DecoderException unused2) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                e();
                return;
            } catch (InvalidKeyException unused3) {
                d(5);
                return;
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            } catch (SignatureException e12) {
                throw new RuntimeException(e12);
            }
        } else {
            kVar = null;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                f(561, kVar);
                return;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    d(3);
                    return;
                } else if (i11 == 4) {
                    Log.w("LicenseValidator", "An error has occurred on the licensing server.");
                    f(291, kVar);
                    return;
                } else if (i11 != 5) {
                    switch (i11) {
                        case 257:
                            Log.w("LicenseValidator", "Error contacting licensing server.");
                            f(291, kVar);
                            return;
                        case 258:
                            d(1);
                            return;
                        case 259:
                            d(2);
                            return;
                        default:
                            Log.e("LicenseValidator", "Unknown response code for license check.");
                            e();
                            return;
                    }
                } else {
                    Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
                    f(291, kVar);
                    return;
                }
            }
        }
        f(this.f7871f.a(str3), kVar);
    }
}