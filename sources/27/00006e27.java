package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class l extends f {
    public l(i iVar, d dVar, int i11) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f26231a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f26241a = iVar.J(allocate, dVar.f26233c + (i11 * dVar.f26236f) + 28);
    }
}