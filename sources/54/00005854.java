package com.stripe.android.stripe3ds2.security;

import aq.b;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.a;
import com.nimbusds.jose.crypto.impl.c;
import com.nimbusds.jose.crypto.impl.f;
import com.nimbusds.jose.crypto.impl.n;
import com.nimbusds.jose.crypto.impl.o;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.s;
import nq.e;
import zp.d;
import zp.h;
import zp.i;
import zp.l;

/* loaded from: classes6.dex */
public final class TransactionEncrypter extends b {
    private final byte counter;

    /* loaded from: classes6.dex */
    public static final class Crypto {
        private static final int BITS_IN_BYTE = 8;
        public static final Crypto INSTANCE = new Crypto();

        private Crypto() {
        }

        private final byte[] getGcmId(int i11, byte b11, byte b12) {
            int i12 = i11 / 8;
            byte[] bArr = new byte[i12];
            Arrays.fill(bArr, b11);
            bArr[i12 - 1] = b12;
            return bArr;
        }

        private final byte[] getGcmIvAtoS(int i11, byte b11) {
            return getGcmId(i11, (byte) -1, b11);
        }

        public final byte[] getGcmIvStoA(int i11, byte b11) {
            return getGcmId(i11, (byte) 0, b11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEncrypter(byte[] key, byte b11) {
        super(new SecretKeySpec(key, "AES"));
        s.g(key, "key");
        this.counter = b11;
    }

    @Override // aq.b, zp.k
    public i encrypt(l header, byte[] clearText) {
        byte[] gcmIvStoA;
        f d11;
        s.g(header, "header");
        s.g(clearText, "clearText");
        h r11 = header.r();
        if (s.c(r11, h.f60604k)) {
            d t11 = header.t();
            if (t11.b() == e.b(getKey().getEncoded())) {
                if (t11.b() == e.b(getKey().getEncoded())) {
                    byte[] a11 = n.a(header, clearText);
                    byte[] b11 = a.b(header);
                    if (s.c(header.t(), d.f60576d)) {
                        gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(128, this.counter);
                        d11 = com.nimbusds.jose.crypto.impl.b.f(getKey(), gcmIvStoA, a11, b11, getJCAContext().d(), getJCAContext().f());
                        s.f(d11, "encryptAuthenticated(\n  …rovider\n                )");
                    } else if (s.c(header.t(), d.f60581i)) {
                        gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(96, this.counter);
                        d11 = c.d(getKey(), new nq.f(gcmIvStoA), a11, b11, null);
                        s.f(d11, "encrypt(key, Container(iv), plainText, aad, null)");
                    } else {
                        throw new JOSEException(com.nimbusds.jose.crypto.impl.e.b(header.t(), o.SUPPORTED_ENCRYPTION_METHODS));
                    }
                    return new i(header, null, nq.c.e(gcmIvStoA), nq.c.e(d11.b()), nq.c.e(d11.a()));
                }
                throw new KeyLengthException("The Content Encryption Key length for " + t11 + " must be " + t11.b() + " bits");
            }
            throw new KeyLengthException(t11.b(), t11);
        }
        throw new JOSEException(s.p("Invalid algorithm ", r11));
    }
}