package atd.d0;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes.dex */
final class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final OAEPParameterSpec f6847a;

    static {
        atd.s0.a.a(-799326437435968L);
        atd.s0.a.a(-799098804169280L);
        f6847a = new OAEPParameterSpec(atd.s0.a.a(-798420199336512L), atd.s0.a.a(-798454559074880L), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
    }

    @Override // atd.b0.a
    public String a() {
        return atd.s0.a.a(-798823926262336L);
    }

    @Override // atd.d0.f
    public atd.c0.d a(atd.f0.f fVar, atd.g0.b bVar) {
        atd.g0.b.a(bVar, atd.g0.d.class);
        return a(fVar.e());
    }

    public atd.c0.d a(atd.c0.b bVar) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(bVar.e());
            keyGenerator.init(bVar.f());
            return new atd.c0.d(keyGenerator.generateKey(), bVar);
        } catch (NoSuchAlgorithmException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    @Override // atd.d0.e
    public byte[] a(atd.c0.d dVar, RSAPublicKey rSAPublicKey) {
        try {
            Cipher cipher = Cipher.getInstance(atd.s0.a.a(-798871170902592L));
            cipher.init(3, rSAPublicKey, f6847a);
            return cipher.wrap(dVar);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }
}