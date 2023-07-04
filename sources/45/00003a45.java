package com.google.gson;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class u<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends u<T> {
        a() {
        }

        @Override // com.google.gson.u
        public T b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return (T) u.this.b(aVar);
        }

        @Override // com.google.gson.u
        public void d(com.google.gson.stream.b bVar, T t11) {
            if (t11 == null) {
                bVar.n0();
            } else {
                u.this.d(bVar, t11);
            }
        }
    }

    public final u<T> a() {
        return new a();
    }

    public abstract T b(tn.a aVar);

    public final k c(T t11) {
        try {
            pn.g gVar = new pn.g();
            d(gVar, t11);
            return gVar.b1();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public abstract void d(com.google.gson.stream.b bVar, T t11);
}