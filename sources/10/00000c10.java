package b6;

import android.graphics.Bitmap;
import androidx.lifecycle.p;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import v20.j0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final p f7424a;

    /* renamed from: b  reason: collision with root package name */
    private final c6.h f7425b;

    /* renamed from: c  reason: collision with root package name */
    private final c6.f f7426c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f7427d;

    /* renamed from: e  reason: collision with root package name */
    private final f6.b f7428e;

    /* renamed from: f  reason: collision with root package name */
    private final c6.d f7429f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f7430g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f7431h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f7432i;

    /* renamed from: j  reason: collision with root package name */
    private final coil.request.a f7433j;

    /* renamed from: k  reason: collision with root package name */
    private final coil.request.a f7434k;

    /* renamed from: l  reason: collision with root package name */
    private final coil.request.a f7435l;

    public c(p pVar, c6.h hVar, c6.f fVar, j0 j0Var, f6.b bVar, c6.d dVar, Bitmap.Config config, Boolean bool, Boolean bool2, coil.request.a aVar, coil.request.a aVar2, coil.request.a aVar3) {
        this.f7424a = pVar;
        this.f7425b = hVar;
        this.f7426c = fVar;
        this.f7427d = j0Var;
        this.f7428e = bVar;
        this.f7429f = dVar;
        this.f7430g = config;
        this.f7431h = bool;
        this.f7432i = bool2;
        this.f7433j = aVar;
        this.f7434k = aVar2;
        this.f7435l = aVar3;
    }

    public final Boolean a() {
        return this.f7431h;
    }

    public final Boolean b() {
        return this.f7432i;
    }

    public final Bitmap.Config c() {
        return this.f7430g;
    }

    public final coil.request.a d() {
        return this.f7434k;
    }

    public final j0 e() {
        return this.f7427d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (s.c(this.f7424a, cVar.f7424a) && s.c(this.f7425b, cVar.f7425b) && this.f7426c == cVar.f7426c && s.c(this.f7427d, cVar.f7427d) && s.c(this.f7428e, cVar.f7428e) && this.f7429f == cVar.f7429f && this.f7430g == cVar.f7430g && s.c(this.f7431h, cVar.f7431h) && s.c(this.f7432i, cVar.f7432i) && this.f7433j == cVar.f7433j && this.f7434k == cVar.f7434k && this.f7435l == cVar.f7435l) {
                return true;
            }
        }
        return false;
    }

    public final p f() {
        return this.f7424a;
    }

    public final coil.request.a g() {
        return this.f7433j;
    }

    public final coil.request.a h() {
        return this.f7435l;
    }

    public int hashCode() {
        p pVar = this.f7424a;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        c6.h hVar = this.f7425b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        c6.f fVar = this.f7426c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        j0 j0Var = this.f7427d;
        int hashCode4 = (hashCode3 + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
        f6.b bVar = this.f7428e;
        int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c6.d dVar = this.f7429f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f7430g;
        int hashCode7 = (hashCode6 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f7431h;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31;
        Boolean bool2 = this.f7432i;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 31;
        coil.request.a aVar = this.f7433j;
        int hashCode10 = (hashCode9 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        coil.request.a aVar2 = this.f7434k;
        int hashCode11 = (hashCode10 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        coil.request.a aVar3 = this.f7435l;
        return hashCode11 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final c6.d i() {
        return this.f7429f;
    }

    public final c6.f j() {
        return this.f7426c;
    }

    public final c6.h k() {
        return this.f7425b;
    }

    public final f6.b l() {
        return this.f7428e;
    }

    public String toString() {
        return "DefinedRequestOptions(lifecycle=" + this.f7424a + ", sizeResolver=" + this.f7425b + ", scale=" + this.f7426c + ", dispatcher=" + this.f7427d + ", transition=" + this.f7428e + ", precision=" + this.f7429f + ", bitmapConfig=" + this.f7430g + ", allowHardware=" + this.f7431h + ", allowRgb565=" + this.f7432i + ", memoryCachePolicy=" + this.f7433j + ", diskCachePolicy=" + this.f7434k + ", networkCachePolicy=" + this.f7435l + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}