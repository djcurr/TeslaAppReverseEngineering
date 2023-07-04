package bl;

import com.google.android.vending.licensing.ValidationException;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes3.dex */
public class a implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f7835c = {Tnaf.POW_2_WIDTH, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: a  reason: collision with root package name */
    private Cipher f7836a;

    /* renamed from: b  reason: collision with root package name */
    private Cipher f7837b;

    public a(byte[] bArr, String str, String str2) {
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f7836a = cipher;
            byte[] bArr2 = f7835c;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f7837b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e11) {
            throw new RuntimeException("Invalid environment", e11);
        }
    }

    @Override // bl.h
    public String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            Cipher cipher = this.f7836a;
            return cl.a.e(cipher.doFinal(("com.google.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("Invalid environment", e11);
        } catch (GeneralSecurityException e12) {
            throw new RuntimeException("Invalid environment", e12);
        }
    }

    @Override // bl.h
    public String b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f7837b.doFinal(cl.a.a(str)), "UTF-8");
            if (str3.indexOf("com.google.android.vending.licensing.AESObfuscator-1|" + str2) == 0) {
                return str3.substring(53 + str2.length(), str3.length());
            }
            throw new ValidationException("Header not found (invalid data or key):" + str);
        } catch (Base64DecoderException e11) {
            throw new ValidationException(e11.getMessage() + ":" + str);
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("Invalid environment", e12);
        } catch (BadPaddingException e13) {
            throw new ValidationException(e13.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e14) {
            throw new ValidationException(e14.getMessage() + ":" + str);
        }
    }
}