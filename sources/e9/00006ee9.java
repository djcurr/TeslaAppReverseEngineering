package freemarker.ext.beans;

import freemarker.core.BugException;

/* loaded from: classes5.dex */
class y extends x {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y(boolean z11) {
        super(z11);
    }

    private void i(int i11, Class[] clsArr, int[] iArr) {
        Class[] clsArr2 = f()[i11];
        if (clsArr2 == null) {
            return;
        }
        int length = clsArr2.length;
        int length2 = clsArr.length;
        int min = Math.min(length2, length);
        for (int i12 = 0; i12 < min; i12++) {
            clsArr2[i12] = d(clsArr2[i12], clsArr[i12]);
        }
        if (length > length2) {
            Class cls = clsArr[length2 - 1];
            while (length2 < length) {
                clsArr2[length2] = d(clsArr2[length2], cls);
                length2++;
            }
        }
        if (this.f27008e) {
            g(i11, iArr);
        }
    }

    @Override // freemarker.ext.beans.x
    void b(Class[] clsArr, int[] iArr) {
        Class[] clsArr2;
        int length = clsArr.length;
        Class[][] f11 = f();
        int i11 = length - 1;
        int i12 = i11;
        while (true) {
            if (i12 < 0) {
                break;
            }
            Class[] clsArr3 = f11[i12];
            if (clsArr3 != null) {
                i(length, clsArr3, e(i12));
                break;
            }
            i12--;
        }
        int i13 = length + 1;
        if (i13 < f11.length && (clsArr2 = f11[i13]) != null) {
            i(length, clsArr2, e(i13));
        }
        while (i13 < f11.length) {
            i(i13, clsArr, iArr);
            i13++;
        }
        if (length > 0) {
            i(i11, clsArr, iArr);
        }
    }

    @Override // freemarker.ext.beans.x
    Class[] h(m mVar) {
        Class[] clsArr = (Class[]) mVar.a().clone();
        int length = clsArr.length - 1;
        Class<?> componentType = clsArr[length].getComponentType();
        if (componentType != null) {
            clsArr[length] = componentType;
            return clsArr;
        }
        throw new BugException("Only varargs methods should be handled here");
    }
}