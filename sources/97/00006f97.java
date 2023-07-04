package g3;

import f3.d;
import f3.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f27540a;

    /* renamed from: b  reason: collision with root package name */
    f3.e f27541b;

    /* renamed from: c  reason: collision with root package name */
    m f27542c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f27543d;

    /* renamed from: e  reason: collision with root package name */
    g f27544e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f27545f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f27546g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f27547h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f27548i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f27549j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27550a;

        static {
            int[] iArr = new int[d.b.values().length];
            f27550a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27550a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27550a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27550a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27550a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(f3.e eVar) {
        this.f27541b = eVar;
    }

    private void l(int i11, int i12) {
        int i13;
        int i14 = this.f27540a;
        if (i14 == 0) {
            this.f27544e.d(g(i12, i11));
        } else if (i14 == 1) {
            this.f27544e.d(Math.min(g(this.f27544e.f27522m, i11), i12));
        } else if (i14 == 2) {
            f3.e J = this.f27541b.J();
            if (J != null) {
                g gVar = (i11 == 0 ? J.f25708d : J.f25710e).f27544e;
                if (gVar.f27519j) {
                    f3.e eVar = this.f27541b;
                    this.f27544e.d(g((int) ((gVar.f27516g * (i11 == 0 ? eVar.f25749z : eVar.C)) + 0.5f), i11));
                }
            }
        } else if (i14 != 3) {
        } else {
            f3.e eVar2 = this.f27541b;
            p pVar = eVar2.f25708d;
            e.b bVar = pVar.f27543d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f27540a == 3) {
                n nVar = eVar2.f25710e;
                if (nVar.f27543d == bVar2 && nVar.f27540a == 3) {
                    return;
                }
            }
            if (i11 == 0) {
                pVar = eVar2.f25710e;
            }
            if (pVar.f27544e.f27519j) {
                float t11 = eVar2.t();
                if (i11 == 1) {
                    i13 = (int) ((pVar.f27544e.f27516g / t11) + 0.5f);
                } else {
                    i13 = (int) ((t11 * pVar.f27544e.f27516g) + 0.5f);
                }
                this.f27544e.d(i13);
            }
        }
    }

    @Override // g3.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i11) {
        fVar.f27521l.add(fVar2);
        fVar.f27515f = i11;
        fVar2.f27520k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i11, g gVar) {
        fVar.f27521l.add(fVar2);
        fVar.f27521l.add(this.f27544e);
        fVar.f27517h = i11;
        fVar.f27518i = gVar;
        fVar2.f27520k.add(fVar);
        gVar.f27520k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i11, int i12) {
        int max;
        if (i12 == 0) {
            f3.e eVar = this.f27541b;
            int i13 = eVar.f25748y;
            max = Math.max(eVar.f25747x, i11);
            if (i13 > 0) {
                max = Math.min(i13, i11);
            }
            if (max == i11) {
                return i11;
            }
        } else {
            f3.e eVar2 = this.f27541b;
            int i14 = eVar2.B;
            max = Math.max(eVar2.A, i11);
            if (i14 > 0) {
                max = Math.min(i14, i11);
            }
            if (max == i11) {
                return i11;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(f3.d dVar) {
        f3.d dVar2 = dVar.f25696f;
        if (dVar2 == null) {
            return null;
        }
        f3.e eVar = dVar2.f25694d;
        int i11 = a.f27550a[dVar2.f25695e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return eVar.f25710e.f27548i;
                    }
                    return eVar.f25710e.f27531k;
                }
                return eVar.f25710e.f27547h;
            }
            return eVar.f25708d.f27548i;
        }
        return eVar.f25708d.f27547h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(f3.d dVar, int i11) {
        f3.d dVar2 = dVar.f25696f;
        if (dVar2 == null) {
            return null;
        }
        f3.e eVar = dVar2.f25694d;
        p pVar = i11 == 0 ? eVar.f25708d : eVar.f25710e;
        int i12 = a.f27550a[dVar2.f25695e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f27548i;
        }
        return pVar.f27547h;
    }

    public long j() {
        g gVar = this.f27544e;
        if (gVar.f27519j) {
            return gVar.f27516g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f27546g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, f3.d dVar2, f3.d dVar3, int i11) {
        f h11 = h(dVar2);
        f h12 = h(dVar3);
        if (h11.f27519j && h12.f27519j) {
            int e11 = h11.f27516g + dVar2.e();
            int e12 = h12.f27516g - dVar3.e();
            int i12 = e12 - e11;
            if (!this.f27544e.f27519j && this.f27543d == e.b.MATCH_CONSTRAINT) {
                l(i11, i12);
            }
            g gVar = this.f27544e;
            if (gVar.f27519j) {
                if (gVar.f27516g == i12) {
                    this.f27547h.d(e11);
                    this.f27548i.d(e12);
                    return;
                }
                f3.e eVar = this.f27541b;
                float w11 = i11 == 0 ? eVar.w() : eVar.R();
                if (h11 == h12) {
                    e11 = h11.f27516g;
                    e12 = h12.f27516g;
                    w11 = 0.5f;
                }
                this.f27547h.d((int) (e11 + 0.5f + (((e12 - e11) - this.f27544e.f27516g) * w11)));
                this.f27548i.d(this.f27547h.f27516g + this.f27544e.f27516g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(d dVar) {
    }
}