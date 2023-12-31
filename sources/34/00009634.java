package org.bouncycastle.jcajce.provider.symmetric.util;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.w;
import org.bouncycastle.util.a;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    String algorithm;
    int digest;
    private final AtomicBoolean hasBeenDestroyed;
    private final int iterationCount;
    int ivSize;
    int keySize;
    k oid;
    private final i param;
    private final char[] password;
    private final byte[] salt;
    boolean tryWrong;
    int type;

    public BCPBEKey(String str, k kVar, int i11, int i12, int i13, int i14, PBEKeySpec pBEKeySpec, i iVar) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.oid = kVar;
        this.type = i11;
        this.digest = i12;
        this.keySize = i13;
        this.ivSize = i14;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = iVar;
    }

    public BCPBEKey(String str, i iVar) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.param = iVar;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }

    static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        char[] cArr = this.password;
        if (cArr != null) {
            a.A(cArr, (char) 0);
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            a.y(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        checkDestroyed(this);
        return this.algorithm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDigest() {
        checkDestroyed(this);
        return this.digest;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        checkDestroyed(this);
        i iVar = this.param;
        if (iVar == null) {
            int i11 = this.type;
            return i11 == 2 ? w.PKCS12PasswordToBytes(this.password) : i11 == 5 ? w.PKCS5PasswordToUTF8Bytes(this.password) : w.PKCS5PasswordToBytes(this.password);
        }
        if (iVar instanceof f1) {
            iVar = ((f1) iVar).b();
        }
        return ((b1) iVar).a();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        checkDestroyed(this);
        return this.iterationCount;
    }

    public int getIvSize() {
        checkDestroyed(this);
        return this.ivSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getKeySize() {
        checkDestroyed(this);
        return this.keySize;
    }

    public k getOID() {
        checkDestroyed(this);
        return this.oid;
    }

    public i getParam() {
        checkDestroyed(this);
        return this.param;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        checkDestroyed(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return a.j(cArr);
        }
        throw new IllegalStateException("no password available");
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        checkDestroyed(this);
        return a.h(this.salt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getType() {
        checkDestroyed(this);
        return this.type;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z11) {
        this.tryWrong = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}