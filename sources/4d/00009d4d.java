package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ServerSRPParams {
    protected BigInteger B;
    protected BigInteger N;

    /* renamed from: g  reason: collision with root package name */
    protected BigInteger f43630g;

    /* renamed from: s  reason: collision with root package name */
    protected byte[] f43631s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.N = bigInteger;
        this.f43630g = bigInteger2;
        this.f43631s = Arrays.clone(bArr);
        this.B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) {
        TlsSRPUtils.writeSRPParameter(this.N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f43630g, outputStream);
        TlsUtils.writeOpaque8(this.f43631s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.B, outputStream);
    }

    public BigInteger getB() {
        return this.B;
    }

    public BigInteger getG() {
        return this.f43630g;
    }

    public BigInteger getN() {
        return this.N;
    }

    public byte[] getS() {
        return this.f43631s;
    }
}