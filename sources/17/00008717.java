package mq;

/* loaded from: classes2.dex */
final class q {

    /* renamed from: a  reason: collision with root package name */
    final r f38813a;

    /* renamed from: b  reason: collision with root package name */
    final r f38814b;

    /* renamed from: c  reason: collision with root package name */
    final r f38815c;

    /* renamed from: d  reason: collision with root package name */
    final int f38816d;

    /* renamed from: e  reason: collision with root package name */
    final String f38817e;

    /* renamed from: f  reason: collision with root package name */
    q f38818f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar, r rVar2, r rVar3, int i11, String str) {
        this.f38813a = rVar;
        this.f38814b = rVar2;
        this.f38815c = rVar3;
        this.f38816d = i11;
        this.f38817e = str;
    }

    static int a(q qVar) {
        int i11 = 0;
        while (qVar != null) {
            i11++;
            qVar = qVar.f38818f;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(q qVar) {
        return (a(qVar) * 8) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(q qVar, d dVar) {
        dVar.k(a(qVar));
        while (qVar != null) {
            dVar.k(qVar.f38813a.f38823d).k(qVar.f38814b.f38823d).k(qVar.f38815c.f38823d).k(qVar.f38816d);
            qVar = qVar.f38818f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q d(q qVar, r rVar, r rVar2) {
        if (qVar == null) {
            return null;
        }
        q d11 = d(qVar.f38818f, rVar, rVar2);
        qVar.f38818f = d11;
        r rVar3 = qVar.f38813a;
        int i11 = rVar3.f38823d;
        r rVar4 = qVar.f38814b;
        int i12 = rVar4.f38823d;
        int i13 = rVar.f38823d;
        int i14 = rVar2 == null ? Integer.MAX_VALUE : rVar2.f38823d;
        if (i13 >= i12 || i14 <= i11) {
            return qVar;
        }
        if (i13 <= i11) {
            return i14 >= i12 ? d11 : new q(qVar, rVar2, rVar4);
        } else if (i14 >= i12) {
            return new q(qVar, rVar3, rVar);
        } else {
            qVar.f38818f = new q(qVar, rVar2, rVar4);
            return new q(qVar, qVar.f38813a, rVar);
        }
    }

    q(q qVar, r rVar, r rVar2) {
        this(rVar, rVar2, qVar.f38815c, qVar.f38816d, qVar.f38817e);
        this.f38818f = qVar.f38818f;
    }
}