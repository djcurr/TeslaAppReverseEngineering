package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class b extends c {
    public b(i iVar, d dVar, long j11, int i11) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f26231a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = j11 + (i11 * 16);
        this.f26229a = iVar.C(allocate, j12);
        this.f26230b = iVar.C(allocate, j12 + 8);
    }
}