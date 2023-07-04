package ab;

import android.content.Context;
import bb.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private final int f370b;

    /* renamed from: c  reason: collision with root package name */
    private final ha.b f371c;

    private a(int i11, ha.b bVar) {
        this.f370b = i11;
        this.f371c = bVar;
    }

    public static ha.b c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        this.f371c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f370b).array());
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f370b == aVar.f370b && this.f371c.equals(aVar.f371c);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return k.o(this.f371c, this.f370b);
    }
}