package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public interface h extends e0, ReadableByteChannel {
    long B(i iVar);

    long C1(c0 c0Var);

    void G(f fVar, long j11);

    long H(i iVar);

    long H1();

    InputStream I1();

    int J1(u uVar);

    String K(long j11);

    byte[] K0();

    boolean N0();

    long T0();

    boolean V(long j11, i iVar);

    f b();

    String c1(Charset charset);

    String f0();

    byte[] i0(long j11);

    i j1();

    long k0();

    void m0(long j11);

    h peek();

    int r1();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j11);

    void skip(long j11);

    f t();

    String w0(long j11);

    i z0(long j11);
}