package w0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final p f55181a = new c(a(new kotlin.jvm.internal.f0() { // from class: w0.q.b
        @Override // kotlin.jvm.internal.f0, n00.o
        public Object get(Object obj) {
            return Boolean.valueOf(b2.d.d(((b2.b) obj).f()));
        }
    }));

    /* loaded from: classes.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<b2.b, Boolean> f55182a;

        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super b2.b, Boolean> lVar) {
            this.f55182a = lVar;
        }

        @Override // w0.p
        public n a(KeyEvent event) {
            kotlin.jvm.internal.s.g(event, "event");
            if (this.f55182a.invoke(b2.b.a(event)).booleanValue() && b2.d.e(event)) {
                if (b2.a.l(b2.d.a(event), x.f55246a.v())) {
                    return n.REDO;
                }
                return null;
            } else if (this.f55182a.invoke(b2.b.a(event)).booleanValue()) {
                long a11 = b2.d.a(event);
                x xVar = x.f55246a;
                if (b2.a.l(a11, xVar.d()) ? true : b2.a.l(a11, xVar.m())) {
                    return n.COPY;
                }
                if (b2.a.l(a11, xVar.t())) {
                    return n.PASTE;
                }
                if (b2.a.l(a11, xVar.u())) {
                    return n.CUT;
                }
                if (b2.a.l(a11, xVar.a())) {
                    return n.SELECT_ALL;
                }
                if (b2.a.l(a11, xVar.v())) {
                    return n.UNDO;
                }
                return null;
            } else if (b2.d.d(event)) {
                return null;
            } else {
                if (b2.d.e(event)) {
                    long a12 = b2.d.a(event);
                    x xVar2 = x.f55246a;
                    if (b2.a.l(a12, xVar2.h())) {
                        return n.SELECT_LEFT_CHAR;
                    }
                    if (b2.a.l(a12, xVar2.i())) {
                        return n.SELECT_RIGHT_CHAR;
                    }
                    if (b2.a.l(a12, xVar2.j())) {
                        return n.SELECT_UP;
                    }
                    if (b2.a.l(a12, xVar2.g())) {
                        return n.SELECT_DOWN;
                    }
                    if (b2.a.l(a12, xVar2.q())) {
                        return n.SELECT_PAGE_UP;
                    }
                    if (b2.a.l(a12, xVar2.p())) {
                        return n.SELECT_PAGE_DOWN;
                    }
                    if (b2.a.l(a12, xVar2.o())) {
                        return n.SELECT_LINE_START;
                    }
                    if (b2.a.l(a12, xVar2.n())) {
                        return n.SELECT_LINE_END;
                    }
                    if (b2.a.l(a12, xVar2.m())) {
                        return n.PASTE;
                    }
                    return null;
                }
                long a13 = b2.d.a(event);
                x xVar3 = x.f55246a;
                if (b2.a.l(a13, xVar3.h())) {
                    return n.LEFT_CHAR;
                }
                if (b2.a.l(a13, xVar3.i())) {
                    return n.RIGHT_CHAR;
                }
                if (b2.a.l(a13, xVar3.j())) {
                    return n.UP;
                }
                if (b2.a.l(a13, xVar3.g())) {
                    return n.DOWN;
                }
                if (b2.a.l(a13, xVar3.q())) {
                    return n.PAGE_UP;
                }
                if (b2.a.l(a13, xVar3.p())) {
                    return n.PAGE_DOWN;
                }
                if (b2.a.l(a13, xVar3.o())) {
                    return n.LINE_START;
                }
                if (b2.a.l(a13, xVar3.n())) {
                    return n.LINE_END;
                }
                if (b2.a.l(a13, xVar3.k())) {
                    return n.NEW_LINE;
                }
                if (b2.a.l(a13, xVar3.c())) {
                    return n.DELETE_PREV_CHAR;
                }
                if (b2.a.l(a13, xVar3.f())) {
                    return n.DELETE_NEXT_CHAR;
                }
                if (b2.a.l(a13, xVar3.r())) {
                    return n.PASTE;
                }
                if (b2.a.l(a13, xVar3.e())) {
                    return n.CUT;
                }
                if (b2.a.l(a13, xVar3.s())) {
                    return n.TAB;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f55184a;

        c(p pVar) {
            this.f55184a = pVar;
        }

        @Override // w0.p
        public n a(KeyEvent event) {
            kotlin.jvm.internal.s.g(event, "event");
            n nVar = null;
            if (b2.d.e(event) && b2.d.d(event)) {
                long a11 = b2.d.a(event);
                x xVar = x.f55246a;
                if (b2.a.l(a11, xVar.h())) {
                    nVar = n.SELECT_LEFT_WORD;
                } else if (b2.a.l(a11, xVar.i())) {
                    nVar = n.SELECT_RIGHT_WORD;
                } else if (b2.a.l(a11, xVar.j())) {
                    nVar = n.SELECT_PREV_PARAGRAPH;
                } else if (b2.a.l(a11, xVar.g())) {
                    nVar = n.SELECT_NEXT_PARAGRAPH;
                }
            } else if (b2.d.d(event)) {
                long a12 = b2.d.a(event);
                x xVar2 = x.f55246a;
                if (b2.a.l(a12, xVar2.h())) {
                    nVar = n.LEFT_WORD;
                } else if (b2.a.l(a12, xVar2.i())) {
                    nVar = n.RIGHT_WORD;
                } else if (b2.a.l(a12, xVar2.j())) {
                    nVar = n.PREV_PARAGRAPH;
                } else if (b2.a.l(a12, xVar2.g())) {
                    nVar = n.NEXT_PARAGRAPH;
                } else if (b2.a.l(a12, xVar2.l())) {
                    nVar = n.DELETE_PREV_CHAR;
                } else if (b2.a.l(a12, xVar2.f())) {
                    nVar = n.DELETE_NEXT_WORD;
                } else if (b2.a.l(a12, xVar2.c())) {
                    nVar = n.DELETE_PREV_WORD;
                } else if (b2.a.l(a12, xVar2.b())) {
                    nVar = n.DESELECT;
                }
            } else if (b2.d.e(event)) {
                long a13 = b2.d.a(event);
                x xVar3 = x.f55246a;
                if (b2.a.l(a13, xVar3.o())) {
                    nVar = n.SELECT_HOME;
                } else if (b2.a.l(a13, xVar3.n())) {
                    nVar = n.SELECT_END;
                }
            }
            return nVar == null ? this.f55184a.a(event) : nVar;
        }
    }

    public static final p a(h00.l<? super b2.b, Boolean> shortcutModifier) {
        kotlin.jvm.internal.s.g(shortcutModifier, "shortcutModifier");
        return new a(shortcutModifier);
    }

    public static final p b() {
        return f55181a;
    }
}