package nj;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import fi.f;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class d extends fi.g<i, j, SubtitleDecoderException> implements g {
    public d(String str) {
        super(new i[2], new j[2]);
        u(1024);
    }

    public static /* synthetic */ void v(d dVar, fi.f fVar) {
        dVar.r(fVar);
    }

    protected abstract f A(byte[] bArr, int i11, boolean z11);

    @Override // nj.g
    public void a(long j11) {
    }

    @Override // fi.g
    /* renamed from: w */
    public final i g() {
        return new i();
    }

    @Override // fi.g
    /* renamed from: x */
    public final j h() {
        return new e(new f.a() { // from class: nj.c
            @Override // fi.f.a
            public final void a(fi.f fVar) {
                d.v(d.this, (j) fVar);
            }
        });
    }

    @Override // fi.g
    /* renamed from: y */
    public final SubtitleDecoderException i(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // fi.g
    /* renamed from: z */
    public final SubtitleDecoderException j(i iVar, j jVar, boolean z11) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ak.a.e(iVar.f13264c);
            jVar.r(iVar.f13266e, A(byteBuffer.array(), byteBuffer.limit(), z11), iVar.f41727i);
            jVar.g(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e11) {
            return e11;
        }
    }
}