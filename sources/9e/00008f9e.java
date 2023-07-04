package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes5.dex */
public interface g extends c0, WritableByteChannel {
    g E0(int i11);

    OutputStream G1();

    g I();

    g L0(int i11);

    g O0(int i11);

    g T(String str);

    g Z(String str, int i11, int i12);

    f b();

    long b0(e0 e0Var);

    @Override // okio.c0, java.io.Flushable
    void flush();

    g i1(long j11);

    g j0(byte[] bArr);

    g o(byte[] bArr, int i11, int i12);

    g q0(long j11);

    g v();

    g w1(i iVar);

    g x(int i11);

    g z(long j11);
}