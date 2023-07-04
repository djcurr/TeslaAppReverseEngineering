package freemarker.core;

import javax.swing.tree.TreeNode;

/* loaded from: classes5.dex */
public abstract class k extends l implements TreeNode {

    /* renamed from: d  reason: collision with root package name */
    private k f26883d;

    /* renamed from: e  reason: collision with root package name */
    private k f26884e;

    @Override // freemarker.core.l
    public final String a() {
        return d(true);
    }

    protected abstract String d(boolean z11);

    public final String e() {
        return d(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final k f() {
        return this.f26884e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final k g() {
        return this.f26883d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(k kVar) {
        if (kVar != null) {
            kVar.f26883d = this;
        }
        this.f26884e = kVar;
    }
}