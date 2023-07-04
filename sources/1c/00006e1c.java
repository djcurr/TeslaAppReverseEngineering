package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class a extends c {
    public a(i iVar, d dVar, long j11, int i11) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f26231a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = j11 + (i11 * 8);
        this.f26229a = iVar.J(allocate, j12);
        this.f26230b = iVar.J(allocate, j12 + 4);
    }
}