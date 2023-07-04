package com.plaid.internal;

import android.text.Editable;
import android.text.TextWatcher;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelect$SearchAndSelectPane;
import java.util.List;

/* loaded from: classes2.dex */
public final class ob implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ nb f19180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchAndSelect$SearchAndSelectPane.Rendering f19181b;

    public ob(nb nbVar, SearchAndSelect$SearchAndSelectPane.Rendering rendering) {
        this.f19180a = nbVar;
        this.f19181b = rendering;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        nb nbVar = this.f19180a;
        j1 searchBehavior = this.f19181b.getSearchBehavior();
        kotlin.jvm.internal.s.f(searchBehavior, "rendering.searchBehavior");
        if (nb.a(nbVar, searchBehavior, editable == null ? null : editable.toString())) {
            return;
        }
        sb sbVar = this.f19180a.f19084f;
        List<Common$ListItem> initialItemsList = this.f19181b.getInitialItemsList();
        kotlin.jvm.internal.s.f(initialItemsList, "rendering.initialItemsList");
        sbVar.a(initialItemsList);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}