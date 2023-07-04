package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
final class i3 {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f32290a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f32291b;

    public i3(List<String> list, List<String> list2) {
        this.f32290a = list;
        this.f32291b = list2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<io.sentry.protocol.s> a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.s sVar = new io.sentry.protocol.s();
                    sVar.r(Boolean.valueOf(b(className)));
                    sVar.t(className);
                    sVar.q(stackTraceElement.getMethodName());
                    sVar.p(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sVar.s(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    sVar.u(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(sVar);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        List<String> list = this.f32291b;
        if (list != null) {
            for (String str2 : list) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        List<String> list2 = this.f32290a;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext() && !str.startsWith(it2.next())) {
            }
        }
        return false;
    }
}