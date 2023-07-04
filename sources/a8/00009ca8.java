package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

/* loaded from: classes4.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i11, int i12, int i13) {
        this(secureRandom, i11, i12, i13, false);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getCntSmallPrimes() {
        return this.cntSmallPrimes;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i11, int i12, int i13, boolean z11) {
        super(secureRandom, i11);
        this.debug = false;
        this.certainty = i12;
        if (i13 % 2 == 1) {
            throw new IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        }
        if (i13 >= 30) {
            this.cntSmallPrimes = i13;
            this.debug = z11;
            return;
        }
        throw new IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
    }
}