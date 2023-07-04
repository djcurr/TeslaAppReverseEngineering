package yi;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f59598a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f59599b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f59598a = byteArrayOutputStream;
        this.f59599b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void c(DataOutputStream dataOutputStream, long j11) {
        dataOutputStream.writeByte(((int) (j11 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j11 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j11 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j11) & 255);
    }

    public byte[] a(a aVar) {
        this.f59598a.reset();
        try {
            b(this.f59599b, aVar.f59592a);
            String str = aVar.f59593b;
            if (str == null) {
                str = "";
            }
            b(this.f59599b, str);
            c(this.f59599b, aVar.f59594c);
            c(this.f59599b, aVar.f59595d);
            this.f59599b.write(aVar.f59596e);
            this.f59599b.flush();
            return this.f59598a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}