package org.spongycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.Writer;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Base64;

/* loaded from: classes4.dex */
public class PemWriter extends BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private char[] buf;
    private final int nlLength;

    public PemWriter(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String lineSeparator = Strings.lineSeparator();
        if (lineSeparator != null) {
            this.nlLength = lineSeparator.length();
        } else {
            this.nlLength = 2;
        }
    }

    private void writeEncoded(byte[] bArr) {
        char[] cArr;
        int i11;
        byte[] encode = Base64.encode(bArr);
        int i12 = 0;
        while (i12 < encode.length) {
            int i13 = 0;
            while (true) {
                cArr = this.buf;
                if (i13 != cArr.length && (i11 = i12 + i13) < encode.length) {
                    cArr[i13] = (char) encode[i11];
                    i13++;
                }
            }
            write(cArr, 0, i13);
            newLine();
            i12 += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) {
        write("-----END " + str + "-----");
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public int getOutputSize(PemObject pemObject) {
        int length = ((pemObject.getType().length() + 10 + this.nlLength) * 2) + 6 + 4;
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                length += pemHeader.getName().length() + 2 + pemHeader.getValue().length() + this.nlLength;
            }
            length += this.nlLength;
        }
        int length2 = ((pemObject.getContent().length + 2) / 3) * 4;
        return length + length2 + ((((length2 + 64) - 1) / 64) * this.nlLength);
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) {
        PemObject generate = pemObjectGenerator.generate();
        writePreEncapsulationBoundary(generate.getType());
        if (!generate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : generate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(generate.getContent());
        writePostEncapsulationBoundary(generate.getType());
    }
}