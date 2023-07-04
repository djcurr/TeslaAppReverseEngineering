package com.teslamotors.plugins.ble;

import android.os.Message;
import bu.a1;
import com.teslamotors.plugins.ble.Peripheral;
import java.util.Map;

/* loaded from: classes6.dex */
public interface d {
    void A(byte[] bArr);

    void a(Map<String, Peripheral> map);

    boolean b(Peripheral peripheral);

    void c(String str, Throwable th2);

    String d();

    void disconnect();

    void e(Peripheral peripheral);

    void f();

    void g(Peripheral peripheral, int i11);

    void h(nv.j jVar, boolean z11);

    void i();

    void j(Message message);

    void k();

    nv.b l(byte[] bArr, byte[] bArr2);

    void m();

    void n(Peripheral.e eVar, Peripheral peripheral);

    void o(bu.d dVar);

    void p(boolean z11, String str, String str2, Peripheral peripheral);

    void q(a1 a1Var);

    nv.f r();

    void s(Peripheral peripheral);

    void t(Peripheral peripheral);

    void u(boolean z11);

    lv.e v();

    boolean w(Peripheral peripheral);

    void x(Peripheral peripheral, String str);

    boolean y();

    void z(String str);
}