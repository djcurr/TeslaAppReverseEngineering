package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class k extends e {
    public k(i iVar, d dVar, long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f26231a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVar.f26232b + (j11 * dVar.f26234d);
        this.f26237a = iVar.J(allocate, j12);
        this.f26238b = iVar.C(allocate, 8 + j12);
        this.f26239c = iVar.C(allocate, 16 + j12);
        this.f26240d = iVar.C(allocate, j12 + 40);
    }
}