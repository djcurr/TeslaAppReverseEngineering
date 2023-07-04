package np;

import a40.a;
import java.nio.ByteBuffer;
import mp.f;
import op.h;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f41774w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f41775x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f41776y = null;

    static {
        n();
    }

    public b() {
        super("esds");
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("ESDescriptorBox.java", b.class);
        bVar.f("method-execution", bVar.e("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        f41774w = bVar.f("method-execution", bVar.e("1", "setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 37);
        f41775x = bVar.f("method-execution", bVar.e("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 42);
        f41776y = bVar.f("method-execution", bVar.e("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 53);
    }

    public boolean equals(Object obj) {
        f.b().c(d40.b.c(f41775x, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f41773o;
        ByteBuffer byteBuffer2 = ((b) obj).f41773o;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        f.b().c(d40.b.b(f41776y, this, this));
        ByteBuffer byteBuffer = this.f41773o;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void w(h hVar) {
        f.b().c(d40.b.c(f41774w, this, this, hVar));
        super.v(hVar);
    }
}