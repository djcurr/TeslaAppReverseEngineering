package be;

import android.content.Context;
import java.util.Set;
import jf.h;
import jf.l;
import md.n;

/* loaded from: classes.dex */
public class f implements n<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7637a;

    /* renamed from: b  reason: collision with root package name */
    private final h f7638b;

    /* renamed from: c  reason: collision with root package name */
    private final g f7639c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<ge.d> f7640d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<xe.b> f7641e;

    /* renamed from: f  reason: collision with root package name */
    private final de.f f7642f;

    public f(Context context, b bVar) {
        this(context, l.l(), bVar);
    }

    @Override // md.n
    /* renamed from: a */
    public e get() {
        return new e(this.f7637a, this.f7639c, this.f7638b, this.f7640d, this.f7641e).L(this.f7642f);
    }

    public f(Context context, l lVar, b bVar) {
        this(context, lVar, null, null, bVar);
    }

    public f(Context context, l lVar, Set<ge.d> set, Set<xe.b> set2, b bVar) {
        this.f7637a = context;
        h j11 = lVar.j();
        this.f7638b = j11;
        g gVar = new g();
        this.f7639c = gVar;
        gVar.a(context.getResources(), fe.a.b(), lVar.b(context), kd.h.g(), j11.j(), null, null);
        this.f7640d = set;
        this.f7641e = set2;
        this.f7642f = null;
    }
}