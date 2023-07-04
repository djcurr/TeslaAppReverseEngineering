package np;

import a40.a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mp.c;
import mp.f;
import op.l;

/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: p  reason: collision with root package name */
    private static Logger f41770p;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f41771q = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f41772t = null;

    /* renamed from: o  reason: collision with root package name */
    protected ByteBuffer f41773o;

    static {
        n();
        f41770p = Logger.getLogger(a.class.getName());
    }

    public a(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("AbstractDescriptorBox.java", a.class);
        bVar.f("method-execution", bVar.e("1", "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        bVar.f("method-execution", bVar.e("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        bVar.f("method-execution", bVar.e("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        f41771q = bVar.f("method-execution", bVar.e("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        f41772t = bVar.f("method-execution", bVar.e("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", MessageExtension.FIELD_DATA, "", "void"), 70);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f41773o = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.f41773o.rewind();
            l.a(-1, this.f41773o);
        } catch (IOException e11) {
            f41770p.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e11);
        } catch (IndexOutOfBoundsException e12) {
            f41770p.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e12);
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f41773o.rewind();
        byteBuffer.put(this.f41773o);
    }

    @Override // mp.a
    protected long d() {
        return this.f41773o.limit() + 4;
    }

    public void u(ByteBuffer byteBuffer) {
        f.b().c(d40.b.c(f41772t, this, this, byteBuffer));
        this.f41773o = byteBuffer;
    }

    public void v(op.b bVar) {
        f.b().c(d40.b.c(f41771q, this, this, bVar));
    }
}