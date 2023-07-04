package com.nimbusds.jose;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;
import nq.l;
import zp.f;
import zp.o;
import zp.p;

/* loaded from: classes2.dex */
public class b extends f {

    /* renamed from: c  reason: collision with root package name */
    private final o f17926c;

    /* renamed from: d  reason: collision with root package name */
    private final String f17927d;

    /* renamed from: e  reason: collision with root package name */
    private nq.c f17928e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<a> f17929f;

    /* loaded from: classes2.dex */
    public enum a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public b(nq.c cVar, nq.c cVar2, nq.c cVar3) {
        this(cVar, new c(cVar2), cVar3);
    }

    private String f() {
        if (this.f17926c.t()) {
            return h().h().toString() + CoreConstants.DOT + b().c().toString();
        }
        return h().h().toString() + CoreConstants.DOT + b().toString();
    }

    private void g() {
        if (this.f17929f.get() != a.SIGNED && this.f17929f.get() != a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public static b k(String str) {
        nq.c[] e11 = f.e(str);
        if (e11.length == 3) {
            return new b(e11[0], e11[1], e11[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public o h() {
        return this.f17926c;
    }

    public nq.c i() {
        return this.f17928e;
    }

    public byte[] j() {
        return this.f17927d.getBytes(l.f41779a);
    }

    public String l() {
        return m(false);
    }

    public String m(boolean z11) {
        g();
        if (z11) {
            return this.f17926c.h().toString() + CoreConstants.DOT + CoreConstants.DOT + this.f17928e.toString();
        }
        return this.f17927d + CoreConstants.DOT + this.f17928e.toString();
    }

    public synchronized boolean n(p pVar) {
        boolean a11;
        g();
        try {
            a11 = pVar.a(h(), j(), i());
            if (a11) {
                this.f17929f.set(a.VERIFIED);
            }
        } catch (JOSEException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
        return a11;
    }

    public b(nq.c cVar, c cVar2, nq.c cVar3) {
        AtomicReference<a> atomicReference = new AtomicReference<>();
        this.f17929f = atomicReference;
        if (cVar != null) {
            try {
                this.f17926c = o.w(cVar);
                if (cVar2 != null) {
                    d(cVar2);
                    this.f17927d = f();
                    if (cVar3 != null) {
                        this.f17928e = cVar3;
                        atomicReference.set(a.SIGNED);
                        if (h().t()) {
                            c(cVar, cVar2.c(), cVar3);
                            return;
                        } else {
                            c(cVar, new nq.c(""), cVar3);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e11) {
                throw new ParseException("Invalid JWS header: " + e11.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}