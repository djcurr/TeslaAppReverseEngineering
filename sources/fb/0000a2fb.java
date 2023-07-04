package org.spongycastle.openssl;

import java.io.IOException;
import java.io.Writer;
import org.spongycastle.openssl.jcajce.JcaMiscPEMGenerator;
import org.spongycastle.util.io.pem.PemGenerationException;
import org.spongycastle.util.io.pem.PemObjectGenerator;
import org.spongycastle.util.io.pem.PemWriter;

/* loaded from: classes4.dex */
public class PEMWriter extends PemWriter {
    public PEMWriter(Writer writer) {
        super(writer);
    }

    public void writeObject(Object obj) {
        writeObject(obj, null);
    }

    public void writeObject(Object obj, PEMEncryptor pEMEncryptor) {
        try {
            super.writeObject((PemObjectGenerator) new JcaMiscPEMGenerator(obj, pEMEncryptor));
        } catch (PemGenerationException e11) {
            if (e11.getCause() instanceof IOException) {
                throw ((IOException) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // org.spongycastle.util.io.pem.PemWriter
    public void writeObject(PemObjectGenerator pemObjectGenerator) {
        super.writeObject(pemObjectGenerator);
    }
}